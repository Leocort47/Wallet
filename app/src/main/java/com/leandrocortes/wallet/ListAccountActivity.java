package com.leandrocortes.wallet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV = new ArrayList<>();

    private RecyclerView myRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();


        myRecycleView = findViewById(R.id.rv_list_accounts);
        AccountAdapter myAdaptador = new AccountAdapter(listAccountRV);
                myRecycleView.setAdapter(myAdaptador);
                myRecycleView.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));
    }

    private void loadFakeData(){
        Account myAccount1 = new Account("Bancolombia", "Cuenta de Ahorros", 1223930934.0,"https://i.pinimg.com/originals/b8/cd/c1/b8cdc1ad498fe080bc21bb5a03c24f83.png");
        Account myAccount2 = new Account("Davivienda", "Cuenta debito", 2384374863.9,"https://logos-world.net/wp-content/uploads/2023/02/Davivienda-Logo.png");
        Account myAccount3 = new Account("MasterCard", "Tarjeta de Credito", 28736434.4,"https://upload.wikimedia.org/wikipedia/commons/7/72/MasterCard_early_1990s_logo.png");

        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);

    }
}