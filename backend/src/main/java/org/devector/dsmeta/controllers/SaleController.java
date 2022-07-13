package org.devector.dsmeta.controllers;

import org.devector.dsmeta.entities.Sale;
import org.devector.dsmeta.services.SaleService;
import org.devector.dsmeta.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @Autowired
    private SmsService smsService;

    @GetMapping
    public Page<Sale> findAll(@RequestParam(value = "minDate", defaultValue = "") String minDate,
                              @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
                              Pageable pageable){
        return service.findSales(minDate, maxDate, pageable);
    }

    @GetMapping("/{id}/notification")
    public void notificationSms(@PathVariable Long id) {
        smsService.sendSms(id);
    }

}
