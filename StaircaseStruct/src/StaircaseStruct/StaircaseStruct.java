
/*
 * Author: Angelo Romel Lopez
 * Date: 02/02/2016
 * Description Staircase Structure. My solution to a problem at Hackerrank.com
 * Prints a staircase of height N that consists of # symbols and spaces. 
 * For example for N=6, here's a staircase of that height:
 * 
 *   #
    ##
   ###
  ####
 #####
######
 * */

package StaircaseStruct;
import java.util.*;

public class StaircaseStruct {

	public static void main(String[] args) {
		System.out.println("STAIRCASE STRUCTURE\nPlease enter the number of steps: ");
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String buffer = "";
        int space = 0,//The number of times to print a space. 
        		value = 0;//The number of times to print the # symbol.
        
        for(int i = 0; i <= n; i ++){
            space = n - i;
            value = i;
            
            for(int x = 0; x < space; x ++){
                buffer += " ";/*Prints the empty spaces that appears
                				before the # symbol.
                				*/
            }
            
            for(int x = 0; x < value; x ++){
                buffer += "#";/*Prints the # symbol that represents
                 				the steps on the staircase.*/
            }
            
            System.out.println(buffer);//Prints the current step of the staircase.
            buffer = "";
        }
        in.close();//Closes the Scanner object.
	}

}