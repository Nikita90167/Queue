import java.util.*;

public class Main {
    public static List<Person> generateClients(ArrayList<Person> clients) {
        System.out.println("Список клиентов");
        System.out.println();
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(clients.get(i).getName());
        }
        return clients;
    }

    public static void main(String[] args) {

        ArrayList<Person> queueClients = new ArrayList<>();
        Person Andrey = new Person("Andrey", "Andreev", 5);
        Person Nikita = new Person("Nikita", "Platonov", 2);
        Person Vika = new Person("Vika", "Vikovna", 3);
        Person Denis = new Person("Denis", "Denisovich", 4);
        Person Jastin = new Person("Jastin", "Biber", 1);

        queueClients.add(Andrey);
        queueClients.add(Vika);
        queueClients.add(Nikita);
        queueClients.add(Denis);
        queueClients.add(Jastin);

        generateClients(queueClients);

        ArrayDeque<Person> queueForRides = new ArrayDeque<>();

        for (Person client : queueClients) {
            queueForRides.offer(client);
        }
        while (true) {
            if (!queueForRides.isEmpty()) {
                Person client = queueForRides.pollFirst();
                if (client.countTicket()) {
                    System.out.println();
                    System.out.println(client.getName() + " прокатился на аттракционе");
                    System.out.println();
                    client.usingTheTicket();
                    queueForRides.offerLast(client);
                }
            }



        }
    }


}