/**
 * 
 */
package jaxb.cars;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

/**
 * @author Prashant Kumar Dubey
 * @since 2015
 *
 */
public class JAXBDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//creating multiple car object
        Car car = new Car();
         car.setCarName("A6");
         car.setCarBrand("Audi");
         car.setColor("black");
         car.setNumberOfSeats(2);
         car.setPrice(2400000);
        Car car1 = new Car();
        car1.setCarName("X1");
        car1.setCarBrand("BMW");
        car1.setColor("Red");
        car1.setNumberOfSeats(4);
        car1.setPrice(4000000);
        // adding car objects to List of cars
        List<Car> cars = new ArrayList<Car>();
        cars.add(car);
        cars.add(car1);
        
        //Marshalling: Writing Java objects to XMl file
        try {
            CarJaxbHandler.marshal(cars, new File("F:/TopCoder/testing/cars.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
         
        //Unmarshalling: Converting XML content to Java objects
        try {
        	cars = CarJaxbHandler.unmarshal(new File("F:/TopCoder/testing/cars.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        System.out.println(cars);
        
	}

}
