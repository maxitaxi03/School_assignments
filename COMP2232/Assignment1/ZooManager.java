/**
 * @author      Maximus Boxill
 * @author      400008300
 * @author      Asha Cumberbatch
 */


import java.awt.*;
import java.awt.event.*;

import javax.print.attribute.standard.MediaName;
import javax.swing.*;


public class ZooManager extends JFrame implements ActionListener {
    
    /***************GUI OBJECTS GO HERE************************/ 

    JFrame mainFrame;
    // LABELS GO HERE
    JLabel welcomeLabel;
    JLabel cageIDLabel;
    JLabel nameLabel;
    JLabel speciesLabel;
    JLabel categoryLabel;
    JLabel hungerLabel;
    JLabel healthLabel;

    JLabel cageID;



   // PANELS GO HERE
    JPanel animalPanel;
    JPanel feedingReportPanel;
    JPanel foodPanel;
    JPanel welcomePanel;
    JPanel medicinePanel;
    JPanel healingPanel;

    // BUTTONS GO HERE
    JButton nextAnimalBtn;
    JButton welcomeBtn;


    

    /***************GUI OBJECTS END HERE************************/ 

    private String userName;
    Zoo zoo;

    public ZooManager() {
        initFrame();
        centerFrame();
       
    }

    private void centerFrame() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        
        // determine the new location of the window
        int w = mainFrame.getSize().width;
        int h = mainFrame.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        mainFrame.setLocation(x, y);
    }

    public void initFrame() {
        mainFrame = new JFrame("Gridlayout stuff");
        mainFrame.setSize(1000, 600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new GridLayout(2, 3, 10, 10));

        
        // PANELS TO BE WORKED ON
        animalPanel = new JPanel(new GridLayout(6, 2));
        animalPanel.setBorder(BorderFactory.createLineBorder(Color.black));


        feedingReportPanel = new JPanel(new GridLayout(2, 2));
        foodPanel = new JPanel(new GridLayout(2, 2));
        welcomePanel = new JPanel(new GridLayout(2, 2));
        welcomePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        medicinePanel = new JPanel(new GridLayout(2, 2));
        healingPanel = new JPanel(new GridLayout(2, 2));
        
        // BUTTON INITIALISATIONS GO HERE
        nextAnimalBtn = new JButton("Next");
        welcomeBtn = new JButton("Zookeeper 2.0 logo");
       

        // BUTTON OPERATIONS GO HERE
    //    int w = welcomePanel.getSize().width;
        welcomeBtn.setPreferredSize(new Dimension(5, 5));
       
        
        
        // LABELS INITIALISATIONS GO HERE
        welcomeLabel = new JLabel();
        cageIDLabel = new JLabel("CageID");
        cageID = new JLabel();
        nameLabel = new JLabel();
        speciesLabel = new JLabel();
        categoryLabel = new JLabel();
        hungerLabel = new JLabel();
        healthLabel = new JLabel();

        userName = JOptionPane.showInputDialog(mainFrame, "Enter your message");
        welcomeLabel.setText("Welcome message goes here with " + userName);
        welcomeLabel.setVerticalAlignment(JLabel.TOP);

        // Adding stuff to the mainFrame
        mainFrame.add(animalPanel);
        mainFrame.add(feedingReportPanel);
        mainFrame.add(foodPanel);
        mainFrame.add(welcomePanel);
        mainFrame.add(medicinePanel);
        mainFrame.add(healingPanel);
        

        // Adding stuff to the welcomePanel
        welcomePanel.setBackground(Color.red);
        welcomePanel.add(welcomeLabel);
        welcomePanel.add(welcomeBtn);
        
        // Adding stuff to the animalPanel
        animalPanel.add(cageIDLabel);
        

        mainFrame.setVisible(true);

    }
    public static void main(String[] args) throws Exception {
        ZooManager zooManager = new ZooManager();
        
    } 

    public void actionPerformed(ActionEvent e) {
        
        

    }
} // ZooManager
