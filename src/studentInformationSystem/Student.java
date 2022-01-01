package studentInformationSystem;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name, stuNo, classes;
    boolean isPass;
    double average;

    public Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3,int oral1, int oral2, int oral3) {

        if ((note1 >= 0 && note1 <= 100)) {
            this.course1.note = note1;

        }
        if ((note2 >= 0 && note2 <= 100)) {
            this.course2.note = note2;
        }
        if ((note3 >= 0 && note3 <= 100)) {
            this.course3.note = note3;
        }

        if(oral1 >=0 && oral1 <=100){
            this.course1.oralScore = oral1;
        }

        if(oral2 >=0 && oral2 <=100){
            this.course2.oralScore = oral2;
        }

        if(oral3 >=0 && oral3 <=100){
            this.course3.oralScore = oral3;
        }

    }


    void isPass(){
        System.out.println("=================================================");
        this.average = ((this.course1.note*0.8 + this.course1.oralScore*0.2) +
                (this.course2.note*0.8 + this.course2.oralScore*0.2)+
                (this.course3.note*0.8 + this.course3.oralScore*0.2))/3.0;
        if (this.average > 55){
            System.out.println(this.name +"\t"+"Successfully passed your class");
            this.isPass = true;
        }
        else{
            System.out.println(this.name +"\t"+"Successfully passed your class");
            this.isPass= false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.course1.name + "Note :" +this.course1.note);
        System.out.println(this.course2.name + "Note :" +this.course2.note);
        System.out.println(this.course3.name + "Note :" +this.course3.note);
        System.out.println("Your average :" +this.average);
    }
}
