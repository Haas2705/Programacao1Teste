import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        Student[] students = {new Student("Pedro"), new Student("Maria")};
        
        System.out.println(Arrays.toString(students));
        // Resultado: [Student{name='Pedro'}, Student{name='Maria'}]
    }
    
}

class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + '}';
    }
}
