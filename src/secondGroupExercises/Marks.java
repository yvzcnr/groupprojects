package secondGroupExercises;
//10.We have to calculate the average of marks obtained in three subjects
//by student A and by student B. Create class 'Marks' with an abstract
//method 'getPercentage' that will be returning the average percentage
//of marks. Provide implementation of abstract method in classes 'A'
//and 'B'. The constructor of student A takes the marks in three
//subjects as its parameters and the marks in four subjects as its
//parameters for student B. Test your code
public abstract class Marks {
    double geometry;
    double physics;
    double chemistry;

    public Marks(double geometry, double physics, double chemistry) {
        this.geometry = geometry;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public abstract double getPercentage();

}
class A extends Marks{

    public A(double geometry, double physics, double chemistry) {
        super(geometry,physics,chemistry);
    }
    @Override
    public double getPercentage() {
        double average=(geometry+physics+chemistry)/3;
        System.out.println("notes of Student A: "+average);
        return average;}
}
class B extends Marks{
    double painting;
    public B(double geometry, double physics, double chemistry,double painting) {
        super(geometry,physics,chemistry);
        this.painting=painting;
    }

    @Override
    public double getPercentage() {
        double average=(geometry+physics+chemistry+painting)/4;
        System.out.println("notes of Student B: "+average);
        return average;
    }
}
class MarksTest{
    public static void main(String[] args) {
        Marks [] arr={new A(65,82,90),new B(85,84,75,100)};
        for (Marks a:arr){
            a.getPercentage();
        }
    }
}