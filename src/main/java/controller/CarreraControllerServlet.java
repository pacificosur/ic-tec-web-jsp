package controller;

import entity.Carrera;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.CarreraServiceImpl;
import service.ICarreraService;

public class CarreraControllerServlet extends HttpServlet {

    private ICarreraService service;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("swhitch: " + action);
        switch (action) {
            case "index":
                System.out.println("Index");
            case "createForm":
                crearFormulario(request, response);
                break;
            case "insert":
                crear(request, response);
                break;
            case "list":
                listar(request, response);
                break;
            default:
                throw new AssertionError();
        }
    }
    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         System.out.println("pospostlllllll");
       doGet(request, response);
    }


    private void crearFormulario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/carrera/createForm.jsp");
        dispatcher.forward(request, response);
    }

    private void crear(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Carrera carrera = new Carrera();
        carrera.setNombre(request.getParameter("nombre"));        
        service = new CarreraServiceImpl();
        service.crearRegistro(carrera);
        System.out.println("INGRESNADO: " + carrera.getNombre());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/carrera/list.jsp");
        
        
        
        dispatcher.forward(request, response);
    }

    private void listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/carrera/list.jsp");
        this.service = new CarreraServiceImpl();
        List<Carrera> listaCarrera = this.service.obtenerRegistros();
        request.setAttribute("listaCarrera", listaCarrera);
        dispatcher.forward(request, response);
    }

