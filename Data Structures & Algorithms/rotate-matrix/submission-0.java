class Solution {
    public void rotate(int[][] matrix) {
        //arr[0][0] = arr[0][1];
        //arr[0][1] = arr[1][1];
         
        //arr[1][0] = arr[0][0];
        //arr[1][1] = arr[1][0];

        int n= matrix.length;
        int[][] matrix2 = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix2[j][n-1-i] = matrix[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= matrix2[i][j];
            }
        }
        System.out.println(matrix2);
    }
}
