public class Developer extends Employee implements IWorkable {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Ad: " + name +
                ", ID: " + id +
                ", Maaş: " + salary +
                ", Dil: " + programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20; // Developer üçün 10% bonus
    }

    @Override
    public void work(){
        System.out.println(getName() + " coding Java projects...");
    }
}