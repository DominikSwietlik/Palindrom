import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter sentence");

        String sentence = myObj.nextLine();
        String tmpsentence = sentence.replaceAll(" ","");
        String tmp = "";
        for (int i = 1; i <= tmpsentence.length() ; i++)
        {
            char s = tmpsentence.charAt(tmpsentence.length() -i);
            tmp = tmp + "" + s;
        }
        if (tmp.equals(tmpsentence))
        {
            System.out.println(sentence + " is palindrom ");
        }

        else
        {
            System.out.println(sentence + " isn't palindrom ");
        }


    }
}
