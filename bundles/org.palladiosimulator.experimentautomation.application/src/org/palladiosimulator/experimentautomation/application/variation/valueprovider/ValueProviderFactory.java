package org.palladiosimulator.experimentautomation.application.variation.valueprovider;

import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider;
import org.palladiosimulator.experimentautomation.experiments.LinearValueProvider;
import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsDoubleValueProvider;
import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider;
import org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider;
import org.palladiosimulator.experimentautomation.experiments.SetLongValueProvider;
import org.palladiosimulator.experimentautomation.experiments.SetValueProvider;
import org.palladiosimulator.experimentautomation.experiments.ValueProvider;

public class ValueProviderFactory {

    public static IValueProviderStrategy<Double> createDoubleValueProvider(final ValueProvider specification) {
        if (ExperimentsPackage.eINSTANCE.getPolynomialValueProvider().isInstance(specification)) {
            final PolynomialValueProvider p = (PolynomialValueProvider) specification;
            return new PolynomialValueProviderStrategy(p);
        } else if (ExperimentsPackage.eINSTANCE.getExponentialValueProvider().isInstance(specification)) {
            final ExponentialValueProvider p = (ExponentialValueProvider) specification;
            return new ExponentialValueProviderStrategy(p);
        } else if (ExperimentsPackage.eINSTANCE.getSetValueProvider().isInstance(specification)) {
            final SetValueProvider p = (SetValueProvider) specification;
            return new SetValueProviderStrategy(p);
        } else if (ExperimentsPackage.eINSTANCE.getLinearValueProvider().isInstance(specification)) {
            final LinearValueProvider p = (LinearValueProvider) specification;
            return new LinearValueProviderStrategy(p);
        } else if (ExperimentsPackage.eINSTANCE.getNestedIntervalsDoubleValueProvider().isInstance(specification)) {
            final NestedIntervalsDoubleValueProvider p = (NestedIntervalsDoubleValueProvider) specification;
            return new NestedIntervalsDoubleValueProviderStrategy(p);
        }
        throw new RuntimeException("Could not find a double value provider strategy for "
                + specification.eClass().getName());
    }

    public static IValueProviderStrategy<Long> createLongValueProvider(final ValueProvider specification) {
        if (ExperimentsPackage.eINSTANCE.getNestedIntervalsLongValueProvider().isInstance(specification)) {
            final NestedIntervalsLongValueProvider p = (NestedIntervalsLongValueProvider) specification;
            return new NestedIntervalsLongValueProviderStrategy(p);
        }	else if (ExperimentsPackage.eINSTANCE.getSetLongValueProvider().isInstance(specification)) {
            final SetLongValueProvider p = (SetLongValueProvider) specification;
            return new SetLongValueProviderStrategy(p);
        }
        throw new RuntimeException("Could not find a long value provider strategy for "
                + specification.eClass().getName());
    }
}
