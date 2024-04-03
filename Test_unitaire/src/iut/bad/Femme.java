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

    public static void main(String[] args) {
        Femme femme = new Femme("Doe", "Jane", 28);
        Homme homme = new Homme("Smith", "John", 30);
        
        femme.ami(homme);
        
        System.out.println(femme.getNom() + " est ami avec " + homme.getNom());
    }
}
