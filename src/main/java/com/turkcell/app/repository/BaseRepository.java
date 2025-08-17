package com.turkcell.app.repository;

import java.util.List;

// Kullanıcılar BaseRepository kullanacağı zaman bana bir tip verecek. Bu tipi T harfi ile ata.
public interface BaseRepository<T>
{
    T findById(int id);
    List<T> findAll();
    void save(T t);
    void delete(T t);
}
