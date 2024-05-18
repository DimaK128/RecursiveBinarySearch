public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int searchKey = 23;
        int result = recursiveBinarySearch(array, searchKey, 0, array.length - 1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int recursiveBinarySearch(int[] a, int search, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (a[mid] == search) {
            return mid;
        } else if (a[mid] < search) {
            return recursiveBinarySearch(a, search, mid + 1, high);
        } else {
            return recursiveBinarySearch(a, search, low, mid - 1);
        }
    }
}
