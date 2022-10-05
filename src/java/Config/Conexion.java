/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author alexis
 */
public class Conexion {
    public DriverManagerDataSource conexion(){
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/clasemvc?zeroDateTimeBehavior=CONVERT_TO_NULL");
        datasource.setUsername("root");
        datasource.setPassword("");
        return datasource;
    }
}
