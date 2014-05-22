package important;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestYourJava {
	
	public static void main(String[] args) {
		int larger, smaller;
		
		/*InputStreamReader isr = null;
		BufferedReader br = null;
		
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
		*/
			
					String str ="1,2,3"; 
					String[] s = str.split(",");
					
					List<Integer> list = new ArrayList<>();
					
				for (int i = 0; i < s.length; i++) {
					list.add(Integer.parseInt(s[i]));
				}
				
				Collections.sort(list);
				
				larger = list.get(1) * list.get(1) + list.get(2) * list.get(2);
				smaller = list.get(0) * list.get(0) + list.get(1) * list.get(1);
				System.out.println(larger-smaller);
				String s2 = "65";
				System.out.println((char)65);
					/*
		char[] c = str.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			System.out.print((int)c[i]);
		}
		*/		
		/*			try {
						str = br.readLine();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println(str);
			
			try {
				isr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
*/		
	}

}
