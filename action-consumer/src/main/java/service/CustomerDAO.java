package service;

import data.Customer;

public interface CustomerDAO {
     Customer getCustomer(String customerId);
    Customer updateCustomer(String customerId);
}
