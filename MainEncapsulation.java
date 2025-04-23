class Employee{

  private int id;
  private String name;
  
   public void setId(int id){
    this.id=id;
   }

   public void setName(String name){
    this.name=name;
   }

   public int getId(){
    return id;
   }
   public String getName(){
    return name;

   }
}


public class MainEncapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setId(1);
        emp.setName("Mahi");

        System.out.println("Employee Id : "+emp.getId());

        System.out.println("Emplpyee Name : "+emp.getName());

    }
}
