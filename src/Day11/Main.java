package Day11;

import java.io.IOException;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException {
        int choice;

        Scanner sc = new Scanner(System.in);
        WritingStories storyWrite = new WritingStories();
        try {
            do {
            System.out.println("""
                    
                    Creating our own reality, together!
                    ----------------------------------
                    1. Add a sentence:
                    2. New user.
                    3. Display the whole story.
                    4. Get list of Users.
                    5. Exit!
                    ----------------------------------

                                     
                    """);
            choice = sc.nextInt();
            switch (choice) {
                case 1:

                    storyWrite.addLine();
                    break;
                case 2:
                    storyWrite.addUser();
                    break;
                case 3:
                    storyWrite.getUserContributions();

                    break;
                case 4:
                    storyWrite.getUsers();
                    break;
                case 5:
                    storyWrite.printWriter.close();
                    storyWrite.bufferedReader.close();
                    storyWrite.printUsers.close();
                    storyWrite.bufferedReaderUsers.close();
                   System.exit(0);
                default:
                    return;
            }
            }while (true);
        }
        catch (IOException e) {
            System.err.println("I/O Exception: "+e.getMessage());
        }catch (InputMismatchException e){
            System.err.println("Input Mismatch: : "+e.getMessage());
        }
    }
}