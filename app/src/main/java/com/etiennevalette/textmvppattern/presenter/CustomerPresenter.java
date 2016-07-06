package com.etiennevalette.textmvppattern.presenter;

import com.etiennevalette.textmvppattern.model.Customer;
import com.etiennevalette.textmvppattern.view.ICustomerView;

/**
 * Created by etiennevalette on 06/07/16.
 */
public class CustomerPresenter {
    private ICustomerView iCustomerView;

    public CustomerPresenter(ICustomerView iCustomerView){
        this.iCustomerView = iCustomerView;
    }

    public void createNewCustomer(){
        Customer customer = new Customer(1, "John Doe");
        iCustomerView.onCustomerCreated(customer);
    }
}