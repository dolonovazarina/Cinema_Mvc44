package org.example.service;

import java.util.List;

public interface ServiceLayer <T>{
   T save(T t);
   T update(int id, T t);
   T findById(int id);
    List<T>findAll();

    void  delete (int id);
}
