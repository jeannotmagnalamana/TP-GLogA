package iut.bad;

public class Femme extends Humain {
    
    public Femme() {
    }
    
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public String toString() {
        return "Femme: " + super.toString();
    }
}
