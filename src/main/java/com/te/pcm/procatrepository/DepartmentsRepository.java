package com.te.pcm.procatrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.pcm.procatentity.DepartmentsEntity;
@Repository
public interface DepartmentsRepository extends JpaRepository<DepartmentsEntity, Integer>{

}
