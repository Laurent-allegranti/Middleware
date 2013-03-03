package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-03T11:58:12")
@StaticMetamodel(Note.class)
public class Note_ { 

    public static volatile SingularAttribute<Note, Long> Note_id;
    public static volatile SingularAttribute<Note, String> Descriptif_note;
    public static volatile SingularAttribute<Note, Integer> Categorie_Id;
    public static volatile SingularAttribute<Note, Double> Latitude_note;
    public static volatile SingularAttribute<Note, Double> Longitude_note;
    public static volatile SingularAttribute<Note, String> Nom_note;

}