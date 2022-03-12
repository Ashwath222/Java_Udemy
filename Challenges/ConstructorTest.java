package Challenges;

public class ConstructorTest {
    private String name, email;
    private int credit;

    public ConstructorTest(){
        this("Ody", "Ody@gmail.com", 23);
    }

    public ConstructorTest(String name, String email, int credit) {
        this.name = name;
        this.email = email;
        this.credit = credit;
    }
    public ConstructorTest(String name, String email){
        this(name,email,45);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCredit() {
        return credit;
    }
}
