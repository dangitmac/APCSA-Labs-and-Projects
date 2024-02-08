// Mac Dang - March 15, 2023
// AP Computer Science A - Mr. Schneider
// lab13 - Selection Sort

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {22, 18, 12, -4, 27, 30, 36, 50, 7, 68, 91, 56, 2, 85, 42, 98, 25};
        int a = arr.length;

        for (int i = 0; i < a-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < a; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
