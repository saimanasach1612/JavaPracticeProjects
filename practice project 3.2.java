package methodsimplement;



public class METHODEXEC {

public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
}

public static void main(String[] args) {

	METHODEXEC b=new METHODEXEC();
	int ans= b.multipynumbers(10,3);
	System.out.println("Multipilcation is :"+ans);
	}



    }