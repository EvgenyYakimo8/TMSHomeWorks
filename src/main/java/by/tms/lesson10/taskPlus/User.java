package by.tms.lesson10.taskPlus;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class User implements Cloneable {

    private Computer computer;
    private String name, password;
    private String[] groupMembership;
    private int userId;

    private boolean prohibitPasswordChange, passwordUnlimitedPeriod;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.prohibitPasswordChange = false;
        this.passwordUnlimitedPeriod = false;
        this.groupMembership = new String[]{"Users", "Administrators"};
        this.userId = generateUserId();
        this.computer = new Computer("Notebook");
    }

    private int generateUserId() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object deepclone() throws CloneNotSupportedException {
        User userCloned = (User) super.clone();
        Computer cloneComputer = (Computer) userCloned.getComputer().clone();
        userCloned.setComputer(cloneComputer);
        return userCloned;
    }


    @Override
    public String toString() {
        return "User{" +
                "computer (адресс в памяти) = " + computer +
                "    computer = " + computer.getTypeComputer() +
                ",   name = '" + name + '\'' +
                ",   password = '" + password + '\'' +
                ",   groupMembership = " + Arrays.toString(groupMembership) +
                ",   userId = " + userId +
                ",   prohibitPasswordChange = " + prohibitPasswordChange +
                ",   passwordUnlimitedPeriod = " + passwordUnlimitedPeriod +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId && prohibitPasswordChange == user.prohibitPasswordChange && passwordUnlimitedPeriod == user.passwordUnlimitedPeriod && Objects.equals(computer, user.computer) && Objects.equals(name, user.name) && Objects.equals(password, user.password) && Arrays.equals(groupMembership, user.groupMembership);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(computer, name, password, userId, prohibitPasswordChange, passwordUnlimitedPeriod);
        result = 31 * result + Arrays.hashCode(groupMembership);
        return result;
    }

    // ниже идут Геттеры и Сеттеры


    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setTypeOfComputer(String computer) {
        this.computer.setTypeComputer(computer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getGroupMembership() {
        return groupMembership;
    }

    public void setGroupMembership(String[] groupMembership) {
        this.groupMembership = groupMembership;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isProhibitPasswordChange() {
        return prohibitPasswordChange;
    }

    public void setProhibitPasswordChange(boolean prohibitPasswordChange) {
        this.prohibitPasswordChange = prohibitPasswordChange;
    }

    public boolean isPasswordUnlimitedPeriod() {
        return passwordUnlimitedPeriod;
    }

    public void setPasswordUnlimitedPeriod(boolean passwordUnlimitedPeriod) {
        this.passwordUnlimitedPeriod = passwordUnlimitedPeriod;
    }
}


