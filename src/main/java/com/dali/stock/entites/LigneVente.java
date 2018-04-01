package com.dali.stock.entites;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mohamed ali on 3/26/2018.
 */
@Entity
public class LigneVente implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    private Long idLigneVente;

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "vente")
    private Vente vente;

    public Long getIdLigneVente() {
        return idLigneVente;
    }

    public void setIdLigneVente(Long id) {
        this.idLigneVente = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }


}
