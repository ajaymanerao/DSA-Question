package TwoDArray;

public class DiagonalSum {
public static void DiagonalSum(int matrix[][]){
    int row=matrix.length-1;
    int col=matrix[0].length-1;
    int n=matrix.length;
    int firstDig=0;
    int secDig=0;
    if(row+col%2==0){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                 firstDig +=matrix[i][j];
                }
            }
             secDig +=matrix[i][n-1-i];
        }
        int totalSum=firstDig+secDig;
        System.out.println(totalSum);
        
    }else{
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                 firstDig +=matrix[i][j];
                }
            }
            if(i!=(n-1-i)){
              secDig +=matrix[i][n-1-i];
            }
              
        }
        int totalSum=firstDig+secDig;
        System.out.println(totalSum);

    }
}

    public static void main(String[] args) {
        //int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

        DiagonalSum(matrix);
    }
    
}
