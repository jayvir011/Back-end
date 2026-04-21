package com.example.DoctorFinder.service;

import com.example.DoctorFinder.entity.Location;
import com.example.DoctorFinder.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public Location save(Location location) {
        return locationRepository.save(location);
    }

    public List<Location> getAll() {
        return locationRepository.findAll();
    }

    public void deleteById(Long id) {
        locationRepository.deleteById(id);
    }

    public Location findById(Long id) {
        return locationRepository.findById(id).orElse(null);
    }

    public long count() {
        return locationRepository.count();
    }
}
