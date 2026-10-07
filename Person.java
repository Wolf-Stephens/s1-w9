public class Person {
    private double height;
    public Person(double h){
        height = h;
    }
    public boolean equals(Person p){
        return this.height == p.height;
    }
}
