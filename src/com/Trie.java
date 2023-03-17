package com;

class TrieNode {
    char val;
    TrieNode [] arr = new TrieNode[26];
    boolean flag = false;
    public TrieNode(){

    }
    public TrieNode(char val){
        this.val = val;
    }

}
public class Trie {

    TrieNode root;

    public Trie(){
        this.root = new TrieNode();
    }

    public void insert (String word){
        TrieNode temp = root;

        for(char i : word.toCharArray()){
            if(temp.arr[(int)i-97] == null){
                temp.arr[(int)i-97] = new TrieNode(i);
                temp = temp.arr[(int)i-97];
            }
            else {
                temp = temp.arr[(int) i - 97];
            }
        }
        temp.flag = true;
    }

    public boolean search(String word){
        TrieNode temp = root;

        for(char i : word.toCharArray()){
            if(temp.arr[(int)i-97] == null){
                return false;
            }
            temp = temp.arr[(int)i-97];
        }
        if(temp.flag){
            return true;
        }
        return false;
    }

    public boolean startsWith(String word){
        TrieNode temp = root;

        for(char i : word.toCharArray()){
            if(temp.arr[(int)i-97] == null){
                return false;
            }
            temp = temp.arr[(int)i-97];
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "apple";
        Trie t = new Trie();
        t.insert(a);
        System.out.println(t.search(a));
        System.out.println(t.search("app"));
        System.out.println(t.startsWith("app"));
    }
}