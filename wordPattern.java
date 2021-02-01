import java.util.HashMap;

class pattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        int len = words.length;
        HashMap<Character, String> firstMapping = new HashMap<>();

        for(int i =0; i < len; i++){
            if (firstMapping.containsKey(pattern.charAt(i))){
                if(!firstMapping.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                }
            }
            else if (firstMapping.containsValue(words[i])) {
                return false;
            }
            else{
                firstMapping.put(pattern.charAt(i), words[i]);
            }

//            if (secondMapping.containsKey(words[i])){
//                if(!secondMapping.get(words[i]).equals(pattern.charAt(i))){
//                    return false;
//                }
//            }
//            else {
//                secondMapping.put(words[i], pattern.charAt(i));
//            }
        }
        return true;
    }
    public static void main(String[] args){
        pattern p = new pattern();
        System.out.println(p.wordPattern("abba", "dog cat cat dog"));
    }
}