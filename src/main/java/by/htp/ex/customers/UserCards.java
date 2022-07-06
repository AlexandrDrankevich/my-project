package by.htp.ex.customers;

import java.util.HashMap;
import java.util.Map;

import by.htp.ex.bean.User;

public class UserCards {
	private static Map<String, User> userCards=new HashMap<>();

public static void addUserCard(String email,User user) {
	
	userCards.put(email, user);
}
public static User getUserCard(String email) {
	return userCards.get(email);
}
	

}
