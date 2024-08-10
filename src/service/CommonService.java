package service;

import java.util.List;

public interface CommonService<T> {

    List<T> getAll();
    T getById(int id);
    void add(T object);
    void delete(int id);

}
