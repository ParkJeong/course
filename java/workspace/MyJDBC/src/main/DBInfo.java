package main;

public class DBInfo {
	private final String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	private final String uid = "USER01";
	private final String upw = "user01";
	
	public String getUrl() {
		return url;
	}
	public String getUid() {
		return uid;
	}
	public String getUpw() {
		return upw;
	}
	
	
	
}
