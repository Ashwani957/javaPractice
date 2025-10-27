
import java.util.Arrays;

public class Streamapi{
    public static void main (String args[]){
        int arr[]={2,3,5,6,8};
// impreative approach

int sum = 0 ; 
for (int i = 0 ; i<arr.length; i++){
    if(arr[i]%2==0){
        sum+=arr[i];
    }
}
System.out.println(sum);



        // stream 
        // first convert it into stream 
   int sum2=Arrays.stream(arr).filter(n->n%2==0).reduce(0,(a,b)->a+b);
   System.out.println(sum2);
    }

}