package com.mobilepearls.memory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MemoryMenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// AdManager.setTestDevices(new String[] { AdManager.TEST_EMULATOR });
		setContentView(R.layout.menu);

		final MemoryMenuActivity self = this;

		Button playButton = (Button) findViewById(R.id.startbutton);
		playButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(self, MemoryActivity.class);
				startActivity(intent);
			}
		});

		Button highscoreButton = (Button) findViewById(R.id.highscorebutton);
		highscoreButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(self, ListHighScoresActivity.class);
				startActivity(intent);
			}
		});

		Button aboutButton = (Button) findViewById(R.id.aboutbutton);
		aboutButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(self, AboutActivity.class);
				startActivity(intent);
			}
		});

		Button exitButton = (Button) findViewById(R.id.exitbutton);
		exitButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

}
