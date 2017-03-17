package com.example.bridgeit.myfragment2;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by bridgeit on 17/3/17.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumberOfTabs;
    public PagerAdapter(FragmentManager fm, int NumberOfTabs){
        super(fm);
        this.mNumberOfTabs=NumberOfTabs;

    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Call cl = new Call();
                return cl;
            case 1:
                Chats chats = new Chats();
                return chats;
            case 2:
                Contacts contacts = new Contacts();
                return contacts;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}
