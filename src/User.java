import java.util.Objects;

public class User {
    //поля класса
    private String firstname;
    private String name;
    private String patronymic;
    private String telephone;
    private String email;
    private String login;
    private String password;

    //конструктор
    public User(String firstname, String name, String patronymic, String telephone, String email, String login, String password) {
        this.firstname = firstname;
        this.name = name;
        this.patronymic = patronymic;
        this.telephone = telephone;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    //firstname getter&setter
    //getter
    public String getFirstname() {
        return firstname;
    }
    //setter
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    //name getter&setter
    //getter
    public String getName() {
        return name;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }

    //patronymic getter&setter
    //getter
    public String getPatronymic() {
        return patronymic;
    }
    //setter
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    //telephone getter&setter
    //getter
    public String getTelephone() {
        return telephone;
    }
    //setter
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    //email getter&setter
    //getter
    public String getEmail() {
        return email;
    }
    //setter
    public void setEmail(String email) {
        this.email = email;
    }

    //login getter&setter
    //getter
    public String getLogin() {
        return login;
    }
    //setter
    public void setLogin(String login) {
        this.login = login;
    }

    //password getter&setter
    //getter
    public String getPassword() {
        return password;
    }
    //setter
    public void setPassword(String password) {
        this.password = password;
    }

    //переопределение equals() and hashCode()
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        User user = (User) o;
//
//        if (!Objects.equals(login, user.login)) return false;
//        return Objects.equals(password, user.password);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = login != null ? login.hashCode() : 0;
//        result = 31 * result + (password != null ? password.hashCode() : 0);
//        return result;
//    }

}
