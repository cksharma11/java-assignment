package com.step.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {2,3,11,4,7};
        printArray(sort(array));
        printArrayReverse(sort(array));
    }

    public static int[] sort(int[] array){
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printArrayReverse(int[] array){
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println(array[i]);
        }
    }


}
