package com.sogyo;

import com.sogyo.valueObjects.Airline;
import com.sogyo.valueObjects.Airport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by gijsbert on 10/21/16.
 */
public class Reader {

    ArrayList<Airline> airlines = new ArrayList<>();
    ArrayList<Airport> airports = new ArrayList<>();

    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.getAirlines();
        reader.getAirports();
        System.out.println("bla");

    }

    public void getAirlines() {
        ClassLoader classLoader = getClass().getClassLoader();
        String filePath = classLoader.getResource("airlines.dat").getPath();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] splittedLine = line.split(",");
                airlines.add(new Airline(splittedLine[0], splittedLine[1], splittedLine[2], splittedLine[3], splittedLine[4],
                        splittedLine[5], splittedLine[6], splittedLine[7]));
            }
        } catch( IOException e) {

        }
    }

    public void getAirports() {
        ClassLoader classLoader = getClass().getClassLoader();
        String filePath = classLoader.getResource("airports.dat").getPath();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] splittedLine = line.split(",");
                airports.add(new Airport(splittedLine[0], splittedLine[1], splittedLine[2], splittedLine[3], splittedLine[4],
                        splittedLine[5], splittedLine[6], splittedLine[7], splittedLine[8], splittedLine[9], splittedLine[10]));
            }
        } catch( IOException e) {

        }
    }

}
