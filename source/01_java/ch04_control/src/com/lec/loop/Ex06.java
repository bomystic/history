package com.lec.loop;
// loop문을 작성할 때는 무한반복문에 들어가지 않도록 주의
public class Ex06 {
	public static void main(String[] args) {
		for(int i=1; ; i++) { // 무한반복문에 빠짐.
			System.out.println(i + ", 안녕하세요");
		}
		//System.out.println("무한루프");
	}
}
