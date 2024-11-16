package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        executeTasks();
    }

    public static void executeTasks() {
        Healthplan basicPlan = new Healthplan(1, "Basic Plan", Plan.BASIC);
        System.out.println(basicPlan);

        String[] healthplans = new String[3];
        Employee employee = new Employee(1, "John Doe", "john@example.com", "password123", healthplans);
        employee.addHealthPlan(0, basicPlan.getName());
        employee.addHealthPlan(1, "Premium Plan");
        System.out.println(employee);

        String[] developers = new String[5];
        Company company = new Company(1, "Tech Corp", 50000, developers);
        company.addEmployee(0, "Alice");
        company.addEmployee(1, "Bob");
        System.out.println(company);
    }
}
