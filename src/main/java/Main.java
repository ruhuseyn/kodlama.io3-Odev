import Interface.CustomerManager;
import Interface.MySql;
import Interface.Repository;
import Polymorphism.BaseLogger;
import Polymorphism.FileLogger;
import Override.*;

public class Main {

    public static void main(String[] args) {

//        //Polimorfizm
//        BaseLogger fileLogger = new FileLogger();
//        fileLogger.log("kitab");
//
//        //Overriding
//        BaseKeditManager[] baseKeditManager = new BaseKeditManager[]{new OgrenciKeditManager(), new PersonelKreditManager()};
//        for(BaseKeditManager kredits: baseKeditManager){
//            System.out.println(kredits.hesapla(1000));
//        }

        CustomerManager customerManager = new CustomerManager(new MySql());
        customerManager.add();

    }
}
