package by.tms.lesson7TasksInLesson8.task1Clinic;

public class Therapist extends Doctor {
    @Override
    protected void heal() {
        System.out.println("Терапевт похилил! Выписал препараты!");
    }

    protected Doctor appointDoctor(int planToHeal) {
        return switch (planToHeal) {
            case 1 -> new Surgeon();
            case 2 -> new Dentist();
            default -> new Therapist();
        };
    }
}
