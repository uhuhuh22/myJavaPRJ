import java.util.Scanner;

public class Code100_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.");
        double num1 = s.nextDouble();

        System.out.println("두 번째 숫자를 입력하세요.");
        double num2 = s.nextDouble();

        System.out.println("연산자를 입력하세요 (+,-,*,/)");
        char operator = s.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("두 숫자의 합은 " + result + "입니다.");
                break;
            case '-':
                result = num1 - num2;
                System.out.println("두 숫자의 차는 " + result + "입니다.");
                break;
            case '*':
                result = num1 * num2;
                System.out.println("두 숫자의 곱은 " + result + "입니다.");
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("두 숫자의 나눗셈 결과는 " + result + "입니다.");
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                break;
        }
    }
}