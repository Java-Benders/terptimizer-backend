package scheduleBuilderRunner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Runner
{

	public static void main(String[] args)
	{
		String jsonString = args[0]; 
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
		
		
		JSONArray requestedClasses= (JSONArray) inputs.get("requestedClasses");
		
		//ScheduleCreator creator = new ScheduleCreator(requestedClasses)
		
		
	}

}
