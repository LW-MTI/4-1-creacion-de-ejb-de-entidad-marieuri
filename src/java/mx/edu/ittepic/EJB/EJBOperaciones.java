/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.EJB;
import mx.edu.ittepic.guiaturistica.entidades.Pais;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marieuri
 */
@Stateless

public class EJBOperaciones {
@PersistenceContext EntityManager em;    

public void nuevoPais(Pais p){
	em.merge(p);    
}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
