package homeworkSolution;

public class Divide {
    public static void main(String[] args) {
        int g = 50;
        int w = 3;
        int d = g / w;
        System.out.println(d);

        int c = -5 + 8 * 6;
        System.out.println(c);

        int f = (55 + 9) % 9;
        System.out.println(f);


        int n = 5;
        System.out.println(getQvadro(5));

        average();


        int a = 1000;
        int b = 500;
        int discount = a + b - 100;
        System.out.println(discount);
        System.out.println(100);
    }


    public static int getQvadro(int n) {
        int qvadro;

        qvadro = n * n;
        return qvadro;
    }

    public static void average() {
        int m0 = 0;
        int m1 = 1;
        int m2 = 2;
        int m3 = 3;
        int m4 = 4;
        int m5 = 5;
        int m6 = 6;
        int m7 = 7;
        int m8 = 8;
        int m9 = 9;
        int average;
        average = (m0 + m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9) / 10;
        System.out.println(average);

    }


}
