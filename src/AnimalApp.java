import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Animal a = new Animal();

        System.out.print("What is your animal's name? ");
        String name = sc.nextLine();
        a.setName(name);
        a.getName();

        System.out.print("What is your animal's type? ");
        String type = sc.nextLine();
        a.setType(type);
        a.getType();

        System.out.print("What is your animal's description? ");
        String description = sc.nextLine();
        a.setDescription(description);
        a.getDescription();

        System.out.println("The animal you were typing was " + a.getName() + ", and the type was " + a.getType() + ", and the description was " + a.getDescription());
    }
 }


