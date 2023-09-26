import javax.swing.*;

public class NumberGuess {
    public static void main(String[] args) {
        int compute= (int) (Math.random() * 100 + 1);
        int userAnswer = 0;
        int count = 1;
        try {
            while (userAnswer != compute) {
                String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100");
                userAnswer = Integer.parseInt(response);
                JOptionPane.showMessageDialog(null, " " + determineGuess(userAnswer, compute, count));
                count++;
            }
        } catch (Exception e) {
            
        }
    }

    public static String determineGuess(int userAnsrwer , int compute , int count)
    {
        if (userAnswer <= 0 || userAnswer > 100) {
            return "INVALID GUESS";
        } else if (userAnswer == compute) {
            return "!!!Correct!!! \n Total Guesses : " + count;
        } else if (userAnswer > compute) {
            return "YOUR GUESS IS TOO HIGH,TRY AGAIN, \n Try Number : " + count;
        } else if (userAnswer < compute) {
            return "YOUR GUESS IS TOO LOW,TRY AGAIN, \n Try Number :  " + count;
        } else {
            return "!!INCORRECT GUESS!!\n Try Number : " + count;
        }
    }
}