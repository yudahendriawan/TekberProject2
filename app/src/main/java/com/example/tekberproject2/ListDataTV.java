package com.example.tekberproject2;

import android.util.Log;

import com.example.tekberproject2.model.DataTV;
import com.example.tekberproject2.model.GuestStar;

import java.util.ArrayList;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class ListDataTV {

    public static String[][] data = new String[][]{
            {"7","1","The Pack","1997-04-07","Bruce Seth Green","7.2","Patrese Borem","Man","Jennifer Sky","Woman","https://res.cloudinary.com/teepublic/image/private/s--46nYIoT5--/t_Resized%20Artwork/c_fit,g_north_west,h_954,w_954/co_ffffff,e_outline:48/co_ffffff,e_outline:inner_fill:48/co_ffffff,e_outline:48/co_ffffff,e_outline:inner_fill:48/co_bbbbbb,e_outline:3:1000/c_mpad,g_center,h_1260,w_1260/b_rgb:eeeeee/c_limit,f_jpg,h_630,q_90,w_630/v1477732245/production/designs/759486_1.jpg"},
            {"10","1","The Puppet Show","1997-05-05","Ellen S. Pressman","7.4","Michelle Miracle","Woman","Krissy Carlson","Man","https://i.pinimg.com/736x/d4/17/ba/d417ba6d037fe613df2697c388cb2cb9.jpg"},
            {"9","1","I Robot, You Jane","1997-04-28","Stephen Posey","6.9","Mark Deakins","Man","Damon Sharp","Man","https://render.fineartamerica.com/images/rendered/default/framed-print/images/artworkimages/medium/1/straw-hat-pirates-jolly-roger-jonathon-summers.jpg?imgWI=6.000&imgHI=8.000&sku=CRQ13&mat1=PM918&mat2=&t=2&b=2&l=2&r=2&off=0.5&frameW=0.875"},
    };

    public static ArrayList<DataTV> getListData(){
        ArrayList<DataTV> list = new ArrayList<>();

        for (String[] aData : data){
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
        }
        return list;
    }

}
