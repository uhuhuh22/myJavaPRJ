import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 입력을 받게 하는 클래스 설정
        int num;//변수 설정

        System.out.println("숫자를 입력하세요 ==>");
        num = s.nextInt();

        if (num%(3*7) == 0) { // 내가 입력한 값이 3과ㅑ 7의 공배수 일때 실행됨
            System.out.println("3의 배수,7의 배수입니다");
        }else if (num%7 ==0) { // 입력한 값이 7의 배수일때 실행됨
            System.out.println("7의 배수입니다");

        }else if (num%3 == 0){ //3의 배수 일때 실행됨
            System.out.println("3의 배수입니다.");}

        else System.out.println("아무것도 아닙니다."); //3과 7읠 배수가 아닐 때 실행됨
        s.close(); //변수 닫기
        }

    }
