import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix: ");
        int matrix = sc.nextInt();
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter col: ");
        int col = sc.nextInt();

        int[][][] arr = new int[matrix][row][col];
        for (int i = 0; i < matrix; i++) {
            System.out.println("matrix " + (i + 1) + ":");
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < matrix; i++) {
            System.out.println("matrix" + (i + 1) + ":");
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
