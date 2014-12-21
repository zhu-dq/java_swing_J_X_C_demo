package User;

public class Suppliers {
		private int id;
		private String gysqc;
		private String jc;
		private String yzbm;
		private String dz;
		private String dh;
		private String cz;
		private String lxr;
		private String lxdh;
		private String khyh;
		private String dzxx;
		//-----------------------------------------------
		public Suppliers(int id, String gysqc, String jc, String yzbm,
				String dz, String dh, String cz, String lxr, String lxdh,
				String khyh, String dzxx) {
			super();
			this.id = id;
			this.gysqc = gysqc;
			this.jc = jc;
			this.yzbm = yzbm;
			this.dz = dz;
			this.dh = dh;
			this.cz = cz;
			this.lxr = lxr;
			this.lxdh = lxdh;
			this.khyh = khyh;
			this.dzxx = dzxx;
		}	
		public Suppliers(String gysqc) {
			this.gysqc = gysqc;
		}
		public Suppliers() {
		}
		//---------------------------------------------
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getGysqc() {
			return gysqc;
		}
		public void setGysqc(String gysqc) {
			this.gysqc = gysqc;
		}
		public String getJc() {
			return jc;
		}
		public void setJc(String jc) {
			this.jc = jc;
		}
		public String getYzbm() {
			return yzbm;
		}
		public void setYzbm(String yzbm) {
			this.yzbm = yzbm;
		}
		public String getDz() {
			return dz;
		}
		public void setDz(String dz) {
			this.dz = dz;
		}
		public String getDh() {
			return dh;
		}
		public void setDh(String dh) {
			this.dh = dh;
		}
		public String getCz() {
			return cz;
		}
		public void setCz(String cz) {
			this.cz = cz;
		}
		public String getLxr() {
			return lxr;
		}
		public void setLxr(String lxr) {
			this.lxr = lxr;
		}
		public String getLxdh() {
			return lxdh;
		}
		public void setLxdh(String lxdh) {
			this.lxdh = lxdh;
		}
		public String getKhyh() {
			return khyh;
		}
		public void setKhyh(String khyh) {
			this.khyh = khyh;
		}
		public String getDzxx() {
			return dzxx;
		}
		public void setDzxx(String dzxx) {
			this.dzxx = dzxx;
		}
		//-------------------------------------------------------
		@Override
		public boolean equals(Object obj) {
			// 判断对象是否为空
			if (obj == null) {
				return false;
			}
			// 判断对象是否是Student类型
			if (!(obj instanceof Suppliers)) {
				return false;
			}
			// 类型强制转换
			Suppliers s = (Suppliers) obj;
			// 具体判断是否相等
			if (s.getGysqc().equals(this.getGysqc())) {
				return true;
			}
			return false;
		}
	
		@Override
		// 返回哈希数
		public int hashCode() {
			return (this.getGysqc()).hashCode();
		}
	
		@Override
		public String toString() {
			return this.gysqc;
		}
		//----------------------------------------------------------
}
