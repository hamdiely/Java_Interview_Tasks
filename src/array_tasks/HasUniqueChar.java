package array_tasks;

import java.util.HashSet;
import java.util.Set;

public class HasUniqueChar {

    public static void main(String[] args) {

    }



    public static boolean hasUniqueChars(String string){

        Set<Character> mySet=new HashSet<>();

        char [] str= string.toCharArray();
        for(char ch: str){
            if(mySet.contains(ch)){
                return false;
            } mySet.add(ch);
        }
        return true;
    }
}
