package cn.edu.jnu.x2020103968;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button caculateButton =this.findViewById(R.id.caculate);
        EditText editTextScores=this.findViewById(R.id.editText);
        TextView textViewScore=this.findViewById(R.id.textView);
        caculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String scores=editTextScores.getText().toString();
                String[] arrayScore=scores.split(",");
                BowlingGame game =new BowlingGame();
                for(int i=0;i<arrayScore.length;i++)
                {
                    game.roll(Integer.parseInt(arrayScore[i]));
                }
                textViewScore.setText("Total Score is :"+game.score());
            }
        });
    }
}