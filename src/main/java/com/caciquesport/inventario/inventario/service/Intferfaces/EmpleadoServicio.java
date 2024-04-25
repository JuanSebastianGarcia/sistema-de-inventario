package com.caciquesport.inventario.inventario.service.Intferfaces;

import com.caciquesport.inventario.inventario.model.entity.Empleado;
import java.util.List;

/**
 * Interfaz para definir los servicios de gestión de Empleado.
 * Proporciona métodos para operaciones CRUD básicas en Empleado.
 */
public interface EmpleadoServicio {

    Integer crearEmpleado(Empleado nuevoEmpleado) throws Exception;

    Integer actualizarEmpleado(Empleado empleado) throws Exception;

    void eliminarEmpleado(String cedula) throws Exception;

    Empleado obtenerEmpleado(String cedula) throws Exception;

    List<Empleado> listarEmpleado() throws Exception;

}
