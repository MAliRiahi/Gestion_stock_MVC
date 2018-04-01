package com.dali.stock.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

/**
 * Created by mohamed ali on 3/26/2018.
 */

@Entity
public class Client implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    private Long idClient;

    private String nom;

    private String prenom;

    private String adresse;

    private String photo;

    private String mail;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;

    public Client() {
        super();
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long id) {
        this.idClient = id;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

   // @JsonIgnore
    public List<CommandeClient> getCommandeClients() {
        return commandeClients;
    }

    public void setCommandeClients(List<CommandeClient> commandeClients) {
        this.commandeClients = commandeClients;
    }
}