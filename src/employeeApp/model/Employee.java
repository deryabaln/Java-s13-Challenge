package employeeApp.model;

import java.util.Arrays;

public class Employee {

   private int id;
   private String fullName;
   private String email;
   private String password;
   private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public void addHealthplan(int index, String name){
        try {
            if (healthplans[index] == null) {
                healthplans[index] = name;
            } else {
                System.out.println("Index is full.");
            }
        }catch (ArrayIndexOutOfBoundsException ex ){
            System.out.println("index not found" +  ex.getMessage());
        }
    }

    @Override
    public String toString() {
        return "FullName: " + fullName + " Healthplans: " + Arrays.toString(healthplans);
    }
}
