import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import javafx.embed.swing.JFXPanel;

import java.io.IOException;
import java.awt.FontFormatException;

import javafx.embed.swing.JFXPanel;






public class EducationalFrame extends JFrame implements ActionListener {
	

	// create frames
	public static JFrame sampleCodeFrame2 = new JFrame("Sample Code");
	public static JFrame sampleCodeFrame = new JFrame("Sample Code");
	public static JFrame sampleCodeFrame3 = new JFrame("Sample Code");

	// Create labels
	JLabel classLabel = new JLabel("Class:");
	JLabel objectLabel = new JLabel("Object: ");
	JLabel classDesLabel = new JLabel("A blueprint (plan)  for making objects.");
	JLabel objectDesLabel = new JLabel("An item that has properties or characteristics and actions.");
	JLabel stepsLabel = new JLabel("Steps to create an object");
	JLabel behaviourTextLabel = new JLabel(
			"<html> <div style='text-align: center;'>An object has attributes that are carried with the object as <br> it’s used in a program. <br> It is specified as part  of the object’s class. Attributes are a named object with associated  values, as specified by the <br> class’s instance</html>");
	JLabel instancesTextLabel = new JLabel(
			"<html><div style='text-align: center;'>They are a particular (specific) object. To instantiate your object is to make an actual one\n"
					+ "In order to create objects, you must use the “key word” new. Each object (instance) from a class has its own set of instance variables (declared in a class outside a method) that represent the unique state or attributes of that object.\n");
	JLabel stepsTextLabel = new JLabel(
			"<html> <div style='text-align: center;'>1) Create a template class <br> 2) Declare fields <br> 3) Declare set and get methods <br> 4) Declare to-String method <br> 5) Create Test Class <br> 6) Create instances <br> 7) Output results</html>");
	public static JLabel accountClassLabel = new JLabel();
	public static JLabel accountClassLabel2 = new JLabel();
	public static JLabel accountClassLabel3 = new JLabel();
	public static JLabel accountTestLabel = new JLabel();
	public static JLabel accountTestLabel2 = new JLabel();
	public static JLabel accountOutputLabel = new JLabel();


	// Crease panels
	JPanel stepsPanel = new JPanel();
	JPanel behaviourPanel = new JPanel();
	JPanel instancesPanel = new JPanel();
	JPanel mainPanel = new JPanel();

	// create buttons
	JButton sampleCode = new JButton("Accounts Template Class");
	JButton sampleCode2 = new JButton("Accounts Test Class");
	JButton sampleCode3 = new JButton("Accounts Output");

	// load font
	static Font panelFont = loadFont();
	
    private JDesktopPane desktopPane;


	// Constructor Method
	// This method runs when the frame is created
	public EducationalFrame() {

		// set the location where frame will appear
		setLocation(0, 0);

		// setup frame
		setSize(1920, 1080);
		setTitle("JavaJungle");
		getContentPane().setBackground(Color.decode("#A2C4A3"));
		mainPanel.setBackground(Color.decode("#A2C4A3"));
		
		desktopPane = new JDesktopPane();
        add(desktopPane);

		// customize labels
		classLabel.setBounds(400, 75, 150, 50);
		add(classLabel);
		classLabel.setFont(panelFont.deriveFont(30f));
		classLabel.setForeground(Color.decode("#6A3125"));

		objectLabel.setBounds(400, 125, 150, 50);
		add(objectLabel);
		objectLabel.setForeground(Color.white);
		objectLabel.setFont(panelFont.deriveFont(30f));
		objectLabel.setForeground(Color.decode("#6A3125"));

		classDesLabel.setBounds(500, 88, 800, 25);
		classDesLabel.setFont(panelFont.deriveFont(30f));
		classDesLabel.setForeground(Color.decode("#6A3125"));
		add(classDesLabel);

		objectDesLabel.setBounds(500, 140, 800, 25);
		objectDesLabel.setFont(panelFont.deriveFont(30f));
		objectDesLabel.setForeground(Color.decode("#6A3125"));
		add(objectDesLabel);

		// customize panels
		stepsPanel.setBounds(1000, 300, 250, 300);
		stepsPanel.setBackground(Color.decode("#6A3125"));
		stepsPanel.setLayout(null);

		// Add a titled border to the stes panel
		TitledBorder stepsBorder = BorderFactory.createTitledBorder("Steps to Create an Object");
		stepsBorder.setTitleFont(panelFont.deriveFont(25f)); // Adjust the font size
		stepsBorder.setTitleColor(Color.decode("#A2C4A3")); // Adjust the title color
		stepsPanel.setBorder(stepsBorder);
		add(stepsPanel);

		behaviourPanel.setBounds(200, 300, 250, 300);
		behaviourPanel.setBackground(Color.decode("#6A3125"));
		behaviourPanel.setLayout(null);

		// Add a titled border to the behaviour panel
		TitledBorder behaviourBorder = BorderFactory.createTitledBorder("   Properties of an Object");
		behaviourBorder.setTitleFont(panelFont.deriveFont(25f)); // Adjust the font size
		behaviourBorder.setTitleColor(Color.decode("#A2C4A3")); // Adjust the title color
		behaviourPanel.setBorder(behaviourBorder);

		add(behaviourPanel);

		instancesPanel.setBounds(600, 300, 250, 300);
		instancesPanel.setBackground(Color.decode("#6A3125"));
		instancesPanel.setLayout(null);

		// Add a titled border to the instances panel
		TitledBorder instancesBorder = BorderFactory.createTitledBorder("          Instances          ");
		instancesBorder.setTitleFont(panelFont.deriveFont(25f)); // Adjust the font size
		instancesBorder.setTitleColor(Color.decode("#A2C4A3")); // Adjust the title color
		instancesPanel.setBorder(instancesBorder);
		add(instancesPanel);

		// behavior description text
		behaviourTextLabel.setBounds(0, 0, 240, 300); // Adjust the bounds as needed
		behaviourTextLabel.setFont(panelFont.deriveFont(21f));// Adjust the font as needed
		behaviourTextLabel.setForeground(Color.decode("#A2C4A3")); // Adjust the text color as needed
		behaviourPanel.add(behaviourTextLabel);

		// instances description text
		instancesTextLabel.setBounds(0, 10, 240, 300);
		instancesTextLabel.setFont(panelFont.deriveFont(20f));
		instancesTextLabel.setForeground(Color.decode("#A2C4A3"));
		instancesPanel.add(instancesTextLabel);

		// steps description text
		stepsTextLabel.setBounds(10, 0, 240, 300);
		stepsTextLabel.setFont(panelFont.deriveFont(20f));
		stepsTextLabel.setForeground(Color.decode("#A2C4A3"));
		stepsPanel.add(stepsTextLabel);

		// Add panels to the main panel
		mainPanel.setLayout(null);
		mainPanel.add(classLabel);
		mainPanel.add(objectLabel);
		mainPanel.add(classDesLabel);
		mainPanel.add(objectDesLabel);
		mainPanel.add(stepsPanel);
		mainPanel.add(behaviourPanel);
		mainPanel.add(instancesPanel);

		// Set the size of the main panel
		// https://docs.oracle.com/javase%2Ftutorial%2F/uiswing/components/scrollpane.html
		mainPanel.setPreferredSize(new Dimension(getWidth(), getHeight()));

		// Add buttons to the main panel
		sampleCode.setBounds(100, 900, 150, 30); // Adjusted bounds
		sampleCode.addActionListener(this);
		mainPanel.add(sampleCode);

		sampleCode2.setBounds(100, 950, 150, 30);
		sampleCode2.addActionListener(this);
		mainPanel.add(sampleCode2);

		sampleCode3.setBounds(100, 1000, 150, 30);
		sampleCode3.addActionListener(this);
		mainPanel.add(sampleCode3);

		JButton monkeyNext = new JButton(new ImageIcon("images/arrow.png"));
		monkeyNext.setBounds(1000, 700, 400, 100);
		// https://stackoverflow.com/questions/4585867/transparent-jbutton
		monkeyNext.setContentAreaFilled(false); // Make content area transparent
		monkeyNext.setBorderPainted(false);
		monkeyNext.setFocusPainted(false);
		mainPanel.add(monkeyNext);

		// Create JScrollPane and set the main panel as its view
		JScrollPane scrollPane = new JScrollPane(mainPanel);
		setContentPane(scrollPane);

		// Set the visibility of the frame
		setVisible(true);
	}

	private static Font loadFont() {

		// Initialize Font object
		Font panelFont;
		// Try to load the custom font
		try {
			// Create a Font object from the specified font file
			panelFont = Font.createFont(Font.TRUETYPE_FONT, new java.io.File("Fonts/panelFont.ttf"));
			// Get the local graphics environment
			GraphicsEnvironment font = GraphicsEnvironment.getLocalGraphicsEnvironment();
			// Register the custom font with the graphics environment
			font.registerFont(panelFont);
			// Return the loaded font
			return panelFont;
			// Catch FontFormatException & IOException; print an error message if the file
			// is not found & return null
		} catch (FontFormatException | IOException error) {
			throw new RuntimeException("Failed to load font");

		}

	}

	private void openInternalFrame() {
		System.out.println("Opening internal frame");

		JFrame sampleCodeFrame = new JFrame("Sample Template Class");
		sampleCodeFrame.setSize(1000, 650);
		sampleCodeFrame.setLocation(100, 100);

		// Create a panel to hold the content with FlowLayout
		JPanel contentPanel = new JPanel();
		// contentPanel.setLayout(null);
		contentPanel.setPreferredSize(new Dimension(1000, 2000));

		// Add images to the content panel and rescale it
		ImageIcon accountClass = new ImageIcon("images/AccountClass.png");
		Image scaledAccountClass = accountClass.getImage().getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		accountClassLabel.setIcon(new ImageIcon(scaledAccountClass));
		accountClassLabel.setBounds(720, 0, 600, 300);
		accountClassLabel.setLayout(null);
		contentPanel.add(accountClassLabel);

		ImageIcon accountClass2 = new ImageIcon("images/AccountClass2.png");
		Image scaledAccountClass2 = accountClass.getImage().getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		accountClassLabel2.setIcon(new ImageIcon(scaledAccountClass2));
		accountClassLabel2.setBounds(720, 700, 600, 300);
		accountClassLabel2.setLayout(null);
		contentPanel.add(accountClassLabel2);

		ImageIcon accountClass3 = new ImageIcon("images/AccountClass3.png");
		Image scaledAccountClass3 = accountClass.getImage().getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		accountClassLabel3.setIcon(new ImageIcon(scaledAccountClass3));
		accountClassLabel3.setBounds(720, 1300, 600, 300);
		accountClassLabel3.setLayout(null);
		contentPanel.add(accountClassLabel3);

		// Create a JScrollPane and set the content panel as its view
		JScrollPane sampleScrollPane = new JScrollPane(contentPanel);

		// Add the scroll pane to the frame's content pane
		sampleCodeFrame.add(sampleScrollPane);
		sampleCodeFrame.setVisible(true);
	}

	private void openInternalFrame2() {
		System.out.println("Opening internal frame");

		JFrame sampleCodeFrame2 = new JFrame("Sample Test Class");
		sampleCodeFrame2.setSize(1000, 650);
		sampleCodeFrame2.setLocation(100, 100);

		// Create a panel to hold the content with FlowLayout
		JPanel contentPanel2 = new JPanel();
		// contentPanel.setLayout(null);
		contentPanel2.setPreferredSize(new Dimension(1000, 1250));

		// Create a JScrollPane and set the content panel as its view
		JScrollPane sampleScrollPane2 = new JScrollPane(contentPanel2);

		// Add images to the content panel and rescale it
		ImageIcon accountTest = new ImageIcon("images/AccountTest1.png");
		Image scaledAccountTest = accountTest.getImage().getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		accountTestLabel.setIcon(new ImageIcon(scaledAccountTest));
		accountTestLabel.setBounds(720, 0, 600, 300);
		accountTestLabel.setLayout(null);
		contentPanel2.add(accountTestLabel);

		ImageIcon accountTest2 = new ImageIcon("images/AccountTest1.png");
		Image scaledAccountTest2 = accountTest.getImage().getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		accountTestLabel2.setIcon(new ImageIcon(scaledAccountTest2));
		accountTestLabel2.setBounds(720, 600, 600, 300);
		accountTestLabel2.setLayout(null);
		contentPanel2.add(accountTestLabel2);

		// Add the scroll pane to the frame's content pane
		sampleCodeFrame2.add(sampleScrollPane2);
		sampleCodeFrame2.setVisible(true);
	}

	private void openInternalFrame3() {
		System.out.println("Opening internal frame");

		sampleCodeFrame3.setSize(1000, 650);
		sampleCodeFrame3.setLocation(100, 100);

		// Create a panel to hold the content with FlowLayout
		JPanel contentPanel3 = new JPanel();
		// contentPanel.setLayout(null);
		contentPanel3.setPreferredSize(new Dimension(1000, 600));

		// Create a JScrollPane and set the content panel as its view
		JScrollPane sampleScrollPane3 = new JScrollPane(contentPanel3);

		// Add images to the content panel and rescale it
		ImageIcon accountOutput = new ImageIcon("images/AccountOutput.png");
		Image scaledAccountOutput = accountOutput.getImage().getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		accountOutputLabel.setIcon(new ImageIcon(scaledAccountOutput));
		accountOutputLabel.setBounds(720, 0, 600, 300);
		accountOutputLabel.setLayout(null);
		contentPanel3.add(accountOutputLabel);

		// Add the scroll pane to the frame's content pane
		sampleCodeFrame3.add(sampleScrollPane3);
		sampleCodeFrame3.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == sampleCode) {
			System.out.println("Button pressed!");
			openInternalFrame();
		} else if (event.getSource() == sampleCode2) {
			openInternalFrame2();
		} else if (event.getSource() == sampleCode3)
			openInternalFrame3();
	}

}
