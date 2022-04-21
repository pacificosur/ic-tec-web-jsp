package model;

import entity.Carrera;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CarreraModelImpl implements ICarreraModel{
    private SessionFactory sf;
    private Session s;
    @Override
    public List<Carrera> obtenerRegistros() {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            List<Carrera> lista = s.createCriteria(Carrera.class).list();
            s.close();
            sf.close();
            return lista;
        } catch (HibernateException e) {
            System.out.println("Error al recuperar los registros: " + e.getMessage());
        }
        return null;
    }
    
     @Override
    public void actualizarRegistro(Carrera carrera) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(carrera);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }

    @Override
    public void eliminarRegistro(Carrera carrera) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(carrera);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al elimiar el registro: " + e.getMessage());
        }
    }

    @Override
    public void crearRegistro(Carrera pais) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(pais);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public Carrera obtenerRegistro(Integer idCarrera) {
       try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            Carrera carrera = (Carrera) s.get(Carrera.class, idCarrera);
            s.close();
            sf.close();
            return carrera;
        } catch (HibernateException e) {
            System.out.println("Error al recuperar los registros: " + e.getMessage());
        }
        return null;
    }
}
