package thisKeyord;

public class CurrentClassObject {
	
	public CurrentClassObject() {
		
		this(10,20);
		System.out.println("i am from default condtructer");
		
	}
	
	
	public CurrentClassObject(int i, int j) {
		
		System.out.println("a--" +i+ " & b--"+ j);
	}

	
	public static void main(String args[]){
		
		CurrentClassObject ThisKeyWord = new CurrentClassObject();
		
	}
	
}
