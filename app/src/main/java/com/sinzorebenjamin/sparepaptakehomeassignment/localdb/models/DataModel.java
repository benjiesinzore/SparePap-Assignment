package com.sinzorebenjamin.sparepaptakehomeassignment.localdb.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.math.BigDecimal;

@Entity(tableName = "t_data")
public class DataModel {

    @PrimaryKey(autoGenerate = true)
    private int pri_key;


    public int getPri_key() {
        return pri_key;
    }

    public void setPri_key(int pri_key) {
        this.pri_key = pri_key;
    }

    @ColumnInfo(name = "dataVal")
    public double val;

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }
}
