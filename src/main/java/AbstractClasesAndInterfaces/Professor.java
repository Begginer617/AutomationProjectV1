package AbstractClasesAndInterfaces;

public class Professor extends User{

    Professor (String username, String password){
        super(username,password);

    }

    void giveNotes(){
        System.out.println("Give Marks");
    }
    void cancelClass(){
        System.out.println("Lesson canceled");
    }

    @Override
    void sendMessage(String message){
        System.out.println("Sending text message to students");
        System.out.println(message);
    }



}





