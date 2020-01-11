package com.example.mvvmusingdatabinding;

import android.view.View;

import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;

class ActivityMainBindingImpl extends ViewDataBinding {
    public ActivityMainBindingImpl(androidx.databinding.DataBindingComponent component, View view) {

    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object value) {
        return false;
    }

    @Override
    protected void executeBindings() {

    }

    @Override
    public void invalidateAll() {

    }

    @Override
    public boolean hasPendingBindings() {
        return false;
    }
}
