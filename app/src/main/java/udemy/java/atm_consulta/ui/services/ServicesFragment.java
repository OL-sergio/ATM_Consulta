package udemy.java.atm_consulta.ui.services;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import udemy.java.atm_consulta.databinding.FragmentServicesBinding;

public class ServicesFragment extends Fragment {

    private FragmentServicesBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentServicesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        String text = "é uma canção da banda norte-americana de rock Linkin" +
                " Park (imagem), gravada para o seu álbum de estreia, Hybrid Theory (2000). " +
                "Foi escrita por todos os membros do grupo e produzida por Don Gilmore, " +
                "sendo gravada entre os anos de 1999 e 2000 nos estúdios NRG Recording, ela gravadora Warner";

        binding.textViewTextViewTextSystem.setText(text);

        binding.textViewTextIndicators.setText(text);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}