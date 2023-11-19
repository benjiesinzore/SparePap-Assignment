package com.sinzorebenjamin.sparepaptakehomeassignment;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.sinzorebenjamin.sparepaptakehomeassignment.databinding.MainBinding;
import com.sinzorebenjamin.sparepaptakehomeassignment.localdb.models.DataModel;
import com.sinzorebenjamin.sparepaptakehomeassignment.localdb.dataviewlayer.DataViewModel;
import com.sinzorebenjamin.sparepaptakehomeassignment.localdb.adapter.ListAdapter;

import java.util.Objects;

public class Main  extends AppCompatActivity {

    MainBinding binding;

    DataViewModel viewModel;
    DataModel model;


    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setTaskBarColor();




        viewModel = new ViewModelProvider(this).get(DataViewModel.class);
        model = new DataModel();

        final ListAdapter adapter = new ListAdapter(new ListAdapter.ProductDiff());

        setButtonBackgroundColor();

        binding.recycleView.setAdapter(adapter);

        binding.recycleView.setLayoutManager(new LinearLayoutManager(this));


        // Update the cached copy of the words in the adapter.
        viewModel.getAllWords().observe(this, adapter::submitList);


        viewModel.getTotal().observe(this, data -> {

            if (data == null){
                binding.output.setText("KES 0.00");
            } else {
                binding.output.setText("KES "+ data);
            }

        });


        //OnClick Listeners
        binding.buttonDel.setOnClickListener( v -> binding.input.setText("0.00"));

        binding.button1.setOnClickListener(v ->{
            if (Objects.equals(binding.input.getText().toString(), "0.00")){
                binding.input.setText("1");
            }
            else {

                if (!checkIfInputHasDecimal()){

                    double currentInput = Double.parseDouble(binding.input.getText().toString());
                    if (currentInput >= 1000000.01){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "1");
                    }

                } else {
                    handleInputDecimalPart("1");
                }

            }
        });

        binding.button2.setOnClickListener(v ->{
            if (Objects.equals(binding.input.getText().toString(), "0.00")){
                binding.input.setText("2");
            }
            else {

                if (!checkIfInputHasDecimal()){

                    double currentInput = Double.parseDouble(binding.input.getText().toString() + "2");
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "2");
                    }

                } else {
                    handleInputDecimalPart("2");
                }

            }
        });

        binding.button3.setOnClickListener(v ->{
            if (Objects.equals(binding.input.getText().toString(), "0.00")){
                binding.input.setText("3");
            }
            else {

                if (!checkIfInputHasDecimal()){

                    double currentInput = Double.parseDouble(binding.input.getText().toString() + "3");
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "3");
                    }

                } else {
                    handleInputDecimalPart("3");
                }

            }
        });

        binding.button4.setOnClickListener(v ->{
            if (Objects.equals(binding.input.getText().toString(), "0.00")){
                binding.input.setText("4");
            }
            else {

                if (!checkIfInputHasDecimal()){

                    double currentInput = Double.parseDouble(binding.input.getText().toString() + "4");
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "4");
                    }

                } else {
                    handleInputDecimalPart("4");
                }

            }
        });

        binding.button5.setOnClickListener(v ->{
            if (Objects.equals(binding.input.getText().toString(), "0.00")){
                binding.input.setText("5");
            }
            else {

                if (!checkIfInputHasDecimal()){

                    double currentInput = Double.parseDouble(binding.input.getText().toString() + "5");
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "5");
                    }

                } else {
                    handleInputDecimalPart("5");
                }

            }
        });

        binding.button6.setOnClickListener(v ->{
            if (Objects.equals(binding.input.getText().toString(), "0.00")){
                binding.input.setText("6");
            }
            else {

                if (!checkIfInputHasDecimal()){

                    double currentInput = Double.parseDouble(binding.input.getText().toString() + "6");
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "6");
                    }

                } else {
                    handleInputDecimalPart("6");
                }

            }
        });

        binding.button7.setOnClickListener(v ->{
            if (Objects.equals(binding.input.getText().toString(), "0.00")){
                binding.input.setText("7");
            }
            else {

                if (!checkIfInputHasDecimal()){

                    double currentInput = Double.parseDouble(binding.input.getText().toString() + "7");
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "7");
                    }

                } else {
                    handleInputDecimalPart("7");
                }

            }
        });

        binding.button8.setOnClickListener(v ->{
            if (Objects.equals(binding.input.getText().toString(), "0.00")){
                binding.input.setText("8");
            }
            else {

                if (!checkIfInputHasDecimal()){

                    double currentInput = Double.parseDouble(binding.input.getText().toString() + "8");
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "8");
                    }

                } else {
                    handleInputDecimalPart("8");
                }

            }
        });

        binding.button9.setOnClickListener(v ->{
            if (Objects.equals(binding.input.getText().toString(), "0.00")){
                binding.input.setText("9");
            }
            else {

                if (!checkIfInputHasDecimal()){

                    double currentInput = Double.parseDouble(binding.input.getText().toString() + "9");
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "9");
                    }

                } else {
                    handleInputDecimalPart("9");
                }

            }
        });

        binding.button0.setOnClickListener(v ->{
            if (Objects.equals(binding.input.getText().toString(), "0.00")){
                binding.input.setText("0");
            }
            else {

                if (!checkIfInputHasDecimal()){

                    double currentInput = Double.parseDouble(binding.input.getText().toString() + "0");
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "0");
                    }

                } else {
                    handleInputDecimalPart("0");
                }

            }
        });

        binding.button0.setOnLongClickListener(new LongPressListener());

        binding.buttonAdd.setOnClickListener( v ->{

            double amount = Double.parseDouble(binding.input.getText().toString());
            if (amount >= 0.01){
                model.setVal(amount);
                viewModel.insertData(model);
                binding.recycleView.setAdapter(adapter);
            } else {
                Toast.makeText(this, "Invalid amount", Toast.LENGTH_SHORT).show();
            }
        });
        //OnClick Listeners


    }

    private void setTaskBarColor() {
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.dark_navy));
    }


    public void handleInputDecimalPart(String btnNumber){

        String[] str = binding.input.getText().toString().split("\\.");

        double currentInput = Double.parseDouble(binding.input.getText().toString() + "1");
        switch (btnNumber){
            case "0":
                if (Objects.equals(str.length, 1)){
                    binding.input.setText(binding.input.getText().toString() + "0");
                }
                else if (str[1].length() < 2){
                    binding.input.setText(binding.input.getText().toString() + "0");
                }
                break;
            case "1":
                if (Objects.equals(str.length, 1)){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "1");
                    }
                }
                else if (str[1].length() < 2){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "1");
                    }
                }
                break;
            case "2":
                if (Objects.equals(str.length, 1)){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "2");
                    }
                }
                else if (str[1].length() < 2){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "2");
                    }
                }
                break;
            case "3":
                if (Objects.equals(str.length, 1)){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "3");
                    }
                }
                else if (str[1].length() < 2){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "3");
                    }
                }
                break;
            case "4":
                if (Objects.equals(str.length, 1)){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "4");
                    }
                }
                else if (str[1].length() < 2){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "4");
                    }
                }
                break;
            case "5":
                if (Objects.equals(str.length, 1)){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "5");
                    }
                }
                else if (str[1].length() < 2){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "5");
                    }
                }
                break;
            case "6":
                if (Objects.equals(str.length, 1)){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "6");
                    }
                }
                else if (str[1].length() < 2){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "6");
                    }
                }
                break;
            case "7":
                if (Objects.equals(str.length, 1)){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "7");
                    }
                }
                else if (str[1].length() < 2){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "7");
                    }
                }
                break;
            case "8":
                if (Objects.equals(str.length, 1)){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "8");
                    }
                }
                else if (str[1].length() < 2){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "8");
                    }
                }
                break;
            case "9":
                if (Objects.equals(str.length, 1)){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "9");
                    }
                }
                else if (str[1].length() < 2){
                    if (currentInput > 1000000.00){
                        Toast.makeText(this, R.string.maximum_accepted_amount_is_1_000_000, Toast.LENGTH_SHORT).show();
                    } else {
                        binding.input.setText(binding.input.getText().toString() + "9");
                    }
                }
                break;

        }
    }


    private class LongPressListener implements View.OnLongClickListener {
        @Override
        public boolean onLongClick(View v) {

            if (Objects.equals(binding.input.getText().toString(), "0.00")){
                binding.input.setText("0.");
            } else {
                boolean checkIfPointPresent = checkIfInputHasDecimal();

                if (!checkIfPointPresent){
                    binding.input.setText((binding.input.getText().toString()) + ".");
                }


            }
            return true;
        }
    }


    public boolean checkIfInputHasDecimal(){
        boolean retVal = false;
        String[] str = binding.input.getText().toString().split("");
        for (String ss :
                str) {
            if (Objects.equals(ss, ".")){
                retVal = true;
                break;
            }
        }
        return retVal;
    }


    private void setButtonBackgroundColor() {
        binding.button1.setBackgroundColor(getResources().getColor(R.color.white));
        binding.button2.setBackgroundColor(getResources().getColor(R.color.white));
        binding.button3.setBackgroundColor(getResources().getColor(R.color.white));
        binding.button4.setBackgroundColor(getResources().getColor(R.color.white));
        binding.button5.setBackgroundColor(getResources().getColor(R.color.white));
        binding.button6.setBackgroundColor(getResources().getColor(R.color.white));
        binding.button7.setBackgroundColor(getResources().getColor(R.color.white));
        binding.button8.setBackgroundColor(getResources().getColor(R.color.white));
        binding.button9.setBackgroundColor(getResources().getColor(R.color.white));
        binding.button0.setBackgroundColor(getResources().getColor(R.color.white));
        binding.buttonDel.setBackgroundColor(getResources().getColor(R.color.white));
        binding.buttonAdd.setBackgroundColor(getResources().getColor(R.color.white));
    }


    //OnDestroy Clear Local DB
    @Override
    protected void onDestroy() {
        super.onDestroy();

        viewModel.deleteAll();
    }

}
