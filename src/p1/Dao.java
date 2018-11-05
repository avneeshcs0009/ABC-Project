package p1;
import java.sql.Connection;
import java.sql.DriverManager;
import oracle.jdbc.driver.OracleDriver;
public class Dao 
{
	private Connection con;
	private String url= "jdbc:oracle:thin:@//localhost:1521/XE";
	private String un= "system";
	private String pwd= "9794221228";
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	Connection getConnection()
	{
		try
		{
			DriverManager.registerDriver(new OracleDriver());
			con= DriverManager.getConnection(url, un, pwd);
			return con;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}
}
