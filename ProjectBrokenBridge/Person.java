package ProjectBrokenBridge;
import java.io.*;
public class Person implements Serializable {

	protected String name;
	protected String id ;

   public Person()throws MyException
	{ 
		this("unnamed","without Id");
	}


	public Person(String n , String iD) throws MyException
	{
	  name = n ;
     if ((iD.length()-1) <2 || iD.charAt(0) != '1')
        throw new MyException("ID is not correct");
	  id = iD ;
	}
	
   
	public String toString()
   { 
		return "Name: "+ name + "\nID: "+ id ; 
	}

   
   public String getName()
   {
		return name;
	}
   
	public String getId()
    {
		return id;
    }
}
