package com.lec.ex;
// 증감연산자 : ++(1증가), --(1감소)
public class Ex02 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = ++n1; //n1을 1 증가하고 n2에 할당
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
		n2 = n1++;	//n1값을 n2에 할당한 후 1 증가
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
		n2 = --n1; //n1을 1 감소하고 n2에 할당 (전 아웃풋에서 12가 되었기 때문에 감소 후 11이 됨)
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
		n2 = n1--; //n1값을 n2에 할당한 후 1 감소
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
	}
}
