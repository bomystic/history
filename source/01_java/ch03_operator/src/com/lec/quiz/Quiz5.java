package com.lec.quiz;

import java.util.Scanner;

//����, ����, ���� ������ ����ڿ��� �Է¹޾�, �� ������ ����ϰ� ����, ���(�Ҽ���2�ڸ�����) ����ϴ� ���α׷��� ���� �Ͻÿ�
public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int su1 = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int su2 = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int su3 = sc.nextInt();
		int tot = su1 + su2 + su3;
		double avg = (double)tot /3;
		System.out.println("���� :"+su1+"\t���� : "+su2+"\t���� : "+su3);
		System.out.printf("���� : %d\t��� : %.2f\n",tot, avg);
	}
}
