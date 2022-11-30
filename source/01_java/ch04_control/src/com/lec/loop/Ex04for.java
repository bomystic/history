package com.lec.loop;
// 출력 15~50 한줄에 5개씩 출력
public class Ex04for {
	public static void main(String[] args) {
		for(int i=15 ; i<=50 ; i++) {
			System.out.print(i + "\t");
			if(i%5 == 4) {
				System.out.println();
			}//if
		}//for
	}//main
}//class
