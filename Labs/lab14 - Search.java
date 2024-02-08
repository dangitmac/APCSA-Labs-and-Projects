// Mac Dang - March 21, 2023
// AP Computer Science A - Mr. Schneider
// lab14 - Search

public class searchlab14 {
    public static void main(String[] args) {
        int[] array = {22, 18, 12, -4, 30, 36, 50, 7, 68, 91, 2, 85, 42, 98, 25};
        int target = 50;

        int sequentialSearchResult = sequentialSearch(array, target);
        System.out.println("Number of indices searched using sequential search: " + sequentialSearchResult);

        int binarySearchResult = binarySearch(array, target);
        System.out.println("Number of indices searched using binary search: " + binarySearchResult);
    }

    public static int sequentialSearch(int[] array, int target) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == target) {
                return j;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int count = 0;

        while (low <= high) {
            count++;
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return count;
    }
}

