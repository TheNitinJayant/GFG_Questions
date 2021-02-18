package GFG_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SieveOfEratosthenes {

    public boolean isPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public List<Integer> nPrimes(int n){
        List<Integer> result = new ArrayList<>();

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for(int i=2;i*i<n;i++){
            if(isPrime(i)){
                for(int j=2*i;j<=n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                result.add(i);
            }
        }
        return result;
    }

    public void mainSieveOfEratosthenes(){
        List<Integer> x = nPrimes(50);

        System.out.println(x);
    }
}
