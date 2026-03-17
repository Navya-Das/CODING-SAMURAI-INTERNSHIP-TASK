import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
	static void saveUser(User user) {
        try {
            FileWriter fw = new FileWriter("users.txt", true);
            fw.write(user.username + "," + user.password + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving user");
        }
    }
}
