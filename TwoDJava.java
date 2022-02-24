
import java.util.Arrays;
class TwoDJava {
    public static void main(String[] args){
        
        //Declaration
        String[][] declareArr;
        declareArr = new String[][] {{"one", "two"}, {"three", "four"}, {"five", "six"}};

        //Initialization 2D Array with emty valua
        int[][] emty = new int[2][5];
        /**[0,0,0,0,0]
         * [0,0,0,0,0]
         */
        
        //Initialization 2D Array
        int[][] initializerList = {{1, 2}, {3, 4}, {5, 6}};        
        //You can: 
        initializerList = new int[][] {{2,4}, {6,8}, {10,12}};

        //Accessing Elements 
        int six = initializerList[1][0]; //6

        //Assign and Modifying Elements
        emty[0][0] = initializerList[0][0]*2;
        emty[0][1] = initializerList[0][1]*2;
        emty[0][2] = initializerList[0][0]*2;
        emty[0][3] = 0;
        emty[0][4] = initializerList[0][1]*2;
        emty[1][0] = initializerList[1][0]*2;
        emty[1][1] = initializerList[1][1]*2;
        emty[1][2] = initializerList[1][0]*2;
        emty[1][3] = 0;
        emty[1][4] = initializerList[1][1]*2;
        
        //Print a 2D array use:
        System.out.println(Arrays.deepToString(initializerList));
        System.out.println(Arrays.deepToString(declareArr));
        System.out.println(Arrays.deepToString(emty));
    }
}