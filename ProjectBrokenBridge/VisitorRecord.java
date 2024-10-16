package ProjectBrokenBridge;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.io.*;
import java.util.*; 
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;


public class VisitorRecord extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public VisitorRecord()throws Exception{
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setType(Type.POPUP);
		setSize(850,700); 
		setBounds(0, 10, 1000, 700);
		setAlwaysOnTop(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
        
		setBounds(0, 10, 1000, 700);
		setSize(850,700); 
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Visitor Records");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 24));
		lblNewLabel.setBackground(new Color(51, 51, 51));
        JScrollPane ScrollBar = new JScrollPane();
        ScrollBar.setViewportBorder(new LineBorder(new Color(128, 128, 128), 3, true));
        JTextArea textArea = new JTextArea();
        ScrollBar.setSize(300, 400);
        contentPane.add(ScrollBar);
   
		 try {
			    String filetext="";

			
		        File Visit =new File("VisitorFile.txt");
			
		        BufferedReader  br = new BufferedReader(new FileReader(Visit)); 
			    
			      while(true)
			      { 
			    	  for (String line; (line = br.readLine()) != null;)
			    	  {  textArea.append(line);
			    	  textArea.append("\n");   
			    	  }
			      
			     break ; 
			        }
			   
				   br.close();
				}catch(EOFException e4) {}
		 catch (FileNotFoundException e) {}
				catch (NoSuchElementException e1) {}
				catch(IOException e2) {}
		    
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(51, 51, 51));
		 try {
			    ImageIcon im1 = new ImageIcon(this.getClass().getResource("logo.jpeg")); 
			    Image im1Right =  im1.getImage();
			    Image modifidedIm1 = im1Right.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
			    im1 = new ImageIcon( modifidedIm1); 
			    lblNewLabel_1.setIcon(im1);
			    }catch (NullPointerException ex1) {}
	
	    
	    lblNewLabel_1.setOpaque(true);
		JLabel lblNewLabel_2 = new JLabel("");
	    try{
		ImageIcon im2 = new ImageIcon(this.getClass().getResource("Cell2.jpg")); 
		 Image im2Right =  im2.getImage();
		 Image modifidedIm2 = im2Right.getScaledInstance(680, 650, java.awt.Image.SCALE_SMOOTH);
		 im2 = new ImageIcon( modifidedIm2);
		 lblNewLabel_2.setIcon(im2);} catch(NullPointerException ex3){}
	   
	    lblNewLabel_2.setOpaque(true);
		 SpringLayout sl_panel = new SpringLayout();
		 sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 36, SpringLayout.NORTH, panel);
		 sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 28, SpringLayout.WEST, panel);
		 sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 599, SpringLayout.NORTH, ScrollBar);
		 sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, panel);
		 panel.setLayout(sl_panel);
		SpringLayout sl_contentPane = new SpringLayout();
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 111, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 180, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -18, SpringLayout.NORTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, -174, SpringLayout.WEST, panel);
		sl_contentPane.putConstraint(SpringLayout.NORTH, ScrollBar, 279, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, ScrollBar, -175, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 153, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, -18, SpringLayout.NORTH, ScrollBar);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, -134, SpringLayout.WEST, panel);
		sl_contentPane.putConstraint(SpringLayout.EAST, ScrollBar, -78, SpringLayout.WEST, panel);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 454, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, -1, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, ScrollBar, 111, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 724, SpringLayout.NORTH, contentPane);
		contentPane.setLayout(sl_contentPane);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel);
		contentPane.add(panel);
		
		
		textArea.setColumns(11);
		textArea.setTabSize(1000);
		textArea.setRows(10);
		
		textArea.setBackground(new Color(64, 64, 64));
		textArea.setForeground(new Color(206, 206, 206));
		panel.add(lblNewLabel_2);
		
		
		
		
		
		lblNewLabel_2.setLocation(new Point(100, 100));
		lblNewLabel_2.setMaximumSize(new Dimension(20, 9));
		lblNewLabel_2.setPreferredSize(new Dimension(100, 100));
		lblNewLabel_2.setSize(new Dimension(500, 500));
		lblNewLabel_2.setAlignmentY(0.0f);
		
		ScrollBar.setViewportView(textArea);
	}
}
