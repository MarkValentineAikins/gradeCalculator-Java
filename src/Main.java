//Ths program will allow user to enter a test score and tell the user his/her grade
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int testScore; //Variable declared as integer value
        String input; //Variable declared as string value

        input = JOptionPane.showInputDialog( "Enter your " +
                "Test Score and I will show your grade");
        testScore = Integer.parseInt(input);

        if (testScore >=80) {
            JOptionPane.showMessageDialog(null, "You grade is A");
        }
        else if (testScore >=70) {
            JOptionPane.showMessageDialog(null, "You grade is B");
        }
        else if (testScore >=60) {
            JOptionPane.showMessageDialog(null, "You grade is C");

        }
        else if (testScore >=50) {
            JOptionPane.showMessageDialog(null, "You grade is D");
        }
        else {
            JOptionPane.showMessageDialog(null, "You grade is E");
            JOptionPane.showMessageDialog(null, "You have failed the test");
        }
        System.exit(0);
    }
}