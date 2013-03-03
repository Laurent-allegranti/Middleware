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
@Table(name = "Note")
@XmlRootElement
public class Note implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Basic(optional = false)
    @Column(name = "Note_id")
    private Long Note_id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Nom_note")
    private String Nom_note;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "Descriptif_note")
    private String Descriptif_note;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "Longitude_note")
    private double Longitude_note;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "Latitude_note")
    private double Latitude_note;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "Categorie_Id")
    private int Categorie_Id;    

    
    /* -------------- Constructeurs ------------- */

    public Note() {
    }

    public Note(Long Note_id) {
        this.Note_id = Note_id;
    }

    public Note(Long Note_id, String Nom_note) {
        this.Note_id = Note_id;
        this.Nom_note = Nom_note;
    }
    
    public Note(Long Note_id, String Nom_note, String Descriptif_note, double Longitude_note, double Latitude_note, int Categorie_Id) {
        this.Note_id = Note_id;
        this.Nom_note = Nom_note;
        this.Descriptif_note = Descriptif_note;
        this.Longitude_note = Longitude_note;
        this.Latitude_note = Latitude_note;
        this.Categorie_Id = Categorie_Id;
    }
    
    /* ------------------------------------------ */
    
    /* ----------- Getters et Setters ----------- */

    
    public Long getId() {
        return Note_id;
    }

    public void setId(Long id) {
        this.Note_id = id;
    }

    public String getNom_note() {
        return Nom_note;
    }

    public void setNom_note(String Nom_note) {
        this.Nom_note = Nom_note;
    }

    public String getDescriptif_note() {
        return Descriptif_note;
    }

    public void setDescriptif_note(String Descriptif_note) {
        this.Descriptif_note = Descriptif_note;
    }

    public double getLongitude() {
        return Longitude_note;
    }

    public void setLongitude(double Longitude) {
        this.Longitude_note = Longitude;
    }

    public double getLatitude() {
        return Latitude_note;
    }

    public void setLatitude(double Latitude) {
        this.Latitude_note = Latitude;
    }

    public int getCategorie_Id() {
        return Categorie_Id;
    }

    public void setCategorie_Id(int Categorie_Id) {
        this.Categorie_Id = Categorie_Id;
    }
    
    /* ------------------------------------------ */

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (Note_id != null ? Note_id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Note)) {
            return false;
        }
        Note other = (Note) object;
        if ((this.Note_id == null && other.Note_id != null) || (this.Note_id != null && !this.Note_id.equals(other.Note_id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Note[ id=" + Note_id + " ]";
    }
    
}
