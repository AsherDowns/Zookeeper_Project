import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }

        int a = 4;
        int b = a++;
        int c = --a + b++;
        int result = ++a - (c++ - b) + c;
        System.out.println(result);
    }
}