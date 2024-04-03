package iut.bad;

public class Homme extends Humain {
    
    public Homme() {
    }
    
    public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public String toString() {
        return "Homme: " + super.toString();
    }
}
