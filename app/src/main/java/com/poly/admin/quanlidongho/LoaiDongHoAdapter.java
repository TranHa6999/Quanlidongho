package com.poly.admin.quanlidongho;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LoaiDongHoAdapter extends RecyclerView.Adapter<LoaiDongHoAdapter.ViewHolder> {
    public Context context;
    public List<LoaiDongHo> loaiDongHoList;
    public LayoutInflater inflater;

    public LoaiDongHoAdapter(Context context, List<LoaiDongHo> loaiDongHoList) {
        this.context = context;
        this.loaiDongHoList = loaiDongHoList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_danh_sach_sp,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        LoaiDongHo loaiDongHo = loaiDongHoList.get(position);
        holder.tvMaLoaiDongHo.setText(loaiDongHo.getMaLoaiDongHo());
        holder.tvTenLoaiDongHo.setText(loaiDongHo.getTenLoaiDongHo());

    }

    @Override
    public int getItemCount() {
        return loaiDongHoList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvMaLoaiDongHo, tvTenLoaiDongHo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvMaLoaiDongHo = itemView.findViewById(R.id.tvMaLoaDongHo);
            this.tvTenLoaiDongHo = itemView.findViewById(R.id.tvTenLoaiDongHo);
        }
    }
}