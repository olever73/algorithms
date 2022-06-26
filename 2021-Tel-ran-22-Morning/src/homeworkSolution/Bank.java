package homeworkSolution;

public class Bank {
    public static void main(String[] args) {
        double bankPerCent =35;
        double amount = 1000;
        int year =7;
        System.out.println(findSumBankAmount(year, amount));
    }
    public  static double findSumBankAmount (int year, double amount){
        double bankPerCent = 3.5;
        return amount+(bankPerCent*amount/100)*year;
    }
}
