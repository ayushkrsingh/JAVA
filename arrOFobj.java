class Student{
    int rollno;
    String name;
    int marks;
}

public class arrOFobj {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 24;
        s1.name = "Ayush";
        s1.marks = 91;
        
        Student s2 = new Student();
        s2.rollno = 25;
        s2.name = "Tom";
        s2.marks = 67;

        Student s3 = new Student();
        s3.rollno = 26;
        s3.name = "Sid";
        s3.marks = 98;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].rollno + " " + students[i].name + " " + students[i].marks);
        }
            //-----------OR--------------

        // for(Student n : students){
        //     System.out.println(n.rollno + " " + n.name + " " + n.marks);
        // }
    }

}



// change data in this latex and convert it for my resume:
// my details:
// highschool from pioneet convent school 93.2%
// intermediate from pioneer convent school 81.4%
// currently btech Cs_Data Science 1st year from Galgotias college of edu and technology
// Skills: C language, MS office tools (Excel, Powerpoint, word), Java(basics), HTML, CSS, Javascript, Git, github, VS code, Blender hard surface modelling, 
// projects: are on my github, put sample links to edit, 

// 1st one is my portfolio sample i am working on using HTML, CSS, JS 
// https://ayushkrsingh.github.io/PORTFOLIO_2025/
 
// many CSS mini projects are at https://github.com/ayushkrsingh/Little-Codes
// one more protfolio, i made it using html and css only like 5yrs ago:
// https://ayushkrsingh.github.io/PORTFOLIO/

// hobby: Badminton, Chess
