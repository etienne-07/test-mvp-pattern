package com.etiennevalette.textmvppattern;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.etiennevalette.textmvppattern.model.Customer;
import com.etiennevalette.textmvppattern.presenter.CustomerPresenter;
import com.etiennevalette.textmvppattern.view.ICustomerView;

/**
 * A placeholder fragment containing a simple view.
 */
public class CustomerActivityFragment extends Fragment implements ICustomerView, View.OnClickListener{

    private CustomerPresenter customerPresenter;
    private Button buttonCreateCustomer;

    public CustomerActivityFragment() {
        this.customerPresenter = new CustomerPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        buttonCreateCustomer = (Button)view.findViewById(R.id.buttonCreateCustomer);
        buttonCreateCustomer.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.buttonCreateCustomer){
            customerPresenter.createNewCustomer();
        }
    }

    @Override
    public void onCustomerCreated(Customer customer) {
        Log.v("customer log", "Customer created " + customer.getName());
    }
}
