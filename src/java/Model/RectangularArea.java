package Model;

import ModelInterfaces.IArea;
import ModelInterfaces.IRectangleSides;

public class RectangularArea implements IArea, IRectangleSides {

    private double area = 0;
    private double sideOne = 0;
    private double sideTwo = 0;
    private final String BAD_ARGUMENT = "Rectangle Side can not be Null or Empty!!";
    private final String SIDE_OUT_OF_BOUNDS = "It is impossibile for a "
            + "Rectangle to have an Area Value when a leg is less "
            + "than or equal to Zero";

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setRectangleSides(String length, String width) {
        if (length == null || length.length() == 0) {
            throw new IllegalArgumentException(BAD_ARGUMENT);
        } else {
            String x = length;
            double convertedlength = new Double(x);
            sideOne = convertedlength;
        }

        if (width == null || width.length() == 0) {
            throw new IllegalArgumentException(BAD_ARGUMENT);
        } else {
            String x = width;
            double convertedWidth = new Double(x);
            sideTwo = convertedWidth;
        }

        if (sideOne <= 0 || sideTwo <= 0) {
            throw new IllegalArgumentException(SIDE_OUT_OF_BOUNDS);
        } else {
            area = sideOne * sideTwo;
        }


    }
}
