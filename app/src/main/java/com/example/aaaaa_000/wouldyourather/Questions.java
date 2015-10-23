package com.example.aaaaa_000.wouldyourather;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by home on 10/22/2015.
 */
@ParseClassName("Questions")
public class Questions extends ParseObject {
    public String getFirstQuestion(){
        return getString("firstOption");
    }

    public void setFirstQuestion(String question){
        put("firstOption", question);
    }

    public String getSecondQuestion(){
        return getString("secondOption");
    }

    public void setSecondQuestion(String question){
        put("secondOption", question);
    }
}
