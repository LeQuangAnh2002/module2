import java.util.Scanner;

public class ThucHanhMang2Chieu {
    public static void main(String[] args) {
        int[][] matrix = new int[3][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+ matrix.length+ " rows and "+ matrix[0].length+" columns: ");
        // Nhập giá trị vào mảng
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = sc.nextInt();
            }
        }
        // in mảng
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        //tính tổng
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
        // tổng từng cột
        for (int column = 0; column < matrix[0].length; column++) {

            for (int row = 0; row < matrix.length; row++)
                total += matrix[row][column];
            System.out.println("Sum for column " + column + " is "
                    + total);
        }
        // tìm ra dòng có tổng các phần tử lớn nhất
        int maxRow = 0;
        int indexOfMaxRow = 0;
// Get sum of the first row in maxRow
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }
        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++)
                totalOfThisRow += matrix[row][column];
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
        // xáo trộn mảng
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int) (Math.random() * matrix.length);
                int j1 = (int) (Math.random() * matrix[i].length);

                // Swap matrix[i][j] with matrix[i1][j1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
    }
}
