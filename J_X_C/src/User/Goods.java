package User;

public class Goods {
		private int id;
		private String spmc;
		private String spjc;
		private String spcd;
		private String dw;
		private String gg;
		private String baoz;
		private String ph;
		private String pzwh;
		private String gysqc;
		private String bz;
		//---------------------------------------------
		public Goods(int id, String spmc, String spjc, String spcd, String dw,
				String gg, String baoz, String ph, String pzwh, String gysqc,
				String bz) {
			super();
			this.id = id;
			this.spmc = spmc;
			this.spjc = spjc;
			this.spcd = spcd;
			this.dw = dw;
			this.gg = gg;
			this.baoz = baoz;
			this.ph = ph;
			this.pzwh = pzwh;
			this.gysqc = gysqc;
			this.bz = bz;
		}
		public Goods() {
			super();
		}
		public Goods(String spmc) {
			super();
			this.spmc = spmc;
		}
		//------------------------------------------
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		public String getSpmc() {
			return spmc;
		}
		public void setSpmc(String spmc) {
			this.spmc = spmc;
		}
		public String getSpjc() {
			return spjc;
		}
		public void setSpjc(String spjc) {
			this.spjc = spjc;
		}
		public String getSpcd() {
			return spcd;
		}
		public void setSpcd(String spcd) {
			this.spcd = spcd;
		}
		public String getDw() {
			return dw;
		}
		public void setDw(String dw) {
			this.dw = dw;
		}
		public String getGg() {
			return gg;
		}
		public void setGg(String gg) {
			this.gg = gg;
		}
		public String getBaoz() {
			return baoz;
		}
		public void setBaoz(String baoz) {
			this.baoz = baoz;
		}
		public String getPh() {
			return ph;
		}
		public void setPh(String ph) {
			this.ph = ph;
		}
		public String getPzwh() {
			return pzwh;
		}
		public void setPzwh(String pzwh) {
			this.pzwh = pzwh;
		}
		public String getGysqc() {
			return gysqc;
		}
		public void setGysqc(String gysqc) {
			this.gysqc = gysqc;
		}
		public String getBz() {
			return bz;
		}
		public void setBz(String bz) {
			this.bz = bz;
		}
		//---------------------------------------------------------------
		@Override
		public boolean equals(Object obj) {
			// 判断对象是否为空
			if (obj == null) {
				return false;
			}
			// 判断对象是否是Student类型
			if (!(obj instanceof Goods)) {
				return false;
			}
			// 类型强制转换
			Goods s = (Goods) obj;
			// 具体判断是否相等
			if (s.getSpmc().equals(this.getSpmc())) {
				return true;
			}
			return false;
		}
	
		@Override
		// 返回哈希数
		public int hashCode() {
			return (this.getSpmc()).hashCode();
		}
	
		@Override
		public String toString() {
			return this.spmc;
		}
//----------------------------------------------------------------------------------------------

}
