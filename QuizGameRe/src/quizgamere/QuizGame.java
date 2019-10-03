
package quizgamere;

import java.util.HashMap;

class Question {
    String question;
    HashMap<String, String> answers; //<key (A,B,C,D), values (answer)> 
    String correctAns; // A, B, C or D
    
    Question (String question, HashMap answers, String correctAns) {
        this.question = question;
        this.answers = answers;
        this.correctAns = correctAns;
    }
    
    public String getQuestion() {
        return question;
    }
    public HashMap getAnswers() {
        return answers;
    }
    
    /**
     * 
     * @param ans
     * @return true if user's answer is equal to the correct answer 
     */
    public boolean isCorrect(String ans) {
        return ans.equals(correctAns);
    }
} 

public class QuizGame {
    
}
