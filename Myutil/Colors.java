package Myutil;

import java.util.Random;

public class Colors {
	public static String RED = "\033[31m";
	public static String GREEN = "\033[32m";
	public static String YELLOW = "\033[33m";
	public static String BLUE = "\033[34m";
	public static String MAGENTA = "\033[35m";
	public static String CYAN = "\033[36m";
	public static String WHITE = "\033[37m";
	public static String BLACK = "\033[30m";
	
	public static String REDBG = "\033[101m";
	public static String GREENBG = "\033[102m";
	
	public static String END = "\033[0m";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RED+"RED"+END);
		System.out.println(GREENBG+"   "+END);

	}
	
	public static void p(String title) {
		System.out.println("*********************");
		Random rd= new Random();
		int color = rd.nextInt(0,256);
		System.out.println("\033[38;5;"+ color +"m"+title+END);
		System.out.println("*********************");
	}

}
