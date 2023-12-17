import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ArrayList класса Goods
        ArrayList<Goods> goods = new ArrayList<>();
        //ArrayList класса User
        ArrayList<User>users = new ArrayList<>();
        while(true) {
            System.out.println("1-Зарегистрироваться\n2-Авторизироваться\n3-Авторизироваться как администратор\n0-выход из программы");
            int inputMenu = in.nextInt();
            //реализация пропуска строки
            in.nextLine();
            switch (inputMenu){
                case 1:
//Регистрация пользователя---------------------------------------------------
                    System.out.println("Регистрация нового пользователя.");
                    //фамилия
                    System.out.println("введите фамилию для регистрации пользователя:");
                    String firstname = in.nextLine();
                    if(firstname.matches( "[А-Я а-я A-Z a-z ]{1,}")) {
                        System.out.println("успешно для регистрации");
                    }else{
                        System.out.println("условие для регистрации не верно");
                        return;
                    }
                    //имя
                    System.out.println("введите имя для регистрации пользователя");
                    String name = in.nextLine();
                    if(name.matches( "[А-Я а-я A-Z a-z ]{1,}")) {
                        System.out.println("успешно для регистрации");
                    }else{
                        System.out.println("условие для регистрации не верно");
                        return;
                    }
                    //отчество
                    System.out.println("введите отчество для регистрации пользователя");
                    String patronymic = in.nextLine();
                    if(patronymic.matches( "[А-Я а-я A-Z a-z ]{1,}")) {
                        System.out.println("успешно для регистрации");
                    }else{
                        System.out.println("условие для регистрации не верно");
                        return;
                    }
                    //телефон
                    System.out.println("введите телефон для регистрации пользователя");
                    String telephone = in.nextLine();
                    if(telephone.matches( "(\\+7|7|8)+(\\d{10})")) {
                        System.out.println("успешно для регистрации");
                    }else{
                        System.out.println("условие для регистрации не верно");
                        return;
                    }
                    //почта
                    System.out.println("введите эл.почту для регистрации пользователя");
                    String email = in.nextLine();
                    if(email.matches( "[A-Z a-z]{1,}+(.|!|_|-|:|$|#|=|;|~)?(\\d{1,}+(@)+(gmail|yandex|yahoo|mail)+(.)+(ru|com))")) {
                        System.out.println("успешно для регистрации");
                    }else{
                        System.out.println("условие для регистрации не верно");
                        return;
                    }
                    //реализация пропуска строки
//                    in.nextLine();
                    //логин
                    System.out.println("введите логин для регистрации пользователя");
                    String login = in.nextLine();
                    if(login.matches( "[A-Z a-z]{1,}+(.|!|_|-|:|$|#|=|;|~)?(\\d{1,})?")) {
                        System.out.println("успешно для регистрации");
                    }else{
                        System.out.println("условие для регистрации не верно");
                        return;
                    }
                    System.out.println("введите пароль для регистрации пользователя");
                    String password = in.nextLine();
                    if(password.matches( "[A-Z a-z]{1,}+(.|!|_|-|:|$|#|=|;|~|%|\\*|)?(\\d{1,})?")) {
                        System.out.println("успешно для регистрации");
                    }else{
                        System.out.println("условие для регистрации не верно");
                        return;
                    }

                    //добавление объекта класса User в ArrayList users
                    users.add(new User(firstname,name,patronymic,telephone,email,login,password));
                    System.out.println("Зарегистрирован новый пользователь.");

                    break;
                case 2:
//Авторизация пользователя-----------------------------------------------------
                    System.out.println("Авторизация пользователя.");

//                    System.out.println("введите фамилию пользователя для входа:");
//                     String firstnameUser = in.nextLine();
//                    System.out.println("введите имя пользователя для входа");
//                     String nameUser = in.nextLine();
//                    System.out.println("введите отчество пользователя для входа");
//                     String patronymicUser = in.nextLine();
//                    System.out.println("введите телефон пользователя для входа");
//                     String telephoneUser = in.nextLine();
//                    System.out.println("введите эл.почту пользователя для входа");
//                     String emailUser = in.nextLine();
                    System.out.println("введите логин пользователя для входа");
                    String loginUser = in.nextLine();
                    System.out.println("введите пароль пользователя для входа");
                    String passwordUser = in.nextLine();

                    //переборка учет. записей в ArrayList под названием users
                    for(User user: users){
                        if(Objects.equals(user.getLogin(), loginUser) && Objects.equals(user.getPassword(), passwordUser)){
                            System.out.println("Пользователь авторизован.");
                        }
                        else{
                            System.out.println("введены неверные данные.");
                            return;
                        }
                    }

                    //        User user1 = new User(firstnameUser, nameUser, patronymicUser, telephoneUser, emailUser, loginUser, passwordUser);
                    //        for(User item:users){
                    //            System.out.println(user1.equals(item));
                    //        }

                    //if(!findUser(loginUser,passwordUser,users)){
                    // System.out.println("введены неверные данные.");
                    //}
//                    System.out.println("введены неверные данные.");


                    //просмотр товаров авторизированным пользователем
                    System.out.println("Посмотреть все товары..? Введите 1");
                    switch (in.nextLine()) {
                        case "1":

                            for (Goods gds : goods) {
                                System.out.println(gds);
                            }
                    }

                    break;
                case 3:
//Авторизация администратора---------------------------------------------------
                    //добавление администратора сразу
                    //String adminLogin = "admin";
                    String adminPass = "pass";

                    System.out.println("Авторизация как администратор");

                    System.out.println("Введите логин:");
                    String adminLoginIN = in.nextLine();
                    System.out.println("Введите пароль:");
                    String adminPassIn = in.nextLine();

                    if(adminLoginIN.matches("(admin|admin@gmail.com)") && adminPassIn.matches(adminPass)){
                        System.out.println("Администратор авторизирован.");
                    }
                    else{
                        System.out.println("введены неверные данные авторизации администратора.");
                    }
                    //манипуляции администратором
                    System.out.println("введите 1 для добавления товара.\nвведите 2 чтобы посмотреть информацию о пользователях.\nвведите 3 для просмотра товаров\n ");
                    switch (in.nextLine()) {
                        case "1":
                            //объект класса Goods
                            Goods goods1 = new Goods();

                            System.out.println("добавьте товар");

                            System.out.println("введите название товара:");
                            goods1.setNomination(in.nextLine());
                            //String nomination = in.nextLine();
                            System.out.println("введите цену товара");
                            goods1.setPrice(in.nextInt());
                            //double price = in.nextInt();
                            in.nextLine();

                            System.out.println("'да') подтвердить добавление товара\n'нет') отменить добавление товара");

                            boolean stop;
                            do {
                                stop = false;
                                switch (in.nextLine()) {
                                    case "да":
                                        goods.add(goods1);
                                        break;
                                    case "нет":

                                        break;
                                    default: stop = true;
                                }
                            }while (stop);
                            break;

                        case "2":
                            System.out.println("вывод всех пользователей");
                            for(User user2:users){
                                System.out.println(user2);
                            }
                            break;

                        case "3":
                            //просмотр товаров администратором
                            System.out.println("Посмотреть все товары..? Нажмите 'да' ");
                            switch (in.nextLine()) {
                                case "да":
                                    for (Goods gds : goods) {
                                        System.out.println(gds);
                                    }

                                    //удаление позиции товара
                                    System.out.println("удалить товар..? Введите 1");
                                case "1":
                                    in.nextLine();
                                    System.out.println("Введите значение товара для его удаления");
                                    if(goods.remove(in.nextLine())){
                                        for(Goods gds1:goods) {
                                            System.out.println(gds1);
                                        }
                                    }else{
                                        System.out.println("Удаление не было завершено");
                                    }

                            }
                            break;
                    }

                    break;
                case 0:
                    System.out.println("Выход - выход из программы");
                    return;

            }

        }

    }
//    static boolean findUser(String login, String password, ArrayList<User>users){
//        for(User user: users){
//                        if(user.getLogin().equals(login) && user.getPassword().equals(password)){
//                            System.out.println("Пользователь авторизован.");
//                            return true;
//                        }
//                   }
//        return false;
//       }
}