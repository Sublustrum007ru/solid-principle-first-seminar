package homework.util.impl;

import homework.User;

public class UserOperation implements Repository{
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }

    @Override
    public void report(User user) {
        System.out.println("Report user: " + user.getName());
    }
}
