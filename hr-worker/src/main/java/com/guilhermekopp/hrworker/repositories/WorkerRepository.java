package com.guilhermekopp.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermekopp.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
