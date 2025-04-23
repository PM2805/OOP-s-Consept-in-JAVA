class Parent{
    public void func(){
        System.out.println("Parrent Func()");

    }
    public void func(int a){
        System.out.println("parent Func(int)" +a);
    }
}

class Child extends Parent{
    public void func(int a){
        System.out.println(" child Func(int)"+a);
    }

}

public class MAinPolymorphisum {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();

        Parent polyObj = new Child();

        p1.func();
        p1.func(2);

        c1.func(20);

        polyObj.func(40);
        
    }
}
