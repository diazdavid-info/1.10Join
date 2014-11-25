package david;

class MiHebra extends Thread{
	public void run(){
		System.out.println("[Hebra]:\tDormimos un rato");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("[Hebra]:\tTerminamos");
	}
}
public class Join {

	public static void main(String[] args) throws InterruptedException {
		MiHebra mh = new MiHebra();
		System.out.println("[Main]: Lanzamos la hebra...");
		mh.start();
//		do {
//			System.out.println("[Main]: Dormimos un rato...");
//			Thread.sleep(3000);
//			System.out.println("[Main]: Relanzamos la hebra...");
//		} while (mh.getState() != Thread.State.TERMINATED);
		
//		do {
//			System.out.println("[Main]: Dormimos un rato...");
//			Thread.sleep(3000);
//			System.out.println("[Main]: Relanzamos la hebra...");
//		} while (mh.isAlive());
		
//		System.out.println("[Main]: Dormimos un rato...");
//		mh.join();
//		System.out.println("[Main]: Relanzamos la hebra...");
		
		System.out.println("[Main]: Esperando a que termine...");
		do {
			System.out.print(".");
			mh.join(1000);
		} while (mh.isAlive());
		System.out.println();
		System.out.println("[Main]: Relanzamos la hebra...");
		mh.start();
		while(true);
	}

}
