package com.example.cheat_gta;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMahasiswa = new ArrayList<>();
    private ArrayList<String> namaMahasiswa = new ArrayList<>();
    private ArrayList<String> infoMahasiswa = new ArrayList<>();
    private ArrayList<String> kelasMahasiswa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMahasiswa, namaMahasiswa, infoMahasiswa, kelasMahasiswa, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private  void getDataFromInternet(){

        namaMahasiswa.add("GTA VICE CITY");
        fotoMahasiswa.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTzrZr7gXW-uu7miabZaiWTXlENj2rkXUER4hAyiMgCBMzm2W2d&usqp=CAU");
        infoMahasiswa.add("Health [Catatan 1]  =  aspirine\n" +
                "Armor  =  preciousprotection\n" +
                "Senjata (tier 1)  =  thugstools\n" +
                "Senjata (tier 2)  =  professionaltools\n" +
                "Senjata (tier 3)  =  nuttertools\n" +
                "Meningkatkan wanted level  =  youwonttakemealive\n" +
                "Mengurangi wanted level (anti polisi)  =  leavemealone\n" +
                "Ahli menyetir  =  gripiseverything\n" +
                "Mobil dodo (terbang) [Catatan 2]  =  omeflywithme\n" +
                "Rhino tank  =  panzer\n" +
                "Mempercepat waktu  =  lifeispassingmeby\n" +
                "Mempercepat game play  =  onspeed\n" +
                "Memperlambat game play (matrix)  =  booooooring\n" +
                "Menghancurkan semua mobil  =  bigbang\n" +
                "Pejalan kaki berkelahi  =  fightfightfight\n" +
                "Pejalan kaki menyerangmu  =  nobodylikesme\n" +
                "Pedestrians have weapons  =  ourgodgivenrighttobeararms\n" +
                "Pejalan kaki memasuki mobilmu  =  hopingirl\n" +
                "Mengubah ukuran ban  =  loadsoflittlethings\n" +
                "Kostum Ken Rosenberg  =  mysonisalawyer\n" +
                "Kostum Hilary King  =  ilooklikehilary\n" +
                "Kostum Jezz Torent (Love Fist)  =  rockandrollman\n" +
                "Kostum Dick (Love Fist)  =  weloveourdick\n" +
                "Kostum Phil Cassaday  =  onearmedbandit\n" +
                "Kostum Sonny Forelli  =  idonthavethemoneysonny\n" +
                "Kostum Mercedes  =  foxylittlething\n" +
                "Mobil berjalan di air  =  seaways\n" +
                "Mobil yang lebih cepat  =  getthereveryfastindeed\n" +
                "Mobil yang sangat cepat  =  getthereamazinglyfast\n" +
                "Semua mobil cepat  =  gettherefast\n" +
                "Groupie Tommy [Catatan 5]  =  fannymagnet");
        kelasMahasiswa.add("KODE CHEAT GTA PC");

        namaMahasiswa.add("GTA Sanadreas");
        fotoMahasiswa.add("https://i2.wp.com/www.gimbot.com/wp-content/uploads/2019/10/alasan-gta-san-andreas-susah-dilupakan-featured.jpg?fit=1200%2C675&ssl=1");
        infoMahasiswa.add("Senjata (Set 1)  =  LXGIWYL\n" +
                "\n" +
                "Senjata (Set 2)  =  PROFESSIONALSKIT\n" +
                "\n" +
                "Senjata (Set 3)  =  UZUMYMW\n" +
                "\n" +
                "Parasut  =  AIYPWZQP\n" +
                "\n" +
                "Nyawa Tak Terbatas (kecuali jatuh atau terkena ledakan)  =  CAINEMVHZC\n" +
                "\n" +
                "Hitman Level di Semua Senjata  =  PROFESSIONALKILLER\n" +
                "\n" +
                "Amunisi tak terbatas  =  FULLCLIP\n" +
                "\n" +
                "Kurus  =  KVGYZQK\n" +
                "\n" +
                "Gendut  =  BTCDBCB\n" +
                "\n" +
                "Lompatan BMX yang Tinggi  =  JHJOECW\n" +
                "\n" +
                "Keahlian Menyetir Natural  =  NATURALTALENT\n" +
                "\n" +
                "Keahlian Menyetir Maksimal  =  STICKLIKEGLUE\n" +
                "\n" +
                "Lompatan Tinggi  =  KANGAROO\n" +
                "\n" +
                "Nafas dalam Air Tanpa Batas  =  CVWKXAM\n" +
                "\n" +
                "Kontrol Senjata Manual di Mobil  =  OUIQDMW\n" +
                "\n" +
                "Pukulan Super  =  STINGLIKEABEE\n" +
                "\n" +
                "Tidak pernah Lapar  =  AEDUWNV\n" +
                "\n" +
                "Respek Maksimum  =  WORSHIPME\n" +
                "\n" +
                "Badan Berotot  =  BUFFMEUP\n" +
                "\n" +
                "Gerak Cepat  =  SPEEDITUP\n" +
                "\n" +
                "Gerak Lambat  =  SLOWITDOWN");
        kelasMahasiswa.add("KODE CHEAT GTA PC");

        namaMahasiswa.add("GTA IV");
        fotoMahasiswa.add("data:image/jpeg;base64,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");
        infoMahasiswa.add("Max Health & Armor  =  Dial 362-555-0100\n" +
                "Max Health, Armor and Ammo  =  Dial 482-555-0100\n" +
                "Weapons 1  =  Dial 486-555-0150\n" +
                "Knife, Molotovs, Pistol, Pump Shotgun, Micro SMG, Assault Rifle, Combat Sniper, RPG\n" +
                "Weapons 2  =  Dial 486-555-0100\n" +
                "Grants Baseball Bat, Grenades, Combat Pistol, Combat Shotgun, SMG, Carbine Rifle, Combat Sniper, RPG\n" +
                "Remove Wanted Level  =  Dial 267-555-0100\n" +
                "Raise Wanted Level  =  Dial 267-555-0150\n" +
                "Change Weather  =  Dial 468-555-0100\n" +
                "Spawn Annihilator Helicopter  =  Dial 359-555-0100\n" +
                "Spawn Banshee  =  Dial 265-555-2423\n" +
                "Spawn Cognoscenti  =  Dial 227-555-0142\n" +
                "Spawn Comet  =  Dial 227-555-0175\n" +
                "Spawn Buffalo  =  Dial 227-555-0100\n" +
                "Spawn Jetmax  =  Dial 938-555-0100\n" +
                "Spawn NRG-900  =  Dial 625-555-0100\n" +
                "Spawn Sanchez  =  Dial 625-555-0150\n" +
                "Spawn SuperGT  =  Dial 227-555-0168\n" +
                "Spawn Turismo  =  Dial 227-555-0147");
        kelasMahasiswa.add("KODE CHEAT PC");

        namaMahasiswa.add("GTA V");
        fotoMahasiswa.add("https://cdn1-production-images-kly.akamaized.net/Xu4V9nfU92jPSjt2GUOc5Y1RG-E=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/21966/original/gta-v-130923c.jpg");
        infoMahasiswa.add("CATCHME  =  Lari dengan cepat\n" +
                "INCENDIARY  =  Peluru api\n" +
                "HIGHEX  =  Peluru meledak\n" +
                "HOTHANDS  =  Tinjuan super\n" +
                "SLOWMO  =  Mode slow-motion\n" +
                "DEADEYE  =  Membidik senjata dengan slow-motion\n" +
                "FLOATER  =  Gravitasi rendah\n" +
                "SNOWDAY  =  Mobil licin\n" +
                "LIQUOR  =  Mode mabuk\n" +
                "SKYFALL  =  Skyfall\n" +
                "MAKEITRAIN  =  Ubah cuaca\n" +
                "PAINKILLER  =  Jadi super dan tidak dapat mati selama 5 menit\n" +
                "JRTALENT  =  Memilih semua karakter yang ada\n" +
                "TURTLE  =  Nyawa dan Armor full\n" +
                "TOOLUP  =  Dapat banyak senjata dan peluru ekstra\n" +
                "LAWYERUP = Level pengejaran polisi terendah (Bintang 1)\n" +
                "FUGITIVE = Level pengejaran polisi tertinggi (Bintang 5)\n" +
                "HOPTOIT  =  Loncat super\n" +
                "POWERUP  =  Mengisi kemampuan secara instan\n" +
                "GOTGILLS  =  Berenang dengan cepat");
        kelasMahasiswa.add("KODE CHEAT GTA");



        prosesRecyclerViewAdapter();

    }
}
