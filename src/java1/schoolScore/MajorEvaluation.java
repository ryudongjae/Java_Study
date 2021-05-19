package java1.schoolScore;

public class MajorEvaluation implements GradeEvaluation{
    @Override
    public String getGrade(int point) {
        String grade;

        if(95<= point && 100 >= point){
            grade = "A+";
        }else if(90<= point && 95 > point){
            grade = "A";
        }else if(85<= point && 90 > point){
            grade = "B+";
        }else if (80<= point && 85 > point) {
            grade = "B0";
        }else if(70<= point && 80 > point){
            grade = "C";
        }else if(60 <= point && 70>point){
            grade ="D";
        }else {
            grade = "F";
        }
    return grade;
    }
}
