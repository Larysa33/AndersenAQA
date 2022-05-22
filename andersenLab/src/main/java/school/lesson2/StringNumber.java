package school.lesson2;

public class StringNumber {
    public static void main (String args[]){
        stringNumber("Привет!", 5);
    }
    public static void stringNumber(String text, int times){
        for(int i=0; i<times; i++) {
            System.out.println(text);
        }
    }
}
