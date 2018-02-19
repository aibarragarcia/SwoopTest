package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTime {
	
	public TestTime() {
    }
		
	
	//I'm using a dummy key as I was not able to get a valid one.
    public String getTestTime() {
    	
    		//curl -X GET --header "Accept: application/json" --header "X-apiKey: 12345" "https://waittime.api.aero/waittime/v1/current/YYC" ;
    		String url="https://waittime.api.aero/waittime/v1/current/YYC";
		String[] command = {"curl", "-X","GET", "-H", "Accept:application/json", "-H", "X-apiKey: 12345" , url};
	
    		ProcessBuilder pb = new ProcessBuilder(command);

    		pb.redirectErrorStream(true);
    		Process p;
    		String result = null;
    		try
    		{
            p = pb.start();
             BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
                StringBuilder builder = new StringBuilder();
                String line = null;
                while ( (line = reader.readLine()) != null) {
                        builder.append(line);
                        builder.append(System.getProperty("line.separator"));
                }
                result = builder.toString();
                System.out.print(result);

    		}
    		catch (IOException e)
    		{   System.out.print("error");
            e.printStackTrace();
    		}
    		
        return result;
    
    }

}
