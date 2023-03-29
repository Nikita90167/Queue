import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<Person> generateClients(ArrayList<Person> clients) {
        for (int i = 0; i < clients.size(); i++) {
            System.out.println((i + 1) + ". " + clients.get(i));
        }
        return clients;
    }
    public static void main (String[]args){

        ArrayList<Person> queueClients = new ArrayList<>();
        Person Andrey = new Person("Andrey", "Andreev", 5);
        Person Nikita = new Person("Nikita", "Platonov", 2);
        Person Vika = new Person("Vika","Vikovna", 3);
        Person Denis = new Person("Denis","Denisovich", 4);
        Person Jastin = new Person("Jastin","Biber", 1);

        queueClients.add(Andrey);
        queueClients.add(Vika);
        queueClients.add(Nikita);
        queueClients.add(Denis);
        queueClients.add(Jastin);

        generateClients(queueClients);

        Queue<Person> queueForRides = new ArrayDeque<>(5);
    }
}