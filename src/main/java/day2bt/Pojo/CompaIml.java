package day2bt.Pojo;


public class CompaIml implements Compa {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void painting(long id, String name, double radius) {
        System.out.println(name + " ve thanh cong hinh tron ban kinh "+radius);
    }

    @Override
    public Student getStudent(long id) {
        return studentService.find(id);
    }
}
