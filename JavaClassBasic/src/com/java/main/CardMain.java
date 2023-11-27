package com.java.main;

import com.java.dto.Card;

public class CardMain {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		Card c3 = new Card();

		Card.width = 100;
		Card.height = 200;
		
		System.out.println("c1 카드 너비 : " + c1.width);
		System.out.println("c1 카드 높이 : " + c1.height);
		
		System.out.println("c1 카드 너비 : " + c2.width);
		System.out.println("c1 카드 높이 : " + c2.height);
		
		System.out.println("c1 카드 너비 : " + c3.width);
		System.out.println("c1 카드 높이 : " + c3.height);

	}
}
