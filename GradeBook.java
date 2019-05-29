import java.util.ArrayList;

public class GradeBook {
private ArrayList <String> studentsName = new ArrayList <String> ();
private char [ ] studentGrade = {'A', 'B', 'C', 'D', 'F' };
private double [ ][ ] studentTestScores;

public String getStudentName( int studentIndex) {
return studentsName.get(studentIndex);
}

public double computeAverage(double [ ] studentTestScores) {
double totalTestScores = 0;
double studentScoreAverage;
for ( int currentTestScore = 0; currentTestScore < studentTestScores.length; currentTestScore++ ) {
 totalTestScores =  totalTestScores + studentTestScores[ currentTestScore ];
}
studentScoreAverage = totalTestScores / studentTestScores.length;
return studentScoreAverage;
}

public char getStudentGrade ( double studentAverage ) {
char studentGrade = 'Z';
if (studentAverage < 60) {
studentGrade = 'F';
} else if(studentAverage < 70) {
studentGrade = 'D';
} else if(studentAverage < 80) {
studentGrade = 'C';
} else if(studentAverage < 90) {
studentGrade = 'B';
} else if(studentAverage <= 100) {
studentGrade = 'A';
}
return studentGrade;
}
public void setStudentName (String studentName) {
studentsName.add( studentName);
}

public void setStudentScore(int studentIndex, int scoreIndex, double studentScore){
studentTestScores[studentIndex][scoreIndex] = studentScore;
}

public double [ ][ ] getStudentTestScoresArray(){
return studentTestScores;
}

 public GradeBook(int nrStudenteve, int nrScorePerStudent ){
 studentTestScores = new double [nrStudenteve ][nrScorePerStudent];
 }
 }