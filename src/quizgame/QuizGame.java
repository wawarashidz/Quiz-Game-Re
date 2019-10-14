
package quizgame;

import java.util.*;
class Question{
    String PlayerName="sam";
    String choice = "s";
    
    public void welcome(){
     System.out.printf("\t\t\tJAVA PROGRAM QUIZ GAME\n");
     System.out.printf("\n\t\t\t   WELCOME ");
     System.out.printf("\n\t\t\t      to ");
     System.out.printf("\n\t\t\t   THE GAME ");
     System.out.printf("\n\t\t________________________________________");
     System.out.printf("\n\t\t________________________________________");
     System.out.printf("\n\t\t   BECOME A MILLIONAIRE!!!!!!!!!!!    ") ;
     System.out.printf("\n\t\t________________________________________");
     System.out.printf("\n\t\t________________________________________");
     System.out.printf("\n\t\t > Press S to start the game");
     System.out.printf("\n\t\t > Press V to view the highest score  ");
     System.out.printf("\n\t\t > Press R to reset score");
     System.out.printf("\n\t\t > press H for help            ");
     System.out.printf("\n\t\t > press Q to quit             ");
     System.out.printf("\n\t\t________________________________________\n\n");
        
    }
    public void choose(String choice){
     
            if(choice=="s" && choice=="S"){
           
           System.out.printf("\n\n\n\n\n\n\n\n\n\n\t\t\tRegister your name:");
           Scanner s = new Scanner(System.in);
           PlayerName =s.nextLine();
           System.out.printf("\n ------------------  Welcome to Java Program Quiz Game --------------------------",PlayerName);
           System.out.printf("\n\n Here are some tips you might wanna know before playing:");
           System.out.printf("\n -------------------------------------------------------------------------");
           System.out.printf("\n >> There are 2 rounds in this Quiz Game,WARMUP ROUND & CHALLANGE ROUND");
           System.out.printf("\n >> In warmup round you will be asked a total of 3 questions to test your");
           System.out.printf("\n    general knowledge. You are eligible to play the game if you give atleast 2");
           System.out.printf("\n    right answers, otherwise you can't proceed further to the Challenge Round.");
           System.out.printf("\n >> Your game starts with CHALLANGE ROUND. In this round you will be asked a");
           System.out.printf("\n    total of 10 questions. Each right answer will be awarded $100,000!");
           System.out.printf("\n    By this way you can win upto ONE MILLION cash prize!!!!!..........");
           System.out.printf("\n >> You will be given 4 options and you have to press A, B ,C or D for the");
           System.out.printf("\n    right option.");
           System.out.printf("\n >> You will be asked questions continuously, till right answers are given");
           System.out.printf("\n >> No negative marking for wrong answers!");
           System.out.printf("\n\n\t!!!!!!!!!!!!! ALL THE BEST !!!!!!!!!!!!!");
           System.out.printf("\n\n\n Press Y  to start the game!\n");
           System.out.printf("\n Press any other key to return to the main menu!");      
     
        choice = s.nextLine();
        String answer = new String("Y" ) ;
        String object = new String ("y");
            if(answer.equalsIgnoreCase(object)){
                //quiz started
       }
            else{
                this.welcome();
            }
       }
       else if("V".equals(choice)){
           System.out.printf("\n\n\t\t*************************************************************");
           System.out.printf("\n\n\t\t %s has secured the Highest Score %0.2f"); //name and score);
           System.out.printf("\n\n\t\t*************************************************************");
           System.out.println("PRESS ANY KEY TO MAIN PAGE");
           
       }
       else if("R".equals(choice)){
           
       }
       
       else if("H".equals(choice)){
           System.out.printf("\n\n                              HELP");
    System.out.printf("\n -------------------------------------------------------------------------");
    System.out.printf("\n ......................... JAVA program Quiz Game...........");
    System.out.printf("\n >> There are two rounds in the game, WARMUP ROUND & CHALLANGE ROUND");
    System.out.printf("\n >> In warmup round you will be asked a total of 3 questions to test your general");
    System.out.printf("\n    knowledge. You will be eligible to play the game if you can give atleast 2");
    System.out.printf("\n    right answers otherwise you can't play the Game...........");
    System.out.printf("\n >> Your game starts with the CHALLANGE ROUND. In this round you will be asked");
    System.out.printf("\n    total 10 questions each right answer will be awarded $100,000.");
    System.out.printf("\n    By this way you can win upto ONE MILLION cash prize in USD...............");
    System.out.printf("\n >> You will be given 4 options and you have to press A, B ,C or D for the");
    System.out.printf("\n    right option");
    System.out.printf("\n >> You will be asked questions continuously if you keep giving the right answers.");
    System.out.printf("\n >> No negative marking for wrong answers");

	System.out.printf("\n\n\t*********************BEST OF LUCK*********************************");
           System.out.println(" ");
	System.out.printf("\n\n\t*****C PROGRAM QUIZ GAME is developed by CODE WITH C TEAM********");}
       }
       
       
    
   
}

public class QuizGame {
    public static void main(String[] args) {
       Question A = new Question();
       A.welcome();
       Scanner s = new Scanner(System.in);
       A.choice = s.nextLine();
       A.choose("s");
               
               
               
               
       
       
       
       
      
       
    }
    
}
