public class Person {
    private String name;
    private String surname;
    private int countTickets;

    public Person(String name, String surname, int countTickets) {
        this.name = name;
        this.surname = surname;
        this.countTickets = countTickets;
    }
    String getName () {
        return name + " " + surname;
    }
    boolean countTicket () {
        if (countTickets > 0) {
            return true;
        }
        return false;
    }
    void usingTheTicket () {
        countTickets = countTickets - 1;
    }
}
