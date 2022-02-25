
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
        System.out.println(six);
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

        //For Loop
        for (int i = 0; i < initializerList.length; i++){
            for (int j = 0; j < initializerList[i].length; j++){
                System.out.print(initializerList[i][j]+" ");

            }
            System.out.println();
        }
        //While loop
        int a = 0, b = 0, c = 0;
        while(a < declareArr.length){
            b = 0;
            while(b < declareArr[a].length){
                System.out.print(declareArr[a][b]+" ");
                c += declareArr[a][b].length();
                b++;
            }
            System.out.println();
            a++;
        }
        System.out.println(c);
        

		int[][] imageData = {{100,90,255,80,70,255,60,50},
							{255,10,5,255,10,5,255,255},
	    			        {255,255,255,0,255,255,255,75},
		    		        {255,60,30,0,30,60,255,255}};
		
		//First, we want to crop the image down to a 4x6 image, removing the right 2 columns. Declare and initialize a new 2D array of integers with 4 rows and 6 columns called `newImage`.
		int[][] newImage = new int[4][6];
		for (int i = 0; i < imageData.length; i++){
            for (int j = 0; j < (imageData[i].length-2); j++){
                newImage[i][j] = imageData[i][j];
                System.out.print(newImage[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}