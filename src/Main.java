import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> attraction = new LinkedList<>();

        for (int i = 0; i < generateClients().size(); i++) {
            attraction.offer(generateClients().get(i));
        }

        while (!attraction.isEmpty()) {
            Person person = attraction.poll();
            int tick = person.getCounterTicket();
            if (tick != 0) {
                person.setCounterTicket(tick - 1);
                System.out.println("На аттракцион прокатился(лась) " + person.getFirstName() + " " + person.getSecondName() + " Билетов осталось " + person.getCounterTicket());
                if (person.getCounterTicket() != 0) {
                    attraction.offer(person);
                }
            }

        }
    }

    public static List<Person> generateClients() {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("Виталий", "Пучилов", 1));
        list.add(new Person("Антон", "Лютов", 2));
        list.add(new Person("Катя", "Сидорова", 3));
        list.add(new Person("Миша", "Иванов", 4));
        list.add(new Person("Оля", "Рыбина", 6));
        return list;
    }
}
