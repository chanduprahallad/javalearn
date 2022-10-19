package actions.demo.arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] data = new int[3][2];
        data[0][0] = 1; data[0][1] = 2; //data[0][2] = 3;
        data[1][0] = 10;
        data[2][0] = 100; data[2][1] = 200;

        //nested for loop;  a for loop inside another for loop is known as

        for(int rows = 0; rows <= data.length -1; rows++){
//            System.out.println(Arrays.toString(data[rows]));

            for(int cols = 0; cols <= data[rows].length -1; cols++){
                System.out.print(data[rows][cols] + " ");
            }
            System.out.println();

        }

    }
}

/*
|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|
|_|_|_|_|_|_|_|

 */
