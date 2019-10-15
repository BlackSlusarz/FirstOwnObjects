public class NewStudent {
     public static class Student {
            String name;
            int age;
            double grade;
            String school;

            public Student(String n, int a, double g, String s) {
                this.name = n;
                this.age = a;
                this.grade = g;
                this.school = s;
            }
            //CONVERT OBJECT WITH DATA toSTRING
            public String toString(){
             return "Name:" + this.name + " Age:"+ this.age + " Grade:"+this.grade + " School:" + this.school; }

     }
    }

