public abstract class Customer implements ICustomer {

    //state
    String name;
    int id;

    //Constructor
    public Customer(int id, String name) {
       this.id = id;
       this.name = name;
    }

    //Behaviour
    @Override
    public String getCustomerName() {
        return this.name;
    }

    @Override
    public abstract double getPriceForProduct(double fullPrice);
}
