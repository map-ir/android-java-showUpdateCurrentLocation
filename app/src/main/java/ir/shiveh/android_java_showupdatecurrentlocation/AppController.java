package ir.shiveh.android_java_showupdatecurrentlocation;

import android.app.Application;

import ir.map.sdk_map.Mapir;

public class AppController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //TODO Please add your API_KEY
        Mapir.getInstance(this, "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6Ijk5MzM4ZTg4ZDQ4OWRkYWU0MDViMjEwNWExMzA1YjZlYWFmZjQ5ZTkxZjk4NjYxMTk4ZDhiMDZiOTc2Mjc5MmRlOWFmMjQwN2IzNzVjNzNmIn0.eyJhdWQiOiI5NDQ5IiwianRpIjoiOTkzMzhlODhkNDg5ZGRhZTQwNWIyMTA1YTEzMDViNmVhYWZmNDllOTFmOTg2NjExOThkOGIwNmI5NzYyNzkyZGU5YWYyNDA3YjM3NWM3M2YiLCJpYXQiOjE1OTkzNzkwMDgsIm5iZiI6MTU5OTM3OTAwOCwiZXhwIjoxNjAxOTc0NjA4LCJzdWIiOiIiLCJzY29wZXMiOlsiYmFzaWMiXX0.ovF71cQXJ0PFu1rh_cLUCiXUEF5XpuxSMMI8DMcEJLJ8G-pMC9owTqX_7HmvB4dN_ZeF7VXzGouFzD2gfMgd6mvM6jHCH-T8HFH8aTER-rAXg2H8ZLqBaPNslpDLDZ-mHdBRvVCSThNtqlILeO8QJhCxP4-oO3Qcq4LTZ73x5OebZdGzcUGEiFHaJsSP2VYb2SAggkeQzMdmkxWFxXbtfu7X6tOfj-JFuNR3Dcdq6p95FIaE_WZBJ40kIxIvNaEumZG9z1jIc-t0Ba-huUFqBDn1Svrvp6RiSLMyshHYTtGlVDmyRKE_ojapGS2v-EJ6T7jQxeUSbNYAQhDdyhrVHQ");
    }
}
