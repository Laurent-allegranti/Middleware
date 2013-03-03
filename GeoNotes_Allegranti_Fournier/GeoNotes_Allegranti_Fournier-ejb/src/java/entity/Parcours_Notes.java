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
@Table(name = "Parcours_Notes")
@XmlRootElement
public class Parcours_Notes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "Parcours_Notes_id")
    private Long Parcours_Notes_id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "Parcours_id")
    private int Parcours_id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "Notes_id")
    private int Notes_id;

    
    /* -------------- Constructeurs ------------- */
    
    public Parcours_Notes() {
    }

    public Parcours_Notes(Long Parcours_Notes_id) {
        this.Parcours_Notes_id = Parcours_Notes_id;
    }
    
    public Parcours_Notes(Long Parcours_Notes_id, int Parcours_id, int Notes_id) {
        this.Parcours_Notes_id = Parcours_Notes_id;
        this.Parcours_id = Parcours_id;
        this.Notes_id = Notes_id;
    }
    
    /* ------------------------------------------ */
    
    /* ----------- Getters et Setters ----------- */
    
    
    public Long getId() {
        return Parcours_Notes_id;
    }

    public void setId(Long id) {
        this.Parcours_Notes_id = id;
    }

    public int getParcours_id() {
        return Parcours_id;
    }

    public void setParcours_id(int Parcours_id) {
        this.Parcours_id = Parcours_id;
    }

    public int getNotes_id() {
        return Notes_id;
    }

    public void setNotes_id(int Notes_id) {
        this.Notes_id = Notes_id;
    }

    /* ------------------------------------------ */

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (Parcours_Notes_id != null ? Parcours_Notes_id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parcours_Notes)) {
            return false;
        }
        Parcours_Notes other = (Parcours_Notes) object;
        if ((this.Parcours_Notes_id == null && other.Parcours_Notes_id != null) || (this.Parcours_Notes_id != null && !this.Parcours_Notes_id.equals(other.Parcours_Notes_id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Parcours_Notes[ id=" + Parcours_Notes_id + " ]";
    }
    
}
