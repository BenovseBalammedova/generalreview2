package service;

import java.util.List;

public interface CommonService<T> {
    void add(T object);
    void update (int id,String name);
    T getById(int id);
    List<T>getAll();
    void delete(int id);

}
