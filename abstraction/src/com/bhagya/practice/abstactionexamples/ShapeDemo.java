package com.bhagya.practice.abstactionexamples;

import com.bhagya.practice.shapeexample.CircleShapeService;
import com.bhagya.practice.shapeexample.SquareShapeService;

public class ShapeDemo {

    public static void main(String[] args) {

        CircleShapeService circleShapeService = new CircleShapeService();
        circleShapeService.displayShape();
        circleShapeService.draw();


        SquareShapeService squareShapeService = new SquareShapeService();
        squareShapeService.displayShape();
        squareShapeService.colour();
        squareShapeService.draw();
    }
}
