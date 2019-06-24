import java.sql.*;
import java.nio.file.*;
import java.io.*;
import java.util.*;


public class ourmoney {

	
    private static Statement stmt;
    public static void main(String[] args) {
	
		
		
		try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try ( Connection con = getConnection()){
                 
            	stmt = con.createStatement();
               System.out.println("Connection succesfull!");
               
       moneymovement move = new moneymovement();
       int id;
       
       
   /*  move.sources = "Jeans";
       move.dates = "2019-05-08";
       move.member = "Me";
       move.amount = "600";
    */           
      
   			Scanner scan = new Scanner(System.in);

   		    System.out.println("Menu");
   		    System.out.println("1 - Make list" + "\n" + "2 - Show balance" + "\n" + "3 - Show income" + "\n" +
   		            "4 - Show outcome" + "\n" + "5 - Add new money movement" + "\n" + "6 - Remove" + "\n" + 
   		    		"7 - Edit" + "\n" +"8 - " + "\n" +"9 - Quit" + "\n");

   		    int menu = scan.nextInt();

   		    switch (menu){

   		        case 1 : 
   		        show();
   		        break;
   		        case 2 : 
   		        balance();
   		        break;
   		        case 3 :
   		        showIncome();
   		        break;
   		        case 4 :
   		        showOutcome();
   		        break;
   		        case 5 :
   		        	
   		        	move = set(move);
   		        	add(move);
   		        	break;
   		        case 6 :
   		        	System.out.println("Enter ID of the line you want to remove");
   		        	id = scan.nextInt();
   		        	remove(id);
   		        	break;
   		        	
   		        case 7 :
   		        	System.out.println("Enter ID of the line you want to edit");
   		        	move.id = scan.nextInt();
   		        	move = set(move);
   		        	add(move);
   		        	edit(move);
   		        	break;
		        	
   		        case 8 :
		        	//Space for new menu item

   		        case 9 : break;
default:
System.out.println("Вы ввели число выходящее за пределы диапазона!");
}
   		 stmt.close();
			con.close();
			scan.close();
}  
}
        catch(Exception ex){
            System.out.println("Connection failed...");
             
            System.out.println(ex);
        }	
   }
	
	public static void remove(int id) 
	{
		String arg = "DELETE FROM moneymovements WHERE moneymovements.id="+id+";";
		try{
			
			stmt.executeUpdate(arg);

			}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	static void balance() {
		try {
			int summ = 0;
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM moneymovements" );
	        while(resultSet.next()){
	            int amount = resultSet.getInt(5);
	            summ+=amount;
	            
	        }
	        System.out.println("Your current balance = " +summ);
		}
			catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
	
	public static  moneymovement set(moneymovement m) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter sources");
		m.sources = scan.nextLine();
		System.out.println("Enter dates");
		m.dates= scan.nextLine();
		System.out.println("Enter member");
		m.member = scan.nextLine();
		System.out.println("Enter amount (Remember that if you enter outcome amount must be negative number)");
		m.amount = scan.nextLine();
		scan.close();
		return m;
	}
	
	public static void edit(moneymovement m) 
	{

		String arg = "UPDATE moneymovements SET sources='"+m.sources+"', dates='"+m.dates+"',  member='"+m.member+"',  amount='"+m.amount+"' WHERE id="+m.id+";";
		
		try{
			
			stmt.executeUpdate(arg);
			
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void add(moneymovement m) 
	{
		String arg = "INSERT INTO moneymovements (sources, dates, member, amount) \n" +
				" VALUES ('"+m.sources+"', '"+m.dates+"',  '"+m.member+"',  '"+m.amount+"');";
		try{
			
			stmt.executeUpdate(arg);
			
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	static void showIncome()
	{
		try {
			
		ResultSet resultSet = stmt.executeQuery("SELECT * FROM moneymovements" );
        while(resultSet.next()){
            
        	int amount = resultSet.getInt(5);
        	if(amount>0)
            {int id = resultSet.getInt(1);
            String sources = resultSet.getString(2);
            String dates = resultSet.getString(3);
            String member = resultSet.getString(4);
           
            
            System.out.printf("%d. %s - %s %s = %d \n", id, sources, dates, member, amount);}
        }}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void showOutcome()
	{
		try {
			
		ResultSet resultSet = stmt.executeQuery("SELECT * FROM moneymovements" );
        while(resultSet.next()){
            
        	int amount = resultSet.getInt(5);
        	if(amount<0)
            {int id = resultSet.getInt(1);
            String sources = resultSet.getString(2);
            String dates = resultSet.getString(3);
            String member = resultSet.getString(4);
           
            
            System.out.printf("%d. %s - %s %s = %d \n", id, sources, dates, member, amount);}
        }}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
			
	static void show()
	{
		try {
			
		ResultSet resultSet = stmt.executeQuery("SELECT * FROM moneymovements" );
        while(resultSet.next()){
             
            int id = resultSet.getInt(1);
            String sources = resultSet.getString(2);
            String dates = resultSet.getString(3);
            String member = resultSet.getString(4);
            int amount = resultSet.getInt(5);
            
            System.out.printf("%d. %s - %s %s = %d \n", id, sources, dates, member, amount);
        }}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
    
   public static Connection getConnection() throws SQLException, IOException{
        
       Properties props = new Properties();
       try(InputStream in = Files.newInputStream(Paths.get("C:\\eclipse\\OurMoney\\database.properties.txt"))){
           props.load(in);
       }
       String url = props.getProperty("url");
       String username = props.getProperty("username");
       String password = props.getProperty("password");
        
       return DriverManager.getConnection(url, username, password);
   }
	
}

