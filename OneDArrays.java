import java.util.*;

public class OneDArrays {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // int marks[] = new int[3];     // we can also use this syntax to declare arrays
        // marks[0]= 97;
        // marks[1]= 98;
        // marks[2]= 99;
        // System.out.println(marks[2]);      //.....// only print marks of index 2 we can print all marks using for loop in arrays
        // for(int i = 0; i<=2;i++){
        //     System.out.println(marks[i]);          //......// print all marks present in array
        // }


        // take input from users for arryas
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[]= new int[size];     // array declaration 

        // for taking input
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();     // array initialization
        }

        // output
        for(int i = 0; i<size; i++){
            System.out.print(numbers[i] +" ");    // printing the values of array
        }
    }
}