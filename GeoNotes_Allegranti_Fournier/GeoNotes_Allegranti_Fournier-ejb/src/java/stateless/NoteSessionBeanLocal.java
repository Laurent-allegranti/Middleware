/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stateless;

import entity.Note;
import java.util.Collection;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Laurent
 */
@Local
public interface NoteSessionBeanLocal {
    
    //CreateNote : Créer une note et l’enregistrer dans la BDD
    public Note CreateNote(Long Note_id, String Nom_note, String Descriptif_note, double Longitude_note, double Latitude_note, int Categorie_Id);
    
    //DeleteNote : Supprimer une note dans la BDD
    public void DeleteNote(Note note);
    
    //ModifyNote : Modifier une note et enregistrer la modif dans la BDD 
    public void ModifyNote(Note note);
    
    //GetAllNotes : Récupérer toutes les notes
    public Collection<Note> getAllNotes();
    
    //GetNoteByID : Récupérer une note par son identifiant
    public Note getNoteByID(int id);
    
}
