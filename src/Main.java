import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Person> queue = new ArrayDeque<>();
        int a = 0;
        ArrayList<Person> list = (ArrayList<Person>) generateClients();
        for (int i = 0; i < 5; i++) {
            queue.add(list.get(i));
            System.out.println((list.get(i)).showInformation());
        }
        while (true) {
            System.out.println(queue);
            Person person = queue.poll();
            if (person == null) {
                break;
            }
            person.attraction();
            if (person.getTickets() == 0) {
                continue;
            }
            queue.add(person);
        }
    }

    public static List<Person> generateClients() {
        Random random = new Random();
        String name;
        int tickets;
        int age;
        List<String> names = new ArrayList(Arrays.asList("Vanya", "Petya", "Masha", "Kolya", "Loki", "Thor", "Vasilysa", "Marina"));
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            name = names.get(random.nextInt(names.size()));
            age = random.nextInt(9, 60);
            tickets = random.nextInt(1, 4);
            Person person = new Person(name, age, tickets);
            people.add(person);
        }
        return people;
    }
}