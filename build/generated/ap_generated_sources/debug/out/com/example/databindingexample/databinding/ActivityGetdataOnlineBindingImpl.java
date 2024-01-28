package com.example.databindingexample.databinding;
import com.example.databindingexample.R;
import com.example.databindingexample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityGetdataOnlineBindingImpl extends ActivityGetdataOnlineBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityGetdataOnlineBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivityGetdataOnlineBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvUserEmail.setTag(null);
        this.tvUserName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.person == variableId) {
            setPerson((com.example.databindingexample.Person) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPerson(@Nullable com.example.databindingexample.Person Person) {
        this.mPerson = Person;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.person);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String personFirstName = null;
        java.lang.String personEmail = null;
        com.example.databindingexample.Person person = mPerson;
        java.lang.String personLastname = null;
        java.lang.String personFirstNamePersonLastname = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (person != null) {
                    // read person.firstName
                    personFirstName = person.getFirstName();
                    // read person.email
                    personEmail = person.getEmail();
                    // read person.lastname
                    personLastname = person.getLastname();
                }


                // read (person.firstName) + (person.lastname)
                personFirstNamePersonLastname = (personFirstName) + (personLastname);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserEmail, personEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserName, personFirstNamePersonLastname);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): person
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}