package Person;

public class Passenger {
    private String name,airLine;
    private int age;
    private boolean isBusinessClass,isFoodMenu;

    public Passenger(String name, int age,String airLine, boolean isBusinessClass, boolean isFoodMenu) {
        this.name = name;
        this.age = age;
        this.airLine=airLine;
        this.isBusinessClass = isBusinessClass;
        this.isFoodMenu = isFoodMenu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAirLine() {
        return airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    public boolean isBusinessClass() {
        return isBusinessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        isBusinessClass = businessClass;
    }

    public boolean isFoodMenu() {
        return isFoodMenu;
    }

    public void setFoodMenu(boolean foodMenu) {
        isFoodMenu = foodMenu;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", airLine='" + airLine + '\'' +
                ", age=" + age +
                ", isBusinessClass=" + isBusinessClass +
                ", isFoodMenu=" + isFoodMenu +
                '}';
    }
}
