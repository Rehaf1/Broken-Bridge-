package ProjectBrokenBridge;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class PrintGuardFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final String NEW_LINE = "\n";
	private Guards guards; 

	public PrintGuardFrame(Guards guards) {
		this.guards = guards;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setType(Type.POPUP);
		setSize(850,700); 
		setAlwaysOnTop(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
        
		setBounds(0, 10, 1000, 700);
		setSize(850,700); 
		setContentPane(contentPane);
        JScrollPane ScrollBar = new JScrollPane();
        ScrollBar.setViewportBorder(new LineBorder(new Color(128, 128, 128), 3, true));
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Serif", Font.PLAIN, 14));
		
        ScrollBar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        ScrollBar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        ScrollBar.setSize(300, 400);
        contentPane.add(ScrollBar);
		textArea.append("************* Guards information *****************");
		textArea.append(NEW_LINE);
      textArea.append(NEW_LINE);
		for (int i =0 ; i<guards.getNumOfGuards() ; i++ )
		{
		textArea.append( guards.getGuard(i).toString()  );
		textArea.append(NEW_LINE);
      textArea.append(NEW_LINE);}
		textArea.append("********************************************");
		textArea.append(NEW_LINE);
		JPanel panel = new JPanel();
		panel.setBorder(null);
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
		 lblNewLabel_2.setIcon(im2);} catch (NullPointerException ex4){}
		 SpringLayout sl_panel = new SpringLayout();
		 panel.setLayout(sl_panel);
		SpringLayout sl_contentPane = new SpringLayout();
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 111, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -450, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, ScrollBar, -182, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 180, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, -172, SpringLayout.WEST, panel);
		sl_contentPane.putConstraint(SpringLayout.WEST, ScrollBar, 111, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, ScrollBar, -79, SpringLayout.WEST, panel);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 452, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, -1, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 724, SpringLayout.NORTH, contentPane);
		contentPane.setLayout(sl_contentPane);
		contentPane.add(lblNewLabel_1);
		contentPane.add(panel);
		
		
		textArea.setColumns(11);
		textArea.setTabSize(1000);
		textArea.setRows(10);
		
		textArea.setBackground(new Color(64, 64, 64));
		textArea.setForeground(new Color(206, 206, 206));
		
		ScrollBar.setViewportView(textArea);
		
		JLabel lblNewLabel = new JLabel("Guards Records");
		sl_contentPane.putConstraint(SpringLayout.NORTH, ScrollBar, 27, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 155, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, -130, SpringLayout.WEST, panel);
		contentPane.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 24));
		lblNewLabel.setBackground(new Color(51, 51, 51));
		
		 sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 24, SpringLayout.NORTH, panel);
		 sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 31, SpringLayout.WEST, panel);
		 sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 615, SpringLayout.NORTH, ScrollBar);
		 sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_2, -10, SpringLayout.EAST, panel);
		 panel.add(lblNewLabel_2);
		
		 
		  lblNewLabel_2.setOpaque(true);
		 
		 
		 
		 
		 
		 lblNewLabel_2.setLocation(new Point(100, 100));
		 lblNewLabel_2.setMaximumSize(new Dimension(20, 9));
		 lblNewLabel_2.setPreferredSize(new Dimension(100, 100));
		 lblNewLabel_2.setSize(new Dimension(500, 500));
		 lblNewLabel_2.setAlignmentY(0.0f);
	}

}
