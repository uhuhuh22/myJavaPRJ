import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("숫자를 입력하세요 ==>");
        num = s.nextInt();

        if (num%(3*5) == 0) {
            System.out.println("3의 배수,5의 배수입니다");
        }else if (num%5 ==0) {
            System.out.println("5의 배수입니다");

        }else if (num%3 == 0){
            System.out.println("3의 배수입니다.");}

        else System.out.println("아무것도 아닙니다.");
        s.close();
        }

    }
