package Example;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
	//Vector vr=new Vector();  //constructor without size
	//Vector vr=new Vector(2);  //constructor with size
	Vector vr=new Vector(2,1);// size with increments
	    vr.add('c');
	    vr.add("saran");
	    vr.add(23);
	    System.out.println(vr);
	    System.out.println("capacity ="+vr.capacity());
	    System.out.println("size ="+vr.size());
	    //access with index
	    for(int i=0;i<3;i++)
	    	System.out.print(vr.elementAt(i)+" ");
	    vr.insertElementAt("i am saran",2);
	    System.out.println();
	    //
	    for(int i=0;i<4;i++)
	    	System.out.print(vr.elementAt(i)+" ");
	    System.out.println();
	    vr.remove("i am saran");
		    for(int i=0;i<3;i++)
		    	System.out.print(vr.elementAt(i)+" ");
		    System.out.println();
		   
		    
	    
	}
     

}
