package com.Lexco.Datos;

import com.Lexco.Modelo.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author SOFTWARE1
 */

public class Consultas {

public void guardar(Object dato) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tra = session.beginTransaction();
        session.save(dato);
        tra.commit();
        session.close();
    }
    
}
