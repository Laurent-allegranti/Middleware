/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stateless;

import entity.Users;
import javax.ejb.Local;

/**
 *
 * @author Laurent
 */
@Local
public interface LogginLocal {
     public boolean CheckUser(Users user);
}
