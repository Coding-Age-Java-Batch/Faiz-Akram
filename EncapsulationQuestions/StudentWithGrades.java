package EncapsulationQuestions;

public class StudentWithGrades {

    private  String name;
    private int rollNo;
    private double mathGrader;
    private double scienceGrad;
    private double englishGrade;

    public StudentWithGrades(String newName, int newRollNo, double newMathGrader, double newScienceGrader, double newEnglishGrader) {
        setName(newName);
        setRollNo(newRollNo);
        setMathGrader(newMathGrader);
        setScienceGrader(newScienceGrader);
        setNewEnglishGrader(newEnglishGrader);

    }

    public void setName(String newNamee) {
        this.name=newNamee;
    }

    public void setRollNo(int newRollNumber){
        this.rollNo=newRollNumber;
    }

    public void setMathGrader(double mathGrader) {
        this.mathGrader = mathGrader;
    }

    public void setScienceGrader(double scienceGrad){
        this.scienceGrad = scienceGrad;

    }

    public void setNewEnglishGrader(double newEnglishGrader) {
        this.englishGrade = newEnglishGrader;
    }

    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public double getMathGrader(){
        return mathGrader;
    }
    public double getScienceGrader(){
        return scienceGrad;
    }
    public double getEnglishGrade(){
        return englishGrade;
    }

    public double averageGrade(){
        return (mathGrader+scienceGrad+englishGrade)/3;
    }

    public String letterGrade(){
        double avg = averageGrade();

        if (avg <=100 && avg >=80){
            return "Grade A";
        }
        else if (avg <80 && avg >= 60) {
            return "Grade B:";
        }
        else {
            return "Grade C";
        }

    }

    static void main(String[] args) {
        StudentWithGrades s = new StudentWithGrades("akram", 93, 89, 89, 98);
        System.out.println(s.letterGrade());
    }





}





//● Private fields: name (String), rollNumber (int), mathGrade (double), scienceGrade (double), englishGrade (double)
//● Constructor with name and roll number
//● Setter methods for each grade (validate grades are between 0-100)
//● Getter methods for all fields
//● getAverageGrade() method
//● getLetterGrade() method (A: 90-100, B: 80-89, C: 70-79, D: 60-69, F:
//below 60)