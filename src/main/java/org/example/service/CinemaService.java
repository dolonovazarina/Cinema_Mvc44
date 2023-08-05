package org.example.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.model.Cinema;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService implements ServiceLayer<Cinema> {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Cinema save(Cinema cinema) {
        entityManager.persist(cinema);
        return cinema;
    }

    @Override
    public Cinema update(int id, Cinema cinema) {
        Cinema oldCinema = entityManager.find(Cinema.class, id);
        oldCinema.setName(cinema.getName());
        oldCinema.setAddress(cinema.getAddress());
        oldCinema.setId(cinema.getId());
        entityManager.merge(oldCinema);
        return oldCinema;
    }

    @Override
    public Cinema findById(int id) {
        return entityManager.find(Cinema.class, id);

    }
@Override
    public List<Cinema> findAll() {
        return (List<Cinema>) entityManager.
                createNativeQuery("from Cinema").getResultList();
    }
@Override
    public void delete(int id) {
        entityManager.remove(entityManager.
                find(Cinema.class, id));

    }
}
