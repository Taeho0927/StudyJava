package Dojang.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class 사이냅소프트면접문제 {

	public static void main(String[] args) {
		//주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.
		// [이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌]
		//김씨와 이씨는 각각 몇 명 인가요?
		//"이재영"이란 이름이 몇 번 반복되나요?
		//중복을 제거한 이름을 출력하세요.
		//중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요..
		String names ="이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		String[] namelist = names.split(",");
		
		int leecount = 0,kimcount = 0;
		int twicename=0;
		
		for(int i=0;i<namelist.length;i++) {
			if(namelist[i].matches("김.*")) {
				kimcount+=1;
			}
			if(namelist[i].matches("이.*")) {
				leecount+=1;
			}
			if(namelist[i].matches("이재영")) {
				twicename+=1;
			}
		}
		HashSet<String> setnames =new HashSet<>(Arrays.asList(namelist));	
		String[] resultArr = setnames.toArray(new String[0]);
		System.out.printf("김씨는 %d 명, 이씨는 %d 명 입니다.",kimcount,leecount);
		System.out.println();
		System.out.printf("이재영이라는 이름은 %d번 반복됩니다",twicename);
		System.out.println();
		String nn = Arrays.toString(resultArr);
		System.out.println("중복을 제거한 이름 리스트"+nn);
		String[] sortedname =  resultArr;
		Arrays.sort(sortedname);
		System.out.print("오름차순 정렬");
		for(int i =0;i<sortedname.length;i++) {
			System.out.print("["+sortedname[i]+"]");
		}
		 
	}
}


