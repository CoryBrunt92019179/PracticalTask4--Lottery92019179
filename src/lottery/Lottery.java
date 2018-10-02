/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

import java.util.ArrayList;

/**
 *
 * @author 92019179
 */
public class Lottery {

//LinerSearch through the array lists
    public static boolean search(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static int tickets = 0;

//Random Ticket picked 0 to 49
    public static int weeklyTicket() {
        return tickets = (int) Math.floor(Math.random() * 49 + 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//Arrays set for the different players
        ArrayList<Players> players = new ArrayList();
        int[] tTickets = {3, 33, 17, 46, 47, 27};
        int[] bTickets = {7, 19, 22, 23};
        int[] cTickets = {33, 13};

        players.add(new Players("Tama", -1, tTickets));
        players.add(new Players("Bob", 8, bTickets));
        players.add(new Players("Caesar", -1, cTickets));

// main loop 
        System.out.println("\n**** Welcome to the Simple Lotto ****\n");
        System.out.println("Welcome ... \n " + "Tama\n " + "Bob\n " + "Caesar");
        boolean winner = false;
        while (!winner) {
            System.out.println("Announcing this week's winning ticket.... the number is " + weeklyTicket() + "\n");

            //this checks players tickets with the weeks lotto ticket for a winner
            for (Players o : players) {
                if (search(o.tickets, tickets)) {
                    System.out.println("****** WINNER ******\n"
                            + "  Congratulations\n " + o.name + " You have won \n");
                    winner = true;
                }
                //this check if players cash and takes it away after each lotto draw
                o.cash -= o.tickets.length;
                if (o.cash == 0) {
                    System.out.println(o.name + " has run out of money, so he no longer plays the lottery. \n");
                    players.remove(o);
                }
            }
        }
    }
}



//}
