package com.sinzorebenjamin.sparepaptakehomeassignment.localdb.dataviewlayer;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.sinzorebenjamin.sparepaptakehomeassignment.localdb.dataaccesslayer.DAO;
import com.sinzorebenjamin.sparepaptakehomeassignment.localdb.dataaccesslayer.RoomDatabase;
import com.sinzorebenjamin.sparepaptakehomeassignment.localdb.models.DataModel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Repository {

    private final DAO mDao;

    private final LiveData<List<DataModel>> mAllWords;

    private final LiveData<Double> getTotal;

    public Repository(Application application) {
        RoomDatabase db = RoomDatabase.getDatabase(application);
        mDao = db.dataDao();
        mAllWords = mDao.getAllData();
        getTotal = mDao.getTotal();
    }

    public LiveData<List<DataModel>> getAllWords() {
        return mAllWords;
    }

    public LiveData<Double> getTotal_() {
        return getTotal;
    }


    public LiveData<List<DataModel>> getAllData() {


        MutableLiveData<List<DataModel>> res = new MutableLiveData<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<LiveData<List<DataModel>>> results = executorService.submit(mDao::getAllData);
        try {
            res = (MutableLiveData<List<DataModel>>) results.get();
        } catch (Exception ee){
            //
        }
        return res;
    }


    public LiveData<Double> getTotal() {


        MutableLiveData<Double> res = new MutableLiveData<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<LiveData<Double>> results = executorService.submit(mDao::getTotal);
        try {
            res = (MutableLiveData<Double>) results.get();
        } catch (Exception ee){
            //
        }
        return res;
    }


    public LiveData<Double> getLatestData() {


        MutableLiveData<Double> res = new MutableLiveData<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<LiveData<Double>> results = executorService.submit(mDao::getLatestData);
        try {
            res = (MutableLiveData<Double>) results.get();
        } catch (Exception ee){
            //
        }
        return res;
    }


    public void insertData(DataModel data) {
        RoomDatabase.databaseWriteExecutor.execute(() -> mDao.insertData(data));

    }

    public void deleteAll() {
        RoomDatabase.databaseWriteExecutor.execute(mDao::deleteAll);

    }


    public LiveData<Integer> getTotalItems() {

        LiveData<Integer> res =  new MutableLiveData<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<LiveData<Integer>> results = executorService.submit(mDao::getTotalItems);
        try {
            res = (MutableLiveData<Integer>) results.get();
        } catch (Exception ee){
            //
        }
        return res;
    }


    public List<DataModel> getListOfData() {

        List<DataModel> res =  new ArrayList<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<List<DataModel>> results = executorService.submit(mDao::getListOfData);
        try {
            res =  results.get();
        } catch (Exception ee){
            //
        }
        return res;
    }
}
