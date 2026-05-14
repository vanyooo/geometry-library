package com.zimin;


public class ShapeComparator {

    public static Shape findLargerArea(Shape first, Shape second) {

        if (first.getArea() > second.getArea()) {
            return first;
        }

        return second;
    }
}
