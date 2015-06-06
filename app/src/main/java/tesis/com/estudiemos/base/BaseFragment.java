package tesis.com.estudiemos.base;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tesis.com.estudiemos.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class BaseFragment extends Fragment {

    public BaseFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_base, container, false);
    }
}
