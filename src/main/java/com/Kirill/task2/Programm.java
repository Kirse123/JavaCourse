package com.Kirill.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Programm {
    public static void main(String[] argv){
        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();

        Map<String, Integer> dictionary = countWorlds.CountWordsInStr(str);

        for(Map.Entry<String, Integer> iter : dictionary.entrySet()){
            System.out.println(iter.getKey() + ": " + iter.getValue().toString());
        }
    }
}
