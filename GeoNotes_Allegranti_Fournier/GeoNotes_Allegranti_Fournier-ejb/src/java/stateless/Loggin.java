/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stateless;

import entity.Users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

/**
 *
 * @author Laurent
 */
@Stateless
public class Loggin implements LogginLocal {

    private EntityManager entityManager;

    @Override
    public boolean CheckUser(Users user){
    
        boolean bool = false;
        Query requete = entityManager.createQuery("SELECT User_id FROM Users WHERE Loggin_user='"+user.getLoggin_user()+"' AND Password_user='"+user.getPassword_user()+"'");
    
        try {
            String result = (String) requete.getSingleResult();
            if (!(result.isEmpty())){
                bool = true;
            }
        } catch (NoResultException e){
            System.out.println ("No result");
        } catch (NonUniqueResultException f){
            System.out.println ("More than one result");
        } catch (IllegalStateException g ){
            System.out.println ("Illegal Persistence query language");
        }
        
        return bool;
    }

}
