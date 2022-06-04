package school.lesson5;
import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args){
        changePlaces();
        System.out.println();
    }
    public static void changePlaces(){
        String[] arr = {"pink", "yellow", "blue", "green", "purple"};
         /*
        String[] arrList = new String[5]; - альтернативный метод заполнения массива
        arrList[0] = "pink";
        arrList[1] = "yellow";
        arrList[2] = "blue";
        arrList[3] = "green";
        arrList[4] = "purple";
         */
        for(int i=0; i<arr.length; i++){
            if(arr[i]=="green"){
                arr[i]="purple";
            } else if(arr[i]=="purple"){
                arr[i]="green";
            }
            System.out.println(arr[i] + " ");
        }
    }
}
