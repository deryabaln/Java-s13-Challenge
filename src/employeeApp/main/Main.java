package employeeApp.main;

import employeeApp.model.Company;
import employeeApp.model.Employee;
import employeeApp.model.HealthPlan;
import employeeApp.model.Plan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 */
public class Main {

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData() {

        HealthPlan planX = new HealthPlan(1, "X", Plan.ADVANCE);
        HealthPlan planY = new HealthPlan(2, "Y", Plan.NORMAL);
        System.out.println(planX.getPlan().getName() + " - " + planX.getPlan().getPrice());
        String[] healthplans = new String[3];
        healthplans[0] = planX.getName();
        healthplans[1] = planY.getName();

        Employee developer1 = new Employee(1, "captain america", "captainamerica@gmail.com", "123", healthplans);
        developer1.addHealthplan(3, "X");
        System.out.println(developer1);
        String[] developerNames = new String[3];
        developerNames[0] = developer1.getFullName();
        Employee developer2 = new Employee(2, "iron man", "ironman@gmail.com", "333", healthplans);

        Company company = new Company(1, "Avengers", 100000000, developerNames);
        company.addEmployee(1, developer2.getFullName());
        System.out.println(company);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.
     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args) {
        workWithData();
    }
}
