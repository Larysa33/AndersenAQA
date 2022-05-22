package school.lesson2;

public class FillArray {
    public static void main (String args[]){
        fillArray();
    }
    public static void fillArray(){
        int [] arr1 = new int[100];
        for (int i = 1; i < arr1.length; i++) {
            arr1[i]=i;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}
