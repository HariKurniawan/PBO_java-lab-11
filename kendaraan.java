package abstrak;

public abstract class Kendaraan {
	private String merk ;
	private String model ;
	private int jumlahRoda ;
	
	public String getMerk() {
		return this.merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}	
	public String getModel() {
		return this.model;
	}
		public void setModel(String model) {
		this.model = model;
	}
	public int getJumlahRoda() {
		return this.jumlahRoda;
	}
	public void setJumlahRoda(int jumlahRoda) {
		this.jumlahRoda = jumlahRoda;
	}
	
	public abstract void nyalakan();
//	public User(String merk, String model, int jumlahRoda) {
//		this.merk = merk;
//		this.model = model;
//		this.jumlahRoda = jumlahRoda;
//	}
}


class Main {
    public static void main(String args[]) {
        Kendaraan MyKendaraan = new Kendaraan(); //buat objek kendaraan
        MyKendaraan.getMerk();
		MyKendaraan.getModel();
		MyKendaraan.getJumlahRoda();
    }
}