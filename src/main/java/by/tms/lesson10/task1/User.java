package by.tms.lesson10.task1;

import java.util.Objects;
import java.util.Random;

public class User implements Cloneable {
    private String name, password, groupMembership;
    private int userId;

    private boolean prohibitPasswordChange, passwordUnlimitedPeriod;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.prohibitPasswordChange = false;
        this.passwordUnlimitedPeriod = false;
        this.groupMembership = "Administrator";
        this.userId = generateUserId();
    }

    private int generateUserId() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", groupMembership='" + groupMembership + '\'' +
                ", userId=" + userId +
                ", prohibitPasswordChange=" + prohibitPasswordChange +
                ", passwordUnlimitedPeriod=" + passwordUnlimitedPeriod +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId && prohibitPasswordChange == user.prohibitPasswordChange && passwordUnlimitedPeriod == user.passwordUnlimitedPeriod && Objects.equals(name, user.name) && Objects.equals(password, user.password) && Objects.equals(groupMembership, user.groupMembership);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, groupMembership, userId, prohibitPasswordChange, passwordUnlimitedPeriod);
    }

    // ниже идут Геттеры и Сеттеры

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

    public String getGroupMembership() {
        return groupMembership;
    }

    public void setGroupMembership(String groupMembership) {
        this.groupMembership = groupMembership;
    }

    public int getUserId() {
        return userId;
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
