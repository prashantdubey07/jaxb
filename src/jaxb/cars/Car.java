/**
 * 
 */
package jaxb.cars;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author prashant kumar dubey
 * @since 2015
 */

//all fields will be bound to XML
@XmlAccessorType (XmlAccessType.FIELD)

//Root Element will be Cars
@XmlRootElement(name="Car")
public class Car {
	
	/**
	 * carName
	 */
	private String carName;
	
	/**
	 * carBrand
	 */
	
	private String carBrand;
	
	/**
	 * color
	 */

	private String color;
	
	/**
	 * price
	 */
	
	private double price;
	
	/**
	 * numberOfSeats
	 */
	
	private int numberOfSeats;
	
	public Car(){
		//default constructor needed for JAXB
	}
	
	public String getCarName() {
		return carName;
	}
/**
 * setter and getters
 * @param carName
 */
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(" This Car is ");
		sb.append(getCarName());
		sb.append(" of Brand ");
		sb.append(getCarBrand());
		sb.append(". It is Available in color ");
		sb.append(getColor());
		sb.append(" & having total number seats ");
		sb.append(getNumberOfSeats());
		sb.append(". start with price ");
		sb.append(getPrice());
		sb.append(" ]");
		return sb.toString();
	}
}
