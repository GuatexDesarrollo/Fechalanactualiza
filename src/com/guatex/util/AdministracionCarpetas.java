/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.lang3.SystemUtils;

/**
 *
 * @author DIBANEZ
 */
public class AdministracionCarpetas {

    public static final String DISCO_UNIDAD;
    private static final String RUTA_PRIMARIA;
    private static final String RUTA_BAT;

    /**
     * Inicializa el PATH de los directorios utilizados por la aplicacion
     */
    static {
        if (SystemUtils.IS_OS_LINUX) {
            DISCO_UNIDAD = System.getenv("HOME");
        } else if (SystemUtils.IS_OS_WINDOWS) {
            DISCO_UNIDAD = System.getenv("USERPROFILE");
        } else {
            System.out.println("El sistema es: " + SystemUtils.OS_NAME);
            DISCO_UNIDAD = "";
        }

        RUTA_PRIMARIA = DISCO_UNIDAD + "\\BATACTUALIZA";
        RUTA_BAT = RUTA_PRIMARIA + "\\lanzador\\";
    }

    public static String getRUTA_PRIMARIA() {
        return RUTA_PRIMARIA;
    }

    public static String getRUTA_BAT() {
        return RUTA_BAT;
    }

    public void crearCarpetasyArchivos() {
        try {
            File ruta = new File(RUTA_PRIMARIA);
            if (!ruta.exists()) {
                ruta.mkdir();
            }
            ruta = new File(RUTA_BAT);
            if (!ruta.exists()) {
                ruta.mkdir();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
