
package quizgamere;

import java.util.HashMap;

class Question {
    String question;
    HashMap<String, String> answers; 
    String correctAns; // A, B, C or D
    
    Question (String question, HashMap answers, String correctAns) {
        this.question = question;
        this.answers = answers;
        this.correctAns = correctAns;
    }
    
    public boolean isCorrect(String ans) {
        return ans.equals(correctAns);
    }
} 

public class QuizGame {
    
}
