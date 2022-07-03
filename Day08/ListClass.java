package Day08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;


public class ListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList
		ArrayList<String> al =  new ArrayList<>();
		al.add("1");
		al.add("100");
		al.add("myblog");
		al.add(1,"newone");
		System.out.println(al+" size() : "+al.size());
		al.remove(2);
		System.out.println(al+" size() : "+al.size());
		System.out.println(al.get(2));
		System.out.println(al.contains("myblog"));
		
		//for문으로 get
		for (int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//Iterator로 get
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//ArrayList vs LinkedList
		//1.읽기 테스트
		ArrayList al3 = new ArrayList();
		LinkedList ll3 = new LinkedList();
		
		for(int i =0;i<100;i++) {
			al3.add(i);
			ll3.add(i);
		}
		
		long t1 = System.currentTimeMillis();
		for(int i=0;i<50;i++) {
			al3.get(i);
		}
		long t2 = System.currentTimeMillis();
		for(int i=0;i<50;i++) {
			ll3.get(i);
		}
		long t3 = System.currentTimeMillis();
		
		System.out.println("ArrayList : " +(t2-t1)+"ms");
		System.out.println("LinkedList : " +(t3-t2)+"ms");
		
		//2.중간에 삽입 테스트
		t1 = System.currentTimeMillis();
		for(int i=0;i<100;i++) {
			al3.add(50,i);
		}
		t2 = System.currentTimeMillis();
		for(int i=0;i<100;i++) {
			ll3.add(50,i);
		}
		t3 = System.currentTimeMillis();
		
		System.out.println("ArrayList : " +(t2-t1)+"ms");
		System.out.println("LinkedList : " +(t3-t2)+"ms");
	}

}
class Cat{
	int legs;
}