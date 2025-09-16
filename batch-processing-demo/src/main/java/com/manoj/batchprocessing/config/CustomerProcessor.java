package com.manoj.batchprocessing.config;

import com.manoj.batchprocessing.entity.Customer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    public Customer process(Customer customer) throws Exception{
        if(customer.getCountry().equalsIgnoreCase("United State")){
            return customer;
        }else{
            return null;
        }
    }

}
