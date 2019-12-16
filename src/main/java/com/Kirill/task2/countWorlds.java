package com.Kirill.task2;

import java.util.*;
import java.util.Scanner;

public class countWorlds {
    public static void main (String[] argv){
        String str;

        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        String[] words = str.split(" ");
        final Map <String, Integer> dictionary = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++){
            if (!dictionary.containsKey(words[i])){
                dictionary.put(words[i], 1);
            }
            else{
                int tmp = dictionary.get(words[i]);
                tmp++;
                dictionary.put(words[i], tmp);
            }
        }
        Set <String> res = dictionary.keySet();
        String[] s = new String[res.size()];
        res.toArray(s);
        for(int i = 0; i < s.length; i++){
            System.out.println(s[i] + ": " + dictionary.get(s[i]).toString());
        }
    }
}
