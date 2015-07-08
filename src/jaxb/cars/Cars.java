/**
 * 
 */
package jaxb.cars;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Prashant Kumar Dubey
 *@since 2015
 */

//all fields will be bound to XML
@XmlAccessorType (XmlAccessType.FIELD)

//Root Element will be Cars
@XmlRootElement(name="Cars")
public class Cars {
	//Element will be Car type which is itself a class or root element in XML
	@XmlElement(name="Car", type= Car.class)
	
	// creating list of Car class object
	private List<Car> cars = new ArrayList<Car>();
	
	public Cars(){
		//default constructor needed for JAXB
	}
	
	// one-arg constructor
	public Cars(List<Car> cars){
		this.cars = cars;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

}
