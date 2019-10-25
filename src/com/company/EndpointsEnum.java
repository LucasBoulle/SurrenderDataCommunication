package com.company;

import java.lang.reflect.Array;

public enum EndpointsEnum {
    SummonerByName("/lol/summoner/v4/summoners/by-name/", new String[] {} , new String[] {"summonerName"}),
    FreeChampionRotation("lol/platform/v3/champion-rotations", new String[] {}, new String[] {});

    private final String path;
    private final String[] parameters;
    private final String[] pathParameters;

    EndpointsEnum(String path, String[] parameters, String[] pathParameters) {
        this.path = path;
        this.parameters = parameters;
        this.pathParameters = pathParameters;
    }

    public String getPath() {
        return path;
    }

    public String[] getParameters() {
        return parameters;
    }

    public String[] getPathParameters() {
        return pathParameters;
    }
}
