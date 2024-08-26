public class ArrayOfObjects {
    public static void main(String[] argc) {
        Data[] dArray = new Data[3];
        for (int i = 0; i < dArray.length; i++) {
            dArray[i] = new Data();
            dArray[i].x = i * 2;
        }
        for (int i = 0; i < dArray.length; i++) {
            System.out.print(dArray[i].x + " ");
        }
    }
}

class Data {
    int x;
}

