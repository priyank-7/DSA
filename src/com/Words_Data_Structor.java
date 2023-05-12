package com;

public class Words_Data_Structor {

    TrieNode root;

    public Words_Data_Structor(){
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

        return helper(temp,word,0);
    }

    public boolean helper(TrieNode temp, String word, int index){
        char c = word.charAt(index);
        if(c == '.'){
            if(index == word.length()-1){
                for(TrieNode i : temp.arr){
                    if(i != null && i.flag){
                        return true;
                    }
                }
                return false;
            }
            for(TrieNode i : temp.arr){
                if (i != null && helper(i,word,index+1)){
                    return true;
                }
            }
        }
        else {
            if(index == word.length()-1) {
                if (temp.arr[(int) c - 97] != null) {
                    if (temp.arr[(int) c - 97].flag) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            else {
                if (temp.arr[(int) c - 97] != null) {
                    return helper(temp.arr[(int) c - 97],word,index+1);
                }
            }
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
