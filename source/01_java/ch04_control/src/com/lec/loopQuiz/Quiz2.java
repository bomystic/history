package com.lec.loopQuiz;
//1~10���� ���� �� ¦�� �Ǵ� Ȧ���� ���� ���غ���
public class Quiz2 {
	public static void main(String[] args) {
		int h = 0;
		int d = 0;
		for(int i=1 ; i<11 ; i++) {
				if(i%2 == 0) {
					d += i;
				}else {
					h += i;
				}
		}
		System.out.println("1~10������ Ȧ���� ���� "+ h +", ¦���� ���� "+d);
		}
}
	

