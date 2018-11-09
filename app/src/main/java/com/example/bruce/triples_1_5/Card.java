package com.example.bruce.triples_1_5;

public class Card {

    enum Shape {
        SQUARE, TRIANGLE, CIRCLE, NO_SHAPE;
    }
    enum Color {
        RED, BLUE, GREEN, NO_COLOR;
    }

    private Shape mShape;
    private Color mColor;
    private int mAlpha;
    private int mNumber;
    private boolean mIsSelected = false;
    private int mImageID;
    private int mSelectedImageID;

    public Card(Shape shape, Color color, int number, int alpha, int imageID, int selectedImageID) {
        mShape = shape;
        mColor = color;
        mAlpha = alpha;
        mNumber = number;
        mImageID = imageID;
        mSelectedImageID = selectedImageID;
    }

    protected Shape getShape() {return mShape;}
    protected Color getColor() {return mColor;}
    protected int getAlpha() {return mAlpha;}
    protected int getNumber() {return mNumber;}
    protected boolean getIsSelected() {return mIsSelected;}
    protected void setIsSelected(boolean isSelected) {mIsSelected = isSelected;}
    protected int getImageID() {return mImageID;}
    protected int getSelectedImageID() {return mSelectedImageID;}

}


