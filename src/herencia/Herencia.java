package herencia;

/**
 *
 * @author crizt
 */
public class Herencia {

    public static void main(String[] args) {
        Persona persona = new Persona(1, "1212", "Juan", "Martinez", "Benito Juarez", "5512455");
        Persona persona2 = new Persona(2, "1313", "Pedro", "Contreras", "Alvaro Obregon", "5512455");

        System.out.println("id " + persona.getId());
        System.out.println("dni " + persona.getDni());
        System.out.println("nombre " + persona.getNombre());
        System.out.println("apellido " + persona.getApellido());
        System.out.println("domicilio " + persona.getDomicilio());
        System.out.println("telefono " + persona.getTelefono());

        System.out.println("id " + persona2.getId());
        System.out.println("dni " + persona2.getDni());
        System.out.println("nombre " + persona2.getNombre());
        System.out.println("apellido " + persona2.getApellido());
        System.out.println("domicilio " + persona2.getDomicilio());
        System.out.println("telefono " + persona2.getTelefono());

        Empleado empleado1 = new Empleado(1, "vendedor", 1.22,
                1, "1212", "Jazmin", "Hernandez", "Chimalhuacan", "545454");
        System.out.println("Nombre del empleado1 " + empleado1.getNombre());

        Consultor consultor1 = new Consultor("Juanita", 2, 1, "1212", "Jazmin", "Hernandez", "Chimalhuacan", "545454");
        System.out.println("Nombre del consultor1 " + consultor1.getNombre_consultor());
        System.out.println("Numero del consultor1 " + consultor1.getNum_consultor());

        Jefe jefe1 = new Jefe(1, "Alamacen", 1, "1545", "eFREN", "Hernandez", "IZTAPALAPA", "545454");

        System.out.println("Departamento del jefe1 " + jefe1.getDepartamento_jefe());
        //var numeroEntero1="aaaaaa0";
    }

}
