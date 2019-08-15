package org.palladiosimulator.experimentautomation.application.variation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.InternalAction;
import org.palladiosimulator.pcm.usagemodel.ClosedWorkload;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.OpenWorkload;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;


public class FixedValueVariation implements IVariationStrategy<Long> {
	private final String pathToValueSource = "C:\\git\\BA_Sebastian_Weber\\BA_Data_Share\\edu.kit.ipd.are.cassandra\\valuesToInstall.txt";
	private final List<String> allConfigurations = new ArrayList<String>();

	private ResourceSet resourceSet;
	private List<Resource> relevantResources;
	
	@Override
	public void setVariedObject(EObject eObject) {
		 resourceSet = eObject.eResource().getResourceSet();
		 relevantResources = resourceSet.getResources().stream().filter(new Predicate<Resource>() {
			@Override
			public boolean test(Resource it) {
				EObject root = it.getContents().get(0);
				 return root instanceof Repository || root instanceof UsageModel; 
			 
			}}).collect(Collectors.<Resource>toList());
		 
		 
		 Scanner sc;
		try {
			sc = new Scanner(new File(pathToValueSource));
			while (sc.hasNext())
				allConfigurations.add(sc.next());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String vary(Long index) {
		String configuration = allConfigurations.get(Math.toIntExact(index));
		
		System.out.println("ADJUSTING TO " + index + ": " + configuration);
		
		
		String[] adjustmentOperations = configuration.split("###");
		for (int i = 0; i < adjustmentOperations.length; i++) {
			parseAndExecute(adjustmentOperations[i]);
		}
		
		return null;
	}

	private void parseAndExecute(String op) {
		String[] parts = op.split("===");
		if (parts.length != 2)
			throw new IllegalStateException();
		
		String target = parts[0];
		String newValue = parts[1];
		
		String[] idAndNavigation = target.split("\\.");
		if (idAndNavigation.length != 2)
			throw new IllegalStateException();
		
		String id = idAndNavigation[0];
		String navigation = idAndNavigation[1];
		
		EObject targetObject = findObject(id);
		if (targetObject == null)
			throw new IllegalStateException();
		
		if (navigation.equals("IA_specification_ParametericResourceDemand0")) {
			InternalAction action = (InternalAction) targetObject;
			action.getResourceDemand_Action().get(0).getSpecification_ParametericResourceDemand().setSpecification(newValue);
		} else if (navigation.equals("US_ClosedWorkload_Population")) {
			UsageScenario us = (UsageScenario) targetObject;
			ClosedWorkload cw = (ClosedWorkload) us.getWorkload_UsageScenario();
			cw.setPopulation(Integer.valueOf(newValue));
		} else if (navigation.equals("US_ClosedWorkload_ThinkTime")) {
			UsageScenario us = (UsageScenario) targetObject;
			ClosedWorkload cw = (ClosedWorkload) us.getWorkload_UsageScenario();
			cw.getThinkTime_ClosedWorkload().setSpecification(newValue);
		} else if (navigation.equals("US_OpenWorkload_InterarrivalTime")) {
			UsageScenario us = (UsageScenario) targetObject;
			OpenWorkload cw = (OpenWorkload) us.getWorkload_UsageScenario();
			cw.getInterArrivalTime_OpenWorkload().setSpecification(newValue);
		} else if (navigation.equals("ELSC_OperationSignature")) {
			EntryLevelSystemCall elsc = (EntryLevelSystemCall) targetObject;
			OperationSignature os = (OperationSignature) findObject(newValue);
			elsc.setOperationSignature__EntryLevelSystemCall(os);
		} else {
			throw new IllegalStateException();
		}
	}

	private EObject findObject(String id) {
		for (Resource r : relevantResources) {
			EObject object = r.getEObject(id);
			if (object != null)
				return object;
		}
		return null;
	}

}
