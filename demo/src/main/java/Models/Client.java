package Models;

public class Client extends Entity<Integer> {
    private String mail; //adresa de mail
    private String password; // parola de logare
    private String NameClient; //nume fam + prenume

    @Override
    public String toString() {
        return "Client{" +
                "username='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", NameClient='" + NameClient + '\'' +

                '}';
    }

    public String getUsername() {
        return mail;
    }

    public void setUsername(String username) {
        this.mail = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameClient() {
        return NameClient;
    }

    public void setNameClient(String nameClient) {
        NameClient = nameClient;
    }


    public Client(String username, String password, String nameClient) {
        this.mail = username;
        this.password = password;
        NameClient = nameClient;
    }
}