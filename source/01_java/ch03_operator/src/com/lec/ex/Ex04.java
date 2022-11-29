package com.lec.ex;
// 논리연산자 : &&(AND),||(OR), !
public class Ex04 {
	public static void main(String[] args) {
		int i=1, j=10, h=10;
		System.out.println("&& : (i<j) && (++j>h) 는" + ((i<j) && (++j>h)) );
		System.out.println("j = " + j); //j=11
		// &&연산의 경우 좌향이 false의 경우 우향의 값은 보지 않는다.
		System.out.println("&& : (i>j) && (++j>h) 는" + ((i>j) && (++j>h)) );
		System.out.println("j = " + j); //j=11 그대로 첫번째 값이 true가 아니기 때문에
		// ||연산의 경우 둘중 하나만 참이여도 true 계산 방법만 다름
		System.out.println("|| : (i<j) || (++j>h) 는" + ((i<j) || (++j>h)) );
		System.out.println("j = " + j); // 좌향 값이 true 때문에 우향은 보지 않는다.
		System.out.println("|| : (i>j) || (++j>h) 는" + ((i>j) || (++j>h)) );
		System.out.println("j = " + j); //좌향이 false인 경우 우향을 계산 한다 j=12
	}

}
