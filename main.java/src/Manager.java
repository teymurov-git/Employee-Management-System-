public class Manager extends Employee implements IWorkable {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Ad: " + name +
                ", ID: " + id +
                ", Maaş: " + salary +
                ", Dil: " + teamSize;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.30; // Developer üçün 10% bonus
    }

    @Override
    public void work(){
        System.out.println(getName() + "coding Java projects...");
    }
}
