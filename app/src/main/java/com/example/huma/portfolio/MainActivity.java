package com.example.huma.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.title) TextView mTitle;
    @BindView(R.id.popular_movies) Button mPopularMovies;
    @BindView(R.id.stock_hawk) Button mStockHawk;
    @BindView(R.id.build_it_bigger) Button mBuildItBigger;
    @BindView(R.id.make_your_app_material) Button mMakeYourAppMaterial;
    @BindView(R.id.go_ubiquitous) Button mGoUbiquitous;
    @BindView(R.id.capstone) Button mCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.popular_movies, R.id.stock_hawk, R.id.build_it_bigger, R.id.make_your_app_material, R.id.go_ubiquitous, R.id.capstone})
    public void onClick(View view) {
        String placeHolderMessage =
                String.format("This button will launch %s app!", ((Button) view).getText());
        switch (view.getId()) {
            case R.id.popular_movies:
                Toast.makeText(MainActivity.this, placeHolderMessage, Toast.LENGTH_LONG).show();
                break;
            case R.id.stock_hawk:
                Toast.makeText(MainActivity.this, placeHolderMessage, Toast.LENGTH_LONG).show();
                break;
            case R.id.build_it_bigger:
                Toast.makeText(MainActivity.this, placeHolderMessage, Toast.LENGTH_LONG).show();
                break;
            case R.id.make_your_app_material:
                Toast.makeText(MainActivity.this, placeHolderMessage, Toast.LENGTH_LONG).show();
                break;
            case R.id.go_ubiquitous:
                Toast.makeText(MainActivity.this, placeHolderMessage, Toast.LENGTH_LONG).show();
                break;
            case R.id.capstone:
                Toast.makeText(MainActivity.this, placeHolderMessage, Toast.LENGTH_LONG).show();
                break;
        }
    }
}
