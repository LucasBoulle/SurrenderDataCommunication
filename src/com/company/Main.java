package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        //Connecting to database
        //String dbURL = "jdbc:derby://localhost:8080/surrender-db;create=true";
        //String user = "admin";
        //String password = "admin";
        //Connection con = DriverManager.getConnection(dbURL, user, password);
        //if (con != null) {
        //    System.out.println("Connected to database!!!");
        //}
        // Uncomment this to connect to database

        // Request api data via REST
        HttpClient obj = new HttpClient();

        System.out.println("GET endpoint request for free champion rotation - League of Legends api");
        List<String[]> parameters = Arrays.asList();
        String endpoint = EndpointsEnum.FreeChampionRotation.getPath();
        obj.sendGet(endpoint, parameters, parameters);

        System.out.println("Send Http POST request");
        System.out.println("OBS: riot api does not have useful post requests, this request is only for example");
        obj.sendPost();
    }
}
