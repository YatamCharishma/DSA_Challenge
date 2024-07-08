// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[7,4,1],[8,5,2],[9,6,3]]

class Solution {
    public void rotate(int[][] matrix) {
        //Transpose the matrix and reverse each row
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int tmp = 0;
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int tmp = 0;
                tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = tmp;
            }
        }
        
    }
}
