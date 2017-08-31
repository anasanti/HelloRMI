import java.rmi.Naming;
import java.rmi.RemoteException;
class HelloServer {
	public static void main (String[] argv) {
		try {
			
			java.rmi.registry.LocateRegistry.createRegistry(1099);
			System.out.println("RMI registry ready.");
			
		}catch (RemoteException e) {
			System.out.println("RMI registry already running.");	
		}
		
		try {
			
			Naming.rebind ("Hello", new HelloImpl ("Hello, Ana!"));
			System.out.println ("HelloServer is ready.");
			
		} 		catch (Exception e) {
				System.out.println ("HelloServer failed:");
				e.printStackTrace();
				}
		}
	}