package com.tugasrestapi.apicrud.Repositories;

import com.tugasrestapi.apicrud.Entities.PegawaiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PegawaiRepository extends JpaRepository<PegawaiEntity, Integer> {
}
