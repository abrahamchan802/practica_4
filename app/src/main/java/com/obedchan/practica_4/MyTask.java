package com.obedchan.practica_4;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

public class MyTask extends AsyncTask<Integer, Void, String> {

    Context context;
    ProgressDialog progressDialog;

    public MyTask(Context myContext){
        this.context = myContext;
    }

    @Override
    protected void onPreExecute() {
        progressDialog = ProgressDialog.show(context,"Progreso","Contando");
    }

    @Override
    protected String doInBackground(Integer... params) {
        int counter=params[0];
        int multiplier=params[1];
        for (int i = 0; i < counter*multiplier; i++) {
            Log.i("Counter",String.format("index: %d",i));
        }
        return "Salida";
    }

    @Override
    protected void onPostExecute(String result) {
        Log.i("Counter",result);
        progressDialog.dismiss();
    }
}
