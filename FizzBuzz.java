// Program 1

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzbuzz(int n){
        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if ((i%5 == 0)&&(i%3 == 0)){
                list.add("FizzBuzz");
            }
            else if ((i%3)==0){
                list.add("Fizz");
            }
            else if ((i%5)==0){
                list.add("Buzz");
            }
            else{
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
    public static void main(String[] args){
        System.out.println(fizzbuzz(5));
    }
}
