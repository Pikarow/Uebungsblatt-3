public class Main {
    public static void main(String[] args) {
        Person person = new Person("Manfred", "Mustermann", 32, "Musterstrasse vier");

        Konto kundenkonto = new Konto(person, 2000);

        kundenkonto.einzahlen(300);
        kundenkonto.auszahlen(100);
    }
}