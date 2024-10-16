package ProjectBrokenBridge;

public class Guards  {
	
	private Staff guardsList[];
	private int numOfGuards;

  
   public int getNumOfGuards(){ return numOfGuards; } 
	
	public Guards( int size) 
	{
		guardsList = new Staff[size];
		numOfGuards = 0;
	}

	public  boolean verifyGuards()
	{       
      for(int i= 0 ; i<numOfGuards ; i++)
			      if(guardsList[i].verify() == true) 
			    	  return true; 
			      
			    	  return false; 
   }
	
	
	public Staff searchGuards(String name)
   {
		for(int i= 0 ; i<numOfGuards ; i++)
			if (guardsList[i].getName().equalsIgnoreCase(name) )
				return guardsList[i] ; 
		
			return null ; 
	}
	
	
	public  boolean addGuards(Staff s )throws MyException
	   {
		   if( numOfGuards < guardsList.length)
		   {
			   guardsList[numOfGuards++] = new Staff(s.getName() , s.getId());
	 	     return true;
		   }
		   
		   return false;
	   }
   
   
	   public boolean removeGuard(String n)
	   {
		   for( int i = 0 ; i < numOfGuards ; i++)
			   if(guardsList[i].getName().equals(n))
			   {
				   guardsList[i] = guardsList[numOfGuards-1];
				   guardsList[numOfGuards-1] = null;
				   numOfGuards--;
				   return true;
			   }
		   
		   return false;
	   }
      
      
	   public void printGuards()
      {
		   for (int i=0 ; i< numOfGuards; i++)
			   System.out.println(guardsList[i].toString());
		   
	   }
      public Staff getGuard(int x){return guardsList[x] ; }

   public int getNumOfGards() 
   { 
     return numOfGuards;
   } 
}
