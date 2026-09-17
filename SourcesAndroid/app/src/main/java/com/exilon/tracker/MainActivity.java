package com.exilon.tracker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOpenWeb = findViewById(R.id.btnOpenWeb);
        btnOpenWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String portalUrl = "https://esws.oneapp.dev/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(portalUrl));
                startActivity(intent);
            }
        });
    }
}
