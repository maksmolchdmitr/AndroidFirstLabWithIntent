package maks.molch.dmitr;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        View view = findViewById(R.id.view);

        String color = getIntent().getStringExtra("COLOR_KEY");

        int backgroundColor = Color.WHITE;

        if (color != null) {
            switch (color.toLowerCase()) {
                case "red":
                    backgroundColor = Color.RED;
                    break;
                case "green":
                    backgroundColor = Color.GREEN;
                    break;
                case "blue":
                    backgroundColor = Color.BLUE;
                    break;
            }
        }

        view.setBackgroundColor(backgroundColor);
    }
}
