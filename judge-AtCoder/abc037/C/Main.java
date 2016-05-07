import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{

  public static void main(String args[]){
    long sum=0;
    int n,k;
    Scanner scan = new Scanner(System.in);
    n=scan.nextInt();
    k=scan.nextInt();

    long table[]=new long [n+1];
    

    for(int i=1;i<=n;i++)
      table[i]=scan.nextInt();

    for(int i=1;i<=k;i++)
      sum+=table[i];

    BigInteger res=new BigInteger("0");
    BigInteger t=BigInteger.valueOf((long)sum);
    res=res.add(t);

    for(int i=1;i<=n-k;i++){
      sum-=table[i];
      sum+=table[i+k];
      t=BigInteger.valueOf((long)sum);
      res=res.add(t);
    }

    System.out.println(res.toString());

  }

}
