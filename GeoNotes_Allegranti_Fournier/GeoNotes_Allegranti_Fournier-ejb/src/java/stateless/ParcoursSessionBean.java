/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stateless;

import entity.Parcours;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Laurent
 */
@Stateless
public class ParcoursSessionBean implements ParcoursSessionBeanLocal {

    @PersistenceContext(name="Geonotes3-ejbPU")
    private EntityManager entityManager;
    private Collection<Parcours> parcours;
    private Parcours parcour;
    private Query query;
    
    @Override
    //CreateParcours : Créer un parcours et l’enregistrer dans la BDD
    public Parcours CreateParcours(Long Parcours_id, String Nom_parcours, String Descriptif_parcours, int Note_parcours, int Vue_parcours) {
        parcour = new Parcours(Parcours_id,Nom_parcours,Descriptif_parcours,Note_parcours,Vue_parcours);
        query = entityManager.createQuery("INSERT into Parcours (Parcours_id,Nom_parcours,Descriptif_parcours,Note_parcours,Vue_parcours) VALUES ('"+parcour.getId()+"','"+parcour.getNom_parcours()+"','"+parcour.getDescriptif_parcours()+"','"+parcour.getNote_parcours()+"','"+parcour.getVue_parcours()+"')");
        query.executeUpdate();
        return parcour;
    }

    @Override
    //DeleteParcours : Supprimer un parcours dans la BDD
    public void DeleteParcours(Parcours parc) {
        query = entityManager.createQuery("DELETE FROM Parcours WHERE Parcours_id = " + parc.getId());
        query.executeUpdate();
    }

    @Override
    //ModifyParcours : Modifier un parcours et enregistrer la modif dans la BDD 
    public void ModifyParcours(Parcours parc) {
        query = entityManager.createQuery("UPDATE Parcours SET Nom_parcours='"+parc.getNom_parcours()+"' ,Descriptif_parcours = '"+parc.getDescriptif_parcours()+"',Note_parcours = '"+parc.getNote_parcours()+"',Vue_parcours = '"+parc.getVue_parcours()+"");
        query.executeUpdate();
    }

    @Override
    //getAllParcours : Récupérer tous les parcours
    public Collection<Parcours> getAllParcours() {
         query = entityManager.createQuery("select Nom_parcours from Parcours");
         parcours = query.getResultList();
         return parcours;
    }

    @Override
    //getParcoursByID : Récupérer un parcours par son identifiant
    public Parcours getParcoursByID(int id) {
        query = entityManager.createQuery("select Nom_parcours from Parcours where Parcours.Parcours_id = '"+id+"'");
        parcour = (Parcours)query.getSingleResult();
        return parcour;
    }


}
