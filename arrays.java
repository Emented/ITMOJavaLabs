import static java.lang.Math.*;

public class arrays {
    public static boolean isOdd(long x) {
        return x % 2 == 1;
    }

    public static double firstCase(double x) {
        return sin(pow(2 / ((3 - x) * x), 3));
    }

    public static double secondCase(double x) {
        return asin(1 / pow(exp(1), sqrt(pow(sin(x), 2))));
    }

    public static double thirdCase(double x) {
        return pow(exp(1), sin(atan(pow((x - 0.5) / 2, 2))));
    }

    public static void arrayOut(double[][] b) {
        for (double[] doubles : b) {  //go line by line
            for (int j = 0; j < b[0].length; j++) { //go through the columns
                System.out.printf("%9.5f", doubles[j]); //item output
            }
            System.out.println();//line break for the sake of visually preserving the table form
        }
    }

    //generating a random number, where bottom <= x <= upper
    public static float randomGen(float bottom, float upper) {
        return bottom + (float) random() * (bottom + upper);
    }

    public static void main(String[] args) {
        long[] a = new long[16];
        for (int i = 0; i < a.length; i++)
            a[i] = i + 1;

        float[] x = new float[15];
        for (int j = 0; j < x.length; j++)
            x[j] = randomGen(-3.0F, 2.0F);

        double[][] b = new double[16][15];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                if (a[i] == 11) {
                    b[i][j] = firstCase(x[j]);
                } else if ((isOdd(a[i]) && a[i] < 10) || a[i] == 10 || a[i] == 14 || a[i] == 15) {
                    b[i][j] = secondCase(x[j]);
                } else {
                    b[i][j] = thirdCase(x[j]);
                }
            }
        }

        arrayOut(b);
    }
}
