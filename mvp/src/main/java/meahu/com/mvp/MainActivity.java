package meahu.com.mvp;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener {

    private ProgressBar pb;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb = (ProgressBar) findViewById(R.id.progress_bar);
        textView = (TextView) findViewById(R.id.tv);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void showMessage(String message) {
        textView.setText(message);
        pb.setVisibility(View.GONE);
    }

    @Override
    public void showToast(@StringRes int String) {
        Toast.makeText(this, String, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showProgressbar() {
        pb.setVisibility(View.VISIBLE);
    }

    @Override
    public void setDate(String s) {
        textView.setText(s);
    }


    @Override
    public void onClick(View v) {

    }
}
