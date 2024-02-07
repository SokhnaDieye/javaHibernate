package org.example;
import org.example.entities.Produit;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();

        Produit produit=new Produit();
        produit.setLibelleP("Chargeur");
        produit.setQteP(6);
        produit.setPrixP(2500);
        produit.setIdCategorie(1);
        em.persist(produit);
        transac.commit();


        em.close();
        emf.close();

    }
}