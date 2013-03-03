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
@Table(name = "Parcours")
@XmlRootElement
public class Parcours implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Basic(optional = false)
    @Column(name = "Parcours_id")
    private Long Parcours_id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Nom_parcours")
    private String Nom_parcours;
    
    @NotNull
    @Column(name = "Descriptif_parcours")
    private String Descriptif_parcours;
    
    @NotNull
    @Column(name = "Note_parcours")
    private int Note_parcours;
    
    @NotNull
    @Column(name = "Vue_parcours")
    private int Vue_parcours;

    /* -------------- Constructeurs ------------- */

    public Parcours() {
    }

    public Parcours(Long Parcours_id) {
        this.Parcours_id = Parcours_id;
    }

    public Parcours(Long Parcours_id, String Nom_parcours) {
        this.Parcours_id = Parcours_id;
        this.Nom_parcours = Nom_parcours;
    }

    public Parcours(Long Parcours_id, String Nom_parcours, String Descriptif_parcours, int Note_parcours, int Vue_parcours) {
        this.Parcours_id = Parcours_id;
        this.Nom_parcours = Nom_parcours;
        this.Descriptif_parcours = Descriptif_parcours;
        this.Note_parcours = Note_parcours;
        this.Vue_parcours = Vue_parcours;
    }
    
    /* ------------------------------------------ */
    
    /* ----------- Getters et Setters ----------- */
    
    public Long getId() {
        return Parcours_id;
    }

    public void setId(Long id) {
        this.Parcours_id = id;
    }

    public String getNom_parcours() {
        return Nom_parcours;
    }

    public void setNom_parcours(String Nom_parcours) {
        this.Nom_parcours = Nom_parcours;
    }

    public String getDescriptif_parcours() {
        return Descriptif_parcours;
    }

    public void setDescriptif_parcours(String Descriptif_parcours) {
        this.Descriptif_parcours = Descriptif_parcours;
    }

    public int getNote_parcours() {
        return Note_parcours;
    }

    public void setNote_parcours(int Note_parcours) {
        this.Note_parcours = Note_parcours;
    }

    public int getVue_parcours() {
        return Vue_parcours;
    }

    public void setVue_parcours(int Vue_parcours) {
        this.Vue_parcours = Vue_parcours;
    }
    
    /* ------------------------------------------ */
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (Parcours_id != null ? Parcours_id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parcours)) {
            return false;
        }
        Parcours other = (Parcours) object;
        if ((this.Parcours_id == null && other.Parcours_id != null) || (this.Parcours_id != null && !this.Parcours_id.equals(other.Parcours_id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Parcours[ id=" + Parcours_id + " ]";
    }
    
}
