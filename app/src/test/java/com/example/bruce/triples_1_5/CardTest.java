package com.example.bruce.triples_1_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    Card[] tests = {new Card(Card.Shape.CIRCLE, Card.Color.BLUE, 1, 1, R.drawable.circle_blue_1_1, R.drawable.circle_blue_1_1_selected),
            new Card(Card.Shape.NO_SHAPE, Card.Color.NO_COLOR, 1, 2, R.drawable.blank_0_0_0, R.drawable.blank_0_0_0),
            new Card(Card.Shape.SQUARE, Card.Color.RED, 0, 3, R.drawable.square_red_3_0, R.drawable.square_red_3_0_selected),
            new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 2, 2, R.drawable.triangle_green_2_2, R.drawable.triangle_green_2_2_selected), };

    @Test
    public void getShape() {
        Card.Shape[] shapeUsed = {Card.Shape.CIRCLE, Card.Shape.NO_SHAPE, Card.Shape.SQUARE, Card.Shape.TRIANGLE};
        Card.Shape[] shapeExpected = new Card.Shape[4];
        for (int i = 0; i < 4; i++) {
            shapeExpected[i] = tests[i].getShape();
        }
        assertArrayEquals(shapeUsed, shapeExpected);
    }

    @Test
    public void getColor() {
        Card.Color[] colorUsed = {Card.Color.BLUE, Card.Color.NO_COLOR, Card.Color.RED, Card.Color.GREEN};
        Card.Color[] colorExpected = new Card.Color[4];
        for (int i = 0; i < 4; i++) {
            colorExpected[i] = tests[i].getColor();
        }
        assertArrayEquals(colorUsed, colorExpected);
    }

    @Test
    public void getAlpha() {
        int[] alphaUsed = {1,1,0,2};
        int[] alphaExpected = new int[4];
        for (int i = 0; i < 4; i++) {
            alphaExpected[i] = tests[i].getAlpha();
        }
        assertArrayEquals(alphaUsed, alphaExpected);
    }

    @Test
    public void getCount() {
        int[] countUsed = {1,2,3,2};
        int[] countExpected = new int[4];
        for (int i = 0; i < 4; i++) {
            countExpected[i] = tests[i].getCount();
        }
        assertArrayEquals(countUsed, countExpected);
    }

    @Test
    public void getIsSelected() {
        assertTrue(!tests[1].getIsSelected());
    }

    @Test
    public void setIsSelected() {
        tests[1].setIsSelected(true);
        assertTrue(tests[1].getIsSelected());
    }

    @Test
    public void getImageID() {
        int[] imageIDUsed = {R.drawable.circle_blue_1_1,R.drawable.blank_0_0_0,R.drawable.square_red_3_0,R.drawable.triangle_green_2_2};
        int[] imageIDExpected = new int[4];
        for (int i = 0; i < 4; i++) {
            imageIDExpected[i] = tests[i].getImageID();
        }
        assertArrayEquals(imageIDUsed, imageIDExpected);
    }

    @Test
    public void getSelectedImageID() {
        int[] selectedImageIDUsed = {R.drawable.circle_blue_1_1_selected,R.drawable.blank_0_0_0,R.drawable.square_red_3_0_selected,R.drawable.triangle_green_2_2_selected};
        int[] selectedImageIDExpected = new int[4];
        for (int i = 0; i < 4; i++) {
            selectedImageIDExpected[i] = tests[i].getSelectedImageID();
        }
        assertArrayEquals(selectedImageIDUsed, selectedImageIDExpected);
    }
}