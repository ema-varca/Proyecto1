package proyecto1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Proyecto1 {

    public static void main(String[] args) {
        //List<Pacientes> List_pacientes = new ArrayList<>();
        Pacientes pers = new Pacientes();
        Medicamentos medi = new Medicamentos();
        //List<String> medicamentos = new ArrayList<>();

        String[] arreglo = {"Ingresar medicamento", "Lista de medicamentos", "Borrar medicamento", "Salir"};
        String selector = "s";
        int seleccion;
        String NombrePaciente = JOptionPane.showInputDialog("Ingrese el nombre del paciente");
        do{
            seleccion = JOptionPane.showOptionDialog(null, "seleccione una opcion ", "Lista de medicamentos "+NombrePaciente, 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Ingresar");
        switch (seleccion) {
            case 0:
               medi.IngresarMedicamentos();
                break;
            case 1:
               medi.BuscarMedicamentos();
                break;
            case 2:
                medi.BorrarMedicamentos();
                break;
            case 3:
                System.out.println("Usted ha decidido salir");
                break;
            default:
        }
        }while(seleccion!=3);

    }
}
