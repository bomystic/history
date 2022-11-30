package com.lec.loop;

public class Ex08while {
	public static void main(String[] args) {
		int tot = 0; // 누적합 변수
		int i = 1;
		while(i<=10) {
			tot += i;
			System.out.printf("i가 %d일떄 누적 값은 %d이다\n",i,tot);
			i++;
		}
//		for(int i=1 ; i<=10 ; i++) {
//			tot += i;
//			System.out.printf("i가 %d일떄 누적 값은 %d이다\n",i,tot);
//		}
	}

}
