package service;

import data.Customer;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDaoImpl implements CustomerDAO{


    private JdbcTemplate jdbcTemplate;

    public CustomerDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate(new datasource);
    }

    @Override
    public Customer getCustomer(String customerId) {
        return null;
    }

    @Override
    public data.Customer updateCustomer(String customerId) {
        return null;
    }
}
