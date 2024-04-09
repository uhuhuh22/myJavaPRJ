import java.util.Scanner;

public class quiz1_3 {

        public static void main (String[]args){
            Scanner s = new Scanner(System.in);

            System.out.print("첫 번째 값을 입력하세요 :");
            int a = s.nextInt();

            System.out.print("두 번째 값을 입력하세요 :");
            int b = s.nextInt();

            for (int i = a; i > b - 1; i--) {
                System.out.print(i + " ");
            }
        }
    }

