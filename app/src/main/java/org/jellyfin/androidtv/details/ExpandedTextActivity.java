package org.jellyfin.androidtv.details;

import android.os.Bundle;
import android.widget.TextView;

import org.jellyfin.androidtv.R;
import org.jellyfin.androidtv.TvApp;

import androidx.fragment.app.FragmentActivity;

public class ExpandedTextActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expanded_text);

        TextView text = (TextView)findViewById(R.id.textView);
        text.setTypeface(TvApp.getApplication().getDefaultFont());
        text.setText(getIntent().getStringExtra("text"));
    }

}
