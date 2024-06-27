package by.tms.lesson7TasksInLesson8.task1Clinic;

public class Patient {
    private int planToHeal;
    private Doctor doctor;

    public Patient(int planToHeal) {
        this.planToHeal = planToHeal;
    }

    public int getPlanToHeal() {
        return planToHeal;
    }

    public void setPlanToHeal(int planToHeal) {
        this.planToHeal = planToHeal;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
