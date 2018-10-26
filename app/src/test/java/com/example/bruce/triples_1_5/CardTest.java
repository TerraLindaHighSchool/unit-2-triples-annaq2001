package com.example.bruce.triples_1_5;

import org.junit.Test;
import android.support.v7.app.AppCompatActivity;

import static org.junit.Assert.*;

public class CardTest extends AppCompatActivity {

    Card[] tests = {new Card(Shape.CIRCLE, Color.BLUE, 1, 1, R.drawable.circle_blue_1_1, R.drawable.circle_blue_1_1_selected),
            new Card(Shape.NO_SHAPE, Color.NO_COLOR, 1, 2, R.drawable.blank_0_0_0, R.drawable.blank_0_0_0),
            new Card(Shape.SQUARE, Color.RED, 0, 3, R.drawable.square_red_3_0, R.drawable.square_red_3_0_selected),
            new Card(Shape.TRIANGLE, Color.GREEN, 2, 2, R.drawable.triangle_green_2_2, R.drawable.triangle_green_2_2_selected), };

    @Test
    public void getShape() {
        Shape[] shapeUsed = {Shape.CIRCLE, Shape.NO_SHAPE, Shape.SQUARE, Shape.TRIANGLE};
        Shape[] shapeExpected = new Shape[4];
        for (int i = 0; i < 4; i++) {
            shapeExpected[i] = tests[i].getShape();
        }
        assertArrayEquals(shapeUsed, shapeExpected);
    }

    @Test
    public void getColor() {
        Color[] colorUsed = {Color.BLUE, Color.NO_COLOR, Color.RED, Color.GREEN};
        Color[] colorExpected = new Color[4];
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