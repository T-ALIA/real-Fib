import java.util.Scanner;

public class Fib{

public static void main(String args[]){
    Scanner r= new Scanner(System.in);
System.out.println("enter a number");
int t= r.nextInt();
long e=sequence(t);
System.out.println(e);
/*prompt the user for a number here. 
 *then, pass that number as an argument to the sequence method (ie call the method).
 *finally, print the result to the console.
 */
}

public static long sequence(int term){
if (term==1|| term ==2){
    return 1;
}

else {
    long low =1;
    long high=1;
    long sum=1;
    for( int i=3;i<= term;i++){
        sum=low+high;
        low=high;
        high=sum;
    }
    return sum;
}
}
        
        
        





/*build the method here from the recursive formula.
 *what needs to be given? why do you think the return type is long rather than int?
 */
}



