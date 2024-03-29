public class quiz1_1 {public static void main(String[] args) {

    int numRows = 4;


    for (int i = 0; i < numRows; i++) {

        for (int j = 0; j < numRows - i - 1; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < 2 * i + 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
