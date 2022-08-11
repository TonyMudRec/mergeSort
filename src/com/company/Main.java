package com.company;

import java.util.Arrays;

public class Main {
    static int[] arrLeft = {3, 5, 15, 36, 38, 44, 47};
    static int[] arrRight = {2, 4, 19, 26, 27, 46, 48, 50};
    static int[] sortedArr = new int[arrLeft.length + arrRight.length];

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArr(arrLeft, arrRight)));
    }

    public static int[] sortArr(int[] arrLeft, int[] arrRight) {
        int countLeft = 0;
        int countRight = 0;
        int countSorted = 0;
        while (countLeft < arrLeft.length && countRight < arrRight.length) {

            if (arrLeft[countLeft] > arrRight[countRight]) {
                sortedArr[countSorted] = arrRight[countRight];
                countSorted++;
                countRight++;
            } else {
                sortedArr[countSorted] = arrLeft[countLeft];
                countSorted++;
                countLeft++;
            }
        }
        if (countLeft == arrLeft.length) {
            while (countRight < arrRight.length) {
                sortedArr[countSorted] = arrRight[countRight];
                countSorted++;
                countRight++;
            }
        } else if (countRight == arrRight.length) {
            while (countLeft < arrLeft.length) {
                sortedArr[countSorted] = arrLeft[countLeft];
                countSorted++;
                countLeft++;
            }
        }
        return sortedArr;
    }
}
