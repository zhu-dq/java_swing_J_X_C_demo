package User;

public class User {

					private int uId;
					private String uqc;
					private String ujc;
					private String uAdress;
					private String email;
					private String ukhyh;
					private String uyhzh;
					private String uuzbm;
					private String ucz;
					private String ulxr;
					private String udh;
					private String ugsdh;

	// -----------------------------------------------------------------

					

					public User(int uId, String uqc, String ujc,
							String uAdress, String email, String ukhyh, String uyhzh,
							String uuzbm, String ucz, String ulxr, String udh,String ugsdh) {
						this.uId = uId;
						this.uqc = uqc;
						this.ujc = ujc;
						this.uAdress = uAdress;
						this.email = email;
						this.ukhyh = ukhyh;
						this.uyhzh = uyhzh;
						this.uuzbm = uuzbm;
						this.ucz = ucz;
						this.ulxr = ulxr;
						this.udh = udh;
						this.ugsdh=ugsdh;
					}
				
				public User() {
				}
				public User(String uqc) {
					this.uqc = uqc;
				}

	// -------------------------------------------------

						public int getuId() {
							return uId;
						}
					
						public void setuId(int uId) {
							this.uId = uId;
						}
					
						public String getUqc() {
							return uqc;
						}
					
						public void setUqc(String uqc) {
							this.uqc = uqc;
						}
					
						public String getUjc() {
							return ujc;
						}
					
						public void setUjc(String ujc) {
							this.ujc = ujc;
						}
					
						public String getuAdress() {
							return uAdress;
						}
					
						public void setuAdress(String uAdress) {
							this.uAdress = uAdress;
						}
					
						public String getEmail() {
							return email;
						}
					
						public void setEmail(String email) {
							this.email = email;
						}
					
						public String getUkhyh() {
							return ukhyh;
						}
					
						public void setUkhyh(String ukhyh) {
							this.ukhyh = ukhyh;
						}
					
						public String getUyhzh() {
							return uyhzh;
						}
					
						public void setUyhzh(String uyhzh) {
							this.uyhzh = uyhzh;
						}
					
						public String getUuzbm() {
							return uuzbm;
						}
					
						public void setUuzbm(String uuzbm) {
							this.uuzbm = uuzbm;
						}
					
						public String getUcz() {
							return ucz;
						}
					
						public void setUcz(String ucz) {
							this.ucz = ucz;
						}
					
						public String getUlxr() {
							return ulxr;
						}
					
						public void setUlxr(String ulxr) {
							this.ulxr = ulxr;
						}
					
						public String getUdh() {
							return udh;
						}
					
						public void setUdh(String udh) {
							this.udh = udh;
						}
						public String getUgsdh() {
							return ugsdh;
						}

						public void setUgsdh(String ugsdh) {
							this.ugsdh = ugsdh;
						}
						
	// ----------------------------------------------------
						@Override
						public boolean equals(Object obj) {
							// 判断对象是否为空
							if (obj == null) {
								return false;
							}
							// 判断对象是否是Student类型
							if (!(obj instanceof User)) {
								return false;
							}
							// 类型强制转换
							User s = (User) obj;
							// 具体判断是否相等
							if (s.getUqc().equals(this.getUqc())) {
								return true;
							}
							return false;
						}
					
						@Override
						// 返回哈希数
						public int hashCode() {
							return (this.getUqc()).hashCode();
						}
					
						@Override
						public String toString() {
							return this.uqc;
						}
//----------------------------------------------------------------------------------------------


}
