/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author n0284106
 */
public class ToRoman {
    

    /**
     * @param args the command line arguments
     */
    public static String convert(int number) {
        int tempnum = number;

        String builder = "";

        Map<String, Integer> constant = new LinkedHashMap<>();
        constant.put("M", 1000);
        constant.put("MC", 900);
        constant.put("D", 500);
        constant.put("CD", 400);
        constant.put("C", 100);
        constant.put("XC", 90);
        constant.put("L", 50);
        constant.put("XL", 40);
        constant.put("X", 10);
        constant.put("V", 5);
        constant.put("IV", 4);
        constant.put("I", 1);

        //System.out.println(constant);
        
        if(tempnum > 4001) {
            return builder = "Number is too high";
        }
        
        while (tempnum != 0) {
            Iterator itr = constant.entrySet().iterator();
            while (itr.hasNext()) {
                Map.Entry place = (Map.Entry) itr.next();
                if (tempnum >= (int) place.getValue()) {
                    tempnum = tempnum - (int) place.getValue();
                    builder += place.getKey();
                    break;
                }
                //System.out.println(place.getKey() + " " + place.getValue());
            }
        }
        return builder;
    }

    public static void main(String[] args) {
        
        int x = 4005;
        String temp = convert(x);
        System.out.println(temp);

    }

}
