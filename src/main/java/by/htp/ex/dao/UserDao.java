package by.htp.ex.dao;

import by.htp.ex.bean.User;

import java.util.HashMap;
import java.util.Map;

public interface UserDao {
     void addUserCard(User user);
     User getUserCard(String email);
}
