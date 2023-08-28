/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boundfootball;

import java.util.Scanner;

/**
 *
 * @author tomaeyo
 */
public class BoundFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LiveScoreBean score = new LiveScoreBean();
        Subscriber James = new Subscriber();
        Subscriber Mike = new Subscriber();
        score.addPropertyChangeListener(James);
        score.addPropertyChangeListener(Mike);
        
        while(true){
            System.out.print("Enter Score -> ");
            String input = sc.nextLine();
            
            if(input.equals("")) {
                break;
            }
            else {
                score.setScoreLine(input);
            }
        }
    }
    
}
