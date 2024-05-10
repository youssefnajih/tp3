package dao;

import org.springframework.stereotype.Component;


public class MySqlConnection implements IDataBaseConnection{

    @Override
    public double getData() {
        System.out.println("Connection with Mysql database ...");
        return 70.5;
    }
}
