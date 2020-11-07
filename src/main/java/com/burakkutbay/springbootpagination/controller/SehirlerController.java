package com.burakkutbay.springbootpagination.controller;

import com.burakkutbay.springbootpagination.model.Sehirler;
import com.burakkutbay.springbootpagination.service.ISehirlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Burak KUTBAY on 7.11.2020.
 */
@RestController
public class SehirlerController {

    @Autowired
    private ISehirlerService iSehirlerService;

    @GetMapping("/sehir/{no}/{size}")
    public List<Sehirler> getSehirler(@PathVariable int no,
                                      @PathVariable int size) {

        return iSehirlerService.getSehirlerList(no, size);
    }
}
