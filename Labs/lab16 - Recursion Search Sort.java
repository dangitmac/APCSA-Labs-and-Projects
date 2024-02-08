// Mac Dang - April 30, 2023
// AP Computer Science A - Mr. Schneider
// lab16 - Recursion / search sort

import java.util.*;

public class lab16 {
    public static void main(String[] args) {
        int[] arr = {22, 18, 12, -4, 58, 7, 31, 42};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            int[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
            int[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(leftHalf);
            mergeSort(rightHalf);

            int i = 0, j = 0, k = 0;
            while (i < leftHalf.length && j < rightHalf.length) {
                if (leftHalf[i] < rightHalf[j]) {
                    arr[k] = leftHalf[i];
                    i++;
                } else {
                    arr[k] = rightHalf[j];
                    j++;
                }
                k++;
            }

            while (i < leftHalf.length) {
                arr[k] = leftHalf[i];
                i++;
                k++;
            }

            while (j < rightHalf.length) {
                arr[k] = rightHalf[j];
                j++;
                k++;
            }
        }
        return arr;
    }
}

