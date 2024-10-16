package ProjectBrokenBridge;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Image ;
import javax.swing.SpringLayout;
import javax.swing.ButtonGroup; 
public class IhsanAndSurvay extends JFrame  {

	private static final long serialVersionUID = 1L;
    private JPanel mainPanel ; 
	private JPanel IhsanPane; 
	private JPanel surveyPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public IhsanAndSurvay() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setType(Type.POPUP);
		setAlwaysOnTop(true);
		setSize(850,700); 
		setBounds(0, 10, 1000, 700);
		 mainPanel = new JPanel();
		 mainPanel.setBorder(null);
		 setContentPane(mainPanel);
		 surveyPane = new JPanel() ;
		 surveyPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		 surveyPane.setForeground(new Color(46, 48, 44));
		 surveyPane.setBackground(new Color(51, 51, 51));
		 JLabel SurveyTitle = new JLabel();
		 SurveyTitle.setForeground(new Color(255, 255, 255));
		 SurveyTitle.setFont(new Font("Serif", Font.BOLD, 20));
		 SurveyTitle.setText("To Help Us Improve, Please Fill Out This Survey");
		 JLabel Unsatisfied = new JLabel();
		 Unsatisfied.setForeground(new Color(225, 225, 225));
		 Unsatisfied.setFont(new Font("Serif", Font.PLAIN, 14));
		 Unsatisfied.setVerticalAlignment(SwingConstants.BOTTOM);
		 Unsatisfied.setText("UnSatisfied");
		    JLabel Satisfied = new JLabel();
		    Satisfied.setForeground(new Color(225, 225, 225));
		    Satisfied.setFont(new Font("Serif", Font.PLAIN, 14));
		    Satisfied.setText("Satisfied");
		    
		    JLabel lblNewLabel = new JLabel("How satisfied are you with our program?");
		    lblNewLabel.setForeground(new Color(225, 225, 225));
		    lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 14));
		    
		    JLabel lblNewLabel_1 = new JLabel("Recommdations : ");
		    lblNewLabel_1.setForeground(new Color(255, 255, 255));
		    
		    textField = new JTextField();
		    textField.setForeground(new Color(207, 207, 207));
		    textField.setBorder(null);
		    textField.setBackground(new Color(74, 74, 74));
		    textField.setColumns(10);
	        IhsanPane = new JPanel() ;
	        IhsanPane.setAlignmentY(0.0f);
	        IhsanPane.setBackground(new Color(51, 51, 51));
	        IhsanPane.setBorder(new EmptyBorder(0, 0, 0, 0));
			
			IhsanPane.setForeground(new Color(46, 48, 44));
		    JLabel IhsanPaneTitle = new JLabel() ; 
		    IhsanPaneTitle.setFont(new Font("Serif", Font.BOLD, 20));
		    IhsanPaneTitle.setForeground(new Color(255, 255, 255));
			IhsanPaneTitle.setText("قال رسول الله صلى الله عليه وسلم");
		    
			JTextArea hadeth = new  JTextArea() ;
			hadeth.setDisabledTextColor(new Color(204, 204, 204));
			hadeth.setBackground(new Color(51, 51, 51));
			hadeth.setText("((من نفَّس عن مؤمنٍ كربةً من كرب الدنيا نفَّس الله عنه كربةً من كرب يوم القيامة )) \r\n\r\n                       وللمساهمة في تفريج كربة من حكم عليهم  \r\n");
			hadeth.setForeground(new Color(204, 204, 204));
		    hadeth.setFont(new Font("Serif", Font.PLAIN, 16));
		    
		    JButton Donate = new JButton("Donate");
		    Donate.setBackground(new Color(41, 41, 41));
		    Donate.setForeground(new Color(255, 128, 0));
		    Donate.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {	setAlwaysOnTop(false);
		    		  try {
                          setAlwaysOnTop(false);      
		    			
		    	            Desktop.getDesktop().browse(new URL("https://ehsan.sa/forijat").toURI());
		    	           

		    	        }catch(Exception ex){}
		    	}
		    });
		    
		    JButton btnNewButton = new JButton("Next");
		    btnNewButton.setBorder(null);
		    btnNewButton.setForeground(new Color(255, 128, 64));
		    btnNewButton.setBackground(new Color(74, 74, 74));
		    mainPanel.setLayout(new CardLayout(0, 0));
		    mainPanel.add(surveyPane, "name_377953902486800");
		    mainPanel.add(IhsanPane, "name_377953923963600");
		    
		    JLabel lblNewLabel_4 = new JLabel("");
		    
		    JPanel panel_1 = new JPanel();
		    panel_1.setAlignmentY(0.0f);
		    
		    
		    JLabel lblNewLabel_5 = new JLabel("");
		    
		    
		    
		    btnNewButton.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		 CardLayout card = (CardLayout)mainPanel.getLayout(); 
		    	        card.show(mainPanel,"name_377953923963600"); 
		    		
		    	}
		    });
		    
		    JRadioButton rbtn = new JRadioButton(""); 
		    buttonGroup.add(rbtn);
		    rbtn.setBackground(new Color(51, 51, 51));
		    JRadioButton rbtn1 = new JRadioButton("");
		    buttonGroup.add(rbtn1);
		    rbtn1.setBackground(new Color(51, 51, 51));
		    JRadioButton rbtn2 = new JRadioButton("");
		    buttonGroup.add(rbtn2);
		    rbtn2.setBackground(new Color(51, 51, 51));
		    JRadioButton rbtn3 = new JRadioButton("");
		    buttonGroup.add(rbtn3);
		    rbtn3.setBackground(new Color(51, 51, 51));
		    JRadioButton rbtn4 = new JRadioButton("");
		    buttonGroup.add(rbtn4);
		    		
		    rbtn4.setBackground(new Color(51, 51, 51));
		    
		    JLabel lblNewLabel_3 = new JLabel("");
          try{
		    ImageIcon im1 = new ImageIcon(this.getClass().getResource("logo.jpeg")); 
		    Image im1Right =  im1.getImage();
		    Image modifidedIm1 = im1Right.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		    im1 = new ImageIcon( modifidedIm1); 
		    lblNewLabel_3.setIcon(im1);
		    lblNewLabel_4.setIcon(im1);} catch (NullPointerException ex5){}
		    
		    
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
		    lblNewLabel_5.setIcon(im2);} catch (NullPointerException ex4){}
		    panel_1.setAlignmentY(Component.TOP_ALIGNMENT);
		    panel_1.setBorder(null);
		    panel_1.setAlignmentX(0.0f);
		    panel_1.setBackground(new Color(204, 204, 204));
		    SpringLayout sl_ihsanPane = new SpringLayout();
		    sl_ihsanPane.putConstraint(SpringLayout.NORTH, Donate, 19, SpringLayout.SOUTH, hadeth);
		    sl_ihsanPane.putConstraint(SpringLayout.NORTH, hadeth, 6, SpringLayout.SOUTH, IhsanPaneTitle);
		    sl_ihsanPane.putConstraint(SpringLayout.EAST, hadeth, -6, SpringLayout.WEST, panel_1);
		    sl_ihsanPane.putConstraint(SpringLayout.EAST, IhsanPaneTitle, -107, SpringLayout.WEST, panel_1);
		    sl_ihsanPane.putConstraint(SpringLayout.EAST, Donate, -192, SpringLayout.WEST, panel_1);
		    sl_ihsanPane.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, IhsanPane);
		    sl_ihsanPane.putConstraint(SpringLayout.NORTH, IhsanPaneTitle, 227, SpringLayout.NORTH, IhsanPane);
		    sl_ihsanPane.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 111, SpringLayout.NORTH, IhsanPane);
		    sl_ihsanPane.putConstraint(SpringLayout.WEST, lblNewLabel_4, 180, SpringLayout.WEST, IhsanPane);
		    sl_ihsanPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -6, SpringLayout.NORTH, IhsanPaneTitle);
		    sl_ihsanPane.putConstraint(SpringLayout.WEST, panel_1, 460, SpringLayout.WEST, IhsanPane);
		    sl_ihsanPane.putConstraint(SpringLayout.NORTH, panel_1, 0, SpringLayout.NORTH, IhsanPane);
		    sl_ihsanPane.putConstraint(SpringLayout.SOUTH, panel_1, 839, SpringLayout.NORTH, IhsanPane);
		    IhsanPane.setLayout(sl_ihsanPane);
		    IhsanPane.add(lblNewLabel_4);
		    IhsanPane.add(Donate);
		    IhsanPane.add(IhsanPaneTitle);
		    IhsanPane.add(hadeth);
		    IhsanPane.add(panel_1);
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
		    SpringLayout sl_surveyPane = new SpringLayout();
		    sl_surveyPane.putConstraint(SpringLayout.SOUTH, textField, 449, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 112, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.WEST, lblNewLabel_3, 178, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -24, SpringLayout.NORTH, SurveyTitle);
		    sl_surveyPane.putConstraint(SpringLayout.EAST, panel, 1243, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.WEST, panel, 496, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.SOUTH, panel, 840, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.NORTH, rbtn3, 375, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.WEST, rbtn3, 330, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.NORTH, rbtn4, 375, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.WEST, rbtn4, 279, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.NORTH, rbtn2, 375, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.WEST, rbtn2, 220, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.EAST, rbtn2, 240, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.NORTH, rbtn1, 375, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.WEST, rbtn1, 154, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.NORTH, rbtn, 375, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.WEST, rbtn, 85, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 414, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 20, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, 130, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 312, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.WEST, lblNewLabel, 20, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.EAST, lblNewLabel, 292, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.NORTH, textField, 434, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.WEST, textField, 20, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.EAST, textField, 387, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.NORTH, Satisfied, 349, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.WEST, Satisfied, 339, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.NORTH, Unsatisfied, 349, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.WEST, Unsatisfied, 20, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.NORTH, btnNewButton, 495, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.WEST, btnNewButton, 20, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.EAST, btnNewButton, 387, SpringLayout.WEST, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.NORTH, SurveyTitle, 247, SpringLayout.NORTH, surveyPane);
		    sl_surveyPane.putConstraint(SpringLayout.WEST, SurveyTitle, 26, SpringLayout.WEST, surveyPane);
		    surveyPane.setLayout(sl_surveyPane);
		    surveyPane.add(lblNewLabel_3);
		    surveyPane.add(SurveyTitle);
		    surveyPane.add(btnNewButton);
		    surveyPane.add(Unsatisfied);
		    surveyPane.add(Satisfied);
		    surveyPane.add(textField);
		    surveyPane.add(lblNewLabel);
		    surveyPane.add(lblNewLabel_1);
		    surveyPane.add(rbtn);
		    surveyPane.add(rbtn1);
		    surveyPane.add(rbtn2);
		    surveyPane.add(rbtn4);
		    surveyPane.add(rbtn3);
		    surveyPane.add(panel);
		    SpringLayout sl_panel = new SpringLayout();
		    sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 75, SpringLayout.NORTH, panel);
		    sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 30, SpringLayout.WEST, panel);
		    sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 591, SpringLayout.NORTH, panel);
		    sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_2, 499, SpringLayout.WEST, panel);
		   
		    panel.setLayout(sl_panel);
		    panel.add(lblNewLabel_2);
		    
		    JLabel label = new JLabel("New label");
		    mainPanel.add(label, "name_549513111214400");
		     
		    setSize(850,700); 
			setBounds(0, 10, 1000, 700);
		
		
		}	
	
	
	
}
	
