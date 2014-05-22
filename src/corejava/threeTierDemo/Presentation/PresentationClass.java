package corejava.threeTierDemo.Presentation;
import java.io.*;
import java.util.Scanner;

import corejava.threeTierDemo.ServiceLayer.ServiceFactory;
import corejava.threeTierDemo.ServiceLayer.ServiceInterface;

public class PresentationClass {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));
		
		ServiceInterface obj = ServiceFactory.factoryMethod();
		Scanner cs = new Scanner(System.in);
		
		showMenu(br, obj, cs);
					
	}

	private static void showMenu(BufferedReader br, ServiceInterface obj,
			Scanner cs) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("1 Register");
		System.out.println("2 Login");
		System.out.println("0 Exit");
		
		
		int val = cs.nextInt();
		
		if(val ==0) 
			System.exit(0);
		else if(val ==1)
			register(br, obj, cs);
		else if(val==2)
			login(br, obj, cs);
		else
			System.out.println("Wrong choice");
		
	}

	private static void login(BufferedReader br, ServiceInterface obj,
			Scanner cs) throws IOException{
		// TODO Auto-generated method stub
		String str[] = new String[2];

		for (int i = 0; i < 2; i++) {
			str[i] = br.readLine();
		}
		
		if (obj.login(str[0], str[1])) {
			System.out.println("Hello "+str[0]);
			showMenu(br, obj, cs);
		}
		else {
			System.out.println("Login failed.");
			showMenu(br, obj, cs);
		}
	}

	private static void register(BufferedReader br, ServiceInterface obj, Scanner cs)
			throws IOException {
		// TODO Auto-generated method stub
		String str[] = new String[3];

		for (int i = 0; i < 3; i++) {
			str[i] = br.readLine();
		}

		if(obj.register(str[0], str[1], str[2])){
			System.out.println(str[0]+" Registered Successfuly!");
			myMenu(br, obj, cs);
		}
		else{
			System.out.println("Registration failed");
			showMenu(br, obj, cs);
		}
		

	}
	
	
	
	
	
	
	private static void myMenu(BufferedReader br, ServiceInterface obj,
			Scanner cs) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("1 Update");
		System.out.println("0 Logout");

		int val = cs.nextInt();

		if (val == 0)
			showMenu(br, obj, cs);
		else if (val == 1)
			update(br, obj, cs);
		else
			System.out.println("Wrong choice");
	}
	
		
	private static void update(BufferedReader br, ServiceInterface obj, Scanner cs)
			throws IOException {
		// TODO Auto-generated method stub
		String str[] = new String[2];

		for (int i = 0; i < 2; i++) {
			str[i] = br.readLine();
		}
		String str2=obj.update(str[0], str[1]);
		if(!str.equals(null)){
			System.out.println(str2+" Updated Successful");
			myMenu(br, obj, cs);
		}
		else{
			System.out.println("Updation failed");
			myMenu(br, obj, cs);
		}
	
	
	}}
