package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MongoDbConnection implements IDataBaseConnection{
    @Override
    public double getData() {
        System.out.println("Connection with mongoDb database ...");
        return 25.5;
    }
}
