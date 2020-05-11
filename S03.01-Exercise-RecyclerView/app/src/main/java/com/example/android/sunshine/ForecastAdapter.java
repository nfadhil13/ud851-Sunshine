package com.example.android.sunshine;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] mWeahterData;

    public ForecastAdapter() {
    }

    public ForecastAdapter(String[] mWeahterData) {
        this.mWeahterData = mWeahterData;
    }

    @NonNull
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        int layoutIdForListen = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListen,viewGroup,shouldAttachToParentImmediately);
        return new ForecastAdapterViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ForecastAdapterViewHolder forecastAdapterViewHolder, int i) {
        String weatherThisDay = mWeahterData[i];
        forecastAdapterViewHolder.mWeatherTextView.setText(weatherThisDay);
    }

    @Override
    public int getItemCount() {
       if(mWeahterData != null){
           return mWeahterData.length;
       }
       return 0;
    }

    public void setmWeahterData(String[] mWeahterData) {
        this.mWeahterData = mWeahterData;
        notifyDataSetChanged();
    }


    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {
        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            mWeatherTextView = itemView.findViewById(R.id.tv_weather_data);
        }

    }

}
