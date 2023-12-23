public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model  = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("Miroslav");
        System.out.println("After updating, Student Details are as follows");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Evlampiy");
        student.setRollNo("10");
        return student;
    }
}