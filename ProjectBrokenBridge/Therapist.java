package ProjectBrokenBridge;
import java.io.File;
import java.io.*;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.swing.*; 

public class Therapist extends Staff {
    
	
	
   public Therapist(String name, String id)throws MyException
   {
		super(name, id);
	}


	public void prescribeMedicine(Prisoner p)
    { 
		if (p == null)
			JOptionPane.showMessageDialog(null , "There is no Prisoner with this name");
		
		else 
		{
         if (p.getNeedsMedication() == true)
        
        	 JOptionPane.showMessageDialog(null, this, "Prisoner "+ p.getSerialNumber()+ " will need 50g a day of ***", 0);
         
	   	else
            if (p.getStrikes() >= 8)
			      {
                  bookAppointment(p);
                  JOptionPane.showMessageDialog(null, "because the prisoner's Strikes are more than 7 manditory apppointment is booked");
               }
			}
     }


	public void bookAppointment(Prisoner p) 
   {
		if (p == null)
			JOptionPane.showMessageDialog(null, "There is no Prisoner with this name");
		else
			JOptionPane.showMessageDialog(null,"You have Booked an Appoinment for "+p.getName()+" with Therapist " + this.name);
	}

		public boolean verify() 
      {
        if (id.substring(0,3).equals("111"))
			   return true ; 
	    	else 
           return false ; 
	}

}
