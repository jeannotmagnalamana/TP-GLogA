package iut.bad;

import java.util.ArrayList;
import java.util.List;

public class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;
    protected List<Humain> amis;
    
    public Humain() {
    	amis = new ArrayList<>();
    }
    
    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        amis = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void ami(Humain ami) {
        amis.add(ami);
        ami.amis.add(this);
    }
    
    public void ami1(Humain ami) {
        ami(ami, 100); 
    }

    public void ami(Humain ami, int dureeAmitieEnJours) {
        amis.add(ami);
        ami.amis.add(this); 
        System.out.println(this.nom + " est ami avec " + ami.nom + " depuis " + dureeAmitieEnJours + " jours.");
    }

    
    public void details() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }

    @Override
    public void manger() {
        System.out.println(nom + " est en train de manger.");
    }

    @Override
    public void boire() {
        System.out.println(nom + " est en train de boire.");
    }
}
