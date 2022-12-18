public class Person {

    String name;
    int age;
    int tickets;

    public Person (String name, int age, int tickets) {
        this.name = name;
        this.age = age;
        this.tickets = tickets;
    }

    public void attraction () {
        this.tickets -= 1;
        System.out.println(name + " прокатился на аттракционе. Осталось билетов" + this.tickets);
    }

    public String showInformation(){
        String text = name + ", " + age + " год(а), " + tickets + " билет(a)";
        return text;
    }
    @Override
    public String toString() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getTickets() {
        return this.tickets;
    }

    public String getName() {
        return this.name;
    }
}
