package com.dali.stock.entites;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mohamed ali on 3/26/2018.
 */
@Entity
public class LigneCommandeFournisseur implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    private Long idLigneCdeFrs;

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "idCommandeFournisseur")
    private CommandeFournisseur commandeFournisseur;

    public Long getIdLigneCdeFrs() {
        return idLigneCdeFrs;
    }

    public void setIdLigneCdeFrs(Long id) {
        this.idLigneCdeFrs = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public CommandeFournisseur getCommandeFournisseur() {
        return commandeFournisseur;
    }

    public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
        this.commandeFournisseur = commandeFournisseur;
    }


}
