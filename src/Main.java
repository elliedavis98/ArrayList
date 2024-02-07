import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//declaring both arrays
        String[] weekDays = new String[7];
        String[] temp;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //printing out first array with all days of the week
        System.out.println("All days of the week:" + Arrays.toString(days));

        //establishing the temp arrays new size
        temp = new String[days.length - 2];
        weekDays = temp;
        String[] tempdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        // shuffling happens here
        Random r = new Random();
        for (int i = 0; i < tempdays.length; i++) {
            int randomIndexToSwap = r.nextInt(tempdays.length);
            String t = tempdays[randomIndexToSwap];
            tempdays[randomIndexToSwap] = tempdays[i];
            tempdays[i] = String.valueOf(t);
        }
        System.out.println("resized days of the week:" + Arrays.toString(tempdays));
    }


}
