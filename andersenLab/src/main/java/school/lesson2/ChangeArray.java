package school.lesson2;

public class ChangeArray {
    public static void main(String args[]) {
        changeArray();
    }

    public static void changeArray() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
