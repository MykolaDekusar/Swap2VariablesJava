package def;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		int y = 10;
		System.out.println("X vale: "+x);
		System.out.println("Y vale: "+y);
		System.out.println("Ora proviamo a cambiare i valori usando una terza variabile");
		int z = x;
		x=y;
		y=z;
		System.out.println("X vale: "+x);
		System.out.println("Y vale: "+y);
		
	}

}
