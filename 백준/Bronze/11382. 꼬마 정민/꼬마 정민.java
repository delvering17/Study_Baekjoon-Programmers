import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long result = 0L;
        for (int i = 0; i < 3; i++) {
            result += Long.parseLong(sc.next());
        }
        System.out.println(result);
    }
}
