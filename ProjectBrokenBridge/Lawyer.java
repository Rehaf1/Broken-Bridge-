package ProjectBrokenBridge;
import java.util.* ;

import javax.swing.JOptionPane;


public class Lawyer extends Staff{

	  public Lawyer(String n , String id )throws MyException
	  {
		  super(n , id);
	  }
	  
     
		public void bookAppointment(Prisoner p) 
      {
		 if (p != null)
			 JOptionPane.showMessageDialog(null,"You have booked an consultation appointment with Prisoner "+ p.getName());
			  
		 else
			 JOptionPane.showMessageDialog(null, "There is no Prisoner with this name"); 
	  }
	
	public boolean verify() 
   {
		if (id.substring(0,3).equals("112"))
			return true; 
		return false ; 
	}
	  
       public String toString()
	  {
		  return "Name : " + name + "/nID : " + id;
	  }


	  
}

