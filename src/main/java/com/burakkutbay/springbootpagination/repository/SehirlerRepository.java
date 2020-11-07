package com.burakkutbay.springbootpagination.repository;

import com.burakkutbay.springbootpagination.model.Sehirler;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by  Burak KUTBAY on 7.11.2020.
 */
@Repository
public interface  SehirlerRepository extends PagingAndSortingRepository<Sehirler, Long> {

}