import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormate {
	
	
	public static void main(String args[])
	   {
		//\[datastore1\] DevShranaS1
		/*String a = "datastore1";
		String b = "DevShranaS1";
		a="["+a+"]";
		//a=a.concat("]");
		a=a.concat(" "+b);
		System.out.println(a);*/
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("A");
		set.add("B");
		set.add("C");

		if(set.size() == 1) {
			if(set.contains("A")) {
				System.out.println("Deployed");
			}
		} else {
			System.out.println("Not Deployed");
		} 
}
	   }

