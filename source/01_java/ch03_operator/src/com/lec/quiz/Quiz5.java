package com.lec.quiz;

import java.util.Scanner;

//����, ����, ���� ������ ����ڿ��� �Է¹޾�, �� ������ ����ϰ� ����, ���(�Ҽ���2�ڸ�����) ����ϴ� ���α׷��� ���� �Ͻÿ�
public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int kor = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int eng = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int mat = sc.nextInt();
		int tot = kor + eng + mat;
		double avg = (double)tot /3;
		System.out.println("���� :"+kor+"\t���� : "+eng+"\t���� : "+mat);
		System.out.printf("���� : %d\t��� : %.2f\n",tot, avg);
	}
}
