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
@Table(name = "Users")
@XmlRootElement
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Basic(optional = false)
    @Column(name = "User_id")
    private Long User_id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Loggin_user")
    private String Loggin_user;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Password_user")
    private String Password_user;

    @Basic(optional = true)
    @Column(name = "Nom_user")
    private String Nom_user;
    
    @Basic(optional = true)
    @Column(name = "Prenom_user")
    private String Prenom_user;
    
    @Basic(optional = true)
    @Column(name = "Mail_user")
    private String Mail_user;
    
    
    /* -------------- Constructeurs ------------- */

    public Users() {
    }

    public Users(Long User_id) {
        this.User_id = User_id;
    }

    public Users(String Loggin_user, String Password_user) {
        this.Loggin_user = Loggin_user;
        this.Password_user = Password_user;
    }

    public Users(Long User_id, String Loggin_user, String Password_user, String Nom_user, String Prenom_user, String Mail_user) {
        this.User_id = User_id;
        this.Loggin_user = Loggin_user;
        this.Password_user = Password_user;
        this.Nom_user = Nom_user;
        this.Prenom_user = Prenom_user;
        this.Mail_user = Mail_user;
    }
    
    /* ------------------------------------------ */
    
    
    
    /* ----------- Getters et Setters ----------- */
    
    public Long getId() {
        return User_id;
    }

    public void setId(Long id) {
        this.User_id = id;
    }

    public String getLoggin_user() {
        return Loggin_user;
    }

    public void setLoggin_user(String Loggin_user) {
        this.Loggin_user = Loggin_user;
    }

    public String getPassword_user() {
        return Password_user;
    }

    public void setPassword_user(String Password_user) {
        this.Password_user = Password_user;
    }

    public String getNom_user() {
        return Nom_user;
    }

    public void setNom_user(String Nom_user) {
        this.Nom_user = Nom_user;
    }

    public String getPrenom_user() {
        return Prenom_user;
    }

    public void setPrenom_user(String Prenom_user) {
        this.Prenom_user = Prenom_user;
    }

    public String getMail_user() {
        return Mail_user;
    }

    public void setMail_user(String Mail_user) {
        this.Mail_user = Mail_user;
    }
    
    /* ------------------------------------------ */
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (User_id != null ? User_id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.User_id == null && other.User_id != null) || (this.User_id != null && !this.User_id.equals(other.User_id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Users[ id=" + User_id + " ]";
    }
    
}