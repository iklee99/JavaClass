public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {15, 20, 35, 41, 57, 63, 75, 80, 85, 90};
        System.out.println("search 63: " + search(a, 0, a.length - 1, 63));
        System.out.println("search 37: " + search(a, 0, a.length - 1, 37));
    }
    public static int search(int[] a, int first, int last, int key) {
        int result = 0;
        if (first > last) result = -1;
        else {
            int mid = (first + last)/2;
            if (key == a[mid]) result = mid;
            else if (key < a[mid])
                result = search(a, first, mid-1, key);
            else if (key > a[mid])
                result = search(a, mid+1, last, key);
        }
        return result;
    }
}
