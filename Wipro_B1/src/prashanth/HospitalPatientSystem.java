package prashanth;

import java.util.HashMap;
import java.util.Map;

public class HospitalPatientSystem {

    public static void main(String[] args) {

        
        Map<Integer, String> patients = new HashMap<>();

        
        patients.put(101, "Ravi");
        patients.put(102, "Anita");
        patients.put(103, "Kumar");


        patients.put(102, "Anita Sharma");


        System.out.println("Patient with ID 101: " + patients.get(101));


        if (patients.containsKey(103)) {
            System.out.println("Patient 103 exists");
        }


        System.out.println("\nAll Patients:");
        for (Map.Entry<Integer, String> entry : patients.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }


        System.out.println("\nTotal Patients: " + patients.size());


        patients.remove(101);
        System.out.println("Patient 101 removed");

        
        patients.clear();
        System.out.println("All patient records cleared");

       
        System.out.println("Total Patients after clearing: " + patients.size());
    }
}
