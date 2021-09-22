package AirlineReservationSystem;

import javafx.scene.layout.Border;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FormPanel extends JPanel {

    private JLabel fromLabel;
    private JLabel toLabel;
    private JLabel departDateLabel;
    private JLabel arriveDateLabel;
    private JTextField fromField;
    private JTextField toField;
    private JTextField departDateField;
    public JTextField arriveDateField;
    public JButton nextBtn;
    private JRadioButton oneWay;
    public JRadioButton twoWay;
    private ButtonGroup tripGroup;

    public FormPanel() {
        Dimension dim = getPreferredSize();
        dim.height = 120;
        setPreferredSize(dim);

        fromLabel = new JLabel("From: ");
        toLabel = new JLabel("To: ");
        departDateLabel = new JLabel("Departure Date: ");
        arriveDateLabel = new JLabel("Arrival Date: ");
        fromField = new JTextField(10);
        toField = new JTextField(10);
        arriveDateField = new JTextField(10);
        departDateField = new JTextField(10);

        nextBtn = new JButton("Next");

        oneWay = new JRadioButton("One Way");
        twoWay = new JRadioButton("Round Trip");

        oneWay.setActionCommand("One Way");
        twoWay.setActionCommand("Two Way");



        tripGroup = new ButtonGroup();

        oneWay.setSelected(true);

        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        ////////// Grouping the radio buttons////////////////////////
        tripGroup.add(oneWay);
        tripGroup.add(twoWay);

        ///////// First Row /////////////////////////////////////////////////
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        add(oneWay, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        add(twoWay, gridBagConstraints);

        ///////// Second Row /////////////////////////////////////////////////
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        add(fromLabel, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        add(fromField, gridBagConstraints);

        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        add(toLabel, gridBagConstraints);

        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        add(toField, gridBagConstraints);

        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        add(departDateLabel, gridBagConstraints);

        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        add(departDateField, gridBagConstraints);

        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.LINE_END;
        add(arriveDateLabel, gridBagConstraints);

        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.LINE_END;
        add(arriveDateField, gridBagConstraints);

        //////////// Third Row /////////////////////////////////////////////////////

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.LINE_END;
        add(nextBtn, gridBagConstraints);

        nextBtn.setActionCommand("Open");




        TitledBorder innerBorder = BorderFactory.createTitledBorder("Book Flight Tickets");
        javax.swing.border.Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

    }
}


