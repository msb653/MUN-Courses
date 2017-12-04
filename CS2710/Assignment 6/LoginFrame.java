import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.*;
import javax.swing.*;

public class LoginFrame extends JFrame { 
	//variable initialization
    private static final int FRAME_WIDTH = 400; 
    private static final int FRAME_HEIGHT = 300; 
    private HashMap<String, String> usernamesAndPasswords; 
    private JTextField usernameField; 
    private JTextField passwordField; 
    private JButton loginButton; 
    private JPanel loginPanel; 
    private JPanel welcomePanel; 
    private JPanel mainPanel; 
    private CardLayout cardLayout; 
 
    //constructor
    public LoginFrame() { 
        this.createComponents(); 
        super.setTitle("User Login"); 
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT); 
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        super.setVisible(true); 
    } 
 
    //method for creating components
    private void createComponents() { 
        this.mainPanel = new JPanel(new CardLayout()); 
        this.createHashMap(); 
        this.loginPanel = this.createLoginPanel(); 
        this.welcomePanel = this.createWelcomePanel(); 
        this.mainPanel.add(this.loginPanel, "User Login"); 
        this.mainPanel.add(this.welcomePanel, "WelcomePanel"); 
        this.cardLayout = (CardLayout) this.mainPanel.getLayout(); 
        this.cardLayout.show(this.mainPanel, "LoginPanel"); 
        super.add(this.mainPanel); 
    } 
 
    //creating maing login panel
    private JPanel createLoginPanel() { 
        JPanel panel = new JPanel(new GridLayout(3, 2)); 
        this.loginButton = new JButton("Login"); 
        this.loginButton.setBackground(Color.GREEN);
        this.loginButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        final int TEXT_FIELD_SIZE = 10; 
        this.usernameField = new JTextField(TEXT_FIELD_SIZE); 
        this.passwordField = new JPasswordField(TEXT_FIELD_SIZE);
        //creating action listener for login button
        this.loginButton.addActionListener(new ActionListener() { 
            private int loginAttempts = 3; 
            @Override 
            public void actionPerformed(ActionEvent arg0) { 
                boolean loggedIn = false; 
                String inputUsername = usernameField.getText().toLowerCase(); 
                String inputPassword = passwordField.getText(); 
                if (this.loginAttempts == 1) { 
                    JOptionPane.showMessageDialog(null, "Too many failed login attempts. Please try again later.","Failed Login",JOptionPane.INFORMATION_MESSAGE); 
                    System.exit(1); 
                } 
                for (Map.Entry<String, String> validUser : usernamesAndPasswords.entrySet()) { 
                    if (inputUsername.equals(validUser.getKey().toLowerCase())) { 
                        if (inputPassword.equals(validUser.getValue())) { 
                            System.out.println("Login successful!"); 
                            cardLayout.show(mainPanel, "WelcomePanel"); 
                            loggedIn = true; 
                        } 
                    } 
                } 
                if (!loggedIn) { 
                    this.loginAttempts -= 1; 
                    String message = String.format("Failed sign in. %d %s remaining", this.loginAttempts, 
                            (this.loginAttempts > 1) ? "attempts" : "attempt"); 
                    JOptionPane.showMessageDialog(null, message, "Failed Login", JOptionPane.INFORMATION_MESSAGE); 
                } 
            } 
        }); 
        //adding all components
        JPanel temp=new JPanel();
        temp.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        panel.add(new JLabel("Username")); 
        panel.add(this.usernameField); 
        panel.add(new JLabel("Password")); 
        panel.add(this.passwordField); 
        panel.add(temp);
        panel.add(this.loginButton);
        return panel; 
    } 
 
    //creating successful sign in panel
    private JPanel createWelcomePanel() { 
        JPanel panel = new JPanel(new GridLayout(2, 1)); 
        panel.add(new JLabel("You have successfully logged in!")); 
        JButton logout = new JButton("Logout");
        logout.setBackground(Color.RED);
        logout.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        //creating action listent for log out button
        logout.addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent arg0) { 
                System.exit(0); 
            } 
        }); 
        panel.add(logout); 
        return panel; 
    } 
 
    //reading and storing the usernames and passwords from the text file
    private void createHashMap() { 
        this.usernamesAndPasswords = new HashMap<String, String>(); 
        try { 
            Scanner fileScanner = new Scanner(new File("users.txt")); 
            while (fileScanner.hasNextLine()) { 
                String[] line = fileScanner.nextLine().split(" "); 
                this.usernamesAndPasswords.put(line[0], line[1]); 
                System.out.println(line[0] + " " + line[1]); 
            } 
            fileScanner.close(); 
        } catch (FileNotFoundException e) { 
            JOptionPane.showMessageDialog(null, 
                    "Error: no users.txt file found. No users/passwords available to read.", "USERS.TXT NOT FOUND!", 
                    JOptionPane.ERROR_MESSAGE); 
            e.printStackTrace(); 
        } 
    } 
 
    //creating the frame
    public static void main(String[] args) { 
        JFrame testFrame = new LoginFrame(); 
    } 
}
