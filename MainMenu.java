package AirlineReservationSystem;

//Importing the necessary classes
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainMenu extends JPanel  {

    //Initialising panel and label
    JPanel panel = new JPanel();
    JLabel label = new JLabel(
            "                                         GAUTAM'S TRAVELS                                                 ");

    public MainMenu() throws IOException{

        //button declaration
        JButton bookButton = new JButton("Book Tickets");
        JButton cancelButton = new JButton("Cancel Tickets");
        JButton closeButton = new JButton("Exit");

        //frame declaration, initialization
        final JFrame frame = new JFrame();
        frame.setTitle("Airline Reservation System");
        frame.setBounds(100, 100, 500, 200);


        bookButton.addActionListener(new ActionListener() {
            //closing frame, opening departure window
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                try {
                    departure();
                } catch (IOException ex) {
                    System.out.println("Invalid Input");
                }
            }
        });

        /*cancelButton.addActionListener(new ActionListener() {
            //closing frame
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

            }
        });*/

        // If exit is clicked
        closeButton.addActionListener(new ActionListener() {
            //closing frame
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
            }
        });

        //adding components to panel
        panel.add(label);
        panel.add(bookButton);
        //panel.add(cancelButton);
        panel.add(closeButton);

        //creating container
        Container con = frame.getContentPane();
        con.add(panel);

        //Making the frame visible
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void flightPanel() throws IOException {

        JPanel panel = new JPanel();
        JLabel label = new JLabel(
                "                                      Book Flight Tickets                                    ");

        //Defining the Buttons and TextFields
        JRadioButton flight1;
        JRadioButton flight2;
        JRadioButton flight3;
        JRadioButton flight4;
        ButtonGroup flightGroup;
        JButton nextBtn;

        JTextField field1;
        JTextField field2;
        JTextField field3;
        JTextField field4;

        Dimension dim = getPreferredSize();
        dim.width = 200;
        setPreferredSize(dim);

        //Initialising the local variables
        flight1 = new JRadioButton("Air India (AI - 701) --------------- Rs. 6877 ");
        flight2 = new JRadioButton("SpiceJet (SG - 254) ------------------ Rs. 6666");
        flight3 = new JRadioButton("Indigo (6E - 417) ---------------------- Rs. 6666 ");
        flight4 = new JRadioButton("GoAir (G8 - 227) ------------------ Rs. 6667");
        nextBtn = new JButton("Next");
        flightGroup = new ButtonGroup();

        field1 = new JTextField(100);
        field2 = new JTextField(100);
        field3 = new JTextField(100);
        field4 = new JTextField(100);

        field1.setText("Flight - Air India (AI - 701) \t Price - Rs. 6877 ");
        field2.setText("Flight - SpiceJet (SG - 254) \t Price - Rs. 6666 ");
        field3.setText("Flight - Indigo (6E - 417) \t Price - Rs. 6666");
        field4.setText("Flight - GoAir (Go - 897) \t Price - Rs. 3666");

        //Setting the Layout
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        flightGroup.add(flight1);
        flightGroup.add(flight2);
        flightGroup.add(flight3);
        flightGroup.add(flight4);

        //Creating the frame
        final JFrame frame = new JFrame();
        frame.setTitle("Airline Reservation System");
        frame.setBounds(100, 100, 500, 200);

        flight1.setActionCommand("flight1");
        flight2.setActionCommand("flight2");
        flight3.setActionCommand("flight3");
        flight4.setActionCommand("flight4");

        //Creating action listener for saving the data to a file
        nextBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String flightChosen = flightGroup.getSelection().getActionCommand();

                if(flightChosen == "flight1") {
                    try {
                        BufferedWriter writer;
                        writer = new BufferedWriter(new FileWriter("Flight.txt",true));
                        writer.write(field1.getText());
                        writer.newLine();
                        writer.close();
                    }
                    catch (IOException ioe) {
                        System.out.println("Invalid Input");
                    }
                }
                if(flightChosen == "flight2") {
                    try {
                        BufferedWriter writer;
                        writer = new BufferedWriter(new FileWriter("Flight.txt",true));
                        writer.write(field2.getText() +  "\t");
                        writer.newLine();
                        writer.close();
                    }
                    catch (IOException ioe) {
                        System.out.println("Invalid Input");
                    }
                }
                if(flightChosen == "flight3") {
                    try {
                        BufferedWriter writer;
                        writer = new BufferedWriter(new FileWriter("Flight.txt",true));
                        writer.write(field3.getText() +  "\t");
                        writer.newLine();
                        writer.close();
                    }
                    catch (IOException ioe) {
                        System.out.println("Invalid Input");
                    }
                }
                if(flightChosen == "flight4") {
                    try {
                        BufferedWriter writer;
                        writer = new BufferedWriter(new FileWriter("Flight.txt",true));
                        writer.write(field4.getText() +  "\t");
                        writer.newLine();
                        writer.close();
                    }
                    catch (IOException ioe) {
                        System.out.println("Invalid Input");
                    }
                }

                //Calling new window for accepting the personal details
                frame.dispose();
                try {
                    personal();
                } catch (IOException ioe) {
                    System.out.println("Invalid Input");
                }
            }
        });



        panel.add(flight1);
        panel.add(flight2);
        panel.add(flight3);
        panel.add(flight4);
        panel.add(nextBtn);

        //Set up the content pane.
        Container con = frame.getContentPane();


        con.add(panel);
        //  Container contentPane = frame.getContentPane();


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void departure() throws IOException{

        JLabel departLabel;
        JLabel arrivalLabel;
        JLabel departDateLabel;
        JTextField departField;
        JTextField arrivalField;
        JTextField departDateField;;
        JButton nxtBtn;

        FileWriter fileWriter = new FileWriter("Flight.txt",true);
        JPanel panel = new JPanel();
        JLabel label = new JLabel(
                "                                     Flight Details                                    ");

        departLabel  = new JLabel("From: ");
        arrivalLabel = new JLabel("To: ");
        departDateLabel = new JLabel("Departure Date: ");

        departField = new JTextField(20);
        departField.setMaximumSize( departField.getPreferredSize() );
        arrivalField = new JTextField(20);
        arrivalField.setMaximumSize( arrivalField.getPreferredSize() );
        departDateField = new JTextField(20);
        departDateField.setMaximumSize( departDateField.getPreferredSize() );

        nxtBtn = new JButton("Next");

        final JFrame frame = new JFrame();
        frame.setTitle("Airline Reservation System");
        frame.setBounds(50, 50, 800, 800);

        //Adding action listener to save data in the file
        nxtBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedWriter writer;
                    writer = new BufferedWriter(new FileWriter("Flight.txt",true));
                    writer.write("From - " + departField.getText() +  "\t");
                    writer.newLine();
                    writer.write("To - " + arrivalField.getText() +  "\t");
                    writer.newLine();
                    writer.write("Date of departure - " + departDateField.getText() +  "\t");
                    writer.newLine();
                    writer.close();
                }
                catch (IOException ioe) {
                    System.out.println("Invalid input");
                }
                //Calling new window to select flight
                frame.dispose();
                try {
                    flightPanel();
                }
                catch (IOException ex) {
                    System.out.println("Invalid Input");
                }
            }
        });

        panel.add(departLabel);
        panel.add(departField);
        panel.add(arrivalLabel);
        panel.add(arrivalField);
        panel.add(departDateLabel);
        panel.add(departDateField);
        panel.add(nxtBtn);

        Container con = frame.getContentPane();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(Box.createHorizontalGlue());
        con.add(panel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void personal() throws IOException {

        JLabel nameLabel;
        JLabel adultLabel;
        JLabel childLabel;
        JLabel infantLabel;
        JLabel genderLabel;
        JTextField nameField;
        JTextField adultField;
        JTextField childField;
        JTextField infantField;
        JRadioButton maleBtn;
        JRadioButton femaleBtn;
        JButton bookBtn;
        ButtonGroup genderGroup;

        FileWriter fileWriter = new FileWriter("Flight.txt", true);
        JPanel panel = new JPanel();
        JLabel label = new JLabel(
                "                                     Personal Details                                    ");

        nameLabel = new JLabel("Name: ");
        adultLabel = new JLabel("Number of Adults: ");
        childLabel = new JLabel("Number of Children: ");
        infantLabel = new JLabel("Number of Infants: ");
        genderLabel = new JLabel("Gender: ");

        nameField = new JTextField(20);
        nameField.setMaximumSize(nameField.getPreferredSize());
        adultField = new JTextField(20);
        adultField.setMaximumSize(adultField.getPreferredSize());
        childField = new JTextField(20);
        childField.setMaximumSize(childField.getPreferredSize());
        infantField = new JTextField(20);
        infantField.setMaximumSize(infantField.getPreferredSize());

        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");
        genderGroup = new ButtonGroup();

        //Setting action command for the two buttons to save in file
        maleBtn.setActionCommand("male");
        femaleBtn.setActionCommand("female");

        bookBtn = new JButton("Book Tickets");

        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);

        final JFrame frame = new JFrame();
        frame.setTitle("Airline Reservation System");
        frame.setBounds(50, 50, 800, 800);

        bookBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String gender = genderGroup.getSelection().getActionCommand();
                try {
                    BufferedWriter writer;
                    writer = new BufferedWriter(new FileWriter("Flight.txt", true));
                    writer.write("Name - " + nameField.getText() + "\t");
                    writer.newLine();
                    writer.write("Number of Adults - " + adultField.getText() + "\t");
                    writer.newLine();
                    writer.write("Number of Children - " + childField.getText() + "\t");
                    writer.newLine();
                    writer.write("Number of Infants - " + infantField.getText() + "\t");
                    writer.newLine();
                    writer.write("Gender of Traveller - " + gender + "\t");
                    writer.close();
                } catch (IOException ioe) {
                    System.out.println("Invalid Input");
                }
                int action = JOptionPane.showConfirmDialog(MainMenu.this,
                        "Congratulations!! Your ticket has been confirmed. See your flight details in the file \"Flight.txt\". Happy Journey!",
                        "Confirm Exit", JOptionPane.OK_CANCEL_OPTION);

                if (action == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        });

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(adultLabel);
        panel.add(adultField);
        panel.add(childLabel);
        panel.add(childField);
        panel.add(infantLabel);
        panel.add(infantField);
        panel.add(genderLabel);
        panel.add(maleBtn);
        panel.add(femaleBtn);
        panel.add(bookBtn);

        Container con = frame.getContentPane();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(Box.createHorizontalGlue());
        con.add(panel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}


