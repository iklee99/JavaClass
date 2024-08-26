public class GenericMethodExample {

    // 제네릭 메서드 정의
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer 배열
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer Array: ");
        printArray(intArray);

        // String 배열
        String[] strArray = {"Hello", "World", "Generics", "in", "Java"};
        System.out.print("String Array: ");
        printArray(strArray);

        // Double 배열
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.print("Double Array: ");
        printArray(doubleArray);
    }
}
