package com.quan;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		
		Set<Card> cards = new HashSet<>();
		//FOUR_CARDS case 
        /*
        cards.add(Card.TWO_CLOVERS);
		cards.add(Card.TWO_DIAMONDS);
		cards.add(Card.THREE_HEARTS);
		cards.add(Card.THREE_DIAMONDS);
		cards.add(Card.THREE_CLOVERS);*/

        //TWO_PAIRS case
        /*
        cards.add(Card.TWO_CLOVERS);
		cards.add(Card.FOUR_CLOVERS);
		cards.add(Card.FOUR_HEARTS);
		cards.add(Card.THREE_DIAMONDS);
		cards.add(Card.THREE_CLOVERS);*/

		//THREE_CARDS case
		/*
		cards.add(Card.TWO_CLOVERS);
		cards.add(Card.FOUR_CLOVERS);
		cards.add(Card.THREE_HEARTS);
		cards.add(Card.THREE_DIAMONDS);
		cards.add(Card.THREE_CLOVERS);*/

		//ONE_PAIR case
       /*
        cards.add(Card.TWO_CLOVERS);
		cards.add(Card.FOUR_CLOVERS);
		cards.add(Card.FIVE_DIAMONDS);
		cards.add(Card.THREE_DIAMONDS);
		cards.add(Card.THREE_CLOVERS);*/

		//FOUR_CARDS case
		cards.add(Card.TWO_CLOVERS);
		cards.add(Card.THREE_SPADES);
		cards.add(Card.THREE_HEARTS);
		cards.add(Card.THREE_DIAMONDS);
		cards.add(Card.THREE_CLOVERS);
		
		Play play = new Play(cards);		
	}

}
