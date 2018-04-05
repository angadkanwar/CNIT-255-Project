import java.io.*;
import java.net.*;
import java.util.*;

public class HtmlGetTest {

	public static String getCurrentTime (String urlToRead) throws Exception {
		StringBuilder result = new StringBuilder();
		URL url = new URL(urlToRead); //creates link to URL passed in
		HttpURLConnection conn = (HttpURLConnection) url.openConnection(); //opens connection to the URL
		conn.setRequestMethod("GET"); //sets default request to get in order to pull information
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream())); //create continuous reader for stream
		String line;
		while ((line = rd.readLine()) != null) {
			result.append(line); //add to the line as stream continues
		}
		rd.close(); //close the reader when information is obtained
		return result.toString();
	}

	public static void main(String[] args) throws Exception
	{
		String time = "";
		while (true) {
			// calls method to obtain full string of current time information
			time = getCurrentTime("http://api.timezonedb.com/v2/get-time-zone?key=U5M24CM8VUSS&format=json&by=zone&zone=America/Indiana/Indianapolis");
			System.out.println(time.substring(285, time.length()-2)); //prints only the minimally necessary part
			Thread.sleep(2000); //delays API call for 2 full seconds
		}
	}
}
