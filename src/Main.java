import entrenamiento.Entrenar;
import smarthings.IPCamera;
import smarthings.IPCameraRecord;

public class Main {

	public static void main(String[] args) {
		
		Entrenar train = new Entrenar();
		train.run();
		
		new IPCameraRecord(new IPCamera(), train).run();
	}

}
