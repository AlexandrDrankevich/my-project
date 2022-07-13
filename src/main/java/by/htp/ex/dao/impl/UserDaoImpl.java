package by.htp.ex.dao.impl;

import by.htp.ex.bean.User;
import by.htp.ex.dao.UserDao;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    private  Map<String, User> userCards = new HashMap<>();

    @Override
    public void addUserCard(User user) {
        userCards.put(user.getEmail(), user);
    }

    @Override
    public User getUserCard(String email) {
        return userCards.get(email);
    }

}
