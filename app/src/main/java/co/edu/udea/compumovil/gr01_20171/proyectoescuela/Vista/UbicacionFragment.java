package co.edu.udea.compumovil.gr01_20171.proyectoescuela.Vista;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import co.edu.udea.compumovil.gr01_20171.proyectoescuela.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class UbicacionFragment extends Fragment {


    public UbicacionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ubicacion, container, false);

    }


}
