package userinputtofile;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInformation {
    public static void main(String[] args) throws IOException {

        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String file= "User_information.txt";
        FileWriter writer= new FileWriter(file);

        try{
            System.out.println("Enter your Name :");
            String name= reader.readLine();

            System.out.println("Enter your age :");
            int age= Integer.parseInt(reader.readLine());

            System.out.println("Enter Domain Language :");
            String lang= reader.readLine();


            writer.write("Name :"+name);
            writer.write("age"+ age);
            writer.write("domain language"+ lang);

            System.out.println("Information added to file");




        } catch (Exception e) {
            System.out.println("Exception occured "+e.getMessage() );
        }
        finally {
            try {
                if (writer != null) writer.close();
                reader.close();
            } catch (IOException e) {
                System.out.println("Failed to close resources: " + e.getMessage());
            }
        }



    }
}
