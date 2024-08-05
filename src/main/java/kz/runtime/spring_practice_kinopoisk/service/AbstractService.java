package kz.runtime.spring_practice_kinopoisk.service;

import java.util.List;

public interface AbstractService<T> {
    //вывод всего списка
    List<T> findAll();

    //вывод по id
    T findById(Long id);

    //создание
    void create(T entity);

    //обновление
    void update(long id, T updatedEntity);

    //удаление по id
    void deleteById(long id);
}