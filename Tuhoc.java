import java.util.Arrays;
import model.Person;
import service.PersonService;
public class Tuhoc {
    public static void main(String[] args)
    {
        Person[] people = new Person [3];
        people[0] = new Person("Binh",20,5.6f);
        System.out.println(people[0].name + ", " + people[0].age);
}
}