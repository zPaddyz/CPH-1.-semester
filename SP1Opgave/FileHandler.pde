import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileNotFoundException;  // Import this class to handle errors

public class FileHandler {
// https://www.w3schools.com/java/java_files_create.asp
// https://www.w3schools.com/java/java_files_read.asp
  
  void createFile(){
    try {
      File myObj = new File("highscores.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  
  void writeToFile(String textToWriteToFile){
    try {
      FileWriter myWriter = new FileWriter("highscores.txt");
      myWriter.write(textToWriteToFile);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  
  ArrayList<String> readFromFile(){
    try {
      ArrayList<String> tempList = new ArrayList<String>();
      File myObj = new File("highscores.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        tempList.add(data);
      }
      myReader.close();
      return tempList;
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      return null;
    }
        
  }
}
