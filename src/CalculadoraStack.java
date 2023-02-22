import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

/**
 * @author
 * Gabriel paz
 * Seccion 10 estructura de datos
 * Codigo Utilizado de HT2 
 * Clase para calcular los datos del archivo
 */
public class CalculadoraStack {
    public ArrayList<String> datos = new ArrayList<String>();
    private IPostfixCalculator calc = new Pcalculator();
    


    /**
     * @param nameArchivo
     *
     * Array list para guardar los datos del archivo
     */
    public ArrayList<String> importArchivo(String nameArchivo) {
        String fpath = nameArchivo;
        String data = "";
        ArrayList<String> datos = new ArrayList<String>();
        try {
            File myObj = new File(fpath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                datos.add(data);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return datos;

    }

    /**
     * @param datoAcalcular
     * @return
     *
     * Metodo para calcular los datos del archivo
     */
    public ArrayList<Integer> calcular(ArrayList<String> datoAcalcular, IStack<Integer> stack) {
        ArrayList<Integer> resultados = new ArrayList<Integer>();
        for (int i = 0; i < datoAcalcular.size(); i++) {
            ArrayList<String> datossepa = calc.getItems(datoAcalcular.get(i));

            for (String dato : datossepa) {
                if (calc.isOperator(dato)) {
                    int a = stack.pull();
                    int b = stack.pull();
                    int resultado = 0;
                    switch (dato) {
                        case "+":
                            resultado = calc.suma(a, b);
                            break;
                        case "-":
                            resultado = calc.resta(a, b);
                            break;
                        case "*":
                            resultado = calc.multiplicacion(a, b);
                            break;
                        case "/":
                            resultado = calc.division(a, b);
                            break;
                        default:
                            break;
                    }
                    stack.push(resultado);
                } else {
                    stack.push(Integer.parseInt(dato));
                }
            }
            resultados.add(stack.pull());

        }

        return resultados;
    }

}

