package com.lec.loop;
// ���1 : 1~20���� ���� ���� 210
// ���2 : 1+2+3+4+5+6+7+8+9+10+11+12+13+14+15+16+17+18+19+20=210
public class Ex02for {
	public static void main(String[] args) {
		int tot = 0; // ���� ���� ���� ���� (������ ���¿��� �������� �ö󰣴�)
		for(int i=1 ; i<=20 ; i++) {
			System.out.print(i);
			if(i!=20) {
				System.out.print('+');
			}
			tot += i; //tot = tot + i ; //���1
		}
		System.out.println(" = " + tot);

	}
}