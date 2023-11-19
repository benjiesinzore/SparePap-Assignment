package com.sinzorebenjamin.sparepaptakehomeassignment.localdb.dataaccesslayer;


import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.sinzorebenjamin.sparepaptakehomeassignment.localdb.models.DataModel;

import java.util.List;

@androidx.room.Dao
public interface DAO {

    @Query("SELECT * FROM t_data ORDER BY pri_key DESC")
    LiveData<List<DataModel>> getAllData();

    @Query("SELECT * FROM t_data")
    List<DataModel> getListOfData();

    @Query("SELECT SUM(dataVal) FROM t_data")
    LiveData<Double> getTotal();


    @Query("SELECT dataVal FROM t_data ORDER BY dataVal DESC LIMIT 1")
    LiveData<Double>  getLatestData();


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertData(DataModel data);

    @Query("DELETE FROM t_data")
    void deleteAll();

    @Query("SELECT COUNT(dataVal) FROM t_data")
    LiveData<Integer> getTotalItems();

}
