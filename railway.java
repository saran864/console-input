package TrainReserve;

public class Passenger {
    private String mailid;
	private String  name;
	private byte age;
	private String  password;
	
	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	Passenger(String mailid,String name,byte age,String password){
		this.name=name;
		this.mailid=mailid;
		this.age=age;
		this.password=password;
		
	}
	
	
	

	package TrainReserve;

import java.util.Scanner;

public class User {
	
	public  static void login(String mailid,String password)
	{
		
		
		
		
	}	
	public void Process()
	{
	boolean b=true;
	  while(b)
	  {       Scanner sc = new Scanner(System.in);
	      System.out.println("----------------------------------");
		    System.out.println("1.Signup\n2.Login\n3.SearchTrains\n3.BookTicket\n4.CancelTicket\n5.Exit");
		  System.out.println("----------------------------------");
		  int userint=sc.nextInt();
		  switch(userint)
		  {
			  case 1:
			  {
				  
				  System.out.println("Enter the Username");
				  int mailid=sc.nextInt();
				  System.out.println("Enter the Username");
				  int password=sc.nextInt();
			     login(String password,String mailid);
				  break;
			  }
			   case 2:
			  {
				  break;
			  }
			   case 3:
				  {
					  
					  break;
				  }
			   case 4:
				  {
					  break;
				  }
			   case 5:
				  {
					  break;
				  }
			  
			  
          }
	  }
}

}
	
}





package TrainReserve;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		
	ArrayList <User> user=new ArrayList <> ();
	Passenger  pr= new Passenger ("saran@gmail.com","saran",(byte)22,"sara123");
	Passenger  pr1= new Passenger ("suren@gmail.com","saran",(byte)22,"suren@123");
	Passenger  pr2= new Passenger ("manoaran@gmail.com","saran",(byte)22,"mano@123");
	Passenger  pr3= new Passenger ("raj@gmail.com","saran",(byte)22,"raj@1213");
 	 user.add(pr);
	 user.add(pr1);
	 user.add(pr2);
	 user.add(pr3);
	
	  }
	  

}
