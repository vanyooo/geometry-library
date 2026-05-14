package com.zimin;


public class ShapeComparator {

    public static Shape findLargerArea(Shape first, Shape second) {

        System.out.println("Comparison");
        if (first.getArea() > second.getArea()) {
            return first;
        }

        return second;
    }
}
