//Program ask the user for the size of an Array
//Ethan Kupka
//3/24/2021 java

import java.util.Scanner;

public class SzArray{
  Sytem.out.println("How long would oyu like the array to be?");
//Gets the element length of the array
    for(int i =0; i<myArray.length; i++){
      System.out.println("What elements of the array would you like?");
      myArray[i] = sc.nextInt();
    } //End of for

//Prints the users array
    System.out.println("The entered elements for the array is");
    for(int arrayElement :myArray){
          System.out.print(arrayElement + " ");
    } //End of for

    public static void main(String[] args){
      int[] myArray =new int[5]; //Size
      Scanner sc = new Scanner(System.in);
  }//End of main
}
