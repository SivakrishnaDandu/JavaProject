package thisKeyord;


public class MethodParameter {

	int a;
	int b;
	

	public MethodParameter() {
		
		a=10;
		b = 20;
		
	}
	

	void display(MethodParameter methodParameter) {
		
		System.out.println("A & B are " + a + b);
		
	}
	
	public void get (){
		
		display(this);
		
	}
	
	
	public static void main(String args[]){
		MethodParameter methodParameter = new MethodParameter();
		methodParameter.get();
		
	}

}
