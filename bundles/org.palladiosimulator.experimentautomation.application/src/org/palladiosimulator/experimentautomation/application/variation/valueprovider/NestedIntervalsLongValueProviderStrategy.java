package org.palladiosimulator.experimentautomation.application.variation.valueprovider;

import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider;

public class NestedIntervalsLongValueProviderStrategy extends AbstractNestedIntervalsValueProviderStrategy<Long> {

    private long min;
    private long middle;
    private long max;

    public NestedIntervalsLongValueProviderStrategy(final NestedIntervalsLongValueProvider specification) {
        super();
        this.min = specification.getMinValue();
        this.max = specification.getMaxValue();
        this.middle = this.min;
    }

    @Override
    public Long valueAtPosition(final int position) {
        if (position != 0) {
            return -1L; // Only position 0 is supported
        }

        return this.middle;
    }

    @Override
    public void setMin(final Long min) {
        if (min < this.min) {
            throw new IllegalArgumentException("New interval has to be nested in original interval");
        }

        if (this.min == this.middle && this.middle != this.max) {
            this.middle = this.max;
            this.min = min;
        } else {
            this.min = min;
            calculateMiddle();
        }

        if (this.min == this.max) {
            this.converged = true;
        } else if (this.min == this.middle) {
            this.middle++;
        }
    }

    @Override
    public void setMax(final Long max) {
        if (max > this.max) {
            throw new IllegalArgumentException("New interval has to be nested in original interval");
        }

        if (this.min > max) {
            this.min = max;
        }

        this.max = max;

        calculateMiddle();

        if (this.min == this.max) {
            this.converged = true;
        }
    }

    private void calculateMiddle() {
        this.middle = (this.min + this.max) / 2L;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Capacity Interval: [");
        stringBuilder.append(String.valueOf(this.min));
        stringBuilder.append(", ");
        stringBuilder.append(String.valueOf(this.max));
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

}
