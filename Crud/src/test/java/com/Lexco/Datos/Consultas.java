package com.Lexco.Datos;

import com.Lexco.Modelo.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author SOFTWARE1
 */

public class Consultas {

public void crearAgenda(Object dato) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tra = session.beginTransaction();
        session.save(dato);
        tra.commit();
        session.close();
    }
 public void leerAgenda(Object datos){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tra = session.beginTransaction();
        session.createQuery("from agenda");
        tra.commit();
        session.close();
    }
    public void modAgenda(Object datos){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tra = session.beginTransaction();
        session.update(datos);
        tra.commit();
        session.close();
    }    
    public void busqAgenda(int dato){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tra = session.beginTransaction();
        Query query = session.createQuery("from agenda where id=:dato");
        query.setParameter("id", dato); //forma de los parametros
        tra.commit();
        session.close();
    }

}
