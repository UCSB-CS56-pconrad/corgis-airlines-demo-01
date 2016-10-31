package edu.ucsb.cs56.corgis.airlines.demos;

import java.util.Collections;
import java.util.ArrayList;

public class ExampleStringSort {
    public static void main(String[] args) {

	ArrayList<String> airportCodes = new ArrayList<String>();

	airportCodes.add("SFO");
	airportCodes.add("OAK");
	airportCodes.add("SJC");
	airportCodes.add("SAN");
	airportCodes.add("SBA");
	airportCodes.add("LAX");
	airportCodes.add("SNA");
	airportCodes.add("PHX");
	airportCodes.add("BOS");
	airportCodes.add("EWR");
	airportCodes.add("JFK");

	Collections.sort(airportCodes);
	System.out.println(airportCodes);
    }
}
