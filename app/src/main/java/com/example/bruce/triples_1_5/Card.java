package com.example.bruce.triples_1_5;

enum Shape {
    SQUARE, TRIANGLE, CIRCLE, NO_SHAPE;
}
enum Color {
    RED, BLUE, GREEN, NO_COLOR;
}

public class Card {

    private Shape mShape;
    private Color mColor;
    private int mAlpha;
    private int mCount;
    private boolean mIsSelected = false;
    private int mImageID;
    private int mSelectedImageID;

    public Card(Shape shape, Color color, int alpha, int count, int imageID, int selectedImageID) {
        mShape = shape;
        mColor = color;
        mAlpha = alpha;
        mCount = count;
        mImageID = imageID;
        mSelectedImageID = selectedImageID;
    }

    protected Shape getShape() {return mShape;}
    protected Color getColor() {return mColor;}
    protected int getAlpha() {return mAlpha;}
    protected int getCount() {return mCount;}
    protected boolean getIsSelected() {return mIsSelected;}
    protected void setIsSelected(boolean isSelected) {mIsSelected = isSelected;}
    protected int getImageID() {return mImageID;}
    protected int getSelectedImageID() {return mSelectedImageID;}

}


