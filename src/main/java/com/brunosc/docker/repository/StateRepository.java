package com.brunosc.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunosc.docker.domain.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
