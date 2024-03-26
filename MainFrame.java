/*
 * 
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class MainFrame extends JFrame implements ActionListener {

	// create GUI Objects

	// menu bar elements
	public JMenuBar menuBar = new JMenuBar();
	JMenu mainMenu = new JMenu("Main Menu");
	JMenu educationalMenu = new JMenu("Learn More");
	JMenu gameMenu = new JMenu("Try This");
	JMenu quizMenu = new JMenu("Test Yourself");

	// menu items
	JMenuItem mainMenuItem = new JMenuItem("Main Menu");
	JMenuItem educationalMenuItem = new JMenuItem("Learn More");
	JMenuItem gameMenuItem = new JMenuItem("Try This");
	JMenuItem quizMenuItem = new JMenuItem("Test Yourself");

	// labels for main frame
	JLabel titleLabel = new JLabel("  WELCOME TO JAVA JUNGLE!");
	JLabel nameLabel = new JLabel("Please enter your name: ");
	JLabel gradeLabel = new JLabel("Please enter your grade (1-12) : ");
	JLabel introPictureLabel = new JLabel();
	JLabel hangingLeavesLabel = new JLabel();
	JLabel hangingLeavesLabel2 = new JLabel();
	JLabel hangingLeavesLabel3 = new JLabel();
	JLabel hangingLeavesLabel4 = new JLabel();


	// text areas for main frame
	JTextArea nameTextArea = new JTextArea();
	JTextArea gradeTextArea = new JTextArea();


	// button for main frame
	JButton continueButton = new JButton("Continue");

	// checkboxes and corresponding labels
	JCheckBox objectClassesCheckbox = new JCheckBox("Object & Classes Expert");
	JCheckBox loadsOfFunCheckbox = new JCheckBox("Loads of Fun!");
	JCheckBox instructorCheckbox = new JCheckBox("Your Very Own Instructor");

	// Constructor Method
	// This method runs when the frame is created
	public MainFrame() {

		// setup frame
		setSize(1920, 1080);
		setLayout(null);
		setTitle("JavaJungle");
		getContentPane().setBackground(Color.decode("#A2C4A3"));

		// menu bar (menu items) action listeners
		mainMenuItem.addActionListener(this);
		educationalMenuItem.addActionListener(this);
		gameMenuItem.addActionListener(this);
		quizMenuItem.addActionListener(this);

		// add menu bar and menu items --> to main frame
		menuBar.add(mainMenuItem);
		menuBar.add(educationalMenuItem);
		menuBar.add(gameMenuItem);
		menuBar.add(quizMenuItem);
		setJMenuBar(menuBar);

		// customize labels
		titleLabel.setBounds(800, 165, 600, 50);
		titleLabel.setFont(new Font("Garamond", Font.BOLD, 30));
		titleLabel.setForeground(Color.decode("#6A3125"));
		//titleLabel.setOpaque(true);  // Set opaque to true to enable background color
        //titleLabel.setBackground(Color.decode("#A2C4A3")); 
		add(titleLabel);

		nameLabel.setBounds(800, 450, 500, 30);
		nameLabel.setFont(new Font("Garamond", Font.BOLD, 25));
		nameLabel.setForeground(Color.decode("#6A3125"));
		add(nameLabel);
		
		gradeLabel.setBounds(800, 550, 500, 30);
		gradeLabel.setFont(new Font("Garamond", Font.BOLD, 25));
		gradeLabel.setForeground(Color.decode("#6A3125"));
		add(gradeLabel);

		// format text areas
		nameTextArea.setBounds(800, 490, 350, 35);
		nameTextArea.setFont(new Font("Garamond", Font.BOLD, 25));
		nameTextArea.setForeground(Color.decode("#E18287"));
		nameTextArea.setBorder(BorderFactory.createLineBorder(Color.decode("#332805"))); 
		add(nameTextArea);
		
		gradeTextArea.setBounds(800, 590, 350, 35);
		gradeTextArea.setFont(new Font("Garamond", Font.BOLD, 25));
		gradeTextArea.setForeground(Color.decode("#E8B2B5"));
		gradeTextArea.setBorder(BorderFactory.createLineBorder(Color.decode("#332805"))); 
		add(gradeTextArea);
		
		

		// format button
		continueButton.setBounds(1220, 660, 150, 50);
		continueButton.setFont(new Font("Garamond", Font.BOLD, 25));
        continueButton.setBackground(Color.decode("#6A3125"));
        continueButton.setOpaque(true);
		continueButton.setBorder(new LineBorder(Color.decode("#819B34")));
		continueButton.setForeground(Color.decode("#819B34"));
		add(continueButton);
		continueButton.addActionListener(this);
		
		// set bounds for checkbox
		objectClassesCheckbox.setBounds(800,175, 400, 200);
		loadsOfFunCheckbox.setBounds(800, 225, 350, 200);
		instructorCheckbox.setBounds(800, 275, 400, 200);

		// Customize checkbox
		objectClassesCheckbox.setFont(new Font("Garamond", Font.BOLD, 28));
		objectClassesCheckbox.setForeground(Color.decode("#6A3125"));
		objectClassesCheckbox.setSelected(true); // Set checkbox as checked

		loadsOfFunCheckbox.setFont(new Font("Garamond", Font.BOLD, 28));
		loadsOfFunCheckbox.setForeground(Color.decode("#6A3125"));
		loadsOfFunCheckbox.setSelected(true); // Set checkbox as checked

		instructorCheckbox.setFont(new Font("Garamond", Font.BOLD, 28));
		instructorCheckbox.setForeground(Color.decode("#6A3125"));
		instructorCheckbox.setSelected(true); // Set checkbox as checked

		add(objectClassesCheckbox);
		add(loadsOfFunCheckbox);
		add(instructorCheckbox);

		// images
		
		ImageIcon imageIconLeaves = new ImageIcon("images/javaJungle.png");
		Image scaledTopImageLeaves = imageIconLeaves.getImage().getScaledInstance(600, 300, Image.SCALE_SMOOTH);
		hangingLeavesLabel.setIcon(new ImageIcon(scaledTopImageLeaves));
		hangingLeavesLabel.setBounds(720, 0, 600,300);
		hangingLeavesLabel.setLayout(null);
		add(hangingLeavesLabel);
		
		/*ImageIcon imageIconLeaves2 = new ImageIcon("images/star.png");
		Image scaledTopImageLeaves2 = imageIconLeaves2.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);
		hangingLeavesLabel2.setIcon(new ImageIcon(scaledTopImageLeaves2));
		hangingLeavesLabel2.setBounds(660, 75, 200,100);
		hangingLeavesLabel2.setLayout(null);
		add(hangingLeavesLabel2);
		
		ImageIcon imageIconLeaves3 = new ImageIcon("images/star.png");
		Image scaledTopImageLeaves3 = imageIconLeaves3.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);
		hangingLeavesLabel3.setIcon(new ImageIcon(scaledTopImageLeaves3));
		hangingLeavesLabel3.setBounds(1210, 75, 200,100);
		hangingLeavesLabel3.setLayout(null);
		add(hangingLeavesLabel3);
		
		ImageIcon imageIconLeaves4 = new ImageIcon("images/star.png");
		Image scaledTopImageLeaves4 = imageIconLeaves4.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);
		hangingLeavesLabel4.setIcon(new ImageIcon(scaledTopImageLeaves3));
		hangingLeavesLabel4.setBounds(660, 600, 200,100);
		hangingLeavesLabel3.setLayout(null);
		add(hangingLeavesLabel4);*/
		
		
		ImageIcon imageIcon = new ImageIcon("images/introPictureLabel.jpg");
		Image scaledTopImage = imageIcon.getImage().getScaledInstance(550, 650, Image.SCALE_SMOOTH);
		introPictureLabel.setIcon(new ImageIcon(scaledTopImage));
		introPictureLabel.setBounds(110, 100, 550, 650);
		// Add a border to introPictureLabel
		introPictureLabel.setBorder(BorderFactory.createLineBorder(Color.decode("#6A3125"), 3));
		add(introPictureLabel);
		

		setVisible(true);

	}

	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == mainMenuItem) {
			setVisible(false);
			new MainFrame();
		} else if (event.getSource() == educationalMenuItem  || event.getSource() == continueButton) {
			setVisible(false);
			new EducationalFrame();
		} else if (event.getSource() == gameMenuItem) {
			setVisible(false);
			new gameFrame();
		} else if (event.getSource() == quizMenuItem) {
			setVisible(false);
			new quizFrame();
		}

	}

}
