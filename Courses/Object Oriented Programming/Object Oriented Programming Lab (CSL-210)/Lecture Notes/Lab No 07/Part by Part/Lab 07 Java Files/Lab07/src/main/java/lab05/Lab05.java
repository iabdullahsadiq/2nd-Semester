package lab05;

public class Lab05 {

    public static void main(String[] args) {
        
        PhysicsTeacher t1 = new PhysicsTeacher();
        t1.setname ("Shahwaiz Ahmed");
        System.out.println(t1.getname());
        System.out.println(t1.getdesignation());
        System.out.println(t1.getuniName());
        System.out.println(t1.getmainSubject());
        t1.Does();
        
        Student s1 = new Student();
        // s1.setname("Abdullah Sadiq");
    }
}
