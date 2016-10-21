package com.sogyo.valueObjects;

/**
 * Created by gijsbert on 10/21/16.
 */
public class Airline {

    String airline;
    String airlineId;
    String sourceAirport;
    String sourceAirportId;
    String destinationAirport;
    String destinationAirportId;
    String codeshare;
    String equipment;

    public Airline(String airline,
                   String airlineId,
                   String sourceAirport,
                   String sourceAirportId,
                   String destinationAirport,
                   String destinationAirportId,
                   String codeshare,
                   String equipment) {
        this.airline = airline;
        this.airlineId = airlineId;
        this.sourceAirport = sourceAirport;
        this.sourceAirportId = sourceAirportId;
        this.destinationAirport = destinationAirport;
        this.destinationAirportId = destinationAirportId;
        this.codeshare = codeshare;
        this.equipment = equipment;
    }
}
