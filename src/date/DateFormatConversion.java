package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatConversion {
	
	public static void main(String[] args) {
		
		try {
			
			Date d = new Date();
			String dateStr = "21/12/2011";
			
			DateFormat srcDf = new SimpleDateFormat("dd/MM/yyyy");
			
			// parse the date string into Date object
			Date date = srcDf.parse(dateStr);
			
			DateFormat destDf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
			 
			// format the date into another format
			dateStr = destDf.format(date);
			
			System.out.println("Converted date is : " + dateStr);
			
			d = destDf.parse(dateStr);
			
			System.out.println(d);
			
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}