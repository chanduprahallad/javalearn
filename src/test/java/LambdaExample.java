import java.util.function.Predicate;

@FunctionalInterface
interface mul
{
     void multiplication(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {

        mul m = ( a, b)-> {
            System.out.println((a * b));};
            m.multiplication(5,7);
            String names[] = {"chandu","anu","swetha","charan","srikanth"};
        Predicate<String> p =s->(s.length()>4);
        for(String s:names)
        {
            if(p.test(s))
            {
                System.out.println(s);
            }
        }


    }
}
