package com.hw3.run;

import com.hw3.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
			
		Product pr1 = new Product("Samsung", "Galaxy S9", "Blue", 960000);
		Product pr2 = new Product("LG", "G6", "Red", 820000);
		
		System.out.println(pr1.toString());;
		System.out.println(pr2.toString());;
		
		System.out.println("================================================");
		
		System.out.print("생성한 두 객체의 값이 같은가 : ");
		System.out.println(pr1.equals(pr2));
		
		System.out.println("================================================");
		
		System.out.print("첫 번째 객체의 해쉬코드 값 : ");
		System.out.println(pr1.hashCode());
		
		System.out.print("두 번째 객체의 해쉬코드 값 : ");
		System.out.println(pr2.hashCode());

		System.out.println("================================================");
		
		Product copy = pr1.clone();
		
//		copy.clone(pr1);
		
//		System.out.print("복사한 객체의 값 : ");
//		System.out.println(copy.toString());
//		
//		
//		pr1.equals(copy);

	}

}
