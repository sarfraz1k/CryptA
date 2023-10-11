package com.example.crypta.Activities;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crypta.Activities.Adapter.CryptoWalletAdapter;
import com.example.crypta.Activities.Domain.CryptoWallet;
import com.example.crypta.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        recyclerViewWallet();
    }
    private void recyclerViewWallet(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView=findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<CryptoWallet>cryptoWalletArrayList=new ArrayList<>();
        ArrayList<Integer> lineData=new ArrayList<>();
        lineData.add(1000);
        lineData.add(1100);
        lineData.add(1200);
        lineData.add(1100);
        ArrayList<Integer> lineData2=new ArrayList<>();
        lineData2.add(2100);
        lineData2.add(2000);
        lineData2.add(1900);
        lineData2.add(2000);
        ArrayList<Integer> lineData3=new ArrayList<>();
        lineData3.add(900);
        lineData3.add(1000);
        lineData3.add(1100);
        lineData3.add(1000);
        lineData3.add(1150);

        cryptoWalletArrayList.add(new CryptoWallet("bitcoin","BTX",1234.12,2.13,lineData,1234.56,0.12343));
        cryptoWalletArrayList.add(new CryptoWallet("etherium","ETH",2134.121,-1.23,lineData2,3424.26,0.713));
        cryptoWalletArrayList.add(new CryptoWallet("trox","ROX",6543.21,0.76,lineData3,34321.31,0.0043));

        adapter=new CryptoWalletAdapter(cryptoWalletArrayList);
        recyclerView.setAdapter(adapter);

    }

}