package postpackaging;

public class Arrays {
    static void main(String[] args){
        //collection of similar kind of data
        //type[] variableNAME
        int[] arr = new int[4]; //array os size 10
        arr[3] = 89;
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }//traversing an array
        System.out.println("-----------------------------");
        //int[] arr1 = new int[5];
        int[] arr2 = {1, 2, 3, 4};

        for(int num : arr2){
            System.out.println(num);
        }
        System.out.println("-----------------------------");
        int[] findArr = {12, 341, 23, 12, 45, 67};
        int sum = 0;
        for(int num : findArr){
            sum += num;
        }
        System.out.println("The sum of the array is: " + sum);

        System.out.println("-----------------------------");
        System.out.println("-------------2D ARRAY------------");

        //int[][] twoDarr = new int[3][3]; //2d array of 3 rows by 4 columns
        int[][] matrix = {
            {1, 2, 3}, //matrix[0] will select first row
            {4, 5, 6}, 
            {7, 8, 9}
        };

        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();   
        }

        System.out.println("-----------------------------");
        char[][] MatArr = new char[3][2]; //2d array of 3 rows by 2 columns
        MatArr[0][0] = 'A';
        MatArr[0][1] = 'B';
        MatArr[1][0] = 'C';
        MatArr[1][1] = 'D';
        MatArr[2][0] = 'E';
        MatArr[2][1] = 'F';

        for(int i =0; i<MatArr.length; i++){
            for(int j =0; j<MatArr[i].length; j++){
                System.out.print(MatArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
