class binarysearch {
    public static void main(String[] args) {
            int [] arr = {-4, 2, 7, 10, 15, 20, 22, 25, 30, 36, 42, 50, 56, 68, 85, 92, 103};
            int a = arr.length;
            int lastNumber = 42;
            search(arr, 0, a, lastNumber);

    }
    public static void search(int arr[], int first, int last, int lastNumber) {
        int middle = (first + last)/2;

        while (first <= last) {
            if (arr[middle] < lastNumber) {
                first = middle+1;

            }else if (arr[middle] == lastNumber) {
                System.out.println("element 42 is at index " + middle);
                break;

            }else{
                last=middle-1;
            }
            middle = (first + last)/2;
        }
        if (first > last) {
            System.out.println("u2");
        }
    }
}
