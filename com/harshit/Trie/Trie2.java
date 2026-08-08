package com.harshit.Trie;

public class Trie2 {
    Node root;
    public Trie2() {
        root = new Node();
    }

    public void insert(String word) {
        Node curr = root;
        for (char ch : word.toCharArray()) {
            int idx = ch-'a';
            if (curr.children[idx] == null) {
                curr.children[idx]= new Node();
            }
            curr.children[idx].freq++;
            curr = curr.children[idx];
        }
        curr.end++;
    }
    public int countWord(String word) {
        Node curr = root;
        for(char ch : word.toCharArray()) {
            int idx = ch-'a';
            if(curr.children[idx]==null) return 0;

            curr = curr.children[idx];
        }
        return curr.end;
    }
    public int countStartsWith(String prefix) {
        Node curr = root;
        for(char ch: prefix.toCharArray()) {
            int idx = ch-'a';
            if(curr.children[idx]==null) return 0;
            curr = curr.children[idx];
        }
        return curr.freq;
    }
}
class Node{
    Node[] children;
    int freq;
    int end ;

    public Node(){
        children = new Node[26];
        freq = 0;
        end = 0;
    }
}
