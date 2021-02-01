import java.util.HashMap;

public class isomorphic {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> firstMapping = new HashMap<>();
            HashMap<Character, Character> secondMapping = new HashMap<>();

            int len = s.length();
            for(int i =0; i < len; i++){
                if (firstMapping.containsKey(s.charAt(i))){
                    if(firstMapping.get(s.charAt(i)) != t.charAt(i)){
                        return false;
                    }
                }
                else {
                    firstMapping.put(s.charAt(i), t.charAt(i));
                }

                if (secondMapping.containsKey(t.charAt(i))){
                    if(secondMapping.get(t.charAt(i)) != s.charAt(i)){
                        return false;
                    }
                }
                else {
                    secondMapping.put(t.charAt(i), s.charAt(i));
                }
            }
            return true;
        }

        public static void main(String[] args){
            isomorphic i = new isomorphic();
            System.out.println(i.isIsomorphic("title", "paper"));
        }
}
