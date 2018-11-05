package p1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Model 
{
	private int id;
	private String password;
	private Connection con;
	private ResultSet res;
	private PreparedStatement pstmt;
	private int accno;
	private String name;
	private int balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public ResultSet getRes() {
		return res;
	}
	public void setRes(ResultSet res) {
		this.res = res;
	}
	public PreparedStatement getPstmt() {
		return pstmt;
	}
	public void setPstmt(PreparedStatement pstmt) {
		this.pstmt = pstmt;
	}
	public Model() 
	{
		Dao d= new Dao();
		con= d.getConnection();
	}
	boolean verify()
	{
		try
		{
			pstmt= con.prepareStatement("select * from bank where customerid=? and password=?");
			pstmt.setInt(1,id);
			pstmt.setString(2,password);
			res= pstmt.executeQuery();
			while(res.next()==true)
			{
				accno= res.getInt(1);
				name= res.getString(5);
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	boolean checkBalance()
	{
		try
		{
			pstmt= con.prepareStatement("select * from bank where accno=? ");
			pstmt.setInt(1,accno);
			res= pstmt.executeQuery();
			while(res.next()==true)
			{
				setBalance(res.getInt("balance"));
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}