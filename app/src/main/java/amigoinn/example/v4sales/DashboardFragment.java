package amigoinn.example.v4sales;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.v4sales.R;

public class DashboardFragment extends Fragment {
    RelativeLayout rlAdd;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.dashboard_fragment, container, false);

        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        rlAdd = (RelativeLayout) v.findViewById(R.id.rlAdd);
    }


}
