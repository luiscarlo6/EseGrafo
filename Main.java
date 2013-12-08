import java.lang.*;

public class Main {
 

    public static void main(String args[]) {
    	Arco a1,a2;
    	Object a3;
    	String src,dst;
    	Boolean iguales;
    	a1 = new Arco("dos","tres");
    	a2 = new Arco("tres","cuatro");
    	
	System.out.println("\nEstos se parecen a los arcos!s=\n");
	System.out.println("\nYo creo que no son!\n");
	System.out.println(a1.toString());
    	System.out.println(a2.toString());
    	   	
    	iguales = a1.equals(a2);
    	
    	System.out.println(iguales);
    	
    	
    }
}
