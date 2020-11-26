package com.example.halalharam;

import java.util.ArrayList;

public class DataHalalFood {
    private static String[] NamaMakananHalal = {
            "Unta",
            "Kelinci ",
            "Rusa",
            "Sapi",
            "Burung",
            "Kuda",
            "Ayam",
            "Kangguru",
            "Tupai",
            "Keledai Liar",
    };
    private static String[] DetailMakananHalal = {
            "Unta\n" +
                    "\nDaging unta memiliki tekstur yang lebih tidak berlemak dan juga bisa menjadi  sumber vitamin E yang baik. Oleh sebab itu, daging ini dianggap lebih sehat daripada daging merah lainnya, seperti daging sapi dan kambing.  \n" + "Terlebih lagi, yang bermanfaat tak hanya dagingnya saja. Susu unta juga mengandung vitamin C tiga kali lipat lebih banyak dari susu sapi, serta kaya akan zat besi dan vitamin B.",
            "Kelinci\n" +
                    "\nKelinci juga dianggap haram karena memiliki cakar seperti kucing dan hewan-hewan buas. Selain itu, kelinci diyakini memiliki darah mirip darah wanita (yang dikeluarkan saat menstruasi). ... Lewat sidang di Jakarta pada 12 Maret 1983, Komisi Fatwa MUI menetapkan bahwa hukum memakan daging kelinci adalah halal.",
            "Rusa\n" +
                    "\npendeknya, hewan-hewan hasil buruan itu pada dasarnya halal dimakan, kecuali hewan yang aslinya tidak boleh dimakan seperti biawak karena termasuk hewan buas.\u2028\n" + "Selebihnya, , rusa dan hewan lainnya yang pada dasarnya memang hewan halal, maka kalau mati dengan cara diburu dengan sengaja dan memenuhi ketentuan syariat Islam, hukum dagingnya halal dimakan, meski tidak lewat penyembelihan.\u2028\n" + "Dalam syariat Islam, sesungguhnya berburu adalah salah satu cara untuk mendapatkan makanan yang halal, selain lewat penyembelihan yang syar'i.",
            "Sapi\n" +
                    "\nPertama : Diimpor dari negara-negara yang mayoritas penduduknya orang-orang musyrik seperti Jepang, China, Rusia, Thailand, maka hukumnya haram.\n" +
                    "\nKedua : Diimpor dari negara-negara yang mayoritas penduduknya ahlul kitab, seperti Amerika, Eropa dan Israel. Maka dalam hal ini mengandung beberapa keadaan :\n" +
                    "\n" +
                    "\nKeadaan Pertama : Telah diketahui bahwa daging-daging yang diimpor tersebut berasal dari binatang yang dibunuh secara tidak benar, seperti dipukul kepalanya sampai mati, atau disetrum. \n" +
                    "\n" +
                    "\nKeadaan Kedua : Telah diketahui bahwa daging-daging yang diimpor tersebut disembelih secara benar, maka hukumnya halal.",
            "Burung\n" +
                    "\nDari Ibnu ‘Abbas dia berkata: Dulu orang-orang di masa jahiliyyah makan apa-apa dan meninggalkan apa-apa karena merasa jijik. Kemudian Allah mengutus Nabi-Nya Shallallahu ‘alaihi wa sallam dan menurunkan kitab-Nya, menghalalkan perkara yang halal dan mengaramkan perkara yang haram. Apa yang dihalalkan oleh Allah maka itu halal dan apa yang diharamkan oleh Allah maka itu haram.",
            "Kuda\n" +
                    "\nInilah hadis-hadis yang menerangkan bahwa daging kuda adalah halal dimakan. Sedangkan hadis yang melandasi keharamannya adalah: Rasululloh melarang kita untuk memakan daging keledai, kuda dan peranakan dari keduanya. Nabi saw melarang kita untuk memakan daging kuda pada waktu perang Khoibar",
            "Ayam\n" +
                    "\nJika daging itu dijual atau dihidangkan oleh orang yang halal sembelihannya, yakni Muslim atau ahli kitab (Yahudi dan Nasrani), kita boleh membeli dan memakannya. Tidak perlu menanyakan bagaimana daging itu disembelih. Hukum dasar (al-ashl) dalam sembelihan mereka adalah halal. Sedangkan sembelihan orang kafir non ahli kitab, tidak boleh dibeli atau dikonsumsi. Demikian difatwakan oleh banyak Ulama besar zaman ini.",
            "Kanguru\n" +
                    "\nJika kanguru termasuk kategori hewan herbivora (pemakan tumbuhan), bukan karnivora (pemakan daging), tidak termasuk binatang buas, tidak bertaring, tidak mencengkeram, tidak memangsa, tidak memakan bangkai, tidak menjijikkan, dan tidak ada faktor atau unsur penyebab haram, maka hukumnya halal untuk konsumsi.",
            "Tupai\n" +
                    "\nUlama berselisih pendapat tentang hukum makan tupai. Jumhur (mayoritas) ulama berpendapat bahwa makan tupai hukumnya halal. Sementara sebagian ulama berpendapat haramnya tupai, karena hewan ini mengigit dengan taringnya. Pendapat kedua ini merupakan pendapat Madzhab Hanafi dan sebagian ulama Syafi’iyah dan Hanabilah. Sementara Malikiyah berpendapat makruh. Pendapat yang lebih kuat adalah boleh, sebagaimana yang ditegaskan Imam An-Nawawi dalam al-Majmu’, Ibnu Qudamah dalam al-Mughni, Khalil dalam at-Taudhih, dan Al-Mardawi dalam al-Inshaf.",
            "Keledai liar\n" +
                    "\nDaging Keledai Liar Hukumnya Halal Karena daging keledai piaraan (jinak) telah diharamkan maka mafhum mukhafalah-nya (kebalikan) berarti daging keledai liar adalah boleh untuk dimakan. ... Adanya najis pada daging keledai maka di perkuat bahwa daging keledai tersebut haram dan sesuatu yang najis itu haram untuk di makan",
    };
    private static int[] GambarMakananHalal = {
            R.drawable.unta,
            R.drawable.kelinci,
            R.drawable.rusa,
            R.drawable.sapi,
            R.drawable.burung,
            R.drawable.kuda,
            R.drawable.ayam,
            R.drawable.kangguru,
            R.drawable.tupai,
            R.drawable.keledai,
    };

    static ArrayList<HalalFood> getListData() {
        ArrayList<HalalFood> list = new ArrayList<>();
        for (int position = 0; position < NamaMakananHalal.length; position++) {
            HalalFood makananHalal = new HalalFood();
            makananHalal.setName(NamaMakananHalal[position]);
            makananHalal.setDetail(DetailMakananHalal[position]);
            makananHalal.setPhoto(GambarMakananHalal[position]);
            list.add(makananHalal);
        }
        return list;
    }
}
