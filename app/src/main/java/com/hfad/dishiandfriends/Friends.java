package com.hfad.dishiandfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Friends extends AppCompatActivity {

    TextView message ;
    ImageView friends;

    ArrayList<String> thoughts = new ArrayList<>();

    ArrayList<Integer> array_image = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        message = (TextView)findViewById(R.id.message);
        friends = (ImageView)findViewById(R.id.friends);

        //abhay
        thoughts.add("abhay");
        thoughts.add("Happiest birthday to the most sincere and formal girl i have ever met...\uD83E\uDD17you are really very very cute yaar...sach mein...\uD83D\uDE48always caring...helpful...intelligent...sweet and what not...❤❤i have never ever met a girl like you yaar...you r unique and best...\n" +
                "Blessed to have u as our friend...\uD83D\uDE0D\uD83D\uDE18\uD83D\uDE18\n" +
                "Happiesttt bday dear...bhagwanji teri saari wishes poori kre...teri health bhi humesha thk rakhe taki tu humare sath khane peene lage\uD83D\uDE1C\uD83D\uDE1Cbhtt long and healthy life de tujhe...alwayss keep smiling and never be stressed...\uD83D\uDE18\n" +
                "Love u deear...many many happy returns of the day once again\uD83C\uDF0F\uD83C\uDF82\uD83D\uDE0D\uD83D\uDE18❤");
        thoughts.add("A very happy birthday d\uD83E\uDD70\uD83E\uDD70\uD83E\uDD70\n" +
                "You are such a pure sole❤\n" +
                "Tumhare jaise sweet ladki mujhe aajtak nhi mili.\n" +
                "You are a complete package of kindness, sweetness, intelligence, smartness....\n" +
                "Aur jitna kahu kam hai\uD83E\uDD2D\uD83E\uDD2D\n" +
                "\n" +
                "Tum hardm sabki madad karti ho, no matter how the person behaves with you!\n" +
                "That's the best thing \uD83E\uDD70\uD83E\uDD70\uD83E\uDD70\n" +
                "\n" +
                "I can share everything with you, my goods n bads \n" +
                "And the best thing is you also enjoy in my happiness and keep me motivated in my bads\uD83E\uDD70\uD83E\uDD70\uD83E\uDD70\uD83E\uDD70\uD83E\uDD70\n" +
                "\n" +
                "That's my d ❤\n" +
                "Love you a lot ❤❤\n" +
                "Happy birthday ones again\uD83D\uDE18\uD83D\uDE18\uD83D\uDE18");
        thoughts.add("You were a reserved person, I was an outgoing one. After sharing company with each other, now you are less reserved and me less crazy..The Universe wanted us to meet so that we can help each other.\n The day we first met, I knew it already that we will become great friends.");

        thoughts.add("Happiest bday dishika \n" +
                "Meri x-roomie \uD83D\uDE0Ddadi-amma \uD83E\uDD2D discipline di Devi \uD83D\uDE0E sab kuch perfect chahiye es ldki ko from bedsheet\uD83D\uDECF to notebooks\uD83D\uDCDA to bday wishing Gmail ch wish bheji madam ne \uD83D\uDE05\uD83D\uDE0D \n" +
                "Twinkle bss 30 min ch utha dena keh keh ke enia sleep lendi koi ginti e ni bdi chngi bina khe samne aale di problem samjh lendi je mai as a roommate dukhi kita hove maafi I know bda sir khada ae tera Hun mai ki kran hor kida khaandi \uD83D\uDE10\uD83D\uDE1B kde kise nu apni problem Na dssni prr putt tere toh mere toh kuch luka v ni hunda c \uD83E\uDD17 koina aggge v twinkle is always there for u koi gl kehni hovi keh dvi earclose krke sunlu aaj tera bday ae aaj Na padhi mzee kri vaadhu jyada \uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D");
        thoughts.add("Happy birthday sweetheart\uD83E\uDD73\uD83E\uDD73\uD83E\uDD29\uD83E\uDD29\uD83C\uDF82\uD83C\uDF82\uD83C\uDF89\uD83C\uDF89\n" +
                "Gbu.....May u achieve great heights of success! Always be as sweet as u r\uD83D\uDE18\uD83D\uDE18");
        thoughts.add("Happiest bday  dishikaa\uD83D\uDC9E\uD83D\uDE0D......the most sweetest ❣and lovable girl i have ever  met......\uD83D\uDC93❤\uD83D\uDC98......saara tym padhai padhai.....hope that u may achieve the heights of success in ur life\uD83E\uDD29\uD83E\uDD29.....but thoda enjoy bhi krr liya krr.......thank you for tolerating our stupid talks and noise\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02......may god  bless u with joy and happiness......happiest bday baby\uD83D\uDE18\uD83D\uDE01.....love you \uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D\uD83D\uDC8B\uD83D\uDC8B");




        array_image.add(R.drawable.abhay);
        array_image.add(R.drawable.rasam);
        array_image.add(R.drawable.u);
        array_image.add(R.drawable.rupinder);
        array_image.add(R.drawable.twinkle);
        array_image.add(R.drawable.manisha);
        array_image.add(R.drawable.diksha);

        Intent intent = getIntent();

        int name = intent.getIntExtra("name",1);

        message.setText(thoughts.get(name));
        friends.setImageResource(array_image.get(name));



    }
}
