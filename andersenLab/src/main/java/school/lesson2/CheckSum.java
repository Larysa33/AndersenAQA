package school.lesson2;

public class CheckSum {
    public static void main(String args[]) {
        checkSum(0, 10);
    }
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
