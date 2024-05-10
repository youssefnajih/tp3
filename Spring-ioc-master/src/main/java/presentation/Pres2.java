package presentation;

import dao.IDataBaseConnection;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException,
            ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner=new Scanner(new File("config.txt"));
        String databaseType= scanner.nextLine();
        IDataBaseConnection cDao=(IDataBaseConnection) Class.forName(databaseType)
                                    .getConstructor().newInstance();
       String metierName=scanner.nextLine();
        MetierImpl metier = (MetierImpl) Class.forName(metierName).
                getConstructor(IDataBaseConnection.class).newInstance(cDao);
        metier.calcul();
    }
}
