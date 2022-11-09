package proyecto1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Medicamentos {

    List<String> medicamentos = new ArrayList<>();

    public ArrayList<String> IngresarMedicamentos() {
        String selector = "s";
        do {
            String medicam = JOptionPane.showInputDialog("Ingrese el nombre del medicamento");
            medicamentos.add(medicam);
            selector = JOptionPane.showInputDialog("Desea ingresar otro medicamento s - n");
        } while (selector.equals("s"));
        return (ArrayList<String>) medicamentos;
    }

    public ArrayList<String> BuscarMedicamentos() {
        String concatenar="";
         for (int a = 0; a < medicamentos.size(); a++) {
                    concatenar+="\n";
                    concatenar+=a+" - "+medicamentos.get(a);

                }
         JOptionPane.showMessageDialog(null, concatenar);
         return (ArrayList<String>) medicamentos;
    }
    
    public ArrayList<String> BorrarMedicamentos() {
        String concatenar="";
        int indice;
         for (int a = 0; a < medicamentos.size(); a++) {  
             concatenar+="\n";
             concatenar+=a+" - "+medicamentos.get(a);
                }
         indice=Integer.parseInt(JOptionPane.showInputDialog(concatenar+"\n Cual numero (medicamento)desea borrar?"));
         medicamentos.remove(indice);
         return (ArrayList<String>) medicamentos;
    }
    
}


