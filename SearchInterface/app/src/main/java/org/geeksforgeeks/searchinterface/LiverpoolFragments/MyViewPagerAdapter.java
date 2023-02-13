package org.geeksforgeeks.searchinterface.LiverpoolFragments;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import org.geeksforgeeks.searchinterface.LiverpoolFragments.DetaljiFragment;
import org.geeksforgeeks.searchinterface.LiverpoolFragments.PostaveFragment;
import org.geeksforgeeks.searchinterface.LiverpoolFragments.UtakmiceFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new DetaljiFragment();
            case 1:
                return new PostaveFragment();
            case 2:
                return new UtakmiceFragment();
            default:
                return new DetaljiFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

