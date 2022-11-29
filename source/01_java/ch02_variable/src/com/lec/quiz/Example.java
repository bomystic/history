package com.lec.quiz;

public class Example {
	public static void main(String[] args) {
		int kor = 100;
		int eng = 99;
		int mat = 100;
		int tot = kor + eng + mat;
		double avg = (double)tot /3;
		System.out.println("국어 : "+kor+"\t영어 : "+eng+"\t수학 : "+mat);
		System.out.printf("총점 : %d\t평균 : %.2f\n",tot, avg);
	}
}
