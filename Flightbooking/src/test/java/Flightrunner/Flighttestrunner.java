package Flightrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\chippiakula\\Flightbooking\\src\\test\\java\\Featurefile\\flight_featurefile.feature",
		glue= {"stepdefinations"})
		
		
		

public class Flighttestrunner {

}
