package jp.a769.insomnia.ciolcaluculator;

/**
 * Created by ryotakishimoto on 2017/11/19.
 */


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class ExampleFragmentPagerAdapter extends FragmentPagerAdapter {
    public ExampleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExampleFragment.newInstance(android.R.color.holo_blue_bright);
            case 1:
                return ExampleFragment.newInstance(android.R.color.holo_green_light);
            case 2:
                return ExampleFragment.newInstance(android.R.color.holo_red_dark);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "ページ" + (position + 1);
    }
}