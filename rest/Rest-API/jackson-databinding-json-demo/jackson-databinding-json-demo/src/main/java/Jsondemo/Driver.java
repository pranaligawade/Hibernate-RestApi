package Jsondemo;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Driver {
    public static void main(String[] args)  {

        try {
            // create object mapper
            ObjectMapper mapper= new ObjectMapper();
            //read json from file and map/convert  to java pojo:
            // data/sample-lite.json
            Student s=   mapper.readValue(new File("sample-full.json"), Student.class);
         //Student s=   mapper.readValue(new File("sample-lite.json"), Student.class);
            //   print first and last name
            System.out.println("first name :"+s.getFirstName());
            System.out.println("last name: "+s.getLastName());
            // Address print strret and city
            Address tempadd= s.getAddress();
            System.out.println("street" +tempadd.getStreet());
            System.out.println("city "+tempadd.getCity());
            System.out.println("city= "+tempadd.getCity());
            System.out.println("street= "+tempadd.getStreet());
            //print out lang
             for (String templang:s.getAddress().getLanguages()){
                 System.out.println(templang);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
