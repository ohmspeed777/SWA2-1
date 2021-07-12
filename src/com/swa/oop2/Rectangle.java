package com.swa.oop2;

/**
 *  This class Rectangle calculates
 *  the area of rectangle
 */

public class Rectangle extends Shape
{
    //Calculate and return area of rectangle
    public double getArea()
    {
        return getHeight() * getWidth();
    }
}