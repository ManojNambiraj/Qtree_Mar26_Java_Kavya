package MyAbstract;

abstract class Marks{
    abstract void studentMarks();
}

class Raj extends Marks{
    int tamil;
    int english;

    Raj(int t, int e){
        this.tamil = t;
        this.english = e;
    }

    void studentMarks(){
        System.out.println("Tamil: " + this.tamil + " " + "English: " + this.english);
    }
}

public class Student {
    static void main(String[] args) {
        Raj raj = new Raj(50,66);

        raj.studentMarks();
    }
}
