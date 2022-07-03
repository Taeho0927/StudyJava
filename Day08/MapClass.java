package Day08;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class MapClass {
	public static void main(String[] args) {
		HashMap hm =  new HashMap();
		
		hm.put("Name", "Lebron");
		hm.put("Age", 34);
		hm.put("Country", "Korea");
		
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.containsKey("Country"));
		
		//Map에서 데이터를 꺼내는 방법
		//1.Key를 꺼내고 그 후에 Value를 꺼내는 방법
		Set keyset = hm.keySet();
		System.out.println(keyset);
		Iterator it = keyset.iterator();
		while(it.hasNext()) {
			System.out.println(hm.get(it.next()));
		}
		
		//2.Key와 Value를 쌍으로 꺼내는 방법
		Set entryset = hm.entrySet();
		System.out.println(entryset);
		Iterator it2 = entryset.iterator();
		while(it2.hasNext()) {
			Map.Entry entry = (Map.Entry)it2.next();
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		}
	}

}
