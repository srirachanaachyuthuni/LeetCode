public class FactorialZeroes {
    public static void main(String[] args){
        System.out.println(trailingZeroes(25));
    }
    public static int trailingZeroes(int n){
        int count = 0;
        while(n > 0){
            n = n/5;
            count = count + n;
        }
        return count;
    }
}
