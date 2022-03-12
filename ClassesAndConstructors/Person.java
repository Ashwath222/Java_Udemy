package ClassesAndConstructors;

public class Person {
    private String firstName, lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age=(age<0 || age>100)?0:age;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return (age>12 && age<20)?true:false;
    }

    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty())
            return "";
        else if(firstName.isEmpty())
            return lastName;
        else if(lastName.isEmpty())
            return firstName;
        else
            return firstName+" "+lastName;
    }
}
