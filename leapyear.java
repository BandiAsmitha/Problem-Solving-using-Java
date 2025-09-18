public class Main {
    public static void main(String[] args) {
        int n = 1900;

        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            System.out.print("Leap Year");
        } else {
            System.out.print("Not a Leap Year");
        }
    }
}
