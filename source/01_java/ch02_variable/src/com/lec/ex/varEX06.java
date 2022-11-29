package com.lec.ex;
// 형변환 (타입변환)
public class varEX06 {
	public static void main(String[] args) {
		int i = 10;
		double d = i; // d = 10.0  묵시적인 형변환 (할당하려는 값보다 작을때 데이터 손실이 없다.)
		System.out.println("d = " + d);
		i = (int)10.6; // 명시적인 형변환 (데이터 손실이 생길 수 있기 때문에 (명시)해주어야 한다.)
		System.out.println("i = " + i);
	}

}