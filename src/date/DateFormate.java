package date;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormate {

	public static void main(String args[])
	   {/*
	       Date todaysDate = new Date();
	       DateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	       String custumDate = "Thu Nov 2017 12:00:01";
	       //String custumDate = "Thu Nov 30 12:00:01 2017";
		    
	       try
	       {
	    	   
	    	   Date output = df2.parse(custumDate);
	            
	            
	       }catch (Exception ex ){
	          System.out.println(ex);
	       }*/
		
		String date="2013-09-06 14:15:11.557";
	   // DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    DateFormat df1=new SimpleDateFormat("dd MM yyyy HH:mm:ss.SSS");
		 Date d = null;
		try {
			
			Date format = df1.parse(date);
			System.out.println(format);
			//d = df1.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	   // df=new SimpleDateFormat("yyyy-MMM-dd hh:mm");
	  //  System.out.println(df.format(d));
}
	   }

