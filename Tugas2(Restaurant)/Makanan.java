
public class Makanan {
		private String nama;
		private double harga;
		private int stok;
		
		public Makanan(String nama, double harga, int stok) {
			super();
			this.nama = nama;
			this.harga = harga;
			this.stok = stok;
		}

		public String getNama() {
			return nama;
		}

		public void setNama(String nama) {
			this.nama = nama;
		}

		public double getHarga() {
			return harga;
		}

		public void setHarga(double harga) {
			this.harga = harga;
		}

		public int getStok() {
			return stok;
		}

		public void setStok(int stok) {
			this.stok = stok;
		}
		
}
