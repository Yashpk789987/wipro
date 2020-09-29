package utils;

import java.util.ArrayList;
import java.util.HashMap;

public class Factorials {
	public static ArrayList<HashMap<String, Integer>> generateListOfFactorials(int n) throws Exception {
		ArrayList<HashMap<String, Integer>> al = new ArrayList<HashMap<String, Integer>>();
		for (int i = 1; i <= n; i++) {
			int p = 1;
			HashMap<String, Integer> obj = new HashMap<String, Integer>();
			for (int j = i; j > 0; j--) {
				p = p * j;
			}
			obj.put("number", i);
			obj.put("factorial", p);
			al.add(obj);
		}
		return al;
	}
}
