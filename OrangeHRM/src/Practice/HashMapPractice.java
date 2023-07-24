package Practice;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapPractice {

	public static void main(String[] args) {
		HashSet<Integer> hm=new HashSet<Integer>();
		hm.add(1);
		hm.clear();
		System.out.println((hm.size()));
		System.out.println(hm);
		HashMap<Integer ,String> H1=new HashMap<Integer ,String>();
		H1.put(1, "");
		H1.put(2, "");
		System.out.println(H1.values());
		System.out.println(H1.keySet());

	}

}
