package GFG_Questions;

import java.util.HashMap;

public class MinimumIndexCharacter {

    public char minimumIndexCharacter(String str, String patt){

        HashMap<Character, Integer> hm = new HashMap<>();
        char answer = ' ';
        int minIndex = str.length()-1;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch, i);
            }
        }

        for (int i=0;i<patt.length();i++){
            char ch = patt.charAt(i);
            if(hm.containsKey(ch)){
                if(minIndex>hm.get(ch)){
                    minIndex = hm.get(ch);
                    answer = ch;
                }
            }
        }

        return answer;
    }

    public void mainMinimumIndexCharacter(){
        String str = "geeksforgeeks";
        String patt = "set";

        System.out.println(minimumIndexCharacter(str,patt));
    }
}
