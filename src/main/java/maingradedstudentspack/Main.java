package maingradedstudentspack ;

import java.util.ArrayList ;

public class Main
{
    public static void main(String[] args)
    {
        Student zack = new Student("zack", "rivera", new ArrayList<Double>() ) ;
        zack.addExamScore(99) ;
        zack.addExamScore(100) ;
        zack.addExamScore(101) ;
        zack.addExamScore(69) ;

        Student bobby = new Student("bobby", "j", new ArrayList<Double>() ) ;
        bobby.addExamScore(46) ;
        bobby.addExamScore(13) ;
        bobby.addExamScore(175) ;
        bobby.addExamScore(27) ;

        Student curly = new Student("curly", "fry", new ArrayList<Double>() ) ;
        curly.addExamScore(95) ;
        curly.addExamScore(100) ;
        curly.addExamScore(9) ;
        curly.addExamScore(58) ;

        Student[] studs = new Student[3] ;

        studs[0] = zack ;
        studs[1] = bobby ;
        studs[2] = curly ;

        Classroom goalDiggers = new Classroom(studs) ;

        System.out.println(goalDiggers.getStudentsByScore());

    }
}