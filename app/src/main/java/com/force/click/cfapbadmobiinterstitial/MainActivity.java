package com.force.click.cfapbadmobiinterstitial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.clickforce.ad.AdInterstitialView;
import com.clickforce.ad.Listener.AdInterstitialListener;

public class MainActivity extends AppCompatActivity {

    private AdInterstitialView fullad ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullad = (AdInterstitialView) this.findViewById(R.id.fullad);
        fullad.init(this);
        fullad.getFullScreenAd(7328);
        fullad.setOnAdInterstitialListener(new AdInterstitialListener() {
            @Override
            public void onCloseFullAd() {

            }

            @Override
            public void onFailToFullAd() {

            }

            @Override
            public void onSuccessToFullAd() {

                fullad.show();
            }

            @Override
            public void onClickToFullAd() {

            }
        });
    }
}
