package school.lesson2;

public class PositiveOrNegativeCheck {
    public static void main (String args[]){
        numberCheck(0);
    }
    public static boolean numberCheck(int value1){
        if (value1<0) {
           return true;
        } else {
            return false;
        }
    }
}
