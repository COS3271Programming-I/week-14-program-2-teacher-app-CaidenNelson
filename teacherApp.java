import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class testing extends person{
}

class student2 extends student{
    public String getStudentInfo(){

        String message;

        message =  "Student " +firstName +" "+ lastName + ", age " + age;

        return message;
    }
}

class teacher extends person{

    String teachingSubject;

    public String getTeacherInfo(){

        String message;

        message =  "Teacher " +firstName +" "+ lastName + ", age " + age;

        return message;
    }

}

public class test {

    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {

        List<person> personList = new ArrayList<>();
        List<student2> studentList = new ArrayList<>();
        List<teacher> teacherList = new ArrayList<>();

        int loopLength;
        String createPerson;
        String createStudent;
        String createTeacher;

        System.out.println("Would you like to input person data? Yes or No");
        createPerson = userinput.nextLine().toLowerCase();

        if (createPerson.equals("yes")) {

            System.out.println("how many people's data are you inputting");
            loopLength = userinput.nextInt();

            for (int i = 0; i < loopLength; i++) {

                testing person1 = new testing();

                System.out.println("What is your person's first name?");
                person1.firstName = userinput.nextLine();
                person1.firstName = userinput.nextLine();

                System.out.println("What is your person's last name?");
                person1.lastName = userinput.nextLine();

                System.out.println("What is your person's gender?");
                person1.gender = userinput.nextLine();

                System.out.println("What is your person's ethnicity?");
                person1.ethnicity = userinput.nextLine();

                System.out.println("What is your person's religion?");
                person1.religion = userinput.nextLine();

                System.out.println("What is your person's age?");
                person1.age = userinput.nextInt();

                System.out.println("What is your person's weight?");
                person1.weight = userinput.nextInt();

                System.out.println("What is your person's height?");
                person1.height = userinput.nextInt();

                personList.add(person1);

            }
        }

        System.out.println("Would you like to input Student data? Yes or No");
        createStudent = userinput.nextLine().toLowerCase();
        createStudent = userinput.nextLine().toLowerCase();


        if (createStudent.equals("yes")) {

            System.out.println("how many people's data are you inputting");
            loopLength = userinput.nextInt();

            for (int j = 0; j < loopLength; j++) {

                student2 student1 = new student2();

                System.out.println("What is your person's first name?");
                student1.firstName = userinput.nextLine();
                student1.firstName = userinput.nextLine();


                System.out.println("What is your person's last name?");
                student1.lastName = userinput.nextLine();

                System.out.println("What is your person's gender?");
                student1.gender = userinput.nextLine();

                System.out.println("What is your person's ethnicity?");
                student1.ethnicity = userinput.nextLine();

                System.out.println("What is your person's religion?");
                student1.religion = userinput.nextLine();

                System.out.println("What is your person's age?");
                student1.age = userinput.nextInt();

                System.out.println("What is your person's weight?");
                student1.weight = userinput.nextInt();

                System.out.println("What is your person's height?");
                student1.height = userinput.nextInt();

                System.out.println("What is your students major");
                student1.major = userinput.nextLine();
                student1.major = userinput.nextLine();


                System.out.println("What is your students class rank");
                student1.classRank = userinput.nextLine();

                System.out.println("What is your students email");
                student1.email = userinput.nextLine();

                studentList.add(student1);

            }
        }

        System.out.println("Would you like to input Teacher data? Yes or No");
        createTeacher = userinput.nextLine().toLowerCase();

        if (createTeacher.equals("yes")) {

            System.out.println("how many people's data are you inputting");
            loopLength = userinput.nextInt();

            for(int y = 0; y<loopLength; y++){

                teacher teacher1 = new teacher();

                System.out.println("What is your person's first name?");
                teacher1.firstName = userinput.nextLine();
                teacher1.firstName = userinput.nextLine();

                System.out.println("What is your person's last name?");
                teacher1.lastName = userinput.nextLine();

                System.out.println("What is your person's gender?");
                teacher1.gender = userinput.nextLine();

                System.out.println("What is your person's ethnicity?");
                teacher1.ethnicity = userinput.nextLine();

                System.out.println("What is your person's religion?");
                teacher1.religion = userinput.nextLine();

                System.out.println("What is your person's age?");
                teacher1.age = userinput.nextInt();

                System.out.println("What is your person's weight?");
                teacher1.weight = userinput.nextInt();

                System.out.println("What is your person's height?");
                teacher1.height = userinput.nextInt();

                System.out.println("What is the subject of the teacher");
                teacher1.teachingSubject = userinput.nextLine();
                teacher1.teachingSubject = userinput.nextLine();


                teacherList.add(teacher1);

            }
        }
        int o = 1;
        int b = 1;
        int c = 1;

        for(int z = 0; z < personList.size(); z++){

            System.out.println("Person" + o + " " +personList.get(z).info());

            o++;
        }

        for(int x = 0; x<studentList.size(); x++){

            System.out.println("Student" + b + " " +studentList.get(x).getStudentInfo());

            b++;
        }

        for (int a = 0; a<teacherList.size(); a++){
            System.out.println("Teacher" + c + " " + teacherList.get(a).getTeacherInfo());

            c++;
        }
    }
}
