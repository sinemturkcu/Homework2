package JavaKampı.Homework2;

public class Main {
    public static void main(String[] args) {

        Course course1 =new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)","21 days","Engin Demirog");
        Course course2 =new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","16 days","Engin Demirog");
        Course course3 =new Course(3,"Programlamaya Giriş İçin Temel Kurs","guideline ","Engin Demirog");

        Course [] courses ={course1, course2, course3};

        for (Course course:courses) {
            System.out.println(course.name);
        }

        CourseManager coursemanager =new CourseManager();
        coursemanager.addCourse(course1);

        Category category1= new Category(1,"Software",3);

        UserRegister register1= new UserRegister(1111,"Sinem Türkçü", "sinemturkcu@gmail.com",123);
        UserRegister register2= new UserRegister(1112,"Beyazıt ", "beyazıt@gmail.com",458);
        UserRegister register3= new UserRegister(1148,"Gizem","gizem@gmail.com",589);

        UserRegister[] registers ={register1,register2,register3};
        for (UserRegister register:registers) {
            System.out.println(register.name);
        }

        RegisterManager registerManager=new RegisterManager();
        registerManager.addRegister(register2.name);











    }
}
