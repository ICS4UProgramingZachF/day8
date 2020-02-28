package DiceGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Visibility;
import java.util.Scanner;
import java.util.Random;

public class App {

    /*
    *  program that creates a number form 1-6
    * Then the user need to guess the right option for the user to win
    */

    //all the local names of the add ons to the code
    private JPanel frmMain;
    private JLabel lblquistion;
    private JTextField txtinput;
    private JButton btnpress;
    private JLabel lblNumGeuss;
    private JLabel lblAnwser;
    private JLabel lblGeuss;
    private JLabel lblYourgeuss;
    private JLabel lblCorect;

    //global varubles
    int geuss = 0;

    public App() {

        //this is the random number gennorater form 1-6
        int role = (int)(Math.random()*6+1);

        //when you press the button on the form it dose this
        btnpress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //read's user input
                int Converter = Integer.parseInt(txtinput.getText());

                //displays the number you just geussed
                lblYourgeuss.setText(Integer.toString(Converter));


                //checking to see what the user role if its corect display you win else display try again
                if (role == Converter){
                    lblCorect.setText("your guess is right");
                    txtinput.hide();
                }
                else {
                    geuss ++;
                    lblGeuss.setText(Integer.toString(geuss)+ " "+"guess again");
                }
            }
        });
    }
    //create a form and run it
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().frmMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
