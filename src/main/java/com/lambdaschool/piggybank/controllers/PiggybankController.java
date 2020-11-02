package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.Piggybank;
import com.lambdaschool.piggybank.repositories.PiggybankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PiggybankController {
    @Autowired
    PiggybankRepository piggybankRepository;

    //http://localhost:2019/total
    @GetMapping(value = "total", produces = "application/json")
    public ResponseEntity<?> getTotal() {
        List<Piggybank> myList = new ArrayList<>();
        piggybankRepository.findAll().iterator().forEachRemaining(myList::add);

        double total = 0.0;
        for (Piggybank p : myList) {
            if (p.getCoinid() == 1) {
                total += p.getValue() * p.getQuantity();
                System.out.println(p.getQuantity() + " " + ((p.getQuantity() > 1) ? p.getNameplural() : p.getName()));
            }
            if (p.getCoinid() == 2) {
                total += p.getValue() * p.getQuantity();
                System.out.println(p.getQuantity() + " " + ((p.getQuantity() > 1) ? p.getNameplural() : p.getName()));
            }
            if (p.getCoinid() == 3) {
                total += p.getValue() * p.getQuantity();
                System.out.println(p.getQuantity() + " " + ((p.getQuantity() > 1) ? p.getNameplural() : p.getName()));
            }
            if (p.getCoinid() == 4) {
                total += p.getValue() * p.getQuantity();
                System.out.println(p.getQuantity() + " " + ((p.getQuantity() > 1) ? p.getNameplural() : p.getName()));
            }
            if (p.getCoinid() == 5) {
                total += p.getValue() * p.getQuantity();
                System.out.println(p.getQuantity() + " " + ((p.getQuantity() > 1) ? p.getNameplural() : p.getName()));
            }
            if (p.getCoinid() == 6) {
                total += p.getValue() * p.getQuantity();
                System.out.println(p.getQuantity() + " " + ((p.getQuantity() > 1) ? p.getNameplural() : p.getName()));
            }
            if (p.getCoinid() == 7) {
                total += p.getValue() * p.getQuantity();
                System.out.println(p.getQuantity() + " " + ((p.getQuantity() > 1) ? p.getNameplural() : p.getName()));
            }
        }

        System.out.println("The piggy bank holds" + " " + total);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
