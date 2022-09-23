package udemy.java.atm_consulta.ui.contacto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import udemy.java.atm_consulta.R;
import udemy.java.atm_consulta.databinding.FragmentContactoBinding;
import udemy.java.atm_consulta.databinding.FragmentHomeBinding;
import udemy.java.atm_consulta.databinding.FragmentServicesBinding;


public class ContactoFragment extends Fragment {

    private FragmentContactoBinding binding;

    public ContactoFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentContactoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}