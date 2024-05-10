package presentation;

import dao.IDataBaseConnection;
import dao.MongoDbConnection;
import dao.MySqlConnection;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        IDataBaseConnection monogoDbConnection=new MongoDbConnection();
        IDataBaseConnection mysqlDbConnection =new MySqlConnection();

        MetierImpl metier=new MetierImpl(mysqlDbConnection);
        metier.calcul();
    }
}
