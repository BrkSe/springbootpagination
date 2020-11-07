package com.burakkutbay.springbootpagination.service;

import com.burakkutbay.springbootpagination.model.Sehirler;

import java.util.List;

/**
 * Created by  Burak KUTBAY on 7.11.2020.
 */
public interface ISehirlerService {
    List<Sehirler> getSehirlerList(int no, int size);
}
