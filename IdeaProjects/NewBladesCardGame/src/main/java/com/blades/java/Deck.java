package com.blades.java;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    Random rand = new Random();

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

        public void createFullDeck(){
            this.cards.add(Card.ONE); this.cards.add(Card.ONE);
            this.cards.add(Card.TWO); this.cards.add(Card.TWO); this.cards.add(Card.TWO);
            this.cards.add(Card.THREE); this.cards.add(Card.THREE); this.cards.add(Card.THREE); this.cards.add(Card.THREE);
            this.cards.add(Card.FOUR); this.cards.add(Card.FOUR); this.cards.add(Card.FOUR); this.cards.add(Card.FOUR);
            this.cards.add(Card.FIVE); this.cards.add(Card.FIVE); this.cards.add(Card.FIVE); this.cards.add(Card.FIVE);
            this.cards.add(Card.SIX); this.cards.add(Card.SIX); this.cards.add(Card.SIX);
            this.cards.add(Card.SEVEN); this.cards.add(Card.SEVEN);
            this.cards.add(Card.MIRROR); this.cards.add(Card.MIRROR); this.cards.add(Card.MIRROR); this.cards.add(Card.MIRROR);
            this.cards.add(Card.BOLT); this.cards.add(Card.BOLT); this.cards.add(Card.BOLT); this.cards.add(Card.BOLT); this.cards.add(Card.BOLT); this.cards.add(Card.BOLT);
        }


    public void shuffle() {
        for (int i = cards.size() - 1; i > 0; i--) {
            // swap random card between beginning and last card of loop
            int pick = rand.nextInt(i);
            Card randCard = cards.get(pick);
            Card lastCard = cards.get(i);
            cards.set(i, randCard);
            cards.set(pick, lastCard);
        }
    }

    public String toString(){
        String cardListOutput = "";
        for(Card aCard : this.cards){
            cardListOutput += "\n" + aCard.toString();
        }
        return cardListOutput;
    }


    public int deckSize(){
        return this.cards.size();
    }
    public Card getCard(int i){
        return this.cards.get(i);
    }



}
