package edu.ucsb.cs56.corgis.airlines.demos;

import java.util.ArrayList;
import corgis.airlines.AirlinesLibrary;
import corgis.airlines.domain.Airline;

public class AirlinePrinter {


    public static void printNicely(ArrayList<Airline> list) {
	for (Airline a: list) {
	    printNicely(a);
	}

    }

    public static void printNicely(Airline a) {
	System.out.println("Airport: " + a.getAirport());
	System.out.println(" Carrier: " + a.getCarrier());
	//System.out.println(" Statistics: " + a.getStatistics());
	//System.out.println(" Time: " + a.getTime());
    }



}
