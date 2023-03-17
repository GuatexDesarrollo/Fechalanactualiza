/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actualizadorfechalan;

import com.guatex.util.AdministracionCarpetas;
import com.guatex.util.D_Motor;
import static com.guatex.util.D_Motor.verificarConexionservicio;
import com.guatex.webservice.servicio.Fechs;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author DIBANEZ
 */
public class Actualizadorfechalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        D_Motor ds = new D_Motor();
        ds.operaciones();
    }
    private static Fechs consultadatos() {
        com.guatex.webservice.servicio.MotorActualizaFecha_Service service = new com.guatex.webservice.servicio.MotorActualizaFecha_Service();
        com.guatex.webservice.servicio.MotorActualizaFecha port = service.getMotorActualizaFechaPort();
        return port.consultadatos();
    }

    private static String verificarConexion() {
        com.guatex.webservice.servicio.MotorActualizaFecha_Service service = new com.guatex.webservice.servicio.MotorActualizaFecha_Service();
        com.guatex.webservice.servicio.MotorActualizaFecha port = service.getMotorActualizaFechaPort();
        return port.verificarConexion();
    }

}
