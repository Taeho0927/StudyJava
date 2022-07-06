package Dojang.Lv1;

import java.util.Scanner;

public class NumberOfCharacters {

	public static void main(String[] args) {
		//네이버 글자수세기 등 특정 글의 글자를 세는 프로그램은 일반적으로 공백을 제외한 글자수만을 세는 기능도 가지고 있다.
		//어떠한 문자열을 입력받았을 때 줄바꿈과 공백을 제외한 글자수만을 리턴하는 코드를 작성하시오.
		Scanner sc= new Scanner(System.in);
		int count=0,spacecount = 0,linecount =0;
		
		String str = "공백을 제외한 글자 수 만을 \n세는 코드";//입력
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				spacecount+=1;
			}
			else if(str.charAt(i)=='\n') {
				linecount+=1;
			}
			else {
				count +=1;
			}
		}
		System.out.println("공백과 줄바꿈을 제외한 글자수는 :"+count);
		System.out.println("총 공백 수 : "+spacecount);
		System.out.println("총 줄바꿈 수 : "+linecount);
	}

}
