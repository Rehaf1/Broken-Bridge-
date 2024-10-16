package ProjectBrokenBridge;

public class Prisoner  extends Person {
	private String timeDue;
	private String crimeType ;
	private int strikes ;
	private String SerialNumber;
	private boolean needsMedication ;
	

	public Prisoner(String name , String id , String timeDue , String crimeType , int strikes  , boolean medication ) throws MyException
   {
		super(name,id);
		this.timeDue = timeDue ; 
		this.crimeType = crimeType ; 
		this.strikes = strikes ; 
		      if (medication == true)
	         needsMedication = true ; 
		     else 
		    	 needsMedication = false ; 
	}
   
	
	public boolean checkStrikes()
    { 
		if (strikes> 5)
			{
            if (strikes > 8 )
			 	System.out.println("Strikes are over 8 you have to call a Therapist");
			   return true;
         }
		else
        return false ; 
		
		
	}
	
	
	public void generateSerialNumber(String cellNumber)
	{ 
         SerialNumber = cellNumber+ (int)Math.random()*100;
   }
   
   
	@Override
	public String toString() 
	{
		return "Prisoner Information : \nName : " + name+"\nID : " + id+ "\nTime Due :" + timeDue + "\nCrime Type : " + crimeType + "\nStrikes=" + strikes + "\nSerial Number="
				+ SerialNumber + "\nNeeds Medication=" + needsMedication + "\n" ;
	}
	
   
   	public String getSerialNumber()
      {
        return SerialNumber ;
      }
    
    
	public boolean getNeedsMedication() 
  	{
     return needsMedication;
   }


	public void setNeedsMedication(boolean needs) 
	{
         needsMedication = needs;
   }


	public int getStrikes() 
	{ 
     return strikes ; 
   }


	public void setStrikes(int strikes) 
   {
     this.strikes = strikes;
   } 
   
}
