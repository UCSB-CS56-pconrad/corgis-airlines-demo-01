package edu.ucsb.cs56.corgis.airlines.demos;


import java.util.ArrayList;
import corgis.airlines.AirlinesLibrary;
import corgis.airlines.domain.Airline;
import java.util.Collections;

public class ExampleSort02 {
    public static void main(String[] args) {
        // Get access to the library
        AirlinesLibrary airlinesLibrary = new AirlinesLibrary();
        // Access data inside the library
        ArrayList<Airline> list_of_airline = airlinesLibrary.getReports(true);

	// Collections.sort(list_of_airline);
	Collections.sort(list_of_airline,
			 (a1,a2) ->
			 a1.getCarrier().toString().compareTo
			 (a2.getCarrier().toString()));
	
        AirlinePrinter.printNicely(list_of_airline);
    }
}
