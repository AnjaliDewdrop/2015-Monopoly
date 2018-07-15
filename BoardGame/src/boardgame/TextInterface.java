/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author Irina
 */
public class TextInterface {
    
    static int board[] = new int[10];
   static  String players[] = {"A", "B"};
   static int[] scores = {0,0};
   static int[] positions = {0,0};
            static int cur_player = 0;
   static int  skip = 5; //position where the player skips turn
   static int minigame = 10;
   static String skipping_person = null;
    
    public static void main (String args[]){
        
        //main game loop
        
        display_board();
        
        //check if the user is supposed to be skipping
        if (players[cur_player].equals (skipping_person)){
            //don nothing, they're skiping
            skipping_person = null; //remove this person from skipping, 
            //don't want them skipping forever
        }
        else{
        // player moves
        int roll = (int) (Math.random() * 6)+1;
        positions[cur_player] += roll; //assuming 3 was rolled by dice
        if (positions[cur_player] == skip){
            
        }
        }
        cur_player++; //advances to the next player
        display_board();
    }
    private static void display_board(){
        System.out.println ("------------------------");
        for (int i = 0; i < board.length; i++){
            System.out.print("|" + board[i]);
            for (int j = 0; j < players.length; j++) { //go through players to see if anyone is at ith positon
                if (positions[j] == i) {
                    System.out.print (players[j]);
                }
            }
            System.out.print("|");
            
        }
        System.out.println();
        System.out.println ("-------------------------");
    }
}
