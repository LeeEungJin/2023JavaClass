package com.java.main;

import com.java.dto.Card;

public class CardMain {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		Card c3 = new Card();

		Card.width = 100;
		Card.height = 200;
		
		System.out.println("c1 ī�� �ʺ� : " + c1.width);
		System.out.println("c1 ī�� ���� : " + c1.height);
		
		System.out.println("c1 ī�� �ʺ� : " + c2.width);
		System.out.println("c1 ī�� ���� : " + c2.height);
		
		System.out.println("c1 ī�� �ʺ� : " + c3.width);
		System.out.println("c1 ī�� ���� : " + c3.height);

	}
}
