/**
 * @author      Maximus Boxill
 * @author      400008300
 * @author      Asha Cumberbatch
 */


import java.awt.*;
import java.awt.event.*;


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
    JLabel name;
    JLabel species;
    JLabel category;
    JLabel hunger;
    JLabel health;

    JLabel label;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    JLabel label10;
    JLabel label11;
    JLabel label12;
    JLabel label13;
    JLabel label14;
    JLabel label15;
    JLabel label16;
    JLabel label17;
    JLabel label18;
    JLabel label19;
    JLabel label20;

    // TextFields go here
    JTextField hayTextField;
    JTextField fruitTextField;
    JTextField grainTextField;
    JTextField fishTextField;
    JTextField meatTextField;

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
    JButton logoBtn;
    JButton addBtn;
    JButton printFoodListBtn;
    JButton feedBtn;


    Animal animal;
    AnimalFeeder animalFeeder;
    
    

    /***************GUI OBJECTS END HERE************************/ 

    Zoo zoo;
    Welcome welcomePopup;
    int animalPosition = 1;

    public ZooManager() {
        zoo = new Zoo();
        animalFeeder = new AnimalFeeder(zoo.getCages());
        welcomePopup = new Welcome();
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
        mainFrame.setSize(1300, 900);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new GridLayout(2, 3, 10, 10));

        
        // PANELS TO BE WORKED ON

        feedingReportPanel = new JPanel(new GridLayout(2, 2));
        // foodPanel = new JPanel(new GridLayout(2, 2));
        welcomePanel = new JPanel(new GridLayout(2, 2));
        welcomePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        medicinePanel = new JPanel(new GridLayout(2, 2));
        healingPanel = new JPanel(new GridLayout(2, 2));
        
        // BUTTON INITIALISATIONS GO HERE
        nextAnimalBtn = new JButton("Next");
        welcomeBtn = new JButton("Zookeeper 2.0 logo");
        logoBtn = new JButton("LOGO");

        // BUTTON OPERATIONS GO HERE
        // int w = welcomePanel.getSize().width;
        welcomeBtn.setPreferredSize(new Dimension(5, 5));
        nextAnimalBtn.addActionListener(this);
        
        // LABELS INITIALISATIONS GO HERE
        welcomeLabel = new JLabel();
        cageIDLabel = new JLabel("CageID");
        nameLabel = new JLabel("Name");
        speciesLabel = new JLabel("Species");
        categoryLabel = new JLabel("Category");
        hungerLabel = new JLabel("Hunger");
        healthLabel = new JLabel("Health");

        cageID = new JLabel();
        name = new JLabel();
        category = new JLabel();
        species = new JLabel();
        hunger = new JLabel();
        health = new JLabel();
        

        
        welcomePopup.displayWelcome();

        welcomeLabel.setText(welcomePopup.getUsername());
        welcomeLabel.setVerticalAlignment(JLabel.TOP);
        // Adding stuff to the mainFrame
        
        // mainFrame.add(foodPanel);
        // mainFrame.add(feedingReportPanel);
        animalPanel();
        foodPanel();
        mainFrame.add(welcomePanel);
        // mainFrame.add(medicinePanel);
        // mainFrame.add(healingPanel);
        

        // Adding stuff to the welcomePanel
        welcomePanel.setBackground(Color.red);
        welcomePanel.add(welcomeLabel);
        welcomePanel.add(welcomeBtn);
        
        // Adding stuff to the animalPanel

        
        try {
            showAnimal(animalPosition);
            animal = getAnimal(animalPosition);
        }
        catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

        mainFrame.setVisible(true);

    }
    public static void main(String[] args) throws Exception {
        ZooManager zooManager = new ZooManager();
        
    } 

    public void animalPanel() {
        animalPanel = new JPanel(new GridLayout(8, 2));
        animalPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        animalPanel.setPreferredSize(new Dimension(30, 30));

        animalPanel.add(cageIDLabel);
        animalPanel.add(cageID);
        animalPanel.add(speciesLabel);
        animalPanel.add(species);
        animalPanel.add(nameLabel);
        animalPanel.add(name);
        animalPanel.add(categoryLabel);
        animalPanel.add(category);
        animalPanel.add(hungerLabel);
        animalPanel.add(hunger);
        animalPanel.add(healthLabel);
        animalPanel.add(health);
        animalPanel.add(logoBtn);
        animalPanel.add(nextAnimalBtn);
        
        mainFrame.add(animalPanel);
    } 

    public void foodPanel() {
        JPanel container = new JPanel();
        JPanel foodPanel = new JPanel();
        JPanel addBtnPanel = new JPanel();
        JPanel totalsPanel = new JPanel();
        JPanel btnContainer = new JPanel();

        totalsPanel.setLayout(new GridLayout(6, 4, 10, 10));
        container.setLayout(new FlowLayout());
        addBtnPanel.setLayout(new FlowLayout());
        foodPanel.setLayout(new GridLayout(6, 2));
        btnContainer.setLayout(new FlowLayout());
        
        JLabel typeLabel = new JLabel("Type");
        JLabel hayLabel = new JLabel("Hay");
        JLabel fruitLabel = new JLabel("Fruit");
        JLabel grainLabel = new JLabel("Grain");
        JLabel fishLabel = new JLabel("Fish");
        JLabel meatLabel = new JLabel("Meat");
        JLabel amountLabel = new JLabel("Amount");

        JLabel zoneALabel = new JLabel("A");
        JLabel zoneBLabel = new JLabel("B");
        JLabel zoneCLabel = new JLabel("C");
        JLabel zoneDLabel = new JLabel("D");

        label = new JLabel("0");
        label2 = new JLabel("0");
        label3 = new JLabel("0");
        label4 = new JLabel("0");
        label5 = new JLabel("0");
        label6 = new JLabel("0");
        label7 = new JLabel("0");
        label8 = new JLabel("0");
        label9 = new JLabel("0");
        label10 = new JLabel("0");
        label11 = new JLabel("0");
        label12 = new JLabel("0");
        label13 = new JLabel("0");
        label14 = new JLabel("0");
        label15 = new JLabel("0");
        label16 = new JLabel("0");
        label17 = new JLabel("0");
        label18 = new JLabel("0");
        label19 = new JLabel("0");
        label20 = new JLabel("0");


        totalsPanel.add(zoneALabel);
        totalsPanel.add(zoneBLabel);
        totalsPanel.add(zoneCLabel);
        totalsPanel.add(zoneDLabel);

        totalsPanel.add(label);
        totalsPanel.add(label2);
        totalsPanel.add(label3);
        totalsPanel.add(label4);
        totalsPanel.add(label5);
        totalsPanel.add(label6);
        totalsPanel.add(label7);
        totalsPanel.add(label8);
        totalsPanel.add(label9);
        totalsPanel.add(label10);
        totalsPanel.add(label11);
        totalsPanel.add(label12); 
        totalsPanel.add(label13);
        totalsPanel.add(label14);
        totalsPanel.add(label15);
        totalsPanel.add(label16);
        totalsPanel.add(label17);
        totalsPanel.add(label18);
        totalsPanel.add(label19);
        totalsPanel.add(label20);
        

        addBtn = new JButton("Add");
        addBtn.addActionListener(this);

        hayTextField = new JTextField("0");
        hayTextField.setColumns(5);

        fruitTextField = new JTextField("0");
        fruitTextField.setColumns(5);

        grainTextField = new JTextField("0");
        grainTextField.setColumns(5);

        fishTextField = new JTextField("0");
        fishTextField.setColumns(5);

        meatTextField = new JTextField("0");
        meatTextField.setColumns(5);

        printFoodListBtn = new JButton("Print List");
        printFoodListBtn.addActionListener(this);

        feedBtn = new JButton("Feed");
        feedBtn.addActionListener(this);

        btnContainer.add(printFoodListBtn);
        btnContainer.add(feedBtn);

        foodPanel.add(typeLabel);
        foodPanel.add(amountLabel);
        foodPanel.add(hayLabel);
        foodPanel.add(hayTextField);
        foodPanel.add(fruitLabel);
        foodPanel.add(fruitTextField);
        foodPanel.add(grainLabel);
        foodPanel.add(grainTextField);
        foodPanel.add(fishLabel);
        foodPanel.add(fishTextField);
        foodPanel.add(meatLabel);
        foodPanel.add(meatTextField);


        addBtnPanel.add(addBtn);
        
        foodPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        container.add(foodPanel);
        container.add(addBtnPanel);
        container.add(totalsPanel);
        container.add(btnContainer);

        mainFrame.add(container);
        
    }

    public void actionPerformed(ActionEvent e) {
        int nextBtnCount = 0;
        feedBtn.setEnabled(false);
        
        if (e.getSource() == nextAnimalBtn) {
            animalPosition++;
            nextBtnCount++;
            try {
                showAnimal(animalPosition);
                animal = getAnimal(animalPosition);
                addBtn.setEnabled(true);

            } 
            catch (Exception exception) {
                System.out.println("Error " + exception.getMessage());
            }
        }

        if (animal.getCategory().equalsIgnoreCase("Herbivore")) {
            this.hayTextField.setEnabled(true);
            this.fruitTextField.setEnabled(true);
            this.grainTextField.setEnabled(true);
            this.fishTextField.setEnabled(false);
            this.meatTextField.setEnabled(false);
        }

        if (animal.getCategory().equalsIgnoreCase("Carnivore")) {
            this.hayTextField.setEnabled(false);
            this.fruitTextField.setEnabled(false);
            this.grainTextField.setEnabled(false);
            this.fishTextField.setEnabled(true);
            this.meatTextField.setEnabled(true);
        }

        if (animal.getCategory().equalsIgnoreCase("Omnivore")) {
            this.hayTextField.setEnabled(true);
            this.fruitTextField.setEnabled(true);
            this.grainTextField.setEnabled(true);
            this.fishTextField.setEnabled(true);
            this.meatTextField.setEnabled(true);
        }

        if (Integer.parseInt(hayTextField.getText()) > 0) {
            this.fruitTextField.setEnabled(false);
            this.grainTextField.setEnabled(false);
            this.fishTextField.setEnabled(false);
            this.meatTextField.setEnabled(false);

            if (e.getSource() == addBtn) {
                try {
                    if (animal.getCageID().contains("A")) {
                        int labelNum = Integer.parseInt(label.getText());
                        int userNum = Integer.parseInt(hayTextField.getText());
                        int finalNum = userNum + labelNum;
                        label.setText(Integer.toString(finalNum));
                       
                        hayTextField.setText("0");
                        hayTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Hay");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }

                    if (animal.getCageID().contains("B")) {
                        int labelNum = Integer.parseInt(label2.getText());
                        int userNum = Integer.parseInt(hayTextField.getText());
                        int finalNum = userNum + labelNum;
                        label2.setText(Integer.toString(finalNum));
                        
                        hayTextField.setText("0");
                        hayTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Hay");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }

                    if (animal.getCageID().contains("C")) {
                        int labelNum = Integer.parseInt(label3.getText());
                        int userNum = Integer.parseInt(hayTextField.getText());
                        int finalNum = userNum + labelNum;
                        label3.setText(Integer.toString(finalNum));

                        hayTextField.setText("0");
                        hayTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Hay");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }

                    if (animal.getCageID().contains("D")) {
                        int labelNum = Integer.parseInt(label4.getText());
                        int userNum = Integer.parseInt(hayTextField.getText());
                        int finalNum = userNum + labelNum;
                        label4.setText(Integer.toString(finalNum));

                        hayTextField.setText("0");
                        hayTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Hay");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }
                } catch (Exception exception) {
                    System.out.println("Error " + exception.getMessage());
                }
            }
        }

        else if (Integer.parseInt(fruitTextField.getText()) > 0) {
            this.hayTextField.setEnabled(false);
            this.grainTextField.setEnabled(false);
            this.fishTextField.setEnabled(false);
            this.meatTextField.setEnabled(false);

            if (e.getSource() == addBtn) {
                try {
                    if (animal.getCageID().contains("A")) {
                        int labelNum = Integer.parseInt(label5.getText());
                        int userNum = Integer.parseInt(fruitTextField.getText());
                        int finalNum = userNum + labelNum;
                        label5.setText(Integer.toString(finalNum));

                        fruitTextField.setText("0");
                        fruitTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Fruit");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }

                    if (animal.getCageID().contains("B")) {
                        int labelNum = Integer.parseInt(label6.getText());
                        int userNum = Integer.parseInt(fruitTextField.getText());
                        int finalNum = userNum + labelNum;
                        label6.setText(Integer.toString(finalNum));

                        fruitTextField.setText("0");
                        fruitTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Fruit");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }

                    if (animal.getCageID().contains("C")) {
                        int labelNum = Integer.parseInt(label7.getText());
                        int userNum = Integer.parseInt(fruitTextField.getText());
                        int finalNum = userNum + labelNum;
                        label7.setText(Integer.toString(finalNum));

                        fruitTextField.setText("0");
                        fruitTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Fruit");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();

                    }

                    if (animal.getCageID().contains("D")) {
                        int labelNum = Integer.parseInt(label8.getText());
                        int userNum = Integer.parseInt(fruitTextField.getText());
                        int finalNum = userNum + labelNum;
                        label8.setText(Integer.toString(finalNum));

                        fruitTextField.setText("0");
                        fruitTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Fruit");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }
                } catch (Exception exception) {
                    System.out.println("Error " + exception.getMessage());
                }
                
            }
        }
        
        else if (Integer.parseInt(grainTextField.getText()) > 0) {
            this.hayTextField.setEnabled(false);
            this.fruitTextField.setEnabled(false);
            this.fishTextField.setEnabled(false);
            this.meatTextField.setEnabled(false);

            if (e.getSource() == addBtn) {
                try {
                    if (animal.getCageID().contains("A")) {
                        int labelNum = Integer.parseInt(label9.getText());
                        int userNum = Integer.parseInt(grainTextField.getText());
                        int finalNum = userNum + labelNum;
                        label9.setText(Integer.toString(finalNum));

                        grainTextField.setText("0");
                        grainTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Grain");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }

                    if (animal.getCageID().contains("B")) {
                        int labelNum = Integer.parseInt(label10.getText());
                        int userNum = Integer.parseInt(grainTextField.getText());
                        int finalNum = userNum + labelNum;
                        label10.setText(Integer.toString(finalNum));

                        grainTextField.setText("0");
                        grainTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Grain");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }

                    if (animal.getCageID().contains("C")) {
                        int labelNum = Integer.parseInt(label10.getText());
                        int userNum = Integer.parseInt(grainTextField.getText());
                        int finalNum = userNum + labelNum;
                        label11.setText(Integer.toString(finalNum));

                        grainTextField.setText("0");
                        grainTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Grain");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }

                    if (animal.getCageID().contains("D")) {
                        int labelNum = Integer.parseInt(label11.getText());
                        int userNum = Integer.parseInt(grainTextField.getText());
                        int finalNum = userNum + labelNum;
                        label12.setText(Integer.toString(finalNum));

                        grainTextField.setText("0");
                        grainTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Grain");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }
                } catch (Exception exception) {
                    System.out.println("Error " + exception.getMessage());
                }
            }
        }

        else if (Integer.parseInt(fishTextField.getText()) > 0) {
            this.hayTextField.setEnabled(false);
            this.grainTextField.setEnabled(false);
            this.grainTextField.setEnabled(false);
            this.meatTextField.setEnabled(false);

            if (e.getSource() == addBtn) {
                try {
                    if (animal.getCageID().contains("A")) {
                        int labelNum = Integer.parseInt(label13.getText());
                        int userNum = Integer.parseInt(fishTextField.getText());
                        int finalNum = userNum + labelNum;
                        label13.setText(Integer.toString(finalNum));

                        fishTextField.setText("0");
                        fishTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Fish");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }

                    if (animal.getCageID().contains("B")) {
                        int labelNum = Integer.parseInt(label14.getText());
                        int userNum = Integer.parseInt(fishTextField.getText());
                        int finalNum = userNum + labelNum;
                        label14.setText(Integer.toString(finalNum));

                        fishTextField.setText("0");
                        fishTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Fish");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }

                    if (animal.getCageID().contains("C")) {
                        int labelNum = Integer.parseInt(label15.getText());
                        int userNum = Integer.parseInt(fishTextField.getText());
                        int finalNum = userNum + labelNum;
                        label15.setText(Integer.toString(finalNum));

                        fishTextField.setText("0");
                        fishTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Fish");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }

                    if (animal.getCageID().contains("D")) {
                        int labelNum = Integer.parseInt(label16.getText());
                        int userNum = Integer.parseInt(fishTextField.getText());
                        int finalNum = userNum + labelNum;
                        label16.setText(Integer.toString(finalNum));

                        fishTextField.setText("0");
                        fishTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Fish");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }
                } catch (Exception exception) {
                    System.out.println("Error " + exception.getMessage());
                }
            }
        }

        else if (Integer.parseInt(meatTextField.getText()) > 0) {
            this.hayTextField.setEnabled(false);
            this.grainTextField.setEnabled(false);
            this.grainTextField.setEnabled(false);
            this.fishTextField.setEnabled(false);

            if (e.getSource() == addBtn) {
                try {
                    if (animal.getCageID().contains("A")) {
                        int labelNum = Integer.parseInt(label17.getText());
                        int userNum = Integer.parseInt(meatTextField.getText());
                        int finalNum = userNum + labelNum;
                        label17.setText(Integer.toString(finalNum));

                        meatTextField.setText("0");
                        meatTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Meat");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }

                    if (animal.getCageID().contains("B")) {
                        int labelNum = Integer.parseInt(label18.getText());
                        int userNum = Integer.parseInt(meatTextField.getText());
                        int finalNum = userNum + labelNum;
                        label18.setText(Integer.toString(finalNum));

                        meatTextField.setText("0");
                        meatTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Meat");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }

                    if (animal.getCageID().contains("C")) {
                        int labelNum = Integer.parseInt(label19.getText());
                        int userNum = Integer.parseInt(meatTextField.getText());
                        int finalNum = userNum + labelNum;
                        label19.setText(Integer.toString(finalNum));

                        meatTextField.setText("0");
                        meatTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Meat");

                        meal.setFoodAmt(userNum);

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }

                    if (animal.getCageID().contains("D")) {
                        int labelNum = Integer.parseInt(label20.getText());
                        int userNum = Integer.parseInt(meatTextField.getText());
                        int finalNum = userNum + labelNum;
                        label20.setText(Integer.toString(finalNum));

                        meatTextField.setText("0");
                        meatTextField.setEnabled(false);
                        addBtn.setEnabled(false);

                        Meal meal = new Meal();
                        meal.setFoodType("Meat");

                        meal.setFoodAmt(userNum);
                        animalFeeder.createNewMeal(meal);

                        animalFeeder.addMeal();
                    }
                } catch (Exception exception) {
                    System.out.println("Error " + exception.getMessage());
                }
            }
        }

        if (nextBtnCount == zoo.getCages().size() - 1) {
            feedBtn.setEnabled(true);
        }

    }

    public void showAnimal(int position) throws Exception {
        zoo.readFile();
        if (zoo.getCages().size() > 0) {
            cageID.setText(zoo.getAnimal(position).getCageID());
            name.setText(zoo.getAnimal(position).getName());
            species.setText(zoo.getAnimal(position).getSpecies());
            category.setText(zoo.getAnimal(position).getCategory());
            hunger.setText(Integer.toString((zoo.getAnimal(position).getHungerStatus())) + "/5");
            health.setText(Integer.toString((zoo.getAnimal(position).getHealthStatus())) + "/10");
            // System.out.println("animal cage id: " + zoo.getAnimal(position).getCageID());
        }
    }

    public Animal getAnimal(int position) {
        return zoo.getAnimal(position);
    }
} // ZooManager
