public class IdealOOP {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7};
        float average = MyUtil.averageArray(array);
        System.out.println("average: " + average);
    }
}

class MyUtil {
    public static float averageArray(int[] array) {
        float sum = 0.0f;
        for (int j : array) {
            sum += (float) j;
        }
        return sum / (float) array.length;
    }
}

