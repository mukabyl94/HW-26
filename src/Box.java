public class Box <A>{
    private A age;

    public Box(A age) {
        this.age = age;
    }

    public Box() {
    }

    public A getAge() {
        return age;
    }

    public void setAge(A age) {
        this.age = age;
    }
    public static <A> A method(){
        return null;
    }

    @Override
    public String toString() {
        return "Box{" +
                "age=" + age +
                '}';
    }
}
