/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.util;

import static com.guatex.util.AdministracionCarpetas.DISCO_UNIDAD;
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
import org.apache.commons.lang3.SystemUtils;

/**
 *
 * @author DIBANEZ
 */
public class D_Motor {

    public void operaciones() {
        System.out.println("Lol estoy iniciando el hilo");
        new Thread(new enviodatosclass()).start();
    }


    private class enviodatosclass extends Thread {

        private boolean keeptheenginerunningmynigga;

        @Override
        public void run() {
            keeptheenginerunningmynigga = true;
            int sleeptime = 30; //time in seconds
           
            while (keeptheenginerunningmynigga) {
                //En esta seccion se hace el llamado al WS, para ver si tenemos conexion al mismo WS.
                //Se apunta a cualquier metodo, con el objetivo que si se le llega, es porque hay conexion.
                if (verificarConexionservicio()) {
                    ejecutacomando();
                } else {
                    System.out.println("no hay conexion con el web service");
                }
                if (keeptheenginerunningmynigga) {
                    try {
                        Thread.sleep(sleeptime * 1000);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }

        }
    }

    public static void ejecutacomando() {
        try {
            boolean correcto = false;
            Date fechaDate = null;
            Fechs respuesta = new Fechs();
            SimpleDateFormat formatos = new SimpleDateFormat("dd-MM-yy");
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");


            /*Se trae la informacion de la base de datos*/
            respuesta = consultadatos();
            try {
                fechaDate = formato.parse(respuesta.getFecha());
                correcto = true;
            } catch (ParseException ex) {

                System.out.println(ex);
                correcto = false;
            }

            /*Si el formato de la fecha es correcto ingresa en el proceso de creacion y actualizacion 
             del a fecha y hora del sistema operativo.
             */
            if (correcto == true) {
                try {

                    String ruta = "C:\\BATACTUALIZA\\lanzador\\ACTUSYSTEM.BAT";
                 
                    String contenido = "@ECHO OFF";
                    String contenido2 = "CLS";
                    String contenido3 = "time " + respuesta.getHora();
                    String conteindo4 = "CLS ";
                    String contenido5 = "date " + formatos.format(fechaDate);
                    String contenido6 = "exit";
                    File file = new File(ruta);

                    // Si el archivo no existe es creado
                    if (!file.exists()) {
                        file.createNewFile();
                        FileWriter fw = new FileWriter(file);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(contenido + "\n");
                        bw.write(contenido2 + "\n");
                        bw.write(contenido3 + "\n");
                        bw.write(conteindo4 + "\n");
                        bw.write(contenido5 + "\n");
                        bw.write(contenido6 + "\n");
                        bw.close();
                        Runtime.getRuntime().exec("cmd /c start  " + ruta);

                    } else {
                        FileWriter fw = new FileWriter(file);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(contenido + "\n");
                        bw.write(contenido2 + "\n");
                        bw.write(contenido3 + "\n");
                        bw.write(conteindo4 + "\n");
                        bw.write(contenido5 + "\n");
                        bw.write(contenido6 + "\n");
                        bw.close();
                        Runtime.getRuntime().exec("cmd /c start  " + ruta);

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("no se pudo parsear la fecha y hora de la base de datos");
            }

        } catch (Exception err) {

            err.printStackTrace();
        }
    }

    public static Boolean verificarConexionservicio() {
        ExecutorService executor = null;

        try {
            //Esta instruccion funciona como un hilo, donde se define el tiempo que tiene que esperar.
            //Si no se obtiene una respuesta en el tiempo establecido, lanza un mensaje de error.
            executor = Executors.newFixedThreadPool(1);
            Future<String> future;
            future = executor.submit(new Callable<String>() {
                public String call() {
                    //Aqui se llama al WS, donde solo se va a consultar un metodo que solo devuelve un string.
                    return verificarConexion();
                }
            });
            String respuesta = future.get(5, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("No hay conexion");
            return false;
        } finally {
            try {
                if (executor != null) {
                    executor.shutdown();
                }
            } catch (Exception ex) {
            }
        }

        return true;
    }

    private static String verificarConexion() {
        com.guatex.webservice.servicio.MotorActualizaFecha_Service service = new com.guatex.webservice.servicio.MotorActualizaFecha_Service();
        com.guatex.webservice.servicio.MotorActualizaFecha port = service.getMotorActualizaFechaPort();
        return port.verificarConexion();
    }

    private static Fechs consultadatos() {
        com.guatex.webservice.servicio.MotorActualizaFecha_Service service = new com.guatex.webservice.servicio.MotorActualizaFecha_Service();
        com.guatex.webservice.servicio.MotorActualizaFecha port = service.getMotorActualizaFechaPort();
        return port.consultadatos();
    }
}
