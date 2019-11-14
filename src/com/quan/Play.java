package com.quan;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.Set;

import com.google.common.collect.EnumMultiset;
import com.google.common.collect.Multiset.Entry;

public class Play {
	public String category = null;
	private final LinkedList<Rank> distinctRanks = new LinkedList<>();
	
	public Play(Set<Card> cards) {
		
		if(cards.size() != 5) {
			System.out.println("please enter exactly 5 card..");
			return;
		}
		EnumSet<Suit> suits = EnumSet.noneOf(Suit.class);
		EnumMultiset<Rank> ranks = EnumMultiset.create(Rank.class);
		
		for (Card card : cards) {
			suits.add(card.suit);
			ranks.add(card.rank);
		}
		
		for (Entry<Rank> entry : ranks.entrySet()) {
			distinctRanks.addFirst(entry.getElement());
		}
		
		Rank first = distinctRanks.getFirst();
		int distinctCount = distinctRanks.size();
		if(distinctCount == 4) {
			category = CategoryContanst.ONE_PAIR;
		} else if(distinctCount == 3) {
			category = ranks.count(first) == 2 ? CategoryContanst.TWO_PAIRS : CategoryContanst.THREE_CARDS;
		} else if(distinctCount == 2) {
			category = ranks.count(first) == 3 ? CategoryContanst.FULL_HOUSE : CategoryContanst.FOUR_CARDS;
		} else {
			category = "@@";
		}
		System.out.println(category);
		
	}
}
