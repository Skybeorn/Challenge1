package Model;

import ModelInterfaces.IArea;
import ModelInterfaces.ICircleRadius;

public class CircularArea implements IArea, ICircleRadius {

    private double area = 0;
    private double radius = 0;
    private final String BAD_ARGUMENT = "Radius can not be Null or Empty!!";
    private final String RADIUS_OUT_OF_BOUNDS = "It is impossibile for a "
            + "circle to have an Area Value when the radius is less "
            + "than or equal to Zero";

    public CircularArea() {
    }

    @Override
    public final double getArea() {
        return area;
    }

    @Override
    public final void setRadius(final String circleRadius) {
        if (circleRadius == null || circleRadius.length() == 0) {
            throw new IllegalArgumentException(BAD_ARGUMENT);
        } else {
            String x = circleRadius;
            Double convertedRadius = new Double(x);
            radius = convertedRadius;
        }
        if (radius == 0) {
            throw new IllegalArgumentException(RADIUS_OUT_OF_BOUNDS);
        } else {
            area = Math.PI * radius * radius;
        }

    }
}