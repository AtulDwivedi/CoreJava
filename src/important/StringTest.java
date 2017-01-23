package important;

import java.util.Base64;

public class StringTest {
public static void main(String[] args) {
	String base64 = Base64.getEncoder().encodeToString("This is shipping document.".getBytes());
	System.out.println("This is shipping document.".getBytes());
	System.out.println(base64);
}
}
