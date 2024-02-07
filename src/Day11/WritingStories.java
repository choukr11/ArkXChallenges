package Day11;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WritingStories implements Serializable {
    transient Scanner sc = new Scanner(System.in);

    HashMap<String, Integer> users;

    String name;
    String contribution;
    ArrayList<String> userContributions;
    File file = new File("theStoriesWeTell.txt");
    File fileUsers = new File("users.txt");

    PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));

    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
    PrintWriter printUsers = new PrintWriter(new BufferedWriter(new FileWriter(fileUsers, true)));
    BufferedReader bufferedReaderUsers = new BufferedReader(new FileReader(fileUsers));

    public WritingStories() throws IOException {
        users = new HashMap<>();
        userContributions = new ArrayList<>();
    }

    public void addUser() throws IOException {
        do {
            System.out.println("Enter your Name: ");
            name = sc.nextLine();
            if (userExists()){
                System.out.println("Name taken, try a new one!\n");
            }
        }while (userExists());
        printUsers.print("\n" + name);
        System.out.println("New user added, welcome aboard!");
        printUsers.close();
    }
    public boolean userExists() {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(name)) {
                    return true; // User exists in the file
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("I/O Exception: " +e.getMessage());
        }
        return false; // User does not exist in the file
    }


    public void enterName() throws IOException {
        System.out.println("Enter your Name:");
        name = sc.nextLine();
        if(userExists()){
            return;
        }else {
            System.out.println("You're new here buddy!\n Identify yourself to contribute to the story! ");
            addUser();
        }

    }
    public void enterContribution(){
        System.out.println("Enter your contribution:");
        contribution = sc.nextLine();
    }
    public void addLine() throws IOException {
        enterName();
        enterContribution();
        userContributions.add(contribution +" - written by "+name+"\n");
        printWriter.print(contribution +" - written by "+name+"\n");
        printWriter.close();

    }

    public void getUsers() throws IOException {
        String line;
        while ((line = bufferedReaderUsers.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReaderUsers.close();
    }
    public void getUserContributions() throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
    @Override
    public String toString() {
        return contribution +" - written by "+name +"\n";
    }
}