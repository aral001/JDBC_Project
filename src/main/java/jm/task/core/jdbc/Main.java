package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Aral", "Imankulov", (byte) 26);
        userService.saveUser("Cristiano", "Ronaldo", (byte) 35);
        userService.saveUser("Mike", "Tyson", (byte) 45);
        userService.saveUser("Arnold", "Swarzenegger", (byte) 67);
        List<User> users = userService.getAllUsers();
        System.out.println(users);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
