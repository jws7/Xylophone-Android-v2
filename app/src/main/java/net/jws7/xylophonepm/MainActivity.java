package net.jws7.xylophonepm;

import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import net.jws7.xylophonepm.R;

public class MainActivity extends AppCompatActivity {

    private SoundPool mSoundPool;
    private int[] mSoundIdArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        //mSoundPool = new SoundPool(7, AudioManager.STREAM_MUSIC, 0);
        mSoundPool = new SoundPool.Builder()
                .setMaxStreams(7)
                .build();


        // TODO: Load and get the IDs to identify the sounds
        mSoundIdArray = new int[]{
                mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1),
                mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1),
                mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1),
                mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1),
                mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1),
                mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1),
                mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1)
        };
    }

    // TODO: Add the play methods triggered by the buttons
    public void play(View button) {
        String tag = (String) button.getTag();
        int number = Integer.parseInt(tag);
        mSoundPool.play(mSoundIdArray[number], 1.0f, 1.0f, 1, 0, 2.0f);
    }
}
