package com;

public class Words_Data_Structor {

    TrieNode root;

    public Words_Data_Structor(){
        this.root = new TrieNode();
    }

    public void insert (String word){
        TrieNode temp = root;

        for(char i : word.toCharArray()){
            if(i == '.'){
                for(TrieNode j : temp.arr){

                }
            }
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
}
