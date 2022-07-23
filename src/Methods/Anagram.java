package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String word1, String word2) {

        //----------code here------------------------

        word1= word1.toLowerCase();
        word2= word2.toLowerCase();
       char[] arr1 = word1.toCharArray();

       char[] arr2 = word2.toCharArray();



        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){
            return true;
        }else {
            return false;
        }



        //--------------------------------------------



    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));

    }


}






