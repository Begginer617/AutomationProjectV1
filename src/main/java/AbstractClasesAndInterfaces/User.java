package AbstractClasesAndInterfaces;

abstract class User {
    String username;
    String password;
    String name;
    String lastName;

     User(String password, String name) {
        this.password = password;
        this.name = name;
    }

    void login(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            System.out.println("Logging user:" + username + "/" + password + "\n" + "Logging successful");
        } else System.out.println("Incorrect password and/or username.");

    }

    void logOut() {
        System.out.println("Logged off");
    }


    abstract void sendMessage(String message);

}


