package ProjectBrokenBridge;

public abstract class CellBlock 
{
	   protected int numOfPrisoners;
	   protected String cellNumber;
	   protected Prisoner prisoners[] ;
	   
	   public CellBlock( int size , String cn)
	   {
		   numOfPrisoners = 0;
		   prisoners = new Prisoner[size];
		   cellNumber = cn; //cellNumber contains serialnumber-cellNumber
	   }
	  
      
	   public int getNumOfPrisoners() {
		return numOfPrisoners;
	}


	public void setNumOfPrisoners(int numOfPrisoners) {
		this.numOfPrisoners = numOfPrisoners;
	}


	public String getCellNumber() {
		return cellNumber;
	}


	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}


	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}


	public  boolean addPrisoner(Prisoner p )
	   {
		   if( numOfPrisoners < prisoners.length)
		    {
			   prisoners[numOfPrisoners++] = p;
			   p.generateSerialNumber(cellNumber);
	 	     return true;
		    }
		   
		   return false;
	   }
      
      
	   public abstract String CellType();
	   
	   
	   public boolean removePrisoner(String name)
	   { 
		   for( int i = 0 ; i < numOfPrisoners ; i++)
			   if(name.equalsIgnoreCase(prisoners[i].getName()))
			   {
				   prisoners[i] = prisoners[numOfPrisoners-1];
				   prisoners[numOfPrisoners-1] = null;
				   numOfPrisoners--;
				   return true;
			   }
		   
		   return false;
	   }
	   
	   public boolean addStrike(String name ) 
      {
		   Prisoner p = searchByName(name);
		   p.setStrikes(p.getStrikes() +1);
         System.out.println("Strike Added");
		   return p.checkStrikes(); 
	   }
	   
	   public Prisoner searchByName( String name)
	   {
		   for( int i = 0 ; i < numOfPrisoners ; i++)
			   if(prisoners[i].getName().equalsIgnoreCase(name))
				   return prisoners[i];
			  
		return null ;		   
						   
	   }
	   
	   
	   public abstract void Display();
	   
	   public Prisoner[] getPrisoners() 
	   { return prisoners;
	   }
	   
          public void printPrisoners() {
	        for (int i = 0 ; i < numOfPrisoners ; i++ )
	        	System.out.println( prisoners[i].toString() ); 
	        	
	}
	   
	   
}
