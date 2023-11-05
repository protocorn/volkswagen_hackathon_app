package com.volkswagen.V2VCloud.controllers;


import com.volkswagen.V2VCloud.model.Car;
import com.volkswagen.V2VCloud.model.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vw")
public class Cloud {

    @PostMapping ("/update")
    public void fogAlert(Location location){
        //calculate range and send alert to all cars in the range

    }

    @PostMapping("/carTheft")
    public void carTheft(Car car){
        //send alert to the provided car, that the car has been stolen
        //as soon as the cars dashboard recieves this alert, car will stop

    }


}
