package com.example.bridgeit.musicplayer;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    SeekBar seekBar;
    Handler handler;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar=(SeekBar)findViewById(R.id.skBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mediaPlayer.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.nevercloseyour);
        seekBar.setMax(mediaPlayer.getDuration());

    }
    public void test(View view) {
        switch (view.getId())
        {
            case R.id.play:
                mediaPlayer.start();
            case R.id.pause:
                mediaPlayer.pause();
            case R.id.stop:
                mediaPlayer.stop();
        }
    }
}
