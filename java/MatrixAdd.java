import java.util.Scanner;

class Matrix {
    int[][] a;
    int m, n;

    // Constructor to initialize the matrix with given dimensions
    Matrix(int rows, int cols) {
        this.m = rows;
        this.n = cols;
        this.a = new int[m][n];
    }

    void read() {
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter the elements of the matrix:  ");
        for ( int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }
    }

    Matrix calc(Matrix n2) {
        if (this.m != n2.m || this.n != n2.n) {
            System.out.println("Matrix dimensions do not match for addition.");
            return null; // Return null if dimensions do not match
        }

        Matrix result = new Matrix(this.m, this.n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result.a[i][j] = this.a[i][j] + n2.a[i][j];
            }
        }
        return result;
    }

    void display() {
        System.out.println("The resulting matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t"); // Use tab for better formatting
            }
            System.out.println(); // New line after each row
        }
    }
}

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        Matrix m1 = new Matrix(rows, cols);
        m1.read();

        Matrix m2 = new Matrix(rows, cols);
        m2.read();

        Matrix m3 = m1.calc(m2);

        if (m3 != null) { // Check if addition was successful
            m3.display();
        }

        input.close(); // Close scanner to prevent resource leak
    }
}

