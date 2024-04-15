import java.util.Scanner;

public class Code100_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.print("년도를 입력하세요 ==>");
        num = s.nextInt();

        if (num%400 == 0) {
            System.out.print("1");
        } else if (num%4 == 0) {
            System.out.print("1");
        } else if (num%100 == 0) {
            System.out.print("0");
        }
        s.close();

    }
}
