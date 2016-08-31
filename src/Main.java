package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // FOR
        /*for (int a = 0; a < 7; a++){
            System.out.print("The numbers are " + a + "\n");
        }*/

        //WHILE
        // EXECUTE A DATA CHAIN WHIT A BREAK

        /*int j = 0;
        while (j < 10){
            System.out.print("Plus " + j + "\n");
            if (j == 10){
                break;
            }
            j++;
        }*/

        //DO WHILE
        //RUN ALWAYS 1 TIME THE CODE
        /*int x = 0;
        do {
            System.out.print("Plus " + x + "\n");
            x++;
        } while (x<5);*/


        //ARRAY LIST ONE
        //LIST WHIT DATA FOR CALL

        ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();

        weeklyTemperatures.add(78);
        weeklyTemperatures.add(67);
        weeklyTemperatures.add(89);
        weeklyTemperatures.add(94);

        //ADD DATA IN A CUSTOM POSITION
        weeklyTemperatures.add(2, 111);

        //PRINT A SPECIFIC POSITION IN ARRAY
        //System.out.print("Print a specific position in array " + weeklyTemperatures.get(2) + "\n");

        //MAKE IF TO PRINT SPECIFIC NUMBER OF POSITION
        for (int j = 0; j < weeklyTemperatures.size(); j++) {

        /*if (j <= 2) {
                System.out.print(weeklyTemperatures.get(j) + "\n");
            }*/

            //System.out.println(weeklyTemperatures.get(j));
        }

        //EASY FORM TO PRINT ALL DATA IN ARRAY
        /*for (Integer temperature : weeklyTemperatures) {
            System.out.println(temperature);
        }*/

        //ARRAY FORM TWO
        //ANOTHER STRUCTURE FOR MALE AN ARRAY

        /*int tmp[] = {1, 2, 3, 4, 5};

        System.out.println(tmp[0]);

        //GET THE LENGTH FOR ARRAY
        System.out.print(tmp.length + "\n");*/

        //MAKE A LOOP FOR ARRAY USING FOR
        //PLUS ALL DATA IN ARRAY

        /*int myArr[] = {2, 2, 2};
        int sum = 0;
        for (int x = 0; x < myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);*/

        //HASH MAP, USE TWO VARIABLES FOR MAKE AND ARRAY

        /*HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

        restaurantMenu.put("Turkey Burger", 13);
        restaurantMenu.put("Naan Pizza", 11);
        restaurantMenu.put("Cranberry Kale Salad", 10);

        System.out.println(restaurantMenu.size());

        for (String item : restaurantMenu.keySet()) {

            System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");

        }*/


    }
}