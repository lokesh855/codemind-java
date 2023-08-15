import java.util.Scanner;
public class Cap
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int cc = 2*x*y*z*512;
        System.out.println(cc/1024+" KB");
    }
}