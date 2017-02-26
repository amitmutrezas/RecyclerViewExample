package com.example.amitmutreja.recyclerviewexample.controllers.implementors;

import com.example.amitmutreja.recyclerviewexample.controllers.interfaces.ILearnController;

/**
 * Created by
 * @author amitmutreja on 25/02/17.
 * implements {@link ILearnController}
 */



public class LearnController implements ILearnController {
    private static final int DATASET_COUNT = 60;

    private String[] mDataSet;

    //region constructors
    public LearnController() {
        super();
    }

    public LearnController(String[] mDataSet) {
        this.mDataSet = mDataSet;
    }
    //endregion

    //region Overridden methods
    @Override
    public String[] getDataSet() {
        initDataset();
        return mDataSet;
    }
    //endregion

    //region private methods
    private void initDataset() {
        mDataSet = new String[DATASET_COUNT];
        for (int i = 0; i < DATASET_COUNT; i++) {
            mDataSet[i] = "This is element #" + i;
        }
    }
    //endregion
}
