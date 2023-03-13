import java.nio.charset.MalformedInputException;

public class MinSubarray {
    public int solve(int A) {
        int i;
        int factors=0;
        for (i=1;i<=Math.sqrt(A);i++)
        {
            if(A%i==0)
            {
                if(i==A/i){
                    factors+=1 ;
                }
                else{
                    factors+=2;
                }
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        MinSubarray cf=new MinSubarray();
        int result= cf.solve(25);
        System.out.println(result);
    }
}

