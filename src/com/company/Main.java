package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
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
