public class Konto {
    Person person;
    double kontostand;


Konto (Person person, double kontostand){}

void einzahlen (double betrag ){
    if (betrag <0 ){
        System.out.println("Betrag konnte nicht eingezahlt werden, da keine negativen Zahlen eingezahlt werden können");
    }
    else {
    kontostand = kontostand+betrag;}

}
void auszahlen (double betrag){
    if ( betrag > kontostand){
    System.out.println("Betrag konnte nicht abgehoben werden, da der kontostand zu gering ist.");
    }
    else{
    kontostand = kontostand-betrag;}
}

}
