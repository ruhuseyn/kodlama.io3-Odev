package Interface;

public class CustomerManager {
    private Repository repository;

    public CustomerManager(Repository repository) {
        this.repository = repository;
    }

    public void add(){
        repository.add();
    }
}
