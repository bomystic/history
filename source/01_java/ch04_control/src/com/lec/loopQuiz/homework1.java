package com.lec.loopQuiz;

import java.util.Scanner;

//��ǻ�Ϳ� ���������� ������ -1�� �Է��Ҷ����� ���ѹݺ��ϴ� ������ �ۼ��Ͻÿ�.
//(��, ������� 0, ������� 1, ����� 2, ���Ḧ ���ϸ� -1�� �Է��մϴ�)
public class homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int you, computer;
		while(true) {
			System.out.println("����(0),����(1),��(2) �� �ϳ��� �����ϼ���.(�����: -1) : ");
			you = sc.nextInt();
			if(you==-1) break;
			computer = (int)(Math.random()*3);
			
			
		}
	}
}
