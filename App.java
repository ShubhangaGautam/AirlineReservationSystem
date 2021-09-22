package AirlineReservationSystem;

import javax.swing.*;
import java.io.IOException;

public class App {
    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainMenu();
                } catch (IOException e) {
                    System.out.println("Invalid Input");
                }
            }
        });
    }

    }


