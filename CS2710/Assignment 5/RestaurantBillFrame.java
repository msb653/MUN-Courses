import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.awt.BorderLayout;
import java.awt.GridLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JOptionPane; 
import javax.swing.JPanel; 
import javax.swing.JTextArea;

public class RestaurantBillFrame extends JFrame { 
    //Initialize buttons
    private JButton Water; 
    private JButton Soda; 
    private JButton Juice; 
    private JButton Tea; 
    private JButton Salmon; 
    private JButton Hamburger; 
    private JButton Steak; 
    private JButton Wings; 
    private JButton Pie;
    private JButton Cake;
    private JButton CalculateBill;
    private JLabel TotalCost; 
    private JTextArea bill;
    
 
    private static final int FRAME_WIDTH = 600; 
    private static final int FRAME_HEIGHT = 400; 
 
    //Constructor
    public RestaurantBillFrame() { 
        this.createComponents(); 
        this.createPanel(); 
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT); 
        super.setTitle("Restaurant Bill");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        super.setVisible(true); 
    } 
 
    //Method to create components to go onto the panel/frame
    private void createComponents() { 
        this.TotalCost = new JLabel("0.00"); 
        this.bill=new JTextArea(30,20);
        this.createButtons(); 
    } 
 
    //Creates buttons
    private void createButtons() { 
        Water = new JButton("Water ($1.00)"); 
        Soda = new JButton("Soda ($2.00)"); 
        Juice = new JButton("Juice ($3.00)"); 
        Tea= new JButton("Tea ($3.00)"); 
        Salmon = new JButton("Salmon ($10.00)"); 
        Hamburger = new JButton("Hamburger ($8.00)"); 
        Steak = new JButton("Steak ($15.00)"); 
        Wings = new JButton("Wings ($8.00)");
        Pie = new JButton("Pie ($6.00)");
        Cake = new JButton("Cake ($2.00)");
        CalculateBill = new JButton("Calculate Bill"); 
 
        //Action listener for item selection
        class Listener1 implements ActionListener { 
            private double itemPrice; 
 
            public Listener1 (double itemPrice) { 
                this.itemPrice = itemPrice; 
            }
            public void actionPerformed(ActionEvent event) { 
                double currentBillSum = Double.valueOf(TotalCost.getText()) + this.itemPrice; 
                TotalCost.setText(String.format("%.4f", currentBillSum)); 
                bill.append("$"+this.itemPrice+"\n");
            } 
        } 
 
        //Adding listener to the buttons
        Water.addActionListener(new Listener1(1.00)); 
        Soda.addActionListener(new Listener1(2.00)); 
        Juice.addActionListener(new Listener1(3.00)); 
        Tea.addActionListener(new Listener1(3.00)); 
        Salmon.addActionListener(new Listener1(10.00)); 
        Hamburger.addActionListener(new Listener1(8.00)); 
        Steak.addActionListener(new Listener1(15.00)); 
        Wings.addActionListener(new Listener1(8.00)); 
        Pie.addActionListener(new Listener1(6.00)); 
        Cake.addActionListener(new Listener1(5.00)); 
        CalculateBill.addActionListener(new ActionListener() { 
            
            //Action listener for calculating bill
            public void actionPerformed(ActionEvent event) { 
                double temp=Double.parseDouble(TotalCost.getText());
                double temp2=temp/5;
                temp=temp*100;
                temp=Math.round(temp);
                temp=temp/100;
                temp2=temp2*100;
                temp2=Math.round(temp2);
                temp2=temp2/100;
                bill.append("Your total comes to: $ "+temp+"\n");
                bill.append("Recommended tip is: $"+temp2);
            } 
        }); 
    } 
 
    //creating panel/frame
    private void createPanel() { 
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JPanel buttonPanel=new JPanel();
        buttonPanel.setLayout(new GridLayout(2,5));
        buttonPanel.add(this.Water); 
        buttonPanel.add(this.Soda); 
        buttonPanel.add(this.Juice); 
        buttonPanel.add(this.Tea); 
        buttonPanel.add(this.Salmon); 
        buttonPanel.add(this.Hamburger); 
        buttonPanel.add(this.Steak); 
        buttonPanel.add(this.Wings); 
        buttonPanel.add(this.Pie); 
        buttonPanel.add(this.Cake); 
        panel.add(buttonPanel,BorderLayout.CENTER);
        panel.add(this.CalculateBill, BorderLayout.SOUTH);
        panel.add(bill, BorderLayout.EAST);
        super.add(panel); 
    } 
     
    //main method
    public static void main(String[] args) { 
        JFrame testFrame = new RestaurantBillFrame(); 
    } 
}
