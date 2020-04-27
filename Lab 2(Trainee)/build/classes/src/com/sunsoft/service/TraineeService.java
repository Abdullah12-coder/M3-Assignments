package com.sunsoft.service;

import java.util.List;
import java.util.Optional;

import com.sunsoft.Entity.Trainee;

public interface TraineeService {

	Trainee find(int id);
    List<Trainee> getAll();
    void create(Trainee t);
    public void delete(int id);
    public void modify(Trainee t);
}
