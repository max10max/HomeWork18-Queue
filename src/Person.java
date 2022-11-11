public class Person {
    private String firstName;
    private String secondName;
    private int counterTicket;

    public Person(String firstname, String secondname, int ticket) {
        this.firstName = firstname;
        this.secondName = secondname;
        this.counterTicket = ticket;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setSecondName(String name) {
        this.secondName = name;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void setCounterTicket(int ticket) {
        this.counterTicket = ticket;
    }

    public int getCounterTicket() {
        return this.counterTicket;
    }

    @Override
    public String toString(){
        return "\nИмя " + firstName + " Фамилия " + secondName + " Количество билетов: " + counterTicket;
    }
}

