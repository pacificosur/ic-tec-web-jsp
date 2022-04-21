package model;

import entity.Carrera;
import java.util.List;

public interface ICarreraModel {
    public List<Carrera> obtenerRegistros();
     public void actualizarRegistro(Carrera carrera);
    public void eliminarRegistro(Carrera carrera);
    public void crearRegistro(Carrera carrera);
    public Carrera obtenerRegistro(Integer idCarrera);
}
