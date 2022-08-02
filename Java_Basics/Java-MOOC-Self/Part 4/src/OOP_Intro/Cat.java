package OOP_Intro;

public class Cat extends Dog {
    public Cat(String givenName, int age) {
        super(givenName);
        this.age = age;     // protected variable can be accessed from the Cat class since it is a subclass of Dog
    }

    public boolean catBelowTenYears() {
        return (this.age < 10 && this.age > 0);
    }
}
