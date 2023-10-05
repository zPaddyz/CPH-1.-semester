package Task2.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    ArrayList<String> coffeeMenu = new ArrayList<String>();



    void loadMenuData(){

        try {
        File file = new File("C:\\Users\\paan\\IdeaProjects\\JavaTest\\src\\Task2\\Task1\\coffee");

            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                coffeeMenu.add(scanner.nextLine());
            }
            /*
            Use a while loop with the hasNextLine() and nextLine()
            -methods called on the Scanner instance, to loop over the lines of the file and add the lines to the coffees ArrayList in this class.


             */

        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }

    }

    @Override
    public String toString() {
        return coffeeMenu.toString();
    }
}
