public class Solution 
{
    public static boolean isPrime(int num){
        //logic goes here
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
}
    public static void main(String[] args) {
        // Test cases
        System.out.print(isPrime(1));
    }
}


