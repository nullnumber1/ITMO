import java.lang.Math;
import java.math.BigInteger;

public class Main {
    public static void sum(String one, String two){
        if (one.length() > two.length()){
            String t = one;
            one = two;
            two = t;
        }
        String str = "";
        one=new StringBuilder(one).reverse().toString();
        two=new StringBuilder(two).reverse().toString();
        int remains = 0;
        for (int i = 0; i < one.length(); i++)
        {
            int sum = ((int)(one.charAt(i) - '0') +
                    (int)(two.charAt(i) - '0') + remains);
            str = str + (char)(sum % 10 + '0');
            remains = sum / 10;
        }
        for (int i = one.length(); i < two.length(); i++)
        {
            int sum = ((int)(two.charAt(i) - '0') + remains);
            str = str + (char)(sum % 10 + '0');
            remains = sum / 10;
        }
        if (remains > 0)
            str = str + (char)(remains + '0');
        str = new StringBuilder(str).reverse().toString();
        System.out.print(str);
    }
    public static void main(String[] args) {
        int a[];
        int [][]m = new int[1][1];
        a = new int[14];
        for (int i = 0; i < 14; i++) {
            a[i] = 13 - i + 3;
        }
        float x[];
        x = new float[17];
        for (int i = 0; i < 17; i++) {
            x[i] = ((float) Math.random()) * (8.0f - (-3.0f)) + (-3.0f);
        }
        float b[][];
        b = new float[14][17];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (a[i] == 8) {
                    b[i][j] = (float) Math.pow(3 * (0.5 - Math.cbrt(Math.log(Math.abs(x[j])))), Math.cos(Math.atan((x[j] + 2.5) / 11)));
                } else if (a[i] == 3 || a[i] == 4 || a[i] == 6 || a[i] == 7 || a[i] == 12 || a[i] == 14 || a[i] == 16) {
                    b[i][j] = (float) (3 / 4 - Math.pow(Math.pow(x[j], Math.PI * (x[j] - 1)), 1 - Math.pow(x[j], (x[j] / 1) / 3) / Math.cos(x[j])));
                } else {
                    b[i][j] = (float) Math.pow(4 * (Math.log(Math.pow(Math.E, x[j]))) / 2, 2);
                }
                System.out.printf("%30.2f| ", b[i][j]);
            }
            System.out.println();
        }
        sum("123","2");
    }
}
