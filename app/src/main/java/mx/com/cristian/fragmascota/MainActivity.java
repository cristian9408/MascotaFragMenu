package mx.com.cristian.fragmascota;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.design.widget.TabLayout;


import mx.com.cristian.fragmascota.adapter.PageAdapter;
import mx.com.cristian.fragmascota.fragment.PerfilFragment;
import mx.com.cristian.fragmascota.fragment.RecyclerViewFragment;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        setUpViewPager();

        if(toolbar!=null)
        {
            setSupportActionBar(toolbar);
        }
    }
    private ArrayList<Fragment> agregarFragments()
    {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new RecyclerViewFragment());
        fragments.add(new PerfilFragment());
        return fragments;
    }
    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.casa);
        tabLayout.getTabAt(1).setIcon(R.drawable.perro);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.mFavoritos:
                Intent intent = new Intent(MainActivity.this, MascotasFavoritas.class);
                System.out.println(intent);
                startActivity(intent);
                break;
            case R.id.mContacto:
                Intent intentContacto = new Intent(MainActivity.this, ContactoEnviarCorreo.class);
                System.out.println(intentContacto);
                startActivity(intentContacto);
                break;
            case R.id.mAcercade:
                Intent intentAcercade = new Intent(MainActivity.this, AcercaDe.class);
                startActivity(intentAcercade);
                System.out.println(intentAcercade);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}

