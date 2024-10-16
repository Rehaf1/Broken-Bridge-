package ProjectBrokenBridge;

public  class Staff extends Person 
{

	public Staff( String name , String id )throws MyException
	{
		 super(name,id);
	}

   public boolean verify ()
  { 
	if (id.substring(0,3).equals("113"))
		return true; 
	 else 
		return false;
	
  }


}
