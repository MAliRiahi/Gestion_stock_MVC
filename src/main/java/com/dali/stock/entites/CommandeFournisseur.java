package com.dali.stock.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by mohamed ali on 3/26/2018.
 */
@Entity
public class CommandeFournisseur implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    private Long idCommandeFournisseur;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCommande;

    @ManyToOne
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;

    public Long getIdCommandeFournisseur() {
        return idCommandeFournisseur;
    }

    public void setIdCommandeFournisseur(Long id) {
        this.idCommandeFournisseur = id;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
        return ligneCommandeFournisseurs;
    }

    public void setLigneCommandeFournisseurs(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
        this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
    }



}
