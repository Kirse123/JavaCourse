package com.Kirill.task2;

import java.util.*;

public class countWorlds {
    public static void PrintWordsFromStr(String str){
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
        for(Map.Entry<String, Integer> iter : dictionary.entrySet()){
            System.out.println(iter.getKey() + ": " + iter.getValue().toString());
        }
    }
    public static Map<String, Integer> CountWordsInStr(String str){
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
        return dictionary;
    }
}
