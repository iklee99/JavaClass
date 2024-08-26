public class SelectionSortDemo {
    public static void main(String[] args) {
        // Integer array demo
        Comparable[] intArray = {64, 25, 12, 22, 11};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(intArray);
        System.out.print("Sorted Integer Array: ");
        printArray(intArray);

        // String array demo
        Comparable[] stringArray = {"apple", "orange", "banana", "kiwi", "grape"};
        sorter.sort(stringArray);
        System.out.print("Sorted String Array: ");
        printArray(stringArray);
    }

    public static void printArray(Comparable[] array) {
        for (Comparable element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
