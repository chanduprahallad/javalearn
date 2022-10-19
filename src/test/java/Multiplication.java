import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int num;
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
         num = sc.nextInt();
         num1=sc.nextInt();
//         num2 = sc.nextInt();

//        for(int i=1; i<=10; i++)
//            System.out.println(num+"*"+i+"="+num*i);
//        System.out.println((num+num1+num2)/3);

        /*swapping of two variables*/
        System.out.println(num +"and"+num1);
        num2=num;
        num=num1;
        num1=num2;
        System.out.println(num +"and"+num1);
    }
}
