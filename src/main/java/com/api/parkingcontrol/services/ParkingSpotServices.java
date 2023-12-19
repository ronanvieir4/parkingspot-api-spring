package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositores.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotServices {

    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotServices(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
}
