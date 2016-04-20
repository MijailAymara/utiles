/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.util.conectividad;

import java.sql.Connection;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author Mijail
 */
public class ConectorDB {
    
    public static Connection obtenerConexionBasica() {
        Connection conexion = null;
        BasicDataSource basicDataSource = null;
        try {
            basicDataSource = new BasicDataSource();
            basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//            basicDataSource.setUrl("jdbc:oracle:thin:@192.168.21.241:1521/pdb1");// local
            basicDataSource.setUrl("jdbc:oracle:thin:@172.28.80.32:1525/INTERAT1");// local
//            basicDataSource.setUsername("interacttdp");// local
            basicDataSource.setUsername("USR_INTERACT_APP");
//            basicDataSource.setPassword("interacttdp99");// local
            basicDataSource.setPassword("RT87TY");
            basicDataSource.setInitialSize(5);
            basicDataSource.setMaxActive(2);
            conexion = basicDataSource.getConnection();

            return conexion;
        } catch (Exception e) {
            return conexion;
        } finally {
            basicDataSource = null;
            conexion = null;
        }
    }
}
