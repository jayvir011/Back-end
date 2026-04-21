package com.example.DoctorFinder;

import com.example.DoctorFinder.entity.Admin;
import com.example.DoctorFinder.entity.Location;
import com.example.DoctorFinder.service.AdminService;
import com.example.DoctorFinder.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private AdminService adminService;

    @Autowired
    private LocationService locationService;

    @Override
    public void run(String... args) throws Exception {
        if (adminService.count() == 0) {
            Admin admin = new Admin();
            admin.setEmail("admin@test.com");
            admin.setPassword("admin123");
            adminService.save(admin);
            System.out.println("Default admin created: admin@test.com / admin123");
        }

        if (locationService.getAll().isEmpty()) {
            String[] locations = {"New York", "London", "Mumbai", "Delhi", "Chicago"};
            for (String locName : locations) {
                Location loc = new Location();
                loc.setName(locName);
                locationService.save(loc);
            }
            System.out.println("Default locations initialized");
        }
    }
}
