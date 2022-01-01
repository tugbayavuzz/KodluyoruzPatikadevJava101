package studentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Tugba", "MATH","1111");
        Teacher t2 = new Teacher("Jane", "PHY","1154");
        Teacher t3 = new Teacher("George", "LIT","0101");


        Course math = new Course( "Mathematics", "101", "MATH");
        math.addTeacher(t1);

        Course phy = new Course( "Physics", "102", "PHY");
        phy.addTeacher(t2);

        Course lit = new Course( "Literature", "103", "LIT");
        lit.addTeacher(t3);


        Student s1 = new Student("Tugba", "10","4",math,phy,lit);
        s1.addBulkExamNote(100,100,100,99,90,98);
        s1.isPass();

        Student s2 = new Student("Defne", "12","4",math,phy,lit);
        s2.addBulkExamNote(55,77,39,85,80,70);
        s2.isPass();



    }
}
