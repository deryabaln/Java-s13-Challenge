package employeeApp.model;

public class HealthPlan {
    private int id;
    private String name;
    private  Plan plan;

    public HealthPlan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString(){
        return "Healtplan = " + "id: " + id + " name: " + name + " plan: " + plan;
    }
}
