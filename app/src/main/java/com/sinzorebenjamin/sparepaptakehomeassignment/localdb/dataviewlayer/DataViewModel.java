package com.sinzorebenjamin.sparepaptakehomeassignment.localdb.dataviewlayer;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.sinzorebenjamin.sparepaptakehomeassignment.localdb.models.DataModel;

import java.util.List;

public class DataViewModel  extends AndroidViewModel {

    private final Repository mRepository;

    public DataViewModel(Application application) {
        super(application);
        mRepository = new Repository(application);
    }


    public LiveData<List<DataModel>> getAllWords(){
        return mRepository.getAllWords();
    }


    public LiveData<List<DataModel>> getAllData() {
        return mRepository.getAllData();
    }


    public LiveData<Double> getTotal() {
        return mRepository.getTotal_();
    }


    public LiveData<Double> getLatestData() {
        return mRepository.getLatestData();
    }


    public void insertData(DataModel data) {
        mRepository.insertData(data);
    }


    public void deleteAll(){
        mRepository.deleteAll();
    }


    public LiveData<Integer> getTotalItems(){
        return mRepository.getTotalItems();
    }

    public List<DataModel> getListOfData(){
        return mRepository.getListOfData();
    }
}
