package com.nija;

import java.util.*;

public class ListRangeView {
	
	public static void main(String[] args) {
		if(args.length <2) {
			System.out.println("2 arguments is required");
			return;
		}
		else {
			
			int noOfHandsToDeal= Integer.parseInt(args[0]);
			int noOfCardsInHand= Integer.parseInt(args[1]);
			//Make a 52 deck card
			String[] cardNames= new String[]{
				"hearts", "spades", "diamonds","clubs"
			};
			String[] ranks= new String[] {
					"Ace","2", "3", "4", "5","6","7","8","9","10",
							 "Jack","queen","king"
			};
			
			List<String> deck= new ArrayList<String>();
			
			for(int i=0; i< cardNames.length; i++) {
				for(int j=0;j<ranks.length; j++) {
					deck.add(ranks[j]+" of "+ cardNames[i]);
				}
			}
			if((noOfCardsInHand*noOfHandsToDeal)>deck.size()) {
				System.out.println("deck Size is less than required");
				return;
			}
			for(int i=0;i<noOfHandsToDeal; i++) {
				System.out.println(dealHand(deck, noOfCardsInHand));
			}
			
			
			
		}
		

		
		
		
		
	}
	
	public static <E> List<E> dealHand(List<E> deck, int n){
		
		int deckSize= deck.size();
		List<E> handView= deck.subList(deckSize-n, deckSize);
		List<E> hand = new ArrayList<E>(handView);
		handView.clear();
		return hand;
		
	}
	

}
