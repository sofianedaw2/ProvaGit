import java.io.*;

public class MainApp {

	/**
	 * Main function
	 * @param args
	 */
	public static void main(String[] args){

		int option = showMenu();
		while(option != 0){
			switch(option){
				case 1:
					addNewUser();
					break;
				case 2:
					break;
				case 3:
					break;
				case 0:
					break;
			}
			option = showMenu();
		}

	}

	/**
	 * Displays a menu and returns option selected
	 * @return option selected
	 */
	public static int showMenu() {
		int result = -1;
		boolean readingError = true;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		while(readingError){
			System.out.println("\tMenu");
			System.out.println("==========");
			System.out.println("1. - Add new User");
			System.out.println("2. - Modify existing User");
			System.out.println("3. - Delete User");
			System.out.println("0. - Exit");
			try{
				String option = buffer.readLine();	
				result = Integer.parseInt(option);
				readingError = false;
			}catch(Exception e){
				readingError = true;
			}
		}		
		return result;
	}

	/**
	 * Asks user for User properties and creates a new one
	 * @return
	 */
	public static User addNewUser() {
		int id, age; id = age = -1;
		String name, surname; name = surname = "";
		boolean readingError;
		do {
			try{
				BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("id:");
				id = Integer.parseInt(buffer.readLine());
				System.out.println("Name:");
				name = buffer.readLine();
				System.out.println("Surname:");
				surname = buffer.readLine();
				System.out.println("age:");
				age = Integer.parseInt(buffer.readLine());
				readingError = false;
			}catch(Exception e){
				System.out.println("Incorrect value!!");
				readingError = true;
			}
		} while(readingError);
		return new User(id, name, surname, age);
	}

}