package Dojang.Lv1;

import java.util.Scanner;

public class DigitTest {

	public static void main(String[] args) {
		//양의 정수만 입력으로 받고 그 수의 자릿수를 출력해보자. 
		//ex1) 3 > 1자리수, ex2) 649 > 3자리수 ....
		Scanner sc = new Scanner(System.in);
		System.out.println("몇자리수 인지 알아볼 수를 입력하세요");
		int user_input = sc.nextInt();
		int num =0;
		String changeinput = Integer.toString(user_input);
		for(int i=1;i<=changeinput.length();i++) {
			num = i;
		}
		System.out.println(num+"자리 수 입니다.");
		
	}

}
