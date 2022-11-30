package com.lec.loop;
// 결과1 : 1~20까지 누적 합은 210
// 결과2 : 1+2+3+4+5+6+7+8+9+10+11+12+13+14+15+16+17+18+19+20=210
public class Ex02for {
	public static void main(String[] args) {
		int tot = 0; // 누적 합을 위한 변수 (증감된 상태에서 누적합이 올라간다)
		for(int i=1 ; i<=20 ; i++) {
			System.out.print(i);
			if(i!=20) {
				System.out.print('+');
			}
			tot += i; //tot = tot + i ; //결과1
		}
		System.out.println(" = " + tot);

	}
}
