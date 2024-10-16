package ProjectBrokenBridge;

public class GeneralCells extends CellBlock
{
	private String cellType;
	  
	  public GeneralCells( int size , String cn , String CT)
	  {
		  super( size , cn);
		  cellType = CT;
	  }
	 
	  
	  public String CellType()
	  {
		  return cellType;
	  }
	  
	  public void Display()
	  {
		  System.out.println("This Prisoner is in General Cells ,ThereFor the Privilages are :");
		  System.out.println("1- Get visits from family or friends");
		  System.out.println("2- Be allowed to spend more money each week ");
		  System.out.println("3- Be allowed to Visit the Library ");
	  }
	  
	  public Prisoner searchByName( String name)
	   {
		   for( int i = 0 ; i < numOfPrisoners ; i++)
			   if(prisoners[i].getName().equalsIgnoreCase(name))
				   return prisoners[i];
			  
		return null ;		   
						   
	   }
}
