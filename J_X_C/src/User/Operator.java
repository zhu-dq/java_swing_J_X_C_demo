package User;
public class Operator {
		private int id;
		private String dlmc;
		private String yhxm;
		private String mm;
		private int qx;
		//-------------------------------------------------------
			public Operator(int id, String dlmc, String yhxm, String mm, int qx) {
				super();
				this.id = id;
				this.dlmc = dlmc;
				this.yhxm = yhxm;
				this.mm = mm;
				this.qx = qx;
			}
		
			public Operator() {
				super();
			}
		
			public Operator(String dlmc) {
				super();
				this.dlmc = dlmc;
			}

//-------------------------------------------------------------------------
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		public String getDlmc() {
			return dlmc;
		}
		public void setDlmc(String dlmc) {
			this.dlmc = dlmc;
		}
		public String getYhxm() {
			return yhxm;
		}
		public void setYhxm(String yhxm) {
			this.yhxm = yhxm;
		}
		public String getMm() {
			return mm;
		}
		public void setMm(String mm) {
			this.mm = mm;
		}
		public int getQx() {
			return qx;
		}
		public void setQx(int qx) {
			this.qx = qx;
		}
		//-------------------------------------------------------------------
		@Override
		public boolean equals(Object obj) {
	                //判断对象是否为空
			if (obj==null) {
				return false;
				
			}
	                 //判断对象是否是Student类型
			if (!(obj instanceof Operator)) {
				return false;
				
			}
	                //类型强制转换
			Operator s=(Operator) obj;
	                //具体判断是否相等
			if (this.getDlmc().equals(s.getDlmc())){
				return true;
			}
			return false;
			
		}
		@Override
	               //返回哈希数
		public int hashCode() {
			return (this.getDlmc()).hashCode();
		}

		@Override
		public String toString() {
			return this.dlmc;
		}
		
		
	}