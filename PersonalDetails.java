package AirlineReservationSystem;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PersonalDetails extends JPanel {

    private JLabel nameLabel;
    private JLabel adultLabel;
    private JLabel childLabel;
    private JLabel infantLabel;
    private JLabel  genderLabel;
    private JTextField nameField;
    private JTextField adultField;
    private JTextField childField;
    private JTextField infantField;
    private JRadioButton maleBtn;
    private JRadioButton femaleBtn;
    private ButtonGroup genderGroup;


    public void PersonalDetails(){

        nameLabel  = new JLabel("Name: ");
        adultLabel = new JLabel("Number of Adults: ");
        childLabel = new JLabel("Number of Children: ");
        infantLabel = new JLabel("Number of Infants: ");
        genderLabel = new JLabel("Gender: ");

        nameField = new JTextField(20);
        adultField = new JTextField(20);
        childField = new JTextField(20);
        infantField = new JTextField(20);

        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");
        genderGroup = new ButtonGroup();

        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);

        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        /////// First Row ////////////////////////////////////////////////////////
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        add(nameLabel, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.PAGE_START;
        add(nameField,gridBagConstraints);

        ////// Second Row ////////////////////////////////////////////////////
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        add(adultLabel, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.PAGE_START;
        add(adultField,gridBagConstraints);

        /////////// Third Row //////////////////////////////////////////////
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        add(childLabel, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.PAGE_START;
        add(childField,gridBagConstraints);

        /////////////// Fourth Row ////////////////////////////////////////
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        add(infantLabel, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.PAGE_START;
        add(infantField,gridBagConstraints);

        //////////////// Fifth Row //////////////////////////////////////////
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.PAGE_START;
        add(genderLabel,gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.PAGE_START;
        add(maleBtn,gridBagConstraints);

        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.PAGE_START;
        add(femaleBtn,gridBagConstraints);

        TitledBorder innerBorder = BorderFactory.createTitledBorder("Personal Details");
        javax.swing.border.Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));


    }
}
