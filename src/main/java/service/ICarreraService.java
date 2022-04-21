/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.Carrera;
import java.util.List;

/**
 *
 * @author informatica
 */
public interface ICarreraService {
    public List<Carrera> obtenerRegistros();
     public void actualizarRegistro(Carrera carrera);
    public void eliminarRegistro(Carrera carrera);
    public void crearRegistro(Carrera carrera);
    public Carrera obtenerRegistro(Integer idCarrera);
}
