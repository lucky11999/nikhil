
import java.util.Date;
public class Main {

	public static void main(String[] args) {

		//You may test that your code works find here
		//Please check that your code works and has no
		//compilation problems before to submit
StudentGroup l=new StudentGroup(5);
  Date d=new Date(1997,8,27);
 	Student s1=new Student(80,"lucky",d,91.0);
 	Student s2=new Student(90,"sam",d,89.0);
        l.addFirst(s1);
            System.out.println(l.getStudent(0).getId());
    }
}
