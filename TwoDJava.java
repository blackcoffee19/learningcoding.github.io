
import java.util.Arrays;
class TwoDJava {
    public static void main(String[] args){
        
        //Declaration
        String[][] declareArr;
        declareArr = new String[][] {{"one", "two"}, {"three", "four"}, {"five", "six"}};

        //Initialization 2D Array with emty valua
        String[][] emty = new String[2][5];
        /**[0,0,0,0,0]
         * [0,0,0,0,0]
         */
        
        //Initialization 2D Array
        int[][] initializerList = {{1, 2}, {3, 4}, {5, 6}};        
        //You can: 
        initializerList = new int[][] {{2,4}, {6,8}, {10,12}};

        //Accessing Elements 
        int six = initializerList[1][0]; //6

        //Print a 2D array use:
        System.out.println(Arrays.deepToString(initializerList));
        System.out.println(Arrays.deepToString(declareArr));
        System.out.println(Arrays.deepToString(emty));
    }
}