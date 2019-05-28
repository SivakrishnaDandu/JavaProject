package thisKeyord;

public class CurrentClassConstructor {
	
	int a =10;
	int b=20;
	
	public CurrentClassConstructor() {
		this(33,44);
		System.out.println("Default ..!" + "a----"+a+"b----"+b);
		
	}

	public CurrentClassConstructor(int i, int j) {
		this.a=i;
		this.b=j;
		System.out.println("from Parameterized constructer"+ "a--" +i+ "b--" + j);
		
	}

	
	public static void main (String args[]){
		
		CurrentClassConstructor cr = new CurrentClassConstructor();
	}
}
