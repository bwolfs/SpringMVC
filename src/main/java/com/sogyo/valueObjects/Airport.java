package com.sogyo.valueObjects;

/**
 * Created by gijsbert on 10/21/16.
 */
public class Airport {

    String airportId;
    String name;
    String city;
    String country;
    String faa;
    String icao;
    String latitude;
    String longitude;
    String altitude;
    String timeZone;
    String dst;

    public Airport(String airportId,
                   String name,
                   String city,
                   String country,
                   String faa,
                   String icao,
                   String latitude,
                   String longitude,
                   String altitude,
                   String timeZone,
                   String dst) {
        this.airportId = airportId;
        this.name = name;
        this.city = city;
        this.country = country;
        this.faa = faa;
        this.icao= icao;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.timeZone = timeZone;
        this.dst = dst;
    }
}
