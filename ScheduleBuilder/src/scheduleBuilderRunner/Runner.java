package scheduleBuilderRunner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//public class Runner
//{
//
//	public static void main(String[] args)
//	{
//		String jsonString = args[0]; 
//		JSONParser parser = new JSONParser();
//		JSONObject inputs;
//		try
//		{
//			inputs = (JSONObject) parser.parse(jsonString);
//		} catch (ParseException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			inputs = null;
//			System.exit(0);
//		}
//		
//		
//		JSONArray requestedClasses= (JSONArray) inputs.get("requestedClasses");
//		
//		//ScheduleCreator creator = new ScheduleCreator(requestedClasses)
//		
//		
//	}
//
//}

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Extend HttpServlet class
public class Runner extends HttpServlet
{

	private String message;

	public void init() throws ServletException
	{
		// Do required initialization
		message = "Hello World";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String jsonString = request.getParameter("requestedClasses");
		JSONParser parser = new JSONParser();
		JSONObject inputs;
		try
		{
			inputs = (JSONObject) parser.parse(jsonString);
		} catch (ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			inputs = null;
			System.exit(0);
		}

		JSONArray requestedClasses = (JSONArray) inputs.get("requestedClasses");

		// ScheduleCreator creator = new ScheduleCreator(requestedClasses)
		
		// Set response content type
		response.setContentType("String");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		//TODO: remember to implement this
		String scheduleList = "";
		// String scheduleList = creator.getSchedules();
		out.println(scheduleList);
	}

	public void destroy()
	{
		// do nothing.
	}
}