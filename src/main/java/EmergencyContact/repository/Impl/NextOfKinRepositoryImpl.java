package EmergencyContact.repository.Impl;

import EmergencyContact.domain.NextOfKin;
import EmergencyContact.repository.NextOfKinRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by graham on 2015/09/22.
 */
public class NextOfKinRepositoryImpl implements NextOfKinRepository {
    Map<Long, NextOfKin> lists = new HashMap<>();

    public NextOfKinRepositoryImpl(){

    }


    @Override
    public NextOfKin findById(Long s) {
        return null;
    }

    @Override
    public NextOfKin update(NextOfKin entity) {
        return null;
    }

    @Override
    public <S extends NextOfKin> S save(S s) {
        return null;
    }

    @Override
    public <S extends NextOfKin> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public NextOfKin findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<NextOfKin> findAll() {
        return null;
    }

    @Override
    public Iterable<NextOfKin> findAll(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long s) {

    }

    @Override
    public void delete(NextOfKin nextOfKin) {

    }

    @Override
    public void delete(Iterable<? extends NextOfKin> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
