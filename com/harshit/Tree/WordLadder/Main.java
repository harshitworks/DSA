package com.harshit.Tree.WordLadder;
import java.util.*;

public class Main {
    static void main(String[] args) {
        String begin = "a";
        String end = "d";
        List<String> list = new ArrayList<>();
        list.add("h");
        list.add("b");
        list.add("d");
        System.out.println(ladderLength(begin,end,list));

    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(wordList==null || wordList.size()==0 || !wordList.contains(endWord)) {
            return 0 ;
        }
        Set<String> visited = new HashSet<>();
        Set<String> wordSet = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();

        queue.add(beginWord);
        visited.add(beginWord);
        int length= 0 ;
        while(!queue.isEmpty()) {
            int size = queue.size();
            length++;
            for(int i = 0 ; i< size;i++) {
                String word = queue.poll();
                char[] temp = word.toCharArray();
                for(int j = 0 ; j < temp.length;j++) {
                    for(char ch = 'a' ; ch<='z'; ch++) {
                        temp[j] = ch;
                        String newWord = new String(temp);
                        if(newWord.equals(endWord)) {
                            return length+1;
                        }
                        if(wordSet.contains(newWord) && !visited.contains(newWord)) {
                            queue.add(newWord);
                            visited.add(newWord);
                        }
                    }
                }

            }
        }
        return 0 ;


    }
}
