package collection;
import java.util.*;

public class BollywoodDepartments {
 
    public static Map<String, String> getDepartmentDetails(Set<Map<String, String>> departments, int index) {
        int i = 0;
        for (Map<String, String> dept : departments) {
            if (i == index) {
                return dept;
            }
            i++;
        }
        return null;  
    }

    public static void main(String[] args) {

        
        Set<Map<String, String>> departments = new LinkedHashSet<>();
 
        Map<String, String> actingDept = new LinkedHashMap<>();
        actingDept.put("Deepika Padukone", "Lead Actress");
        actingDept.put("Alia Bhatt", "Supporting Actress");

    
        Map<String, String> danceDept = new LinkedHashMap<>();
        danceDept.put("Nora Fatehi", "Choreographer");
        danceDept.put("Madhuri Dixit", "Classical Dance Lead");

    
        Map<String, String> fitnessDept = new LinkedHashMap<>();
        fitnessDept.put("Shilpa Shetty", "Yoga Trainer");
        fitnessDept.put("Katrina Kaif", "Fitness Ambassador");

   
        departments.add(actingDept);
        departments.add(danceDept);
        departments.add(fitnessDept);

        
        String[] departmentNames = {"Acting", "Dance", "Fitness"};

    
        int index = 0;
        for (Map<String, String> dept : departments) {
            System.out.println("Department: " + departmentNames[index++]);

            for (Map.Entry<String, String> entry : dept.entrySet()) {
                System.out.println("  " + entry.getKey() + " - " + entry.getValue());
            }
            System.out.println();
        }
 
        System.out.println("Fetching Acting Department:");
        Map<String, String> actingDetails = getDepartmentDetails(departments, 0);

        if (actingDetails != null) {
            for (Map.Entry<String, String> entry : actingDetails.entrySet()) {
                System.out.println("  " + entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}