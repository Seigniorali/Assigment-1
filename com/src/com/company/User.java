package com.company;
public class User {
    private String firstName;
    private String secondName;
    private int id;
    private static int id_gen=0;
    private int age;
    private String gender;
    private String password;
    private String dateOfBirth;
    public User(String firstName, String secondName, int age, String gender, String password, String dateOfBirth){
        setAge(age);
        setFirstName(firstName);
        setSecondName(secondName);
        setGender(gender);
        setPassword(password);
        setDateOfBirth(dateOfBirth);
        id=id_gen++;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getPassword() {
        return password;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void printValues(){
        System.out.println(getId());
        System.out.println(getFirstName());
        System.out.println(getSecondName());
        System.out.println(getGender());
        System.out.println(getAge());
        System.out.println(getDateOfBirth());
        System.out.println(getPassword());
    }
}
