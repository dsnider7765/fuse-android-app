package com.example.pltw.noctipractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CustomerActivity extends AppCompatActivity {

    Customer mCustomer = Customer.get();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
    }

    public void onMainSubmitBtnClick(View view){
        mCustomer.setName(((EditText)view.findViewById(R.id.edit_first_name)).getText().toString()+
                ((EditText)view.findViewById(R.id.edit_last_name)).getText().toString());
        String street = ((EditText)view.findViewById(R.id.edit_address_street)).getText().toString();
        String city = ((EditText)view.findViewById(R.id.edit_address_city)).getText().toString();
        String state = ((EditText)view.findViewById(R.id.edit_address_state)).getText().toString();
        String zip = ((EditText)view.findViewById(R.id.edit_address_zip)).getText().toString();
        String[] address ={street,city,state,zip};
        mCustomer.setAddress(address);


    }
}
