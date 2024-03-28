package homework.util.impl;

import homework.User;

public interface Repository {
    void save(User user);
    void report(User user);
}
