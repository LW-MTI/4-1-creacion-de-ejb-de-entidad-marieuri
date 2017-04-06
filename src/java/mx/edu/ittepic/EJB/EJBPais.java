/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.EJB;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author marieuri
 */
@Stateless
@Remote (EJBPaisRemoto.class)
public class EJBPais implements EJBPaisRemoto {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
