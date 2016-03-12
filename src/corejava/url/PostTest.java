package corejava.url;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class PostTest {


	public static void main(String[] args) {
		HttpClient httpClient = HttpClientBuilder.create().build(); 
		try {
			HttpPost request = new HttpPost("http://localhost:8080/register");
			StringEntity params =new StringEntity("userJson={\"id\":\"100\",\"age\":\"20\",\"name\":\"Purnima\"}");
			//			request.addHeader("content-type", "application/x-www-form-urlencoded");
			request.addHeader("content-type", "application/json");
			request.setEntity(params);
			HttpResponse response = httpClient.execute(request);
			System.out.println(response);
			// handle response here...
		}catch (Exception ex) {
			// handle exception here
		} finally {
			httpClient.getConnectionManager().shutdown(); //Deprecated
		}
	}

}
