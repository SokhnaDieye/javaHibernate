package entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Produit {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idP")
    private int idP;
    @Basic
    @Column(name = "libelleP")
    private String libelleP;
    @Basic
    @Column(name = "qteP")
    private int qteP;
    @Basic
    @Column(name = "prixP")
    private int prixP;
    @Basic
    @Column(name = "idCategorie")
    private int idCategorie;
    @ManyToOne
    @JoinColumn(name = "idCategorie", referencedColumnName = "idCat", nullable = false)
    private Categorie categorieByIdCategorie;

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getLibelleP() {
        return libelleP;
    }

    public void setLibelleP(String libelleP) {
        this.libelleP = libelleP;
    }

    public int getQteP() {
        return qteP;
    }

    public void setQteP(int qteP) {
        this.qteP = qteP;
    }

    public int getPrixP() {
        return prixP;
    }

    public void setPrixP(int prixP) {
        this.prixP = prixP;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return idP == produit.idP && qteP == produit.qteP && prixP == produit.prixP && idCategorie == produit.idCategorie && Objects.equals(libelleP, produit.libelleP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idP, libelleP, qteP, prixP, idCategorie);
    }

    public Categorie getCategorieByIdCategorie() {
        return categorieByIdCategorie;
    }

    public void setCategorieByIdCategorie(Categorie categorieByIdCategorie) {
        this.categorieByIdCategorie = categorieByIdCategorie;
    }
}
