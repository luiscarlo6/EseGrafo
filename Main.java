import java.lang.*;

public class Main {
 

    public static void main(String args[]) {
    	Arco a1,a2;
    	Object a3;
    	String src,dst;
    	Boolean iguales;
    	a1 = new Arco("dos","tres");
    	a2 = new Arco("tres","cuatro");
    	
	//System.out.println("\nEstos son Arcos=\n");
	//System.out.println(a1.toString());
    	//System.out.println(a2.toString());
    	   	
    	iguales = a1.equals(a2);
    	
    	System.out.println(iguales);
    	
    	
    }
}
