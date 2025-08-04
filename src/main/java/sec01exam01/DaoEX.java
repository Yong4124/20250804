package sec01exam01;

public class DaoEX {
	public static void dbWork(DataAccessObject dao) {
		
	
	dao.select();
	dao.insert();
	dao.update();
	dao.delete();
	}
	
	
	public static void main(String[] args) {
		dbWork(new OracleDAO());
		dbWork(new MySqlDAO());

	}

}
