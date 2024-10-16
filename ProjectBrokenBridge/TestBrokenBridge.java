package ProjectBrokenBridge;
import java.io.*; 
import java.util.*;

public class TestBrokenBridge {

   public static void main(String[] args) throws IOException,MyException {
      Scanner input = new Scanner(System.in);
     
      		// Adding 5 Prisoners to Broken Bridge Prison , SolitaryConfinement
      Prisoner pr1 = new Prisoner("James Earl Ray", "111", "23/4/2067", "Robbery", 12,  true);
      Prisoner pr2 = new Prisoner("Jeffrey Dahmer", "112", "28/11/2094", "Serial Killer", 12,  false);
      Prisoner pr3 = new Prisoner("Louis Buchalter", "113", "4/3/2044", "Crime Boss", 12,  false);
      Prisoner pr4 = new Prisoner("Ted Bundy", "114", "24/1/2089", "Serial Killer and Rapist", 12,  false);
      Prisoner pr5 = new Prisoner("Zodiac Killer", "115", "1/6/2070", "Serial Killer", 12,  false);
      Prisoner pr6 = new Prisoner("Dean ester", "111", "23/5/2005", "Arsen", 15 , true );
      Prisoner pr8 = new Prisoner("Ricky LaFleur", "112","4/8/2055","Theft",11,false);
      Prisoner pr9 = new Prisoner("Julian Tremblay", "113","4/8/2055","Money Landring",0,false);
      SolitaryConfinement n1 = new SolitaryConfinement(100, "10", "Solitary Confinement");
      GeneralCells cell2 = new GeneralCells(100, "111-121", "General Cells");
   	
      // adding to file
      Prisoner P1 = new Prisoner("David NotRay", "116", "23/7/2047", "Money laundering", 5,  false);
      Prisoner P2 = new Prisoner("Rene Enzo", "117", "13/4/2057", "Bribery of law Inforsment", 0,  false);
      Prisoner P3 = new Prisoner("Garnet Jools", "118", "2/3/2080", "identity Theft", 5,  false);
      Prisoner P4 = new Prisoner("Jean-Michel Creighton", "119", "31/1/2090", "Child Abuse", 14,  true);
      Prisoner P5 = new Prisoner("Ross Kean", "110", "9/7/2060", "Manslaugter", 5,  false);
      Prisoner P6 = new Prisoner("Hercule Barthelemy", "121", "26/4/2076", "Assult", 12,  true);
      
      File Win = new File("WardenIn.data");
      FileOutputStream WOutput = new FileOutputStream(Win); 
      ObjectOutputStream objectOut = new ObjectOutputStream(WOutput);
      objectOut.writeObject(P1);
      objectOut.writeObject(P2);
      objectOut.writeObject(P3);
      objectOut.writeObject(P4);
      objectOut.writeObject(P5);
      objectOut.writeObject(P6);
      objectOut.close();       
      
      cell2.addPrisoner(pr6); 
      cell2.addPrisoner(pr8);
      cell2.addPrisoner(pr9);
      n1.addPrisoner(pr1);
      n1.addPrisoner(pr2);
      n1.addPrisoner(pr3);
      n1.addPrisoner(pr4);
      n1.addPrisoner(pr5);
      
      
   	// adding 10 Guards to broken Bridge
      Staff s1 = new Staff("Li Si", "113220");
      Staff s2 = new Staff("Han Van Meegeren", "113221");
      Staff s3 = new Staff("Khalid Al-Islambuli", "113222");
      Staff s4 = new Staff("Charles De Valois", "113223");
      Staff s5 = new Staff("Pierre Laval", "113224");
      Staff s6 = new Staff("Peter Kurten", "113225");
      Staff s7 = new Staff("Ilse Koch", "113226");
      Staff s8 = new Staff("Bruno Ludke", "113227");
      Staff s9 = new Staff("Tenji Hideki", "113228");
      Staff s0 = new Staff("Ricardo Flores Magon", "113229");
   
      Guards guards = new Guards(100);
      guards.addGuards(s0);
      guards.addGuards(s1);
      guards.addGuards(s2);
      guards.addGuards(s3);
      guards.addGuards(s4);
      guards.addGuards(s5);
      guards.addGuards(s6);
      guards.addGuards(s7);
      guards.addGuards(s8);
      char ch ; 
      
      
   
      
      
      
      do{ 
       while(true)
            try {
               do{  
            	  
         System.out.println(); 
         System.out.println("             ************* Broken Bridge Prison ***************");
         System.out.println("How can we Help you today?");
         System.out.println("Please Enter: \n(W) for Warden \n(L) for Lawyer  \n(T) for Therapist \n(V) for Regular Visitors \n(E) to leave:  ");
        
                  ch = input.next().charAt(0);
               } while(ch != 'w' & ch != 'W' & ch != 'L' & ch != 'l' & ch != 'T' & ch != 't' & ch != 'v' & ch != 'V' & ch != 'e' & ch !='E');
                
               break ; 
            }//try 
            catch(InputMismatchException ex1)
            {
               System.out.println("Wrong Input ,Try again"); 
            } 
      
         switch (ch) {
            case 'W': case 'w':
               int WardenChoise;
               FileOutputStream wfo = null ;
               PrintWriter pf = null;
               try { //warden
                  File wardenFile = new File("Warden File.txt"); 
                  wfo = new FileOutputStream(wardenFile); 
                  pf = new PrintWriter(wfo);
                  do {
                	
                	  while (true){ 
                          try { 
                        	 
                     System.out.println(); 
                     System.out.println("Welcome Warden , How We Can Help you ?");
                     System.out.println("1- Add Guards ");
                     System.out.println("2- Add Prisoners to Blocks");
                     System.out.println("3- Remove Prisoners from Blocks");
                     System.out.println("4- Search for Prisoners");
                     System.out.println("5- Print Information of Prisoners");
                     System.out.println("6- Print the Information of All the Guards");
                     System.out.println("7- Add Strike to Prisoner");
                     System.out.println("8- Reward / Punish Guard");
                     System.out.println("9- Transfer Prisoners into or out of the Prison");
                     System.out.println("10- See Visitors Records");
                     System.out.println("11- Exist Warden Choice");
                     System.out.println(); 
                  
                    
                           do{ 
                              WardenChoise = input.nextInt();} while(WardenChoise > 11);
                          break; } // try
                        catch(InputMismatchException ex2)
                        {
                           System.out.println("Wrong Input ,Try again"); 
                           input.next();
                        } }//while
                  
                  
                     switch (WardenChoise) {
                     
                        case 1:
                        	 boolean opti = true;
                        	 while (opti) { 
                                 try {
                             Staff s ; 
                             int num = 1;
                            	  System.out.println("Enter How many Guards you would like to Add: (There are currantly "+ guards.getNumOfGards() +" ) ");
                                  num = input.nextInt();
                              
                              
                                 if (guards.getNumOfGards() < 100) {
                                    for (int i = 0; i < num; i++) {
                                       input.nextLine();
                                    
                                       System.out.println("1- Enter the " + ( guards.getNumOfGards() + 1) + "th Guard Name : ");
                                       String name = input.nextLine();
                                       String id;
                                      
                                       while(true)
                                       try {
                                    	   
                                       System.out.println("2- Enter his ID Please : (guard id must start with 113) ");
                                       id = input.next();
                                       s = new Staff(name, id);
                            
                                       
                                       if (guards.addGuards(s) && s.verify())
                                          System.out.println("The " + (guards.getNumOfGards() + 1) + "th Guard is Added Successfully!");
                                       else
                                          System.out.println("The " + (guards.getNumOfGards() + 1) + "th Guard wasn't Added!");
                                       break ;}catch(MyException ex5){ 
                                              System.out.println(ex5.getMessage());
                                       		}}
                                    
                                       System.out.println();
                                    
                                       
                                        opti = false ;                   
                                       break ; 
                                     } } 
                              catch(InputMismatchException ex4)
                              {
                                 System.out.println("Wrong Input ,Try again"); 
                                 input.next();
                              } 
                              } 
                        break ; 	
					case 2:
                           while (true){ 
                              try  {
                                 System.out.println("Enter the Number of Prisoners : ");
                                 int n = input.nextInt();
                                 System.out.println("Enter the Cell Number  :");
                                 String c = input.next();
                                 char char1 ; 
                                 do { 
                                    System.out.println("Enter The Cell Type (S) for SolitaryConfinement , (G) for GeneralCells");
                                    char1 = input.next().charAt(0);
                                 }while(char1 != 's' && char1 != 'S' && char1 != 'g' && char1 != 'G');
                                 if (n < 100)
                                    if (char1 == 'S' || char1 == 's') {
                                       for (int i = 0; i < n; i++) {
                                          input.nextLine(); 
                                          System.out.println(); 
                                          System.out.println(
                                             "*************** Enter The Information of The Prisoner **************");
                                          System.out.println("Enter The name : ");
                                          String name = input.nextLine();
                                          System.out.println("Enter The ID : ");
                                          String ID = input.nextLine();
                                          System.out.println("Enter The Time Due : ");
                                          String timeDue = input.nextLine();
                                          System.out.println("Enter The Crime Type : ");
                                          String crimeType = input.nextLine();
                                          System.out.println("Enter The Strikes : ");
                                          int strikes = input.nextInt();
                                       
                                          System.out.println(
                                             "Does The Prisoner Needs Medication ? , Please Enter true or false : ");
                                          boolean needsMedication = input.nextBoolean();
                                          Prisoner p1 = new Prisoner(name, ID, timeDue, crimeType, strikes,needsMedication);
                                       			
                                          if (n1.addPrisoner(p1))
                                             System.out.println("The Prisoner is Added!");
                                          else
                                             System.out.println("The Prisoner has not beeen Added!");
                                       
                                       }
                                    } else if (n < 100)
                                       if (char1 == 'G' || char1 == 'g') {
                                          for (int i = 0; i < n; i++) {
                                             System.out.println(); 
                                             System.out.println(
                                                "*************** Enter The Information of The Prisoner **************");
                                             input.nextLine(); 
                                             System.out.println("Enter The name : ");
                                             String name = input.nextLine();
                                             System.out.println("Enter The ID : ");
                                             String ID = input.nextLine();
                                             System.out.println("Enter The Time Due : ");
                                             String timeDue = input.nextLine();
                                             System.out.println("Enter The Crime Type : ");
                                             String crimeType = input.nextLine();
                                             System.out.println("Enter The Strikes : ");
                                             int strikes = input.nextInt();
                                          
                                             System.out.println(
                                                "Does The Prisoner Needs Medication ? , Please Enter true or false : ");
                                             boolean needsMedication = input.nextBoolean();
                                             Prisoner p1 = new Prisoner(name, ID, timeDue, crimeType, strikes,
                                                needsMedication);
                                             if(p1.checkStrikes())
                                             {n1.addPrisoner(p1);
                                                System.out.println("Prisoner has been added to SolitaryConfinement because Strikes exceed 5 "); 
                                             }
                                             else
                                             {
                                                if (cell2.addPrisoner(p1))
                                                   System.out.println("The Prisoner is Added!");
                                                else
                                                   System.out.println("The Prisoner is Was not Added!");
                                             }}}
                                       else
                                          System.out.println("The Type enterd is not Correct");
                              
                              
                                 break;       
                              } catch(InputMismatchException ex6)
                              {
                                 System.out.println("Wrong Input ,Try again"); 
                                 input.next();
                              }
                              catch (MyException ex7){ 
                                 System.out.print(ex7.getMessage()); 
                                 System.out.println(" (Id must start with 111)");
                                System.out.println("Try again");
                              } }// while
                        
                        
                           System.out.println(); 
                           break;
                     
                        case 3:
                           while(true){ 
                              try { 
                                 System.out.println("How Many Prisoners you Would Like to Remove?");
                                 int remove = input.nextInt();
                                 char ch1; 
                                 do{ 
                                    System.out.println("Enter The Cell Type (S) for SolitaryConfinement , (G) for GeneralCells");
                                    ch1 = input.next().charAt(0); 
                                 }while(ch1 !='s'&& ch1!='s'&& ch !='G' && ch1 != 'g');          
                                 input.nextLine();
                                 for (int i = 0; i < remove; i++) {
                                 
                                    System.out.println("Enter the name of the Prisoner :");
                                    String name = input.nextLine();
                                    if (ch1 == 'G' || ch1 == 'g')
                                       System.out.println((cell2.removePrisoner(name))? "removed Succesfully": "Could not find Prisoner with this name");
                                    else if (ch1 == 'S' || ch1 == 's')
                                       System.out.println((n1.removePrisoner(name))? "removed Succesfully": "Could not find Prisoner with this name");
                                    else
                                       System.out.println("The Type enterd is not Correct");
                                 }
                                 break ;  
                              }catch(InputMismatchException ex7)
                              {
                                 System.out.println("Wrong Input ,Try again"); 
                                 input.next();
                              } } 
                            
                           System.out.println(); 
                           break;
                     
                        case 4:
                           while (true) { 
                              try { 
                                 input.nextLine();
                                 System.out.println("Enter the name for Prisoner you are Looking for");
                                 String name = input.nextLine();
                                 char ch2 ; 
                                 do{ 
                                    System.out.println("Enter The Cell Type (S) for SolitaryConfinement , (G) for GeneralCells");
                                    ch2 = input.next().charAt(0);
                                 } while(ch2 != 'S'&& ch2 != 's'&& ch2 !='G'&& ch2 !='g');
                                 if (ch2 == 'G' || ch2 == 'g') {
                                	    Prisoner p6 = cell2.searchByName(name);
                                	    
                                        if (p6== null)
                                       	 System.out.println("No Prisoner with That name"); 
                                        else {
                                    System.out.println(
                                       "Would You like to Print the Information of the Prisoners? , Enter (y) for Yes , (n) for No ");
                                    boolean i = input.next().charAt(0) == 'y' ? true : false;
                                    if (i == true) {
                                       System.out.println(p6);
                                    }}
                                 } else if (ch2 == 'S' || ch2 == 's') {
                                    Prisoner p6 = n1.searchByName(name);
                                    
                                    
                                 if (p6 == null)
                                	 System.out.println("No Prisoner with That name"); 
                                 else {
                                    System.out.println(
                                       "Would You like to Print the Information of the Prisoners? , Enter (y) for Yes , (n) for No ");
                                    boolean i = input.next().charAt(0) == 'y' ? true : false;
                                    if (i == true) {
                                       System.out.println(p6);
                                       System.out.println("*****************************************************"); 
                                    }}
                                 } 
                                 break ;   }
                              catch(InputMismatchException ex8)
                              {
                                 System.out.println("Wrong Input ,Try again"); 
                                 input.next();
                              }} 
                        
                           System.out.println(); 
                           break;
                     
                        case 5:
                           while(true ) { 
                              try { 
                                 char ch3 ;
                                 do { 
                                    System.out.println("Enter The Cell Type (S) for SolitaryConfinement , (G) for GeneralCells");
                                    ch3 = input.next().charAt(0); 
                                 }while(ch3 != 's'&& ch3 !='S'&&ch3 !='G' && ch3 != 'g');
                                 if (ch3 == 'G' || ch3 == 'g') {
                                    Prisoner pDisplay1[] = cell2.getPrisoners();
                                    pf.println("****************************** Prisoner Information in GeneralCells **********************");
                                    if (pDisplay1 != null)
                                       for (int t = 0; t < pDisplay1.length; t++)
                                          if (pDisplay1[t] != null)
                                          {	System.out.println(pDisplay1[t]);
                                             pf.println(pDisplay1[t]); }
                                 
                                 } else if (ch3 == 'S' || ch3 == 's') {
                                    Prisoner pDisplay1[] = n1.getPrisoners();
                                    pf.println("****************************** Prisoner Information in SolitaryConfinement **********************");
                                    if (pDisplay1 != null)
                                       for (int t = 0; t < pDisplay1.length; t++)
                                          if (pDisplay1[t] != null)
                                          {System.out.println(pDisplay1[t]);
                                             pf.println(pDisplay1[t]);}
                                 } else
                                    System.out.println("The Type enterd is not Correct");
                              
                                 break ;  } 
                              catch(InputMismatchException ex9)
                              {
                                 System.out.println("Wrong Input ,Try again"); 
                                 input.next();
                              }} //while 
                        
                           System.out.println(); 
                           break;
                     
                        case 6: 
                        
                         
                           pf.println("**************************** Guard Information************************************");
                           for (int i =0 ; i<guards.getNumOfGuards() ; i++ )
                              pf.println(guards.getGuard(i).toString() );
                           pf.println("***************************************************************************");  
                           try { 
                        	   PrintGuardFrame frame = new PrintGuardFrame(guards);
                           	frame.setVisible(true); 
                           }catch (Exception e) {
                       		e.printStackTrace();
                       	}
                        
                           break ; 
                     
                        case 7 : 
                          
                           while (true){
                              try {   input.nextLine();
                                 System.out.println("Enter the name of the Prisoner: "); 
                                 String name3 = input.nextLine();
                                 char q1 ; 
                                 do { 
                                    System.out.println("Is your Clinet in SolitaryConfinement: (Y) for yes , (N) for no");
                                    q1 = input.next().charAt(0);
                                 }while(q1 != 'Y'&& q1 != 'y'&& q1 !='n' && q1 !='N');
                         
                                 if (q1 == 'y'|| q1 == 'Y')
                                  n1.addStrike(name3);
                                  
                                 if (q1 == 'N' || q1 == 'n' )
                                	
                                    if(cell2.addStrike(name3))
                                    {Prisoner p2 = cell2.searchByName(name3);
                                       if(cell2.removePrisoner(name3))
                                          if( n1.addPrisoner(p2) ) 
                                             System.out.println("Prisoner has been moved to Solitary Confinement because Strikes have exceeded 5 "); 
                                    }
                                 break ; } 
                              catch(InputMismatchException ex10)
                              {
                                 System.out.println("Wrong Input ,Try again"); 
                                 input.next();
                              }
                              catch(NullPointerException e10) {  System.out.println("No Prisoner with that name, Try Again"); 
                              
                              }
                               }//while
                           break;
                        case 8: 
                           input.nextLine(); 
                           while(true){ 
                              try{
                                 Staff Guard1;
                                 do {
                                    System.out.println("Enter Guard Name: "); 
                                    String name4 = input.nextLine(); 
                                    Guard1=  guards.searchGuards(name4); 
                                    if(Guard1== null )
                                       System.out.println("There is no Guard with this name"); 
                                 } while(Guard1 == null); 
                              
                                 char q2; 
                                 do { 
                                    System.out.println("Select (R) if you want to Reward the Guard or (P) if you want to punish the Guard ");
                                    q2 = input.next().charAt(0); }while(q2 !='R' && q2 != 'r' && q2 != 'p' && q2 != 'P' ); 
                                 if (q2== 'r'|| q2 == 'R')
                                    System.out.println(Guard1.getName() + " will be Rewarded");
                                 else if (q2 == 'P'|| q2== 'p')
                                    System.out.println(Guard1.getName()+ " will be Punished");
                              
                                 break; } 
                              catch(InputMismatchException ex11)
                              {
                                 System.out.println("Wrong Input ,Try again"); 
                                 input.next();
                              }
                           } // while
                        break;
                        case 9: 
                           while(true) { 
                              try { 
                                 char choice ; 
                                 do{
                                 System.out.println("If you want to Transfer Prisoner from ALQassim Prison enter I");
                                 System.out.println("If you want to Transfer Prisoner to ALQassim Prison enter O");
                                 
                                    choice = input.next().charAt(0); 
                                 }while(choice != 'I' && choice !='i' && choice !='O' && choice !='o');
                              
                              
                                 switch(choice){
                                 
                                    case 'o': case 'O':
                                       File wto = new File("Warden_TransferOut.data");
                                       FileOutputStream fout = new FileOutputStream (wto);
                                       ObjectOutputStream objout= new ObjectOutputStream(fout); 
                                     
                                       char choice1;
                                       int noT;
                                       do{  System.out.println("To Transfer Prisoners form Solitary select S , From GeneralCells press G ");
                                             choice1 = input.next().charAt(0); 
                                       }while(choice1 != 'S' && choice1 !='s' && choice1 !='G' && choice1 !='g');
                                       if (choice1 == 'S' || choice1 == 's')
                                       {
                                           while(true) {
                                             try {
                                          System.out.println("How many Prisoners would you like to transfer");
                                           noT = input.nextInt();
                                           break;}catch(InputMismatchException ex16) {
                                        	            input.nextLine();
                                             System.out.println("Wrong Input, Try again");}}
                                           input.nextLine();
                                         for (int i = 0 ; i< noT ; i++)
                                          {
                                        	  System.out.println("Enter the name of " + (i+1)+ " you want to transfer"); 
                                        	  
                                             String tName = input.nextLine();
                                          
                                             if (n1.searchByName(tName) != null ) 
                                             {  objout.writeObject(n1.searchByName(tName));
                                                n1.removePrisoner(tName);
                                                System.out.println("Transfered Succesfully"); }else System.out.println("No Prisoner with that Name");}
                                            
                                       }
                                       else if (choice1 == 'G' || choice1 == 'g')
                                       {while(true) {
                                    	   try {
                                       
                                    	   System.out.println("How many prisoners would you like to transfer");
                                        noT = input.nextInt(); 
                                        break ; }catch(InputMismatchException ex17 ) {input.nextLine(); 
                                        System.out.println("Wrong Input ,Try Again ");}}
                                       input.nextLine();
                                          for (int i = 0 ; i< noT ; i++)
                                          {
                                        	  System.out.println("Enter the name of "+ (i+1)+ " you want to transfer"); 
                                        	  
                                             String tName = input.nextLine();
                                          
                                             if (cell2.searchByName(tName) != null ) 
                                             {  objout.writeObject(cell2.searchByName(tName));
                                                n1.removePrisoner(tName);
                                                System.out.println("Transfered Succesfully"); }
                                             else System.out.println("No Prisoner with that Name");}
                                           
                                          objout.close(); 
                                          }
                                       
                                       break ; 
                                    case 'i': case 'I':  
                                       FileInputStream wIn = new FileInputStream (Win); 
                                       ObjectInputStream objin = new  ObjectInputStream(wIn); 
                                       char Tin ; 
                                       do{
                                       System.out.println("would you like to Transfer these Prisoners into S Solitary or G GeneralCells");
                                 
                                          Tin =input.next().charAt(0);
                                       }while(Tin != 'S' && Tin != 's' && Tin != 'G' && Tin != 'g'); 
                                    
                                       if (Tin == 'S' || Tin == 's')
                                       {
                                          try{
                                             while (true) {
                                                Prisoner prisoner2 = (Prisoner) objin.readObject(); 
                                                n1.addPrisoner(prisoner2);}
                                          }catch (ClassNotFoundException ex19){} 
                                          catch (EOFException e){}
                                          System.out.println("Transfer Succesfully ");
                                       }
                                       else if (Tin == 'G' || Tin == 'g')
                                       {
                                          try{
                                             while (true) {
                                                Prisoner prisoner2 =( (Prisoner) objin.readObject()); 
                                                cell2.addPrisoner(prisoner2);}
                                          
                                          }catch (EOFException e){System.out.println();} 
                                          catch(ClassNotFoundException ex20){System.out.println(9); }
                                          objin.close();
                                          System.out.println("Transfer Succesfully ");
                                       }
                                 }
                                             
                                 break ;     }
                              catch(InputMismatchException ex12)
                              {
                                 System.out.println("Wrong Input ,Try again"); 
                                 input.next();
                              } } 
                       
                          break ; 
                        case 10 : 
                        	try { 
                        	VisitorRecord frame = new VisitorRecord();
                        	frame.setVisible(true); 
                        }catch (Exception e) {
                    		e.printStackTrace();
                    	}
                        	
                     
                       
                          
                     }
                  }while (WardenChoise != 11);  
               }catch(IOException ex17){ 
                  System.out.println(); } 
            
               break ; 
            
            
            case 'L': case 'l':
            
            	
            	try { 
            		LawyerFrame frame = new LawyerFrame(n1, cell2);
                	frame.setVisible(true); 
                }catch (Exception e) {
            		e.printStackTrace();
            	}
            	
        break ; 
         
            case 'T': case 't':
            
                try { 
                	TherapistFrame frame = new TherapistFrame(n1, cell2);
                	frame.setVisible(true); 
                }catch (Exception e) {
            		e.printStackTrace();
            	}
               break ; 
         
         
            case 'v':
            case 'V': 
               while(true){ 
                  try{
                     input.nextLine(); 
                     System.out.println("Enter your name"); 
                    String  vName = input.nextLine(); 
                     System.out.println("Enter the Prisoner name you want to visit");
                     String str = input.nextLine(); 
                     char q2 ; 
                  
                     do { 
                        System.out.println("Is your Clinet in SolitaryConfinement: (Y) for yes , (N) for no");
                        q2 = input.next().charAt(0);
                     }while(q2 != 'Y'&& q2 != 'y'&& q2 !='n' && q2 !='N');
                  
                   
                     PrintWriter pv = null;
                     try{
                        File vf = new File("VisitorFile.txt"); 
                        pv= new PrintWriter(new BufferedWriter(new FileWriter(vf,true)));
                     
                        if (q2 == 'y'|| q2 == 'Y')
                        { Prisoner p = cell2.searchByName(str);
                           if (p== null)
                            System.out.println("There is no Prisoner with this name");
                            else{
                           System.out.println("You can't visit Prisoner in Solitary Confinment"); 
                           pv.println("Visitor "+vName + "Tried to Visit Someone in Solitary Confinment" );
                        }}
                        else if (q2 == 'N'|| q2 =='n')
                        {  Prisoner p = cell2.searchByName(str);
                           if (p== null)
                              System.out.println("There is no Prisoner with this name");
                           else 
                           { System.out.println("You visit with "+ p.getName() + " has been Booked");
                              pv.println("Visitor "+ vName + " has booked a visit with Prisoner "+p.getName()  );
                           } 
                        }
                     
                     
                     } //try 
                     catch (IOException e){}
                     pv.close();
                  
                     break ;     } 
                  catch(InputMismatchException ex16)
                  {
                     System.out.println("Wrong Input ,Try again"); 
                     input.next();
                  }
               }//while
         
         } 
      
      }while (ch != 'e' && ch != 'E');
   
	   
        
  	try {
  		 IhsanAndSurvay frame  = new IhsanAndSurvay() ;
  		 frame.setSize(850,700);
		frame.setVisible(true);
	}catch (Exception e) {
		e.printStackTrace();
	}
  	
    
      }
	
}