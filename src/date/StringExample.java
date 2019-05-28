package date;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringExample {
	
	
	public String conversion(String version){
		String standardFormat = "";
		String actulString = version.toUpperCase().replace("-", "_").replace(" ", "_");
		System.out.println("Replaced Streing :" + actulString);
		if(actulString !=null && actulString.contains("_SP") || actulString.contains("_P")){
			String [] splitV = actulString.split("_");
			standardFormat = standardFormat + splitV[0];
			
			if(splitV.length > 1){
				if(splitV[1] != null && splitV[1].length() > 0 && splitV[1].charAt(0) == 'P'){
					standardFormat = standardFormat +".0";
					standardFormat = standardFormat +"."+ splitV[1].substring(1,2);
				} else {
					if(splitV[1] != null && splitV[1].length() > 0)
						standardFormat = standardFormat +"."+ splitV[1].substring(2);
				}
			}
			
			if(splitV.length > 2)
				standardFormat = standardFormat +"."+ splitV[2].substring(1,2);
			System.out.println("Input Format: "+actulString+" to standardFormat:"+standardFormat);
			return standardFormat = String.valueOf(convertToInteger(standardFormat));
			
		}else if(actulString !=null && actulString.contains("_")){
			 standardFormat = actulString.replace("_",".");
			 return standardFormat = String.valueOf(convertToInteger(standardFormat));
		}
			System.out.println(String.valueOf(convertToInteger(actulString)));
			return String.valueOf(convertToInteger(actulString));
			
			
				}
	
	public static Integer convertToInteger(String version){
		
		String [] splitVersion = version.split("\\.");
		String zeroString = "000";
		String convertedVersionInInt="";
		
		for(String vers : splitVersion){
			convertedVersionInInt= convertedVersionInInt+vers;
		}
		System.out.println("convertedVersionInInt:"+convertedVersionInInt);
		
		if(convertedVersionInInt.length() < 4){			
			convertedVersionInInt = convertedVersionInInt + zeroString.substring(0, 4-convertedVersionInInt.length());
		}
		
		System.out.println("version::"+version+" convertedVersionInInt:"+convertedVersionInInt+"");
		
		return Integer.parseInt(convertedVersionInInt);
	}

	/*public static Integer convertToInteger(String version){
		
		String [] splitVersion = version.split("\\.");
		String zeroString = "0000";
		StringBuilder convertedVersionInInt=new StringBuilder();
		
		for(String vers : splitVersion){
			convertedVersionInInt.append(vers.trim());
		}
		System.out.println("convertedVersionInInt:"+convertedVersionInInt);
		
		if(convertedVersionInInt.length() < 4){			
			 convertedVersionInInt.append(zeroString.substring(4-convertedVersionInInt.length()));
		}
		
		System.out.println("version::"+version+" convertedVersionInInt:"+convertedVersionInInt+"");
		
		return Integer.parseInt(convertedVersionInInt.toString());
	}
	*/
	/*public String conversion(String version){
		
		String actualString = version.replace("-", "_");
		String standardFormat = "";
		String finalString = "";
		//List<String> dummyString = new ArrayList<>();
		
		
		 * Coverts the Agent version (EX: 7.2_SP3_P1) to Standard Format 7.2.3.1	
		 * 7.2_SP3 => 7.2.3.0
		 * 	7.2_P6 => 7.2.0.6
		 * 7.2 => 7.2.0.0
		 * 7.2 SP3 P1
		 * 7.2 SP3_P1
		 * 7.2_SP3_P1
		 * 7.2 SP3-P1
		 * 7.2-SP3_P1
		 * 7.2-SP3-P1
		 * 7.2-P1
		 * 7.2-SP3
		 * 
		
		System.out.println(version.trim());
		
		if(actualString != null && actualString.contains("_SP") || (actualString.contains("_P"))){
			
			//finalString = actualString.replace("-", "_");
			
			System.out.println("finalString:-->" + actualString);
			
			String [] splitV = actualString.split("_");
				standardFormat = standardFormat + splitV[0];
			if(splitV.length > 1){
				if(splitV[1].charAt(0) == 'P'){
					standardFormat = standardFormat +".0";
					standardFormat = standardFormat +"."+ splitV[1].substring(1,2);
				} else {
					standardFormat = standardFormat +"."+ splitV[1].substring(2);
				}
			}
			if(splitV.length > 2)
			standardFormat = standardFormat +"."+ splitV[2].substring(1,2);
			System.out.println("Input Format: "+actualString+" to standardFormat:"+standardFormat);
			return standardFormat;
			
		} else if (actualString !=null && actualString.contains("_")){
			standardFormat = actualString.replace("_", ".");
			System.out.println("Input Format: "+actualString+"Else If block & convertedString" + standardFormat);
			return standardFormat; 
		}
			return actualString;
	}
	*/
	public static void main(String args[]){
		
		//String version ="7.2_3.6";
		String version = "7.2 sP9 P1";
		
		StringExample se = new StringExample();
		System.out.println("Final output:" + se.conversion(version));
		//System.out.println("Conveting Integer"+ se.convertToInteger(version));
		
		
	}

}
