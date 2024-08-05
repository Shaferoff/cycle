import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 10; i<=99;i++)
        {
            if (i%6==0)
                System.out.print(i+"  ");
        }
        System.out.println(" ");
        for (int i = 12; i <= 96; i += 6)
        {
            System.out.print(i+"  ");
        }
        System.out.println("  ");
        for (int i = 2; i <= 16; i++)
        {
            System.out.print(i*6+"  ");
        }
    }
}