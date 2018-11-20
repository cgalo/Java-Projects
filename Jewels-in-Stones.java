/*
* Author: Carlos Galo
*
*
*/

public class JewelsandStones {

    public static void main (String[] args) {

        //You can edit the strings for any other letters you want to find in a string
        String J = new String("abc");
        String S = new String("abbbcdddd") ;

        int totJinS = numJewelsInStones ( J , S ) ;

        System.out.println ( totJinS ) ;
    }

    private static int numJewelsInStones ( String J, String S ) {

        char jewels [] = J.toCharArray () ; //Convert String J into char array for easier comparison on loop
        char stones [] = S.toCharArray () ; //Convert String S into char array for easier comparison on loop

        int numJInS = 0; //Keep track of repetitive char, start with 0 as that's the least you can have


        for ( int i = 0; i < stones.length ; i++ ) {
            
            for (int j = 0; j < jewels.length ; j ++) {
                
                if ( stones [ i ] == jewels [ j ] )
                    
                    numJInS ++ ;
                
            }
        }

        return numJInS;


    }


}
