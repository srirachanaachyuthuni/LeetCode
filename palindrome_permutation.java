import java.util.*;

public class palindrome_permutation {
    public static boolean check_permutations(String s){
        Hashtable<String, Integer> count = new Hashtable<>();
        for(int i=0;i<s.length();i++){
            if(count.containsKey(Character.toString(s.charAt(i)))){
                count.put(Character.toString(s.charAt(i)), count.get(Character.toString(s.charAt(i)))+1);
            }
            else{
                count.put(Character.toString(s.charAt(i)), 1);
            }
        }
        boolean oneOdd = false;
        for(String key: count.keySet()){
            if((count.get(key) % 2 != 0)){
                if (!oneOdd) {
                    oneOdd = true;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]){
        String str = args[0];
        if(check_permutations(str)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
