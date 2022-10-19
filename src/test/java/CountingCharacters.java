import java.util.Arrays;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character sequence:\n");
        String c = sc.nextLine();
        char d[] = c.toCharArray();
        char e[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i = 0; i < d.length; i++) {
            for(int j =0;j<e.length;j++)
            {
                if(d[i]==e[j])
//                    System.out.print(d[i]);
                count+=1;

            }
            System.out.print(d[i]+":"+count);
//            System.out.println(count+=1);


        }
    }
}
