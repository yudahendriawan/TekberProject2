package com.example.tekberproject2;

import android.util.Log;

import com.example.tekberproject2.model.DataTV;
import com.example.tekberproject2.model.GuestStar;

import java.util.ArrayList;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class ListDataTV {

    public static String[][] data = new String[][]{
            {"10","1","The Puppet Show","1997-05-05","Ellen S. Pressman","7.4","Michelle Miracle","Woman","Krissy Carlson","Man","https://i.pinimg.com/736x/d4/17/ba/d417ba6d037fe613df2697c388cb2cb9.jpg"},
            {"9","1","I Robot, You Jane","1997-04-28","Stephen Posey","6.9","Mark Deakins","Man","Damon Sharp","Man","https://www.thegadgetstore.ie/user/products/large/tobbie-diy-robot-build-your-own-gadget.png"}
    };

    public static ArrayList<DataTV> getListData(){
        ArrayList<DataTV> list = new ArrayList<>();

        for (String[] aData : data){
            GuestStar guestStar = new GuestStar();
            DataTV dataTV = new DataTV();
            dataTV.setId(aData[0]);
            dataTV.setAiredSeason(aData[1]);
            dataTV.setEpisodeName(aData[2]);
            dataTV.setFirstAired(aData[3]);
            dataTV.setDirector(aData[4]);
            dataTV.setRating(aData[5]);
            dataTV.getGuestStar().setNama(aData[6]);
            dataTV.getGuestStar().setGender(aData[7]);
            dataTV.getGuestStar().setNama2(aData[8]);
            dataTV.getGuestStar().setGender2(aData[9]);
            dataTV.setPhotos(aData[10]);
            list.add(dataTV);
            Log.d(TAG, "getListData: "+dataTV.getGuestStar().getNama());
        }
        return list;
    }

}
