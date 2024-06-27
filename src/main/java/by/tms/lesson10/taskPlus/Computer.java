package by.tms.lesson10.taskPlus;

public class Computer implements Cloneable {
    private String typeComputer;

    public Computer(String typeComputer) {
        this.typeComputer = typeComputer;
    }

    public String getTypeComputer() {
        return typeComputer;
    }

    public void setTypeComputer(String typeComputer) {
        this.typeComputer = typeComputer;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
