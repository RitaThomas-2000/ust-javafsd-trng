import java.util.*;

/**
 * The type Student list.
 */
public class StudentList {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String args[]){
        /*
        create ArrayList of Student
        */
        List<Student> arrayListObject = new ArrayList<>();
        String name="Rita";
        /*
        create 4000 objects
        */
        for(int i=1;i<=4000;i++){
            Student student = new Student();
            student.setName(name.concat(String.valueOf(i)));
            student.setAge(i);
            student.setrollNo(i);
            arrayListObject.add(student);
        }
        /*
        add one more object
        */
        Student student1 = new Student();
        student1.setName("Lisna4001");
        student1.setAge(4001);
        student1.setrollNo(4001);
        arrayListObject.add(student1);
        /*
        iterate through 4001 students and measure time taken
        */
        long currentTime1=System.currentTimeMillis();
        for (Student i:arrayListObject) {
            System.out.println(i.getName()+" "+i.getAge()+" "+i.getrollNo());
        }
        long arrayListTime=System.currentTimeMillis()-currentTime1;
        System.out.println("Time taken for ArrayList: "+arrayListTime);
        /*
        create LinkedList of Student
        */
        List<Student> linkedListObject = new LinkedList<>();
        /*
        create 4000 objects
         */
        for(int i=1;i<=4000;i++){
            Student student = new Student();
            student.setName(name.concat(String.valueOf(i)));
            student.setAge(i);
            student.setrollNo(i);
            linkedListObject.add(student);
        }
        /*
        add one more object
         */
        Student student2 = new Student();
        student2.setName("Lisna4001");
        student2.setAge(4001);
        student2.setrollNo(4001);
        linkedListObject.add(student2);
        long currentTime2=System.currentTimeMillis();
        for (Student i:linkedListObject) {
            System.out.println(i.getName()+" "+i.getAge()+" "+i.getrollNo());
        }
        long linkedListTime=System.currentTimeMillis()-currentTime2;
        System.out.println("Time taken for LinkedList: "+linkedListTime);
        /*
        create HashSet of Student
         */
        Set<Student> hashSetObject = new HashSet<>();
        /*
        create 4000 objects
         */
        for(int i=1;i<=4000;i++){
            Student student = new Student();
            student.setName(name.concat(String.valueOf(i)));
            student.setAge(i);
            student.setrollNo(i);
            hashSetObject.add(student);
        }
        /*
        add one more object
         */
        Student student3 = new Student();
        student3.setName("Lisna4001");
        student3.setAge(4001);
        student3.setrollNo(4001);
        linkedListObject.add(student3);
        /*
        iterate through 4001 students and measure time taken
         */
        long currentTime3=System.currentTimeMillis();
        for (Student i:hashSetObject) {
            System.out.println(i.getName()+" "+i.getAge()+" "+i.getrollNo());
        }
        long hashSetTime=System.currentTimeMillis()-currentTime2;
        System.out.println("Time taken for ArrayList iteration: "+arrayListTime);
        System.out.println("Time taken for LinkedList iteration: "+linkedListTime);
        System.out.println("Time taken for HashSet iteration: "+hashSetTime);
    }
}
