import java.util.*;

public class check_permutations {
    public static boolean isPermutation(String str1, String str2){
        Hashtable<String, Integer> count = new Hashtable();
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 != len2){
            return false;
        }
        else {
            for (int i = 0; i < len1; i++) {
                if (count.containsKey(Character.toString(str1.charAt(i)))){
                    count.put(Character.toString(str1.charAt(i)), count.get(Character.toString(str1.charAt(i))) + 1);
                } else {
                    count.put(Character.toString(str1.charAt(i)), 1);
                }
            }

            for (int j = 0; j <len2; j++){
                if(count.containsKey(Character.toString(str2.charAt(j))))
                {
                    count.put(Character.toString(str2.charAt(j)), count.get(Character.toString(str2.charAt(j))) - 1);
                    if (count.get(Character.toString(str2.charAt(j))) < 0){
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            return true;
        }
    }


    public static void main(String args[]){
        String s1 = args[0].toLowerCase();
        String s2 = args[1].toLowerCase();

        if (isPermutation(s1, s2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

}
