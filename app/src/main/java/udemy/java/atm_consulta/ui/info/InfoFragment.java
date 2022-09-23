package udemy.java.atm_consulta.ui.info;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;
import udemy.java.atm_consulta.R;
import udemy.java.atm_consulta.databinding.FragmentHomeBinding;
import udemy.java.atm_consulta.databinding.FragmentInfoBinding;
import udemy.java.atm_consulta.databinding.FragmentServicesBinding;


public class InfoFragment extends Fragment {

    private FragmentInfoBinding binding;

    public InfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       /*binding = FragmentInfoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;

            */

        String text = "é uma canção da banda norte-americana de rock Linkin" +
                " Park (imagem), gravada para o seu álbum de estreia, Hybrid Theory (2000). " +
                "Foi escrita por todos os membros do grupo e produzida por Don Gilmore, " +
                "sendo gravada entre os anos de 1999 e 2000 nos estúdios NRG Recording, ela gravadora Warner";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        View aboutPage = new AboutPage(getActivity())

                .isRTL(false)
                .setImage(R.drawable.logo)
                .setDescription(text)

                .addGroup("Entre em conatacto")
                .addEmail("atendimento@atmconsultoria.com.br", "Envia um email")
                .addWebsite("https://www.google.com/", "Acesse nosso site")

                .addGroup("Redes sociais")
                .addFacebook("sergio.oliveira.3538", "Facebook")
                .addTwitter("medyo80", "Twitter")
                .addYoutube("sergio.oliveira.3538", "Youtube")
                .addPlayStore("com.github.android", "PlayStore download app")
                .addGitHub("OL-sergio", "GitHub")
                .addInstagram("sergio.oliveira.3538","Instagram")
                .addItem(versao)

                .create();

        return aboutPage;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}