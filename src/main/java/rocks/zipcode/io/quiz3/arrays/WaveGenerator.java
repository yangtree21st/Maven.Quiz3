package rocks.zipcode.io.quiz3.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
//    public static String[] wave(String str) {
//        String [] array = new String[str.length()];
//        String temp = new String();
//
//        for(int i = 0; i< str.length();i++){
//
//            temp = Character.toUpperCase(str.charAt(i))+ str.substring(0,i).toLowerCase()
//                    + str.substring(i+1,str.length()).toLowerCase();
//
//           array.add()
//        }
//        return array;
//    }


    public static String[] wave(String str) {
        String[] strings = new String[str.length()];
        String lowString = str.toLowerCase();
        List<String> result = new ArrayList<>();
        for(int i = 0 ; i < str.length();i++)
        if(Character.isLetter(lowString.charAt(i))){
           result.add(waveMaker(lowString,i));
        }
        return result.toArray(new String[0]);



    }

    public static String waveMaker (String input, int i){
        String lowString = input.toLowerCase();

        String result = lowString.substring(0,i)+
        Character.toUpperCase(lowString.charAt(i))+
                lowString.substring(i+1);

        return result;

    }
}