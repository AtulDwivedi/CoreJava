package corejava.onmobile;

import java.util.ArrayList;
import java.util.List;

public final class Test {
	public static void main(String[] args) {
		String s = "aaeaeeiiiaouuuu";
		String ms = "";
		String ar = "";
		System.out.println(s.contains("l"));
		System.out.println(s.indexOf("a"));
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				ms = ms + s.charAt(i);
				ar = ar + s.charAt(i);
			} else {
				if (s.charAt(i) == s.charAt(i-1)) {
					ms = ms + s.charAt(i);
				} else if (!(ar.contains(s.charAt(i) + ""))) {
					ms = ms + s.charAt(i);
					ar = ar + s.charAt(i);
				}

			}
List l  = new ArrayList<String>();
		}
		System.out.println(ms);
	}
}
