package com.example.esteticafinal;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                PedicuraFragment pedicuraFragment = new PedicuraFragment();
                return pedicuraFragment;
            case 1:
                CorteFragment corteFragment=new CorteFragment();
                return corteFragment;
            case 2:
                ColimetriaFragment colimetriaFragment=new ColimetriaFragment();
                return colimetriaFragment;
            case 3:
                ManicuraFragment manicuraFragment=new ManicuraFragment();
                return manicuraFragment;
            case 4:
                MaquillajeFragment maquillajeFragment=new MaquillajeFragment();
                return maquillajeFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        //paginas que va a regresar
        return 5;
    }
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Pedicura";
            case 1:
                return "Corte";
            case 2:
                return "Colimetria";
            case 3:
                return  "Manicura";
            case  4:
                return  "Maquillaje";
            default:
                return null;

        }
    }
}
