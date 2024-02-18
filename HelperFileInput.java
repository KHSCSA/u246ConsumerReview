import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class HelperFileInput {
    public static void main(String[] args){
        // gets data from a file
        // each item in ArrayList is one line from file
        ArrayList<String> posAdjectives = new ArrayList<String>();

        try {
            Scanner input = new Scanner(new File("docs/positiveAdjectives.txt"));
            while(input.hasNextLine()){
                posAdjectives.add(input.nextLine().trim());
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
        }  

        // TODO
        // we can .get() items
        System.out.println();

        // what if we want only the sentiment value??
        // what string tools would be necessary?

    }
    
}
