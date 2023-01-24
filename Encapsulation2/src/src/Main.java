package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("insert person name.");
        String name=reader.readLine();
        System.out.println("insert person surname.");
        String surname=reader.readLine();
        System.out.println("insert person height like (1.80)");
        double height=(Double.parseDouble(reader.readLine()));
        System.out.println("insert person age:");
        int age= Integer.parseInt(reader.readLine());
        Person person= new Person();
        person.setAge(age);
        person.setName(name);
        person.setSurname(surname);
        person.setHeight(height);

        String personPrint = String.format("%s\n%s : %s\n%s : %s\n%s : %.2f\n%s : %d"," Person details : "," The name is: ",person.getName()," The surname is: ",person.getSurname()," The height is: ", person.getHeight()," The age is: ",person.getAge()) ;
        System.out.println(personPrint);
    }
}