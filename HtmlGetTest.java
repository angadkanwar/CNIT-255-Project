import java.io.*;
import java.net.*;
import java.util.*;
// import org.json.JSONObject;
// import org.json.JSONException;

// public class HtmlGetTest {

// 	public static String getHTML(String urlToRead) throws Exception {
// 		StringBuilder result = new StringBuilder();
// 		URL url = new URL(urlToRead);
// 		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
// 		conn.setRequestMethod("GET");
// 		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
// 		String line;
// 		while ((line = rd.readLine()) != null) {
// 			result.append(line);
// 		}
// 		rd.close();
// 		return result.toString();
// 	}

// 	public static void main(String[] args) throws Exception
// 	{
// 		System.out.println(getHTML(args[0]));
// 	}
// }

public class HtmlGetTest {

	public static String getHTML(String urlToRead) throws Exception {
		StringBuilder result = new StringBuilder();
		URL url = new URL(urlToRead);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line;
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		rd.close();
		return result.toString();
	}

	public static String getCurrentTime (String urlToRead) throws Exception {
		StringBuilder result = new StringBuilder();
		URL url = new URL(urlToRead);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line;
		while ((line = rd.readLine()) != null) {
			result.append(line);
			//System.out.println(line);
		}
		rd.close();
		return result.toString();
		// JSONObject jsonObj = new JSONObject(result);
		// String time = jsonObj.getString("formatted");
		// return time;
	}

	public static void main(String[] args) throws Exception
	{
		// System.out.println(getHTML(args[0]));
		//System.out.println(getHTML("http://api.timezonedb.com/v2/get-time-zone?key=U5M24CM8VUSS&format=json&by=zone&zone=America/Indiana/Indianapolis"));
		//String totalOutput = getHTML("http://api.timezonedb.com/v2/get-time-zone?key=U5M24CM8VUSS&format=json&by=zone&zone=America/Indiana/Indianapolis");
		// String timeTotal = getCurrentTime("http://api.timezonedb.com/v2/get-time-zone?key=U5M24CM8VUSS&format=json&by=zone&zone=America/Indiana/Indianapolis");
		// System.out.println(time.substring(285, time.length()-2));
		System.out.println("Start here:");
		String time = "";
		while (true) {
			time = getCurrentTime("http://api.timezonedb.com/v2/get-time-zone?key=U5M24CM8VUSS&format=json&by=zone&zone=America/Indiana/Indianapolis");
			System.out.println(time.substring(285, time.length()-2));
			Thread.sleep(5000);
		}
	}
}
