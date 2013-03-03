/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stateless;

import entity.Parcours;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author Laurent
 */
@Local
public interface ParcoursSessionBeanLocal {
 
    //CreateParcours : Créer un parcours et l’enregistrer dans la BDD
    public Parcours CreateParcours(Long Parcours_id, String Nom_parcours, String Descriptif_parcours, int Note_parcours, int Vue_parcours);
    
    //DeleteParcours : Supprimer un parcours dans la BDD
    public void DeleteParcours(Parcours parc);
    
    //ModifyParcours : Modifier un parcours et enregistrer la modif dans la BDD 
    public void ModifyParcours(Parcours parc);
    
    //getAllParcours : Récupérer tous les parcours
    public Collection<Parcours> getAllParcours();
    
    //getParcoursByID : Récupérer un parcours par son identifiant
    public Parcours getParcoursByID(int id);
    
}
