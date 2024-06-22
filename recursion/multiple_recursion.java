import java.util.*;

public class multiple_recursion {
    //in this multiple recursion we will gonna use the example of -- fibonacci number --
    
        public static int fib (int n) {
            if(n<=1){
                return n;
            }
            else{
                int last = fib(n-1);
                int s_last = fib(n-2);
                return last+s_last;
            }

        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int result=fib(n);
            System.out.println(result);
            sc.close();
        }
    }
