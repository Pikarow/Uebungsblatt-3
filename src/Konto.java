public class Konto {
    Person person;
    double kontostand;


Konto (Person person, double kontostand){}

void einzahlen (double betrag ){
    kontostand=kontostand+betrag;
}
void auszahlen (double betrag){
    kontostand=kontostand-betrag;
    if ( betrag > kontostand){

    }
}

}

