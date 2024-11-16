package org.example;


public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
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

    public String[] getHealthPlans() {
        return healthPlans;
    }
    public void addHealthPlan(int index, String planName) {
        if (index >= 0 && index < healthPlans.length) {
            if (healthPlans[index] == null) {
                healthPlans[index] = planName;
            } else {
                System.out.println("Bu indeks zaten dolu.");
            }
        } else {
            System.out.println("Geçersiz indeks.");
        }
    }

}
