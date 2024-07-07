// Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

class Solution {
    public void setZeroes(int[][] matrix) {
        int flg = 1;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j!=0){
                    matrix[0][j] = 0;
                    }
                    else{
                        flg = 0;
                    }
                }
            }
        }
            for(int i=1; i<m; i++){
                for(int j=1; j<n; j++){
                    if(matrix[i][j] != 0){
                        if(matrix[0][j]==0 || matrix[i][0]==0){
                            matrix[i][j] = 0;
                        }
                    }
                }
            }
            if(matrix[0][0]==0){
                for(int j = 0; j<n; j++){
                    matrix[0][j] = 0;
                }
            }
            if(flg == 0){
                for(int i=0; i<m; i++){
                    matrix[i][0] = 0;
                }
            }
        }
    }
