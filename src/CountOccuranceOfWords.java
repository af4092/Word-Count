package org.example;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountOccuranceOfWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        Map<String, Integer> map = new TreeMap<>();
        String[] words = text.split("[ \n\t\r.,;:!?(){]");
        for(int i=0; i<words.length; i++){
            String key = words[i].toLowerCase();
            if(key.length()>0){
                if(!map.containsKey(key)){
                    map.put(key, 1);
                }else{
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for(Map.Entry<String, Integer> entry: entrySet)
            System.out.println(entry.getValue() + "\t" + entry.getKey());
    }
}
