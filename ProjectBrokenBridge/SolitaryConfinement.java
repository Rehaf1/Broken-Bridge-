package ProjectBrokenBridge;

public class SolitaryConfinement extends CellBlock
{
	private String cellType;
	  
	  public SolitaryConfinement( int size , String cn , String CT)
	  {
		  super(size , cn);
		  cellType = CT;
	  }
	  
	  public String CellType()
	  {
		  return cellType;
	  }
	  
	  public void Display()
	  {
		  System.out.println("This Prisoner is in  SolitaryConfinement ,ThereFor the Privilages are :");
		  System.out.println("1- Get to have a Walk outside for one hour");
		  System.out.println("2- shower Once a Week ");
	  }
	  
	 
}