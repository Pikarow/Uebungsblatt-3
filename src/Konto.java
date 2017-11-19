public class Konto {
    Person person;
    double kontostand;


Konto (Person person, double kontostand){}

void einzahlen (double betrag ){
    kontostand = kontostand+betrag;
}
void auszahlen (double betrag){
    if ( betrag > kontostand){
    System.out.println("Betrag konnte nicht abgehoben werden, da der kontostand zu gering ist.");
    }
    kontostand = kontostand-betrag;
}

}
