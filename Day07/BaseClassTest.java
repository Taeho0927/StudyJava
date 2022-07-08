package Day07;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;


public class BaseClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "";
		StringBuffer str2 = new StringBuffer("");
		
		long t1 = System.currentTimeMillis();
		for(int i=0;i<100;i++) {
			str1 = str1+i;
		}
		long t2 = System.currentTimeMillis();
		for(int i=0;i<100;i++) {
			str2.append(i);
		}
		long t3 = System.currentTimeMillis();
		
		System.out.println("String Duration : "+(t2-t1));
		System.out.println("StringBuffer Duration : "+(t3-t2));
		
		//StringBuffer
		StringBuffer sb1 = new StringBuffer("abcdefg");
		StringBuffer sb2 = new StringBuffer("abcdefg");
		
		//StringBuffer의 값 비교하는 방법
		System.out.println(sb1==sb2);
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		//StringBuffer insert, delete
		sb1.delete(4, 6);
		System.out.println(sb1);
		
		sb1.insert(2, 218736517);
		System.out.println(sb1);
		
		// Date, SimpleDateFormat
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		System.out.println(d);
		System.out.println(sf.format(d));
		
		//Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
	}

}
