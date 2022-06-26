package homeworkSolution;


public class HomworkFive {
    static double pi1 = 3.14;

    public static void main(String[] args) {

        System.out.println("Площадь круга:" + findSquare(7.6));
        System.out.println("Радиус окружжности:" + findCircle(7.6));
        System.out.println("Сумма конвертации:" + euroFromDollar(7.6));
        System.out.println("Соотношение площади Беларуси к Украине:" + relationBYtoUA());
        System.out.println("Москва больше Берлина в:" + relation());
        System.out.println("Клиент получит:" + depositum());
    }

    public static double findSquare(double radius) {

        double result = radius * radius * pi1;
        return result;

    }

    public static double findCircle(double radius) {

        double result = 2 * radius * pi1;
        return result;
    }

    public static double euroFromDollar(double dollar) {
        double result = dollar / 1.1;
        return result;
    }

    public static double relationBYtoUA() {
        double squareBY = 207600;
        double squareUA = 603628;

        double result = squareBY / squareUA;
        return result;
    }

    public static double relation() {
        double squareMoskau = 207600;
        double squareBerlin = 603628;
        double result = squareMoskau / squareBerlin;
        return result;
    }

    public static double depositum() {
        //условия депозита 1,035
        double euro = 1000;
        for (int i = 0; i < 7; i = i + 1) {
            euro = euro * 1.035;

        }
        return euro;
    }
}

