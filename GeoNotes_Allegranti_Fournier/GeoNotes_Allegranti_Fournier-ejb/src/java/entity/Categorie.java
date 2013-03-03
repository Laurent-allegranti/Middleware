/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Laurent
 */

@Entity
@Table(name = "Categorie")
@XmlRootElement
public class Categorie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Basic(optional = false)
    @Column(name = "Categorie_id")
    private Long Categorie_id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Nom_categorie")
    private String Nom_categorie;

    
    /* -------------- Constructeurs ------------- */
    
    public Categorie() {
    }

    public Categorie(Long Categorie_id) {
        this.Categorie_id = Categorie_id;
    }

    public Categorie(Long Categorie_id, String Nom_categorie) {
        this.Categorie_id = Categorie_id;
        this.Nom_categorie = Nom_categorie;
    }
    
    /* ------------------------------------------ */
    
    /* ----------- Getters et Setters ----------- */
    
    
    public Long getId() {
        return Categorie_id;
    }

    public void setId(Long id) {
        this.Categorie_id = id;
    }

    public String getNom_categorie() {
        return Nom_categorie;
    }

    public void setNom_categorie(String Nom_categorie) {
        this.Nom_categorie = Nom_categorie;
    }
    
    /* ------------------------------------------ */

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (Categorie_id != null ? Categorie_id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorie)) {
            return false;
        }
        Categorie other = (Categorie) object;
        if ((this.Categorie_id == null && other.Categorie_id != null) || (this.Categorie_id != null && !this.Categorie_id.equals(other.Categorie_id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Categorie[ id=" + Categorie_id + " ]";
    }
    
}
