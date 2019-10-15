
public class StudentsDB {
    public static void main(String[] args) {
        // ENTERING DATA TO OBJECT
        // NewStudent.Student mike = new NewStudent.Student("Mike", 20, 4.5, "Montgomery");
        // NewStudent.Student falk = new NewStudent.Student("Falk", 20, 6.7, "Boltimore");

        //CREATING ARRAY OF OBJECTS TO PRINT IT LATER
        StringBuilder sb = new StringBuilder();
        NewStudent.Student[] students = new NewStudent.Student[10];
        students[0] = new NewStudent.Student("Falk", 20, 6.7, "Boltimore");
        students[1] = new NewStudent.Student("Mike", 20, 4.5, "Montgomery");

        //LOOP OVER ARRAY USING STRING BUILDER
        for (int i = 0; i < students.length; i++) {
            sb.append(students[i]);
        }
        // QUICK CONVERT TO STRING AND PRINTLN
        String arrayOfStudents = sb.toString();
        System.out.println(arrayOfStudents);
    }
}



