package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ExcersiseList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();	//Integer�� �����ִ� ���۷���
		
		list.add(3);
		list.add(1);
		list.add(2);
		//list.add(0,5);	//0������ 5�� �Ҵ��
		list.set(0, 5);		//0������ 5�� �ٲ�
		list.add(6);
		list.add(4);
		/*
		list.add('a');
		list.add("a");
		list.add(false);
		list.add(1.0f);
		list.add(1.0);
		list.add(1l);*/
		
//		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("����Ʈ ũ�� : " + list.size());
				
		for (int i = 0 ; i<list.size() ; i++) {
			System.out.println(i+"���� �� : " + list.get(i));
		}
		
	}

}