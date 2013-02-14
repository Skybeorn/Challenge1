/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import ModelInterfaces.ITriangleHypotenuse;
import ModelInterfaces.ITriangleSides;

/**
 *
 * @author Skybeorn
 */
public class MissingHypotenuseCalculator implements
        ITriangleHypotenuse, ITriangleSides {

    private double triangleLegA = 0;
    private double triangleLegB = 0;
    private double triangleLegC = 0;
    private String NULL_OR_EMPTY_STRING = "Side Value can not be null or Empty";
    private String VALUE_CAN_NOT_BE_ZERO = "The Value of a Triangle Leg"
            + " Cannot be less than or equal to Zero";
    private int ZERO = 0;

    @Override
    public double getHypotenuse() {
        if (triangleLegA == ZERO || triangleLegB == ZERO) {
            throw new IllegalArgumentException(VALUE_CAN_NOT_BE_ZERO);
        }
        triangleLegC = Math.sqrt(Math.pow(triangleLegA, 2) + Math.pow(triangleLegB, 2));
        return triangleLegC;
    }

    @Override
    public void setTriangleSides(String sideA, String sideB, String sideC) {

        if (sideA == null || sideA.length() == ZERO) {
            throw new IllegalArgumentException(NULL_OR_EMPTY_STRING);
        } else {
            String x = sideA;
            double convertedSideA = new Double(x);
            if (convertedSideA <= ZERO) {
                throw new IllegalArgumentException(VALUE_CAN_NOT_BE_ZERO);
            } else {
                triangleLegA = convertedSideA;
            }
        }

        if (sideB == null || sideB.length() == ZERO) {
            throw new IllegalArgumentException(NULL_OR_EMPTY_STRING);
        } else {
            String x = sideB;
            double convertedSideB = new Double(x);
            if (convertedSideB <= ZERO) {
                throw new IllegalArgumentException(VALUE_CAN_NOT_BE_ZERO);
            } else {
                triangleLegB = convertedSideB;
            }
        }
    }
}
