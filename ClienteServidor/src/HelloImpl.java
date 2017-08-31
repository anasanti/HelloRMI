import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class HelloImpl extends UnicastRemoteObject implements HelloInterface{
		
	private static final long serialVersionUID = 7896795898928782846L;
	private String message;
	
	public HelloImpl (String msg) throws RemoteException {
		message = msg;
		}
		public String say() throws RemoteException {
		return message;
		}

	
}
