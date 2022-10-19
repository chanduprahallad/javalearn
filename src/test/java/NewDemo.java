import com.google.gson.internal.bind.util.ISO8601Utils;

public class NewDemo {
    public static void main(String[] args) {
//        System.out.printf("%x",123);
        int[][] a = new int[3][3];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++) {
                if (i >= j)
                    System.out.print("*");
            }
                System.out.println();

        }
    }
}
