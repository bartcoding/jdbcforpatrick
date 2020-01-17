package be.intecbrussel.springbootjdbcdemo.data;

public interface BeerDao {
    String getBeerById(int id);
    void setStock(int id, int stock);
}
