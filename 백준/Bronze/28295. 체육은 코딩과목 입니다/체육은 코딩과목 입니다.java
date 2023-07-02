import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            student += num * 90;
        }
        student %= 360;
        String answer = "";
        switch (student) {
            case 0:
                answer = "N";
                break;
            case 90:
                answer = "E";
                break;
            case 180:
                answer = "S";
                break;
            case 270:
                answer = "W";
                break;
        }
        System.out.println(answer);
    }
}