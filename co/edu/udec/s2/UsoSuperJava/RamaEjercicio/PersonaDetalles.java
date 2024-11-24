import Domain.Model.Ejercicio1.Empleado;
import Domain.Model.Ejercicio1.Persona;

public class PersonaDetalles {
    
    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        Persona persona = new Persona("Juan Torres", 22);
        Empleado empleado = new Empleado("Carlos Fernandez", 24, "Base de datos");

        System.out.println("- Persona:");
        persona.mostrarDetalles();

        System.out.println("*********************************************");

        System.out.println("- Empleado:");
        empleado.mostrarDetalles();

        System.out.println("*********************************************");

    }
}
