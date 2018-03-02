package com.eacuji.services;

import com.eacuji.dao.DataRepository;
import com.eacuji.entities.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private DataRepository dataRepository;

    @Override
    public Data save(Data data) {
        dataRepository.save(data);
        return data;
    }

    @Override
    public Iterable<Data> findAll() {
        return dataRepository.findAll();
    }
}
