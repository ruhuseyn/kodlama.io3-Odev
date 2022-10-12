package Interface;

public class MySql implements Repository{
    @Override
    public void add() {
        System.out.println("Mysql eklendi");
    }
}
