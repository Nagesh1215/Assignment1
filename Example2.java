import java.util.Scanner;
public class Example2
{
    public static void main(String[] args) 
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = scanner.nextLine();
        System.out.println("Vowels in the string:");
        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o'|| ch=='u' || ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                System.out.println(ch+" ");
            }
        }


    }
}

