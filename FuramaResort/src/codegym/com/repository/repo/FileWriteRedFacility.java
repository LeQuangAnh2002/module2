package codegym.com.repository.repo;

import codegym.com.model.facility.Facility;
import codegym.com.model.facility.House;
import codegym.com.model.facility.Room;
import codegym.com.model.facility.Villa;
import codegym.com.model.person.Customer;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FileWriteRedFacility {
    static Map<Facility,Integer> facilityMap = new LinkedHashMap<>();

    static {
        Facility villa1 = new Villa("V01", "Villa", 500, 10, "FullTime", "5 sao", 15.2, 3);
        Facility villa2 = new Villa("V02", "Villa", 450, 8, "FullTime", "2 sao", 10.2, 3);
        Facility house1 = new House("H01", "House", 200, 5, "PartTime", "1 sao", 5);
        facilityMap.put(villa1, 5);
        facilityMap.put(villa2, 0);
        facilityMap.put(house1, 0);

    }


    public Map<Facility,Integer> docNho(){

         return facilityMap;

    }
    public void addVilla(Facility facility){
        facilityMap.put(facility,0);
        System.out.println("Lưu thành công!!!");
    }



}
