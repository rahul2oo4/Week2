public class emp1{
    public static void main(String[] args) {
       emp emp = new emp();
       System.out.println(emp.name);
       System.out.println(emp.id);
       System.out.println(emp.salary);

    }
}

class emp{
    String name = "gon";
    int id = 123;
    int salary = 5000;
}