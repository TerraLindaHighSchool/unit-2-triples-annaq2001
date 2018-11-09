package com.example.bruce.triples_1_5;

import android.content.Context;
import java.util.ArrayList;

public class GameModel {
    private Deck deck;
    private ArrayList<Card> mCardOnBoard;
    private ArrayList<Integer> mSelectedCards;
    private long mStartTime;
    private int mScore, mTriplesRemaining, mLevel;

    GameModel(int numOfCardsInDeck, int level){
        deck = new Deck(numOfCardsInDeck);
        mCardOnBoard = new ArrayList<>();
        mSelectedCards = new ArrayList<>();
        mScore = 0;
        mTriplesRemaining = numOfCardsInDeck / 3;
        mLevel = level;
    }

/*************************************************
 * Getters and Setters
 *************************************************/

    protected Card getCardOnBoard(int index) {
        return mCardOnBoard.get(index);
    }

    protected int getNumOfCardsSelected() {
        return mSelectedCards.size();
    }

    protected int getNumOfCardsInDeck() {
        return mCardOnBoard.size();
    }

    protected int getSelectedCardIndex(int index) {
        return mSelectedCards.get(index);
    }

    protected void setStartTime() {
        mStartTime = System.currentTimeMillis();
    }

    protected void setTriplesRemaining() {
        mTriplesRemaining--;
    }

    /*************************************************
     * Methods that place cards to board
     *************************************************/
    protected void addCardToBoard(){
        mCardOnBoard.add(deck.getTopCard());
    }

    protected void replaceCardOnBoard(int index){
        mCardOnBoard.set(index, deck.getTopCard());
    }

    /*************************************************
     * Methods that keep track of selected cards
     *************************************************/

    protected void addSelectedCardIndex(int cardIndex){
        mSelectedCards.add(cardIndex);
    }

    protected void removeSelectedCardIndex(int cardIndex){
        mSelectedCards.remove(new Integer(cardIndex));
    }

    protected void resetSelectedCardIndices(){
        mSelectedCards.clear();
    }

    /*************************************************
     * Scoring
     *************************************************/
    protected int updateScore() {
        // to be implemented
        return -1; // temporary placeholder until implementation
    }

    /*************************************************
     * Methods that determine play
     *************************************************/

    protected boolean isTriple(int firstCard, int secondCard, int thirdCard){
        Card[] cards = {getCardOnBoard(firstCard), getCardOnBoard(secondCard), getCardOnBoard(thirdCard)};
        return (cards[0].getShape().ordinal() + cards[1].getShape().ordinal() + cards[2].getShape().ordinal()) % 3 == 0
                && (cards[0].getColor().ordinal() + cards[1].getColor().ordinal() + cards[2].getColor().ordinal()) % 3 == 0
                && (cards[0].getNumber() + cards[1].getNumber() + cards[2].getNumber()) % 3 == 0
                && (cards[0].getAlpha() + cards[1].getAlpha() + cards[2].getAlpha()) % 3 == 0;
    }

    protected boolean playIsPossible(){
        // to be implemented
        return true;  // temporary placeholder until implementation
    }

    protected String getGameOverMessage(Context context){
        String message = context.getString(R.string.game_over);
        if(mTriplesRemaining > 0)
            message = "      " + message + "\n" + context.getString(R.string.play_not_possible);
        return message;
    }
}

