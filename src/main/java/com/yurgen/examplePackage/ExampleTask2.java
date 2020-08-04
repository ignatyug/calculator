package com.yurgen.examplePackage;

public class ExampleTask2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 5, 5, 5, 5, 5,};
        int[] result = nonDupArray(arr);

        for (int number: result) {
            System.out.print(number);
        }
    }

    public static int[] nonDupArray(int[] arr) {
        int[] tempArr = new int[arr.length];
        int lengthSubst = 0;
        boolean isUnique;
        for (int i = 0; i < arr.length; i++) {
            isUnique = true;
            for (int j = 0; j < tempArr.length; j++) {
                if (arr[i] == tempArr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                tempArr[i] = arr[i];
            } else {
                lengthSubst++;
            }
        }
        int[] result = new int[arr.length - lengthSubst];
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] != 0) {
                for (int j = 0; j < result.length; j++) {
                    if (result[j] == 0) {
                        result[j] = tempArr[i];
                        break;
                    }
                }
            }
        }
        return result;
    }
}
