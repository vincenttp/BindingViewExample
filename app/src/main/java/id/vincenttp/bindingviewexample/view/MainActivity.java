package id.vincenttp.bindingviewexample.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import id.vincenttp.bindingviewexample.R;
import id.vincenttp.bindingviewexample.databinding.ActivityMainBinding;
import id.vincenttp.bindingviewexample.presenter.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setHandler(new Handler() {
            @Override
            public void onButtonClick(View view) {
                activityMainBinding.textView.setText(activityMainBinding.editText.getText());
            }
        });
    }
}
