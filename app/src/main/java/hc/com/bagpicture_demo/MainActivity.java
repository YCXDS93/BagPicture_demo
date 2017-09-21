package hc.com.bagpicture_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageSurfaceView img = (ImageSurfaceView) findViewById(R.id.worldview);

        InputStream inputStream = null;
        try {
            inputStream = getAssets().open("world.jpg");
            img.setInputStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
