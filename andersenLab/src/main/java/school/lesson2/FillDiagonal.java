package school.lesson2;

public class FillDiagonal {
    public static void main(String args[]) {
        fillDiagonal();
    }

    public static void fillDiagonal() {
        int[][] arr3 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i+j) % 2==0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
