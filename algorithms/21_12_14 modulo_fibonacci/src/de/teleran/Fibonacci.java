package de.teleran;

public class Fibonacci {


        public int moduloFibonacci(int n, int m) {

            int f1 = 0;
            int f2 = 1;
            for (int i = 0; i < n; i++) {
                int f3 = (f1 + f2) % m;
                f1 = f2;
                f2 = f3;


            }
            return f2;
        }
}
