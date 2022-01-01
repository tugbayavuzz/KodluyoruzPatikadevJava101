package studentInformationSystem;

public class Teacher {
    String name, branch, mobilePhone;

    public Teacher(String name, String branch, String mobilePhone) { // This is Constructor. Constructor methods must have the same name as the class.
        this.name=name;
        this.branch=branch;
        this.mobilePhone=mobilePhone;
    }

    void print(){
        System.out.println("Teacher: "+ this.name);
        System.out.println("Branch: "+ this.branch);
        System.out.println("Mobile Phone: "+ this.mobilePhone);
    }

}
