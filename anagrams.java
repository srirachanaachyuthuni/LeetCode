import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Long, List<String>> anagrams = new HashMap<>();
        for(String s: strs){
            long value = calculateValue(s);
            if (anagrams.containsKey(value)){
                anagrams.get(value).add(s);
            }
            else{
                anagrams.put(value, new ArrayList<>(Collections.singleton(s)));
            }
        }
        return new ArrayList<>(anagrams.values());
    }

    public static long calculateValue(String s){
        int[] primes = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        long value = 1;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            value = value * primes[c - 'a'];
        }
        return value;
    }
    public static void main(String[] args){
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

}