package com.lec.loop;

public class Ex05_breakcontinue {
	public static void main(String[] args) {
		for(int i=1 ; i<=5 ;i++) { //i<=5 �� ������ ���ѹݺ������� ���������� ����
			if(i==3)
				//break; // �ݺ��� ����� ���� ����
				continue; // ���������� �ö�
			System.out.println(i);
		}//for
	}//main
}//class
