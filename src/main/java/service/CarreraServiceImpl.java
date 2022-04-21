
package service;

import entity.Carrera;
import java.util.List;
import model.CarreraModelImpl;
import model.ICarreraModel;

public class CarreraServiceImpl implements ICarreraService{
    ICarreraModel model = new CarreraModelImpl();

    @Override
    public List<Carrera> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void actualizarRegistro(Carrera carrera) {
        model.actualizarRegistro(carrera);
    }

    @Override
    public void eliminarRegistro(Carrera carrera) {
        model.eliminarRegistro(carrera);
    }

    @Override
    public void crearRegistro(Carrera carrera) {
        model.crearRegistro(carrera);
    }

    @Override
    public Carrera obtenerRegistro(Integer idCarrera) {
        return model.obtenerRegistro(idCarrera);
    }    
}
