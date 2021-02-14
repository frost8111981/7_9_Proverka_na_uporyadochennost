package com.frost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listSort = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String input = reader.readLine();
            list.add(input);
            listSort.add(input);
        }

        //String temp = "";

//        for(int i = 0; i < list.size() - 1; i ++){
//            if(list.get(i + 1).length() < list.get(i).length()) {
//                System.out.println(i);
//            }
//            break;
//        }

        for(int i = 1; i < list.size(); i ++){
            if(list.get(i - 1).length() >  list.get(i).length()) {
                System.out.println(i);
                break;
            }
        }













        //        for (int j = 0; j < listSort.size(); j++) {
//            for (int i = 0; i < listSort.size() - 1; i++) {
//                if (listSort.get(i + 1).length() < listSort.get(i).length()) {
//                    temp = listSort.get(i + 1);
//                    listSort.set(i + 1, listSort.get(i));
//                    listSort.set(i, temp);
//                }
//            }
//
//        }
//
//        System.out.println(list);
//        System.out.println(listSort);
//
//        for (int i = 0; i < listSort.size(); i++) {
//             if(listSort.get(i) != list.get(i)){
//            System.out.println(i);
//             }
//
//
//        }


        //напишите тут ваш код
    }
}

