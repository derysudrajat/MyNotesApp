package com.example.mynotesapp;

import android.database.Cursor;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(Cursor notes);
}
