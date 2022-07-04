package Dojang.Lv1;

import java.util.Scanner;

public class Fibonacci {
	//피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 
	//이후의 항들은 이전의 두 항을 더한 값으로 이루어지는 수열을 말한다.
	//예) 0, 1, 1, 2, 3, 5, 8, 13
	//인풋을 정수 n으로 받았을때, n 이하까지의 피보나치 수열을
	//출력하는 프로그램을 작성하세요
	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}
		else {
			return (fibo(n-2))+(fibo(n-1));
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("몇까지 출력하실건가요?");
		int user_input = sc.nextInt();
		for (int i=0;i<user_input;i++) {
			System.out.print(fibo(i)+",");
		}
	}
}
