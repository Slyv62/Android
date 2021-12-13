package com.example.td5;

public class Contact {
    String nom, prenom, imageURL;

    public Contact(String nom, String prenom, String imageURL) {
        this.nom = nom;
        this.prenom = prenom;
        this.imageURL = imageURL;
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
