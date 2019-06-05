
public class ThreadExample extends Thread {
	
	public static void main (String[] args){
		
		System.out.println("Hi");
		
		
	}
	
	public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running"); 
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
	

}
