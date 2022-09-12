package com.centrooleo.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centrooleo.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
