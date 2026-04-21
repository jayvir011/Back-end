package com.example.DoctorFinder.repository;

import com.example.DoctorFinder.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
