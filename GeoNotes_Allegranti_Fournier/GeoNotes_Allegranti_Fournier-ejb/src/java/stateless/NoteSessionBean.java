/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stateless;

import entity.Note;
import java.util.Collection;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Laurent
 */
@Stateless
public class NoteSessionBean implements NoteSessionBeanLocal {

    @PersistenceContext(name="Geonotes3-ejbPU")
    private EntityManager entityManager;
    private Collection<Note> notes;
    private Note note;
    private Query query;
    
    @Override
    //CreateNote : Créer une note et l’enregistrer dans la BDD
    public Note CreateNote(Long Note_id, String Nom_note, String Descriptif_note, double Longitude_note, double Latitude_note, int Categorie_Id) {
        note = new Note(Note_id,Nom_note,Descriptif_note,Longitude_note,Latitude_note,Categorie_Id);
        query = entityManager.createQuery("INSERT into Note (Nom_note,Descriptif_note,Longitude_note,Latitude_note,Categorie_Id) VALUES ('"+note.getNom_note()+"','"+note.getDescriptif_note()+"','"+note.getLongitude()+"','"+note.getLatitude()+"','"+note.getCategorie_Id()+"')");
        query.executeUpdate();
        return note;
    }

    @Override
    //DeleteNote : Supprimer une note dans la BDD
    public void DeleteNote(Note not) {
        query = entityManager.createQuery("DELETE FROM Note WHERE Note_id = " + not.getId());
        query.executeUpdate();
    }

    @Override
    //ModifyNote : Modifier une note et enregistrer la modif dans la BDD 
    public void ModifyNote(Note not) {
        query = entityManager.createQuery("UPDATE Note SET Nom_note='"+not.getNom_note()+"' ,Descriptif_note = '"+not.getDescriptif_note()+"',Longitude_note = '"+not.getLongitude()+"',Latitude_note = '"+not.getLatitude()+"',Categorie_Id = "+not.getCategorie_Id()+" where Note_id="+not.getId()+"");
        query.executeUpdate();
    }

    @Override
    //GetAllNotes : Récupérer toutes les notes
    public Collection<Note> getAllNotes() {
         query = entityManager.createQuery("select Nom_note from Note");
         notes = query.getResultList();
         return notes;
    }

    @Override
    //GetNoteByID : Récupérer une note par son identifiant
    public Note getNoteByID(int id) {
        query = entityManager.createQuery("select Nom_note from Note where Note.Note_id = '"+id+"'");
        note = (Note)query.getSingleResult();
        return note;
    }
}
