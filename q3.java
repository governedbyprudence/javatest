import java.util.*;
public class q3 {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String second_string = sc.nextLine();
            String concatString = args[0]+" "+second_string;

            String words[]=concatString.split(" ");
            System.out.println(concatString);
            System.out.println(words[0]);
            System.out.println(words[1]);
            System.out.println(words[2]);
            System.out.println(words[3]);

    }
}
