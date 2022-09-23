package udemy.java.atm_consulta;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import java.time.Instant;

import udemy.java.atm_consulta.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarEmail();
            }
        });

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_customers, R.id.nav_contact, R.id.nav_contact, R.id.nav_info)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    private void enviarEmail() {
        String telemovel = "tel: 939316327";
        String imagem = "https://www.des1gnon.com/wp-content/uploads/2020/03/Pexels-Banco-de-Imagens-gratis-Des1gnON.jpg";
        String moradaGoogle = "https://www.google.com/maps/place/AeroPerspectiva+-+Imagens+A%C3%A9reas/@41.548014,-8.5358405,12z/data=!3m1!5s0xd24fea3881763d1:0x26a3c1b634c9a722!4m9!1m2!2m1!1simagens!3m5!1s0xd24fc3ab8c50a9d:0x47bcaa243ec17bfb!8m2!3d41.548009!4d-8.404012!15sCgdpbWFnZW5zkgEHYWlybGluZeABAA";
        String email = "" ;

        //Intent instant  = new Intent(Intent.ACTION_DIAL, Uri.parse(telemovel));
        //Intent instant  = new Intent(Intent.ACTION_VIEW, Uri.parse(imagem));
        Intent intent  = new Intent( Intent.ACTION_SEND );

        intent.putExtra( Intent.EXTRA_EMAIL, new String[]{"atendimento@atmconsultoria.com.br"});
        intent.putExtra( Intent.EXTRA_SUBJECT,"sergio@live.com");
        intent.putExtra( Intent.EXTRA_TEXT, "Mensagem Automática");

        intent.setType("message/rfc822");
        //intent.setType("text/plain");
        //intent.setType("image/*");
        //intent.setType("application/pdf");

        startActivity( Intent.createChooser( intent, "Escolha uma app para envio do email"));
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}