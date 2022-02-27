package Files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithFiles {
    public static void main(String[] args) {
        String fileName = "src/data.csv";
        File file = new File(fileName);

        // If it doesn't exist create it
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println(file.getName() + " created.");
            } catch (IOException e) {
                System.out.println("Error creating file");
                System.out.println(e);
            }
        }

        //Writing files
        try {
            FileWriter fileWriter = new FileWriter(fileName); // add true inside the parameters to append instead of overriding
            PrintWriter printWriter =
                    new PrintWriter(fileWriter);
            printWriter.println("id, name, email");
            printWriter.println("1, Jamila, jamila@gmail.com");
            printWriter.println("2, Alex, alex@hotmail.com");
            printWriter.flush(); // flush first before closing
            printWriter.close();
            System.out.println("contents added to file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading files

        try {
            FileReader fileReader = new FileReader(file); // file in variable
            BufferedReader reader =
                    new BufferedReader(fileReader);

            String contents = "";
            // check the first header with the objects
            System.out.println("header = "
                    + reader.readLine()); // skip first line

            List<User> users = new ArrayList<>();
            while ((contents = reader.readLine()) != null ) {
//                System.out.println(contents);
                String[] split = contents.split(",");

                // parse to create object
                int id = Integer.parseInt(split[0]);
                String name = split[1];
                String email = split[2];

                User user = new User(id, name, email); // object
                users.add(user);

            }

            reader.close();
            System.out.println("Looping through users list");
            users.forEach(System.out::println); // print users

        } catch(IOException e) {
            System.out.println(e);
        }


    }
}
