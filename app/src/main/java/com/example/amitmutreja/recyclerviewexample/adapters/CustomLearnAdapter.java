package com.example.amitmutreja.recyclerviewexample.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.amitmutreja.recyclerviewexample.R;

/**
 * Created by
 * @author amitmutreja on 24/02/17.
 * A {@link android.support.v7.widget.RecyclerView.Adapter} subclass for learn fragments recycler views
 */

public class CustomLearnAdapter extends RecyclerView.Adapter<CustomLearnAdapter.ViewHolder> {
    private static final String TAG = "CustomLearnAdapter";

    private String[] mDataSet;

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param mDataSet String[] containing the data to populate views to be used by RecyclerView.
     */
    public CustomLearnAdapter(String[] mDataSet) {
        this.mDataSet = mDataSet;
    }

    public void loadData() {
        notifyDataSetChanged();
    }

    public void addData(String newString) {
        mDataSet[3] = newString;
        notifyItemChanged(3);
    }

    // BEGIN_INCLUDE(recyclerViewCustomViewHolder)
    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView);
        }

        public TextView getTextView() {
            return textView;
        }
    }
    // END_INCLUDE(recyclerViewCustomViewHolder)

    // BEGIN_INCLUDE(recyclerViewOnCreateViewHolder)
    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chapter_row_item, parent, false);

        return new ViewHolder(view);
    }
    // END_INCLUDE(recyclerViewOnCreateViewHolder)

    // BEGIN_INCLUDE(recyclerViewOnBindViewHolder)
    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        viewHolder.getTextView().setText(mDataSet[position]);
    }
    // END_INCLUDE(recyclerViewOnBindViewHolder)

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}
