package org.lesson.java.shop;

public class RegistroStudenti {


    private Studente[] StudentList = new Studente[3];

   
    public RegistroStudenti(Studente Studente1, Studente Studente2, Studente Studente3) {
        this.StudentList[0] = Studente1;
        this.StudentList[1] = Studente2;
        this.StudentList[2] = Studente3;
    };

    public void getStudentList(){
        for (int i = 0; i < StudentList.length; i++){
             System.out.println(StudentList[i].getStudentName());
        }
    }


}
