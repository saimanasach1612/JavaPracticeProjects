package newAccessModifiers;
public class AccessModifiers {
	public void methodpublic() {
		System.out.println("this is public method");
	}
	public void methodPrivate() {
		System.out.println("this is private method");
	}
	public void methodDefault() {
		System.out.println("this is default method");
		
	}
	public void methodProtected() {
		System.out.println("this is protected method");
	}
	
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		
		obj.methodpublic();
		obj.methodPrivate();
		obj.methodDefault();
		obj.methodProtected();
	
		
	}
}