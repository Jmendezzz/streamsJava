import com.sun.jdi.connect.spi.TransportService;
import model.Person;
import model.PersonDTO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Person> arrayListPersons = new ArrayList<>();


        Person p1 = new Person(23,"Juan","32","juan@gmail.com","324232");
        Person p2 = new Person(15,"Santiago","100","santi@gmail.com","355332");
        Person p3 = new Person(19,"Luis","55","luis@gmail.com","32322");
        Person p4 = new Person(25,"Carlos","30","carlos@gmail.com","31244");
        Person p5 = new Person(29,"Jhon","920","jhon@gmail.com","3242");
        arrayListPersons.add(p1);
        arrayListPersons.add(p2);
        arrayListPersons.add(p3);
        arrayListPersons.add(p4);
        arrayListPersons.add(p5);


        System.out.println(findByName("Carlos",arrayListPersons).getName());
        arrayListPersons.sort(new AgeComparator());


        //Collection
        LinkedList<Person> personLinkedList= new LinkedList<>();
        personLinkedList.add(p1);
        personLinkedList.add(p2);
        personLinkedList.add(p3);
        personLinkedList.add(p4);
        personLinkedList.add(p5);


        ListIterator<Person>personListIterator = arrayListPersons.listIterator();
        personListIterator.next();
        personListIterator.add(new Person(16,"Daniel","920","daniel@gmail.com","3242"));
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next().getName());
        }





    }
    //Encontrar por nombre.
    static Person findByName (String name,ArrayList<Person> arrayListPersons){
        return arrayListPersons.stream()
                .filter(person -> person.getName().equals(name))
                .findFirst()
                .orElse(null);

    }
    //Generar lista DTO a partir de la normal
    static List<PersonDTO> generatePersonDTOArrayList(ArrayList<Person> personArrayList){

        return personArrayList.stream()
                .map(person -> new PersonDTO(person.getAge(),person.getName()))
                .collect(Collectors.toList());

    }
}