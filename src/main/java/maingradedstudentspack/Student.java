package maingradedstudentspack ;

import java.util.ArrayList ;

public class Student
{
    private String firstName ;
    private String lastName ;
    private ArrayList<Double> examScores ;

    public Student(String firstName, String lastName, ArrayList<Double> examScores)
    {
        this.firstName = firstName ;
        this.lastName = lastName ;
        this.examScores = examScores ;
    }

    public String getFirstName() { return firstName ; }
    public void setFirstName(String firstName) { this.firstName = firstName ; }
    public String getLastName() { return lastName ; }
    public void setLastName(String lastName) { this.lastName = lastName ; }

    public int getNumberOfExamsTaken() { return examScores.size() ; }

    public String getExamScores()
    {
        String examScoreList = "Exam scores:" ;
        for (Double s : examScores)
        {
            examScoreList += ( "\n\tExam " + (examScores.indexOf(s)+1) + " -> " + s ) ;
        }
        return examScoreList ;
    }

    public void addExamScore(double examScore) { examScores.add(examScore) ; }

    public void setExamScore(int examNumber, double examScore)
    {
        examScores.remove(examNumber-1) ;
        examScores.add(examNumber-1, examScore) ;
    }

    public double getAverageExamScore()
    {
        double sum = 0 ;
        for (Double s : examScores)
        {
            sum += s ;
        }
        return sum / examScores.size() ;
    }

    @Override
    public String toString()
    {
        return "Student name: " + firstName + " " + lastName + "\n> Average score: " +
                getAverageExamScore() + "\n> " + getExamScores() ;
    }
}