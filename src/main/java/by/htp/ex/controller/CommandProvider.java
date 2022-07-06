package by.htp.ex.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.ex.controller.impl.DoAuthorization;
import by.htp.ex.controller.impl.DoRegistration;
import by.htp.ex.controller.impl.GoToAuthorizationPage;
import by.htp.ex.controller.impl.GoToMainPage;
import by.htp.ex.controller.impl.GoToRegistrationPage;

public class CommandProvider {
	private Map<CommandName,Command>commands=new HashMap<>();
	public CommandProvider() {
		commands.put(CommandName.GO_TO_MAIN_PAGE, new GoToMainPage() );
		commands.put(CommandName.GO_TO_AUTHORIZATION_PAGE, new GoToAuthorizationPage() );
		commands.put(CommandName.GO_TO_REGISTRATION_PAGE,new GoToRegistrationPage());
		commands.put(CommandName.DO_AUTHORIZATION,new DoAuthorization());
		commands.put(CommandName.DO_REGISTRATION,new DoRegistration());
	
		
	}
	public Command getCommand(String name) {
		CommandName commandName=CommandName.valueOf(name.toUpperCase());
			return commands.get(commandName);
		
	}
	

}
