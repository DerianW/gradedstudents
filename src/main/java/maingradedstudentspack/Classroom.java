package maingradedstudentspack ;

import java.util.Arrays ;

public class Classroom
{
    private Student[] students ;
    private int maxNumberOfStudents ;

    public Classroom(int maxNumberOfStudents) { this.maxNumberOfStudents = maxNumberOfStudents ; }
    public Classroom(Student[] students) { this.students = students ; }
    public Classroom() { this.students = new Student[30] ; }

    public Student[] getStudents() { return students ; }

    public double getAverageExamScore()
    {
        double sum = 0 ;
        for (Student s : students)
        {
            sum += s.getAverageExamScore() ;
        }
        return sum / students.length ;
    }

    public void addStudent(Student student)
    {
        for (int i = 0; i < students.length; i++)
        {
            if (students[i] == null)
            {
                students[i] = student ;
                break ;
            }
        }
    }

    public void removeStudent(String firstName, String lastName)
    {
        for (int i = 0; i < students.length; i++)
        {
            if ( (students[i].getFirstName() == firstName) &&
                    (students[i].getLastName() == lastName) )
            {
                students[i] = null ;
                break ;
            }
        }
        for (int i = 0; i < students.length; i++)
        {
            if (students[i] == null)
            {
                for (int x = 0; x < students.length ; x++)
                {
                    students[x] = students[x+1] ;
                }
                break ;
            }
        }
    }

    public Student[] getStudentsByScore()
    {
        Arrays.sort(students) ;
        return students ;
    }

    public String getGradeBook()
    {
        String gradeBook = "" ;
        for (Student s : students)
        {
            if (s.getAverageExamScore() > getAverageExamScore()*.9 )
            {
                gradeBook += s.getFirstName() + ": A\n" ;
            }
            else if (s.getAverageExamScore() > getAverageExamScore()*.71 )
            {
                gradeBook += s.getFirstName() + ": B\n" ;
            }
            else if (s.getAverageExamScore() > getAverageExamScore()*.5 )
            {
                gradeBook += s.getFirstName() + ": C\n" ;
            }
            else if (s.getAverageExamScore() > getAverageExamScore()*.11 )
            {
                gradeBook += s.getFirstName() + ": D\n" ;
            }
            else gradeBook += s.getFirstName() + ": F\n" ;
        }
        return gradeBook ;
    }
}