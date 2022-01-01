package studentInformationSystem;

public class Course {

    Teacher teacher;//we produced reference in Teacher class
    String name, code, prefix;
    int note;
    int oralScore;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.oralScore = 0;
        this.note = 0;
    }

    void addTeacher(Teacher teacher){

        if(teacher.branch.equals(this.prefix)){
            this.teacher =  teacher;
        }
        else
        {
            System.out.println("The teacher and course sections do not match ");
        }

    }

    void printTeacher(){
        this.teacher.print();
    }
}
