import java.io.IOException;

import server.Server;
import servercommunication.*;
import coreClasses.*;

import com.google.gson.Gson;

public class Temp 
{
	public static void main(String [] args)
	{
//		Server server = new Server();
//		try {
//			server.runServer();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ServerCommunicator t = new ServerCommunicator();
		ServerMessage m = t.sendServerMessage(new ServerMessage("Login", "bop"));
		Product p1 = new Product(0, "hello", "hi", 0, 0, 0, 0, 0, 0);
		Gson g = new Gson();
		ServerMessage m1 = new ServerMessage("Register", g.toJson(p1));
		ServerMessage i = t.sendServerMessage(m1);
	}
}
