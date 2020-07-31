package com.dkp;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length = input.nextInt();
        int [] myArray = new int [length];
        System.out.println("Enter elements in array");
        for(int i=0;i<length;i++){
            myArray[i] = input.nextInt();
        }
        for(int lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex >0; lastUnsortedIndex--){
            for(int j=0;j< lastUnsortedIndex;j++){
                if(myArray[j]>myArray[j+1]){
                    swap(myArray,j,j + 1);
                }
            }
        }
        for(int k=0; k<= myArray.length - 1; k++){
            System.out.println(myArray[k]);
        }


    }
    public static void swap(int[] array, int i, int j){
        if(i==j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
