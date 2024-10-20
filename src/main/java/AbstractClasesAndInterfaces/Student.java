package AbstractClasesAndInterfaces;

public class Student extends User{
    Student (String username, String password){
        super(username, password);
    }

    @Override
    void sendMessage(String message) {

    }

    void checkNotes(){
        System.out.println("Checking marks");
    }

    void skipClass(){
        System.out.println("School skipping");
    }

}
