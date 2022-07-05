package Dojang.Lv1;

import java.util.Arrays;
import java.util.Scanner;

public class MakeAvg {

	public static void main(String[] args) {
		//리스트에 있는 숫자들의 평균을 구하는 프로그램을 만들어라.
		//[4, 6, 8] = 6
		//[11, 17, 20, 24] = 18
		//[26, 33, 45, 51, 60] = 43
		//평균 : 자료의 값의 총합을 자료의 개수로 나눈 값
		int avg=0;
		String ints="";
		Scanner sc = new Scanner(System.in);
		String[] user_input = sc.next().split(",");
		int [] nums = Arrays.stream(user_input).mapToInt(Integer::parseInt).toArray();
		for(int i = 0; i<nums.length;i++) {
			avg += nums[i];
		}
		System.out.println((double)avg/nums.length);
		
		
	}

}
