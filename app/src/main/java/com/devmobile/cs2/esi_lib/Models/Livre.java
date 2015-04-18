package com.devmobile.cs2.esi_lib.Models;

/**
 * Created by Ahmed-PC on 10-04-2015.
 */
public class Livre {

    private int image;
    private String titre ;
    private String auteur ;
    private String categorie ;
    private String annee ;
    private String descreption ;

    public Livre(int image ,String titre,String auteur,String categorie,String annee,String descreption ){
        this.setImage(image);
        this.setTitre(titre);
        this.setAuteur(auteur);
        this.setCategorie(categorie);
        this.setAnnee(annee);
        this.descreption=descreption;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }
}
