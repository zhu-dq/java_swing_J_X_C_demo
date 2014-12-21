package PO;

public class salesReturn{
	private String thph;//退货票号
	private String xhbh;//商品编号
	private String spmc;//商品名称
	private String gg;//规格
	private String piece;//单价
	private String Tnum;//退货数量
	
	private String czy;//操作员
	private String jsr;//经手人
	private String khqc;//客户全称
	private String jsfs;//结算方式
	private String Tmoney;//总金额
	private String Tdate;//日期
	public String getTnum() {
		return Tnum;
	}
	public void setTnum(String tnum) {
		Tnum = tnum;
	}
	public String getThph() {
		return thph;
	}
	public void setThph(String thph) {
		this.thph = thph;
	}
	public String getXhbh() {
		return xhbh;
	}
	public void setXhbh(String xhbh) {
		this.xhbh = xhbh;
	}
	public String getSpmc() {
		return spmc;
	}
	public void setSpmc(String spmc) {
		this.spmc = spmc;
	}
	public String getGg() {
		return gg;
	}
	public void setGg(String gg) {
		this.gg = gg;
	}
	public String getPiece() {
		return piece;
	}
	public void setPiece(String piece) {
		this.piece = piece;
	}
	public String getCzy() {
		return czy;
	}
	public void setCzy(String czy) {
		this.czy = czy;
	}
	public String getJsr() {
		return jsr;
	}
	public void setJsr(String jsr) {
		this.jsr = jsr;
	}
	public String getKhqc() {
		return khqc;
	}
	public void setKhqc(String khqc) {
		this.khqc = khqc;
	}
	public String getJsfs() {
		return jsfs;
	}
	public void setJsfs(String jsfs) {
		this.jsfs = jsfs;
	}
	public String getTmoney() {
		return Tmoney;
	}
	public void setTmoney(String tmoney) {
		Tmoney = tmoney;
	}
	public String getTdate() {
		return Tdate;
	}
	public void setTdate(String tdate) {
		Tdate = tdate;
	}
	
	
}
