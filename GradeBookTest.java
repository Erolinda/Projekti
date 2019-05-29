import java.util.Scanner;

public class GradeBookTest {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner( System.in);
      String studentName;
      double studentScore;
      double [ ][ ] studentTestScores;
      double studentAverage;
      char studentGrade;
   
      final int NUMRI_STUDENTEVE = 3;
      final int NUMRI_I_SCORE_PER_STUDENT = 4;
   
      GradeBook klasa = new GradeBook(NUMRI_STUDENTEVE, NUMRI_I_SCORE_PER_STUDENT);
      studentTestScores = klasa.getStudentTestScoresArray();
   
      for( int studentet = 0; studentet < NUMRI_STUDENTEVE; studentet++ ) {
         System.out.println("Sheno Emrin e Studentit: " + (studentet + 1 ) );
         studentName = keyboard.nextLine();
         klasa.setStudentName ( studentName );
      
         for( int scorePerStudent = 0; scorePerStudent < NUMRI_I_SCORE_PER_STUDENT; scorePerStudent++ ) {
            System.out.println("Sheno score-in  e " + (scorePerStudent + 1 ) + " te " + studentName );
            studentScore = keyboard.nextDouble();
         
            while(studentScore < 0 || studentScore > 100) {
               System.out.println("Shkruani nje score brenda 0 dhe 100 " + (scorePerStudent + 1 ) + "te " + studentName);
               studentScore = keyboard.nextDouble();
            }
            keyboard.nextLine();
            klasa.setStudentScore(studentet, scorePerStudent, studentScore);
         }
      }
      for( int studentet = 0; studentet < NUMRI_STUDENTEVE; studentet++ ) {
         System.out.print(klasa.getStudentName(studentet) + "ka score " );
         studentAverage = klasa.computeAverage(studentTestScores[studentet]);
         studentGrade = klasa.getStudentGrade( studentAverage );
      
         for( int scorePerStudent = 0; scorePerStudent < NUMRI_I_SCORE_PER_STUDENT; scorePerStudent++ ) {
            if( scorePerStudent != NUMRI_I_SCORE_PER_STUDENT - 1){
               System.out.print(studentTestScores[studentet][scorePerStudent] + " " );
            } else { 
            }
         
         }
         System.out.println(", ka mesatare " + String.format("%.2f", studentAverage) + " nota " + studentGrade);
         System.out.println();
      }
   
   }
}