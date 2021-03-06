package tgo1014.aguaaguaaguamineral.Activities;

import android.os.Bundle;

import com.orhanobut.hawk.Hawk;

import tgo1014.aguaaguaaguamineral.Fragments.MainFragment;
import tgo1014.aguaaguaaguamineral.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializa toolbar
        configuraToolbar();
        Hawk.init(this).build();

        //Inicializar o fragment da aplicação
        MainFragment mainFragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, mainFragment).commit();
    }
}
