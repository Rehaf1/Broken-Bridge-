
package ProjectBrokenBridge;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Image ;
import javax.swing.SpringLayout; 

public class TherapistFrame extends JFrame {

	private static final long serialVersionUID = 1L;
    private JPanel mainPanel ; 
	private JPanel Panel1; 
	private JPanel Panel2;
	private JTextField textField;
	private JTextField txtFieldName;
	private JTextField textField_Id;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
    public SolitaryConfinement n1 ; 
    public GeneralCells cell2; 
	 
	
	

	/**
	 * Create the frame.
	 */
	 public TherapistFrame(SolitaryConfinement n1, GeneralCells cell2)throws MyException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 this.n1 = n1; 
		 this.cell2 = cell2 ; 
		 setType(Type.POPUP);


    setAlwaysOnTop(true);
		toFront();
		requestFocus();
		repaint();
		
		setBounds(0, 10, 1000, 700);
		setSize(850,700); 
		setTitle("Therapistframe");
		 mainPanel = new JPanel();
		 mainPanel.setBorder(null);
		 setContentPane(mainPanel);
		 Panel2 = new JPanel() ;
		 Panel2.setBorder(new EmptyBorder(0, 0, 0, 0));
		 Panel2.setForeground(new Color(46, 48, 44));
		 Panel2.setBackground(new Color(51, 51, 51));
		 JLabel SurveyTitle = new JLabel();
		 SurveyTitle.setForeground(new Color(255, 255, 255));
		 SurveyTitle.setFont(new Font("Serif", Font.BOLD, 20));
		 SurveyTitle.setText("Welcome To invoke A Service Please Select one");
		 JLabel Unsatisfied = new JLabel();
		 Unsatisfied.setForeground(new Color(192, 192, 192));
		 Unsatisfied.setFont(new Font("Serif", Font.BOLD, 14));
		 Unsatisfied.setVerticalAlignment(SwingConstants.BOTTOM);
		 Unsatisfied.setText("Your Client is in :");
		    
		    JLabel lblNewLabel_1 = new JLabel("Client Name : ");
		    lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 14));
		    lblNewLabel_1.setForeground(new Color(192, 192, 192));
		    
		    textField = new JTextField();
		    textField.setForeground(new Color(192, 192, 192));
		    textField.setCaretColor(new Color(74, 74, 74));
		    textField.setBorder(null);
		    
		    textField.setBackground(new Color(74, 74, 74));
		    textField.setColumns(10);
	        Panel1 = new JPanel() ;
	        Panel1.setAlignmentY(0.0f);
	        Panel1.setBackground(new Color(51, 51, 51));
	        Panel1.setBorder(new EmptyBorder(0, 0, 0, 0));
			
			Panel1.setForeground(new Color(46, 48, 44));
		    JLabel WelcomePaneTitle = new JLabel() ; 
		    WelcomePaneTitle.setFont(new Font("Serif", Font.BOLD, 20));
		    WelcomePaneTitle.setForeground(new Color(255, 255, 255));
			WelcomePaneTitle.setText("Welcome To Broken Bridge Prison ");
		    
			JTextArea Name = new  JTextArea() ;
			Name.setDisabledTextColor(new Color(204, 204, 204));
			Name.setBackground(new Color(51, 51, 51));
			Name.setText("Name");
			Name.setForeground(new Color(204, 204, 204));
		    Name.setFont(new Font("Serif", Font.BOLD, 16));
		    
		    JButton Next = new JButton("Next");
		    Next.setBackground(new Color(41, 41, 41));
		    Next.setForeground(new Color(255, 128, 0));
		    
		   
		    
		    JButton Done = new JButton("Done");
		    Done.setBorder(null);
		    Done.setForeground(new Color(255, 128, 64));
		    Done.setBackground(new Color(74, 74, 74));
		    mainPanel.setLayout(new CardLayout(0, 0));
		    mainPanel.add(Panel1, "name_377953923963600");
		    mainPanel.add(Panel2, "name_377953902486800");
		    
		    
		    JLabel lblNewLabel_4 = new JLabel("");
		    
		    JPanel panel_1 = new JPanel();
		    panel_1.setAlignmentY(0.0f);
		    
		    JLabel IDlabel = new JLabel("ID");
		    IDlabel.setFont(new Font("Serif", Font.BOLD, 14));
		    IDlabel.setBackground(new Color(51, 51, 51));
		    IDlabel.setForeground(new Color(192, 192, 192));
		    
		    txtFieldName = new JTextField();
		    
		    txtFieldName.setForeground(new Color(192, 192, 192));
		    txtFieldName.setBackground(new Color(47, 47, 47));
		    txtFieldName.setColumns(10);
		    
		    textField_Id = new JTextField();
		    textField_Id.setForeground(new Color(192, 192, 192));
		    textField_Id.setBackground(new Color(47, 47, 47));
		    textField_Id.setColumns(10);
		    
		    
		    
		    Next.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		Therapist t1 = null;
				    String TherapistName ="No Name"; 
		 		    if (txtFieldName.getText() != null)
		 		    	TherapistName = txtFieldName.getText();
		 		    
		 		   String TherapistID ="111"; 
				    if (textField_Id.getText() != null)
				    	TherapistID = textField_Id.getText();
				  
					try {
						t1 = new Therapist(TherapistName , TherapistID);
					
		    	 
		    		if (t1.verify()) {
		    		  try {
		    			  CardLayout card = (CardLayout)mainPanel.getLayout(); 
			    	        card.show(mainPanel,"name_377953902486800"); 
		    	           

		    	        }catch(Exception ex){}
		    	}else {  setAlwaysOnTop(false);
		    		JOptionPane.showMessageDialog(null, "You'r not a Therapist (Therapist ID should Start with 111)"); 
		    	}
		    		}  catch (MyException e1) {
		    			 setAlwaysOnTop(false);
						JOptionPane.showMessageDialog(null, " ID problem ( ID should Start with 11)");	
						
					} 
		    	
		    	}});
		    
		    
		    JLabel lblNewLabel_5 = new JLabel("");
		    
		    
		    Therapist t1 = null;
		    String TherapistName ="No Name"; 
 		    if (txtFieldName.getText() != null)
 		    	TherapistName = txtFieldName.getText();
 		    
 		   String TherapistID ="111"; 
		    if (textField_Id.getText() != null)
		    	TherapistID = textField_Id.getText();
			try {
				t1 = new Therapist(TherapistName , TherapistID);
			} catch (MyException e1) {}
			 String  PName1 = textField.getText(); 
		    
		 
		    
		    JRadioButton rbtn = new JRadioButton("Book An Appoinment");
		    rbtn.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		
		    	}
		    	
		    });
		    rbtn.setForeground(new Color(192, 192, 192));
		    rbtn.setFont(new Font("Serif", Font.PLAIN, 14));
		    rbtn.setToolTipText("");
		    
		    rbtn.setBackground(new Color(51, 51, 51));
		    
		    JRadioButton rbtn1 = new JRadioButton("Prescribe Medicine");
		    rbtn1.setForeground(new Color(192, 192, 192));
		    rbtn1.setFont(new Font("Serif", Font.PLAIN, 14));
		  
		    rbtn1.setBackground(new Color(51, 51, 51));
		    
		    JRadioButton rbtn2 = new JRadioButton("GeneralCells");
		    rbtn2.setFont(new Font("Serif", Font.PLAIN, 14));
		    rbtn2.setForeground(new Color(192, 192, 192));
		    
		    rbtn2.setBackground(new Color(51, 51, 51));
		    
		    JRadioButton rbtn4 = new JRadioButton("SolitaryConfinement");
		    rbtn4.setForeground(new Color(192, 192, 192));
		    rbtn4.setFont(new Font("Serif", Font.PLAIN, 14));
		    
		    rbtn4.setBackground(new Color(51, 51, 51));
		    
		    buttonGroup_1.add(rbtn4);
		    buttonGroup_1.add(rbtn2); 
		    buttonGroup.add(rbtn1); 
		    buttonGroup.add(rbtn); 
		    
		    JLabel lblNewLabel_3 = new JLabel("");
		    try {
		    ImageIcon im1 = new ImageIcon(this.getClass().getResource("logo.jpeg")); 
		    Image im1Right =  im1.getImage();
		    Image modifidedIm1 = im1Right.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		    im1 = new ImageIcon( modifidedIm1); 
		    lblNewLabel_3.setIcon(im1);
		    lblNewLabel_4.setIcon(im1);
		    }catch (NullPointerException ex1) {}
		    Done.addActionListener(new ActionListener() {
		    	public void  actionPerformed(ActionEvent e) {
		    		Therapist t1 = null;
				    String TherapistName ="No Name"; 
		 		    if (txtFieldName.getText() != null)
		 		    	TherapistName = txtFieldName.getText();
		 		    
		 		   String TherapistID ="111"; 
				    if (textField_Id.getText() != null)
				    	TherapistID = textField_Id.getText();
					try {
						t1 = new Therapist(TherapistName , TherapistID);
					} catch (MyException e1) {
						 setAlwaysOnTop(false);
						JOptionPane.showMessageDialog(null, " ID problem ( ID should Start with 11)");	
					} 
                  String  PName1 = textField.getText(); 
                    
                    if (rbtn.isSelected())
			 		{	setAlwaysOnTop(false);
			 			if (rbtn4.isSelected() & PName1 != null)	
			 			{Prisoner p1 = n1.searchByName(PName1);
			 				t1.bookAppointment(p1);	
			 			}
			 			else if (rbtn2.isSelected() && PName1 != null) {
			 				Prisoner p1 = cell2.searchByName(PName1);
			 				t1.prescribeMedicine(p1);
			 				}
			 		}else if (rbtn1.isSelected()) {
			 			setAlwaysOnTop(false);
			 		if (rbtn4.isSelected() && PName1 != null)
			 			{Prisoner p1 = n1.searchByName(PName1);
			 		         t1.prescribeMedicine(p1);
			 		        }
			 		else if (rbtn2.isSelected() && PName1 != null) {
			 			Prisoner p1 = cell2.searchByName(PName1);
		 				t1.prescribeMedicine(p1); 
			 		}else {
			 			 setAlwaysOnTop(false);
			 			JOptionPane.showMessageDialog(null,"Please Pick an Option");
			 		}
			 			
			 		}else {
			 			 setAlwaysOnTop(false);
			 			JOptionPane.showMessageDialog(null,"Please Pick an Option");}
	 	
                    
	 	}

				
		    	});
		    		
		    
		    
		   JPanel panel = new JPanel();
		    panel.setBorder(null);
		    panel.setBackground(new Color(204, 204, 204));
		    panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		    
		    JLabel lblNewLabel_2 = new JLabel("");
          try{ 
		    ImageIcon im2 = new ImageIcon(this.getClass().getResource("Cell2.jpg")); 
		    Image im2Right =  im2.getImage();
		    Image modifidedIm2 = im2Right.getScaledInstance(680, 650, java.awt.Image.SCALE_SMOOTH);
		    im2 = new ImageIcon( modifidedIm2); 
		    lblNewLabel_2.setIcon(im2);
		    lblNewLabel_5.setIcon(im2);} catch(NullPointerException ex4){}
          panel_1.setAlignmentY(Component.TOP_ALIGNMENT);
		    panel_1.setBorder(null);
		    panel_1.setAlignmentX(0.0f);
		    panel_1.setBackground(new Color(204, 204, 204));
		    SpringLayout sl_panel1 = new SpringLayout();
		    sl_panel1.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, Panel1);
		    sl_panel1.putConstraint(SpringLayout.NORTH, WelcomePaneTitle, 238, SpringLayout.NORTH, Panel1);
		    sl_panel1.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 111, SpringLayout.NORTH, Panel1);
		    sl_panel1.putConstraint(SpringLayout.WEST, lblNewLabel_4, 180, SpringLayout.WEST, Panel1);
		    sl_panel1.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -17, SpringLayout.NORTH, WelcomePaneTitle);
		    sl_panel1.putConstraint(SpringLayout.NORTH, panel_1, 0, SpringLayout.NORTH, Panel1);
		    sl_panel1.putConstraint(SpringLayout.WEST, panel_1, 84, SpringLayout.EAST, textField_Id);
		    sl_panel1.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, Panel1);
		    sl_panel1.putConstraint(SpringLayout.WEST, WelcomePaneTitle, 0, SpringLayout.WEST, textField_Id);
		    sl_panel1.putConstraint(SpringLayout.NORTH, Next, 431, SpringLayout.NORTH, Panel1);
		    sl_panel1.putConstraint(SpringLayout.WEST, Next, 159, SpringLayout.WEST, Panel1);
		    sl_panel1.putConstraint(SpringLayout.EAST, Next, 255, SpringLayout.WEST, Panel1);
		    sl_panel1.putConstraint(SpringLayout.NORTH, IDlabel, 358, SpringLayout.NORTH, Panel1);
		    sl_panel1.putConstraint(SpringLayout.WEST, IDlabel, 84, SpringLayout.WEST, Panel1);
		    sl_panel1.putConstraint(SpringLayout.EAST, IDlabel, 133, SpringLayout.WEST, Panel1);
		    sl_panel1.putConstraint(SpringLayout.NORTH, Name, 288, SpringLayout.NORTH, Panel1);
		    sl_panel1.putConstraint(SpringLayout.WEST, Name, 84, SpringLayout.WEST, Panel1);
		    sl_panel1.putConstraint(SpringLayout.NORTH, txtFieldName, 320, SpringLayout.NORTH, Panel1);
		    sl_panel1.putConstraint(SpringLayout.WEST, txtFieldName, 84, SpringLayout.WEST, Panel1);
		    sl_panel1.putConstraint(SpringLayout.EAST, txtFieldName, 376, SpringLayout.WEST, Panel1);
		    sl_panel1.putConstraint(SpringLayout.NORTH, textField_Id, 382, SpringLayout.NORTH, Panel1);
		    sl_panel1.putConstraint(SpringLayout.WEST, textField_Id, 84, SpringLayout.WEST, Panel1);
		    sl_panel1.putConstraint(SpringLayout.EAST, textField_Id, 376, SpringLayout.WEST, Panel1);
		    Panel1.setLayout(sl_panel1);
		    Panel1.add(lblNewLabel_4);
		    Panel1.add(textField_Id);
		    Panel1.add(txtFieldName);
		    Panel1.add(Name);
		    Panel1.add(IDlabel);
		    Panel1.add(Next);
		    Panel1.add(WelcomePaneTitle);
		    Panel1.add(panel_1);
		    SpringLayout sl_panel_1 = new SpringLayout();
		    sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 75, SpringLayout.NORTH, panel_1);
		    sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_5, 30, SpringLayout.WEST, panel_1);
		    sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_5, 564, SpringLayout.NORTH, panel_1);
		    panel_1.setLayout(sl_panel_1);
		    panel_1.add(lblNewLabel_5);
		    
		    
		    lblNewLabel_2.setLocation(new Point(1500, 100));
		    lblNewLabel_2.setMaximumSize(new Dimension(4, 5));
		    lblNewLabel_2.setPreferredSize(new Dimension(100, 100));
		    lblNewLabel_2.setSize(new Dimension(500, 500));
		    lblNewLabel_2.setAlignmentY(0.0f);
		    SpringLayout sl_panel2 = new SpringLayout();
		    sl_panel2.putConstraint(SpringLayout.WEST, rbtn4, 250, SpringLayout.WEST, Panel2);
		    sl_panel2.putConstraint(SpringLayout.EAST, rbtn4, -44, SpringLayout.WEST, panel);
		    sl_panel2.putConstraint(SpringLayout.WEST, panel, 32, SpringLayout.EAST, SurveyTitle);
		    sl_panel2.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, Panel2);
		    sl_panel2.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, Panel2);
		    sl_panel2.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST, Panel2);
		    sl_panel2.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 111, SpringLayout.NORTH, Panel2);
		    sl_panel2.putConstraint(SpringLayout.WEST, lblNewLabel_3, 180, SpringLayout.WEST, Panel2);
		    sl_panel2.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -24, SpringLayout.NORTH, SurveyTitle);
		    sl_panel2.putConstraint(SpringLayout.WEST, Unsatisfied, 0, SpringLayout.WEST, rbtn);
		    sl_panel2.putConstraint(SpringLayout.SOUTH, Unsatisfied, -6, SpringLayout.NORTH, rbtn2);
		    sl_panel2.putConstraint(SpringLayout.EAST, Unsatisfied, 0, SpringLayout.EAST, rbtn2);
		    sl_panel2.putConstraint(SpringLayout.WEST, rbtn2, 56, SpringLayout.WEST, Panel2);
		    sl_panel2.putConstraint(SpringLayout.EAST, rbtn2, -72, SpringLayout.WEST, rbtn4);
		    sl_panel2.putConstraint(SpringLayout.NORTH, rbtn4, 0, SpringLayout.NORTH, rbtn2);
		    sl_panel2.putConstraint(SpringLayout.SOUTH, rbtn2, -14, SpringLayout.NORTH, lblNewLabel_1);
		    sl_panel2.putConstraint(SpringLayout.NORTH, rbtn1, 18, SpringLayout.SOUTH, SurveyTitle);
		    sl_panel2.putConstraint(SpringLayout.NORTH, rbtn, 0, SpringLayout.NORTH, rbtn1);
		    sl_panel2.putConstraint(SpringLayout.WEST, rbtn, 54, SpringLayout.WEST, Panel2);
		    sl_panel2.putConstraint(SpringLayout.EAST, rbtn, -42, SpringLayout.WEST, rbtn1);
		    sl_panel2.putConstraint(SpringLayout.WEST, rbtn1, 252, SpringLayout.WEST, Panel2);
		    sl_panel2.putConstraint(SpringLayout.EAST, rbtn1, 0, SpringLayout.EAST, textField);
		    sl_panel2.putConstraint(SpringLayout.NORTH, textField, 426, SpringLayout.NORTH, Panel2);
		    sl_panel2.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, textField);
		    sl_panel2.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -6, SpringLayout.NORTH, textField);
		    sl_panel2.putConstraint(SpringLayout.EAST, lblNewLabel_1, 164, SpringLayout.WEST, Panel2);
		    sl_panel2.putConstraint(SpringLayout.WEST, textField, 54, SpringLayout.WEST, Panel2);
		    sl_panel2.putConstraint(SpringLayout.EAST, textField, 392, SpringLayout.WEST, Panel2);
		    sl_panel2.putConstraint(SpringLayout.NORTH, SurveyTitle, 246, SpringLayout.NORTH, Panel2);
		    sl_panel2.putConstraint(SpringLayout.WEST, SurveyTitle, 20, SpringLayout.WEST, Panel2);
		    sl_panel2.putConstraint(SpringLayout.EAST, SurveyTitle, 429, SpringLayout.WEST, Panel2);
		    sl_panel2.putConstraint(SpringLayout.NORTH, Done, 484, SpringLayout.NORTH, Panel2);
		    sl_panel2.putConstraint(SpringLayout.WEST, Done, 125, SpringLayout.WEST, Panel2);
		    sl_panel2.putConstraint(SpringLayout.EAST, Done, 299, SpringLayout.WEST, Panel2);
		    Panel2.setLayout(sl_panel2);
		    Panel2.add(lblNewLabel_3);
		    Panel2.add(rbtn);
		    Panel2.add(rbtn2);
		    Panel2.add(rbtn4);
		    Panel2.add(rbtn1);
		    Panel2.add(Done);
		    Panel2.add(Unsatisfied);
		    Panel2.add(SurveyTitle);
		    Panel2.add(lblNewLabel_1);
		    Panel2.add(textField);
		    Panel2.add(panel);
		    SpringLayout sl_panel = new SpringLayout();
		    sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 75, SpringLayout.NORTH, panel);
		    sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 30, SpringLayout.WEST, panel);
		    sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 564, SpringLayout.NORTH, panel);
		    sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_2, 697, SpringLayout.WEST, panel);
		    panel.setLayout(sl_panel);
		    panel.add(lblNewLabel_2);
		    
		    JLabel label = new JLabel("New label");
		    mainPanel.add(label, "name_549513111214400");
		   
		}	
	
}
	
	 

