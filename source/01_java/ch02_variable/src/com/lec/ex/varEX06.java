package com.lec.ex;
// ����ȯ (Ÿ�Ժ�ȯ)
public class varEX06 {
	public static void main(String[] args) {
		int i = 10;
		double d = i; // d = 10.0  �������� ����ȯ (�Ҵ��Ϸ��� ������ ������ ������ �ս��� ����.)
		System.out.println("d = " + d);
		i = (int)10.6; // ������� ����ȯ (������ �ս��� ���� �� �ֱ� ������ (���)���־�� �Ѵ�.)
		System.out.println("i = " + i);
	}

}