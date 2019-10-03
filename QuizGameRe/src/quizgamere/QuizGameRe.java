
package quizgamere;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuizGameRe {

    public static void main(String[] args) {
        Scanner s;
        try {
            s = new Scanner(new File("game_questions.csv"), "UTF-8");
            s.useDelimiter(",");
            while(s.hasNext()) {
                System.out.print(s.next() + " ");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuizGameRe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
