package com.hfad.iak_satriya;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by satriya on 07/02/18.
 */

public class ItemObject {
    @SerializedName("results")
    List<Results> results;

    //This class has two fields that represent the person name and birth date of a person. These fields are annotated with the @SerializedName annotation. The parameter (value) of this annotation is the name to be used when serialising and deserialising objects. For example, the Java field personName is represented as name in JSON.
    public class Results{
        @SerializedName("poster_path")
        public String poster_path;

        @SerializedName("original_title")
        public String original_title;

        @SerializedName("overview")
        public String overview;

        @SerializedName("release_date")
        public String release_date;

        @SerializedName("backdrop_path")
        public String backdrop_path;

        @SerializedName("vote_average")
        public String vote_average;

        @SerializedName("id")
        public String id;
    }
}
