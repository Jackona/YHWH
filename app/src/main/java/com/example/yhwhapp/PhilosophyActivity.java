package com.example.yhwhapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class PhilosophyActivity extends AppCompatActivity {

    TextView tv_p;
    Button Philosophy_button;

    private String jokes[] = {"Happiness is the meaning and the purpose of life, the whole aim and end of human existence - Aristotle",
            "The secret of happiness, you see is not found in seeking more, but in developing the capacity to enjoy less - Socrates",
            "The greatest blessings of mankind are within us and within our reach. A wise man is content with his lot, whatever it may be, without wishing for what he has not - Seneca",
            "If you hate a person, then you’re defeated by them - Confucius ",
            "Life exists only at this very moment, and in this moment it is infinite and eternal, for the present moment is infinitely small; before we can measure it, it has gone, and yet it exists forever - Alan Watts",
            "If I cannot do great things, I can do small things in a great way - Dr. Martin Luther King Jr ",
            "Love is born into every human being; it calls back the halves of our original nature together; it tries to make one out of two and heal the wound of human nature - Plato",
            "I see all this potential, and I see squandering. God damn it, an entire generation pumping gas, waiting tables; slaves with white collars. Advertising has us chasing cars and clothes, working jobs we hate so we can buy shit we don't need. We're the middle children of history, man. No purpose or place. We have no Great War. No Great Depression. Our Great War's a spiritual war, our Great Depression is our lives - Tyler Durden",
            "You have power over your mind – not outside events. Realize this, and you will find strength - Marcus Aurelius ",
            "Man is not worried by real problems so much as by his imagined anxieties about real problems - Epictetus ",
            "It’s not because things are difficult that we dare not venture. It’s because we dare not venture that they are difficult - Seneca",
            "I am not afraid of an army of lions led by a sheep; I am afraid of an army of sheep led by a lion - Alexander The Great "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philosophy);

        ImageButton imageButton36 = findViewById(R.id.imageButton36);
        imageButton36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        tv_p = (TextView) findViewById(R.id.tv_p);
        Philosophy_button = (Button) findViewById(R.id.Philosophy_button);
        Philosophy_button.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View v) {
                Random random=new Random();
                int num = random.nextInt(jokes.length);
                tv_p.setText(jokes[num]);    }
        });



    }
    public void openHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);


    }
}