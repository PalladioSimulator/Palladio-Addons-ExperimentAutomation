package org.palladiosimulator.experimentautomation.application.variation.valueprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.palladiosimulator.experimentautomation.experiments.SetLongValueProvider;

public class SetLongValueProviderStrategy implements IValueProviderStrategy<Long> {
	
	private final SetLongValueProvider specification;
    private final List<Long> values;

    public SetLongValueProviderStrategy(final SetLongValueProvider p) {
        this.specification = p;
        this.values = parseValueString(this.specification.getValues());
    }

    @Override
    public Long valueAtPosition(final int position) {
        if (position > this.values.size() - 1) {
            throw new RuntimeException("Requested the value at position " + (position + 1)
             + ", but the set contains only " + values.size() + " values.");
        }
        return this.values.get(position);
    }

    private static List<Long> parseValueString(final String values) {
        final List<Long> result = new ArrayList<Long>();
        final StringTokenizer tokens = new StringTokenizer(values, ",");
        while (tokens.hasMoreElements()) {
            final String value = tokens.nextToken();
            final Long l = Long.valueOf(value);
            result.add(l);
        }
        return result;
    }
	
	
}