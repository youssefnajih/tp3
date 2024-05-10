package metier;

import dao.IDataBaseConnection;
import dao.MongoDbConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier{

    @Autowired
    private IDataBaseConnection dataBaseConnection;



    public MetierImpl(IDataBaseConnection dataBaseConnection){
        this.dataBaseConnection=dataBaseConnection;
    }

    @Override
    public double calcul() {
        return dataBaseConnection.getData();
    }

    public void setDataBaseConnection(IDataBaseConnection dataBaseConnection) {
        this.dataBaseConnection = dataBaseConnection;
    }
}
