package com.example.tugas_3;

import java.util.ArrayList;

public class AnimesData {
    private static String[] animeNames ={
            "Gintama",
            "Haikyuu",
            "Death Note",
            "Fullmetal Alchemist Brotherhood",
            "Hunter x Hunter",
            "Jujutsu Kaisen",
            "Kimetsu no Yaiba",
            "Kimi no Nawa",
            "Koe no Katachi",
            "Mob Psycho 100",
            "Shigatsu wa Kimi no Uso",
            "Shingeki no Kyojin"
    };

    private static String[] animeDetails ={
            "Gintama bercerita tentang kehidupan sehari-hari tokoh utamanya, yaitu Sakata Gintoki, yang mendirikan usaha bernama Yorozuya bersama dua temannya dan satu anjing. Mereka bersedia mengerjakan tugas apa saja asalkan dibayar agar dapat membiayai kehidupan sehari-hari. Pada laman myanimelist anime Gintama mendapatkan Rating 9.10 dan menempati peringkat ke-5 pada laman tersebut.",
            "Anime Haikyu merupakan salah satu anime olahraga asal Jepang. Haikyu dalam bahasa Indonesia berarti bola voli. Anime ini memang menceritakan tentan olahraga. Manga satu ini telah diadaptasi menjadi serial anime oleh Production I.G kemudian ditayangkan dari bulan April hingga September 2014 lalu. Pada laman myanimelist anime Haikyuu mendapatkan Rating 8.52 dan menempati peringkat ke-96 pada laman tersebut.",
            "Death Note adalah salah satu anime yang cukup populer. Anime ini mengikuti seorang pelajar bernama Light Yagami yang berambisi untuk menciptakan dunia baru dengan membantai para penjahat menggunakan Death Note. Pada laman myanimelist anime Death Note mendapatkan Rating 8.63 dan menempati peringkat ke-60 pada laman tersebut.",
            "Fullmetal Alchemist Brotherhood bercerita tentang kakak beradik bernama Edward dan Alphonse Elric yang mencoba menghidupkan kembali ibunya dari kematian dengan kekuatan Alkemis. Berbekal pengetahuan dari buku dan sedikit pembelajaran dari guru Alkemis mereka, kedua anak kecil ini melakukan ritual transmutasi manusia tanpa tahu resiko yang harus mereka bayar. Pada laman myanimelist anime Fullmetal Alchemist Brotherhood mendapatkan Rating 9.15 dan menempati peringkat ke-1 pada laman tersebut.",
            "Hunter x Hunter adalah sebuah seri manga shōnen Jepang yang ditulis dan diilustrasikan oleh Yoshihiro Togashi. Ceritanya berfokus pada seorang bocah lelaki bernama Gon Freecss, yang mengetahui bahwa ayahnya yang sudah meninggalkannya sejak masih kecil, sebenarnya merupakan seorang Hunter ternama di dunia, sebuah profesi berlisensi bagi mereka yang berspesialisasi dalam tetapi tidak terbatas pada pencarian hal tak lazim layaknya menemukan spesies hewan langka atau tidak dikenal, berburu harta karun, mengunjungi wilayah-wilayah yang belum terjamah, atau memburu individu yang melanggar hukum. Pada laman myanimelist anime Hunter x Hunter mendapatkan Rating 8.41 dan menempati peringkat ke-152 pada laman tersebut.",
            "Anime Jujutsu Kaisen mengisahkan tentang anak laki-laki bernama Itadori Yuji yang memiliki kekuatan fisik luar biasa mencoba menyelamatkan temannya yang diserang oleh kutukan. Untuk menyelamatkan temannya, Itadori memakan jari Double Faced Spectre. Sejak saat itu, Itadori harus berbagi tubuh dengan sang monster. Pada laman myanimelist anime Jujutsu Kaisen mendapatkan Rating 8.62 dan menempati peringkat ke-62 pada laman tersebut.",
            "Anime Kimetsu no Yaiba mengisahkan tentang Tanjiro Kamado, seorang anak laki-laki yang menjadi pembasmi iblis setelah keluarganya dibantai dan adik perempuannya yang bernama Nezuko diubah menjadi iblis.  Pada laman myanimelist anime Kimetsu no Yaiba mendapatkan Rating 8.61 dan menempati peringkat ke-63 pada laman tersebut.",
            "Kimi no Nawa menceritakan tentang dua remaja yang bernama Mitsuha Miyamizu dan Taki Tachibana yang saling bertukar tubuh satu sama lain. Awalnya mereka tidak menyadari pertukaran tubuh itu, mereka menganggapnya hanya mimpi semata. Pada laman myanimelist anime Kimi no Nawa mendapatkan Rating 8.95 dan menempati peringkat ke-16 pada laman tersebut.",
            "Koe no Katachi menceritakan tentang Nishimiya Shouko murid SD pindahan dan gadis dengan keterbatasan, berkebutuhan khusus yaitu seorang Tuna Rungu. Karena hal tersebut, ada beberapa murid yaitu teman sekelas Shouko termasuk Ishida Shouya melalukan Bullying terhadapnya. Pada laman myanimelist anime Koe no Katachi mendapatkan Rating 8.99 dan menempati peringkat ke-11 pada laman tersebut.",
            "Mob Psycho 100 bercerita tentang keseharian seorang Esper lugu bernama Kageyama Shigeo. Juga tentang hubungannya dengan orang-orang di sekitarnya dan masalah yang terus bermunculan. Pada laman myanimelist anime Mob Psycho 100 mendapatkan Rating 8.48 dan menempati peringkat ke-113 pada laman tersebut.",
            "Shigatsu wa Kimi no Uso menceritakan tentang seorang pianis berbakat bernama Kousei Arima. Kousei yang sangat berbakat sering sekali memenangi berbagai macam lomba. Hingga pada umurnya yang ke 11 tahun, Kousei memutuskan untuk tidak lagi bermain piano. Ia merasa tidak lagi memiliki tujuan. Pada laman myanimelist anime Shigatsu wa Kimi no Uso mendapatkan Rating 8.73 dan menempati peringkat ke-36 pada laman tersebut.",
            "Attack on Titan atau Shingeki no Kyojin berkisah tentang suatu zaman dimana umat manusia menghadapi ancaman kepunahan akibat serangan para Titan (manusia raksasa). Yang mengerikan adalah para Titan ini benar-benar sengaja mengincar manusia untuk dimakannya. Pada laman myanimelist anime Shingki no Kyojin mendapatkan Rating 8.49 dan menempati peringkat ke-109 pada laman tersebut."
    };

    private static int[] animeImages = {
            R.drawable._gintama,
            R.drawable._haikyuu,
            R.drawable.death_note,
            R.drawable.fullmetal_alchemist,
            R.drawable.hunter_x_hunter,
            R.drawable.jujutsu_kaisen,
            R.drawable.kimetsu_no_yaiba,
            R.drawable.kimi_no_nawa,
            R.drawable.koe_no_katachi,
            R.drawable.mob_psyco,
            R.drawable.shigatsu_wa_kimi_no_uso,
            R.drawable.shingeki_no_kyoujin
    };

    static ArrayList<Anime> getListData(){
        ArrayList<Anime> list = new ArrayList<>();
        for (int position = 0; position < animeNames.length; position++){
            Anime anime = new Anime();
            anime.setName(animeNames[position]);
            anime.setDetail(animeDetails[position]);
            anime.setPhoto(animeImages[position]);
            list.add(anime);
        }

        return list;
    }
}
