
package assignment_4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Balen
 */
public class Method_1 {
    
    public String methodOne(int n){
            int  i, c = 0, count = 0;
            List<Integer> factors = new ArrayList<Integer>();
            for(i=2;i<=n;i++)
            {
                if(n%i==0) // checking factors of the number
                {
                    factors.add(i);
                    c++;
                    count++;
                }
                else {
                    count++;
                }
            }
            if(c>1) // if factors are greater than 1
            {
                return  
                        n+" is composite number and factors are -> "+factors.toString()+"\n" +
                        "With 1st method number of iteration  is: "+count+"\n";
            }
            else
            {
                return
                        n+" is prime number and factors are -> "+factors.toString()+"\n" +
                        "With 1st method number of iteration  is: "+count+"\n";
           }
    }

    String methodOne(String result_m1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
