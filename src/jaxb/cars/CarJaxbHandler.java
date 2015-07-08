/**
 * 
 */
package jaxb.cars;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


/**
 * @author Prashant
 * @serial 1.0
 * @since 2015
 *
 */


public class CarJaxbHandler {
	// Export data to XML
    public static void marshal(List<Car> Cars, File selectedFile)
            throws IOException, JAXBException {
        JAXBContext context;
        BufferedWriter writer = null;
        //creating BufferedWriter object on selected xml file
        writer = new BufferedWriter(new FileWriter(selectedFile));
        
        //getting JAXBContext object by passing Cars bean class
        context = JAXBContext.newInstance(Cars.class);
        
        //creating Marshaller object from JAXBContext object
        Marshaller m = context.createMarshaller();
        
        //formatting output XML File
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        //writing XML Files
        m.marshal(new Cars(Cars), writer);
        
        //closing IO
        writer.close();
    }
 
    // Import data from XML
    public static List<Car> unmarshal(File importFile) throws JAXBException {
        Cars cars = new Cars();
        
        //getting JAXBContext object by passing Cars bean class
        JAXBContext context = JAXBContext.newInstance(Cars.class);
        
        //creating UnMarshaller object from JAXBContext object
        Unmarshaller um = context.createUnmarshaller();
        
        //reading data from XML(unMarshal)
        cars = (Cars) um.unmarshal(importFile);
 
        //return Cars list
        return cars.getCars();
    }
}
