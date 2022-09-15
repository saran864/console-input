package maptoday;
import java.util.*;
public class maptutorial {
	
	public static void main(String[] args) {
		HashMap hm=new HashMap();//defualt size = 16
		hm.put("Saran",8101);
		hm.put("karan",8103);
		hm.put("kiran",8106);
		hm.put("pavan",8102);
		
		System.out.println(hm);
		
		Set s=hm.keySet();
		System.out.println(s); //prints only keys - set of keys.
		
		Collection c=hm.values();//prints only values -collection of values.
		System.out.println(c);
		
		Set e=hm.entrySet();//prints entry - entire set.
		System.out.println(e);
		
		HashMap hm2=new HashMap();
		hm2.putAll(hm);
		
		System.out.println(hm2);
		
		System.out.println(hm2.get("Saran"));
		
		System.out.println(hm2.containsKey("harish"));
		
		System.out.println(hm2.containsValue(8101));
		
		System.out.println(hm2.remove("karan"));
		
		System.out.println(hm2.size());
		
	}

}
