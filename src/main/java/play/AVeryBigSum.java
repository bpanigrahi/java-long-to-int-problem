package play;

public class AVeryBigSum {

    private static long[] ar = {123L, 999999999999999999L};

    public static void main(String[] args) {
        long sum = 0L;

        for (int i = 0; i < ar.length; i++) {
        sum += ar[ i];
        }

        System.out.println(sum);

    }
}
