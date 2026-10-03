package org.palladiosimulator.experimentautomation.application.variation.valueprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.palladiosimulator.experimentautomation.experiments.SetLongValueProvider;

/**
 * Provides discrete long values from a comma-separated set (e.g. closed-workload population).
 */
public class SetLongValueProviderStrategy implements IValueProviderStrategy<Long> {

    private final List<Long> values;

    public SetLongValueProviderStrategy(final SetLongValueProvider specification) {
        this.values = parseValueString(specification.getValues());
    }

    @Override
    public Long valueAtPosition(final int position) {
        if (position > this.values.size() - 1) {
            return -1L;
        }
        return this.values.get(position);
    }

    private static List<Long> parseValueString(final String values) {
        final List<Long> result = new ArrayList<>();
        final StringTokenizer tokens = new StringTokenizer(values, ",");
        while (tokens.hasMoreElements()) {
            result.add(Long.valueOf(tokens.nextToken().trim()));
        }
        return result;
    }
}
