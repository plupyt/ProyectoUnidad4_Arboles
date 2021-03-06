package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author plupy
 */
public class CSV {
    boolean cargadoCorrectamente=false;
    
    public void readCSV(String ruta, ListaSimpleLigada destino) throws IOException{
        String separator = ",";
        String nombre;
        String profesion;
        float promedio;
        BufferedReader bufferLectura = null;
        try{
            //abrir el .csv en buffer de lectura
            bufferLectura = new BufferedReader(new FileReader(ruta));
            
            //leer una linea del archivo
            String linea = bufferLectura.readLine();
            
            //salta linea de titulos
            linea = bufferLectura.readLine();
            
            //Detecta si tiene encabezados el csv (version Beta)
            /*String[] titulos = linea.split(separator);
            if(titulos[0].compareTo("Nombre") == 0 || titulos[0].compareTo("Nombres") == 0 || titulos[0].compareTo("nombre") == 0 || titulos[0].compareTo("nombres") == 0 || titulos[1].compareTo("Profesion") == 0 || titulos[1].compareTo("Profesión") == 0 || titulos[1].compareTo("profesion") == 0 || titulos[1].compareTo("profesión") == 0 || titulos[2].compareTo("Promedio") == 0 || titulos[1].compareTo("promedio") == 0){
                linea = bufferLectura.readLine();
            }*/
            
            while (linea != null) {
                //separar la linea leída con el separador definido previamente
                String[] campos = linea.split(separator);
                nombre = campos[0];
                profesion = campos[1];
                promedio = Float.parseFloat(campos[2]);
                Egresado newEgresado = new Egresado(nombre, profesion, promedio);
                //se inserta en la lista
                Nodo newNodo = new Nodo(newEgresado);
                destino.insertarFin(newNodo);
                
                //volver a leer otra línea del fichero
                linea = bufferLectura.readLine();
            }
            bufferLectura.close();
            System.out.println("Datos cargados\n");
            JOptionPane.showMessageDialog(null, "Datos cargados correctamente");
            cargadoCorrectamente = true;
        }
        catch(IOException e){
            System.out.println("No se pudieron cargar los datos\n");
            cargadoCorrectamente = false;
            JOptionPane.showMessageDialog(null, "No se pudieron cargar los datos, revisa la ruta \nrecuerda que debes ingresar la ruta con el nombre del archivo\nEjemplo: Documents/nombreDelArchivo.csv", "Error en la busqueda", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean confirmacionDatosCargados(){
        return cargadoCorrectamente;
    }
}
