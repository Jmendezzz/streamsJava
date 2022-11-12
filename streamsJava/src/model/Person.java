package model;

public class Person {
    private int age;
    private String name;
    private String id;
    private String email;
    private String cellphoneNumber;

    public Person(int age, String name, String id, String email, String cellphoneNumber) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.email = email;
        this.cellphoneNumber = cellphoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }
}
