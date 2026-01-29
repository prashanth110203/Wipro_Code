package prashanth;

public class Array_matrix {

    public static void main(String[] args) {

        int[][][] matrix = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");

            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    System.out.print(matrix[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
            
            
        }
    }
}
