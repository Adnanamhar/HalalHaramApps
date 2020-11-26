package com.example.halalharam;

import java.util.ArrayList;

public class DataHaramFood {
    private static String[] NamaMakananHaram = {
            "Bangkai",
            "Darah",
            "Daging Babi",
            "Khamer",
            "Hewan Buas Yang bertaring",
            "Semua Burung Yang Memiliki Cakar",
            "Jallalah",
            "Keledai Jinak",
            "Hewan Yang Diperintahkan Untuk Dibunuh",
            "Monyet",
};
    private static String[] DetailMakananHaram = {
            "Bangkai\n " +
                    "\nYang dimaksud dengan bangkai adalah semua hewan yang mati tanpa melalui proses penyembelihan yang sesuai syariat agama islam dan juga bukanlah hasil dari aktifitas perburuan. Allah -Subhanahu wa Ta’ala berfirman mengenai hal yang dimaksudkan sebagai bangkai",
            "Darah\n" +
                    "\nadalah salah satu jenis makanan yang diharamkan dan tidak boleh dikonsumsi sebagaimana orang mengkonsumsi darah sebagai campuran makanan atau minuman dan membekukannya untuk dimakan. Darah yang mengalir atau terpancar haram hukumnya sebagaimana disebutkan dalam Alqur’an surat Al An’an ayat 145 yang bunyinya",
            "Daging babi\n" +
                    "\nDaging Babi Disebutkan dalam surat Almaidah ayat 3 bahwa Allah SWT mengharamkan babi dan apapun makanan yang mengandung bagian dari tubuh babi termasuk daging, lemak dan bahkan enzim atau sel tubuhnya. Babi diharamkan karena hewan ini termasuk hewan yang kotor dan membawa bibit penyakit khususnya cacing pita yang dapat membahayakan manusia.",
            "Khamer\n " +
                    "\nKhamer adalah segala sesuatu yang memabukkan dan termasuk didalamnya minuman keras atau minuman beralkohol dan segala jenis narkoba yang dapat membuat orang kecanduan",
            "Semua hewan buas yang bertaring\n" +
                    "\nJenis makanan haram selanjutnya adalah segala hewan yang memiliki taring baik yang sifatnya jinak maupun liar. Hewan bertaring dalam hal ini adalah hewan yang menggunakan taring untuk memakan mangsanya termasuk anjing, harimau, dan bahkan kucing yang jinak sekalipun haram untuk dikonsumsi. Sebagaimana yang disebutkan dalam hadits berikut",
            "Semua burung yang memiliki cakar\n" +
                    "\nSelain hewan yang bertaring maka semua burung yang memiliki cakar tajam yang digunakan untuk membunuh dan memakan mangsanya adalah haram hukumnya untuk dikonsumsi misalnya burung elang dan burung rajawali.\n",
            "Jallalah\n" +
                    "\nadalah sebutan bagi hewan pemakan feses atau kotoran manusia atau hewan lainnya baik kotoran hewan ternak seperti sapi, kerbau, ayam dan sebagainya. Oleh sebab itu jika seseorang memelihara hewan ternak yang akan dikonsumsi sebaiknya perhatikan makanannya agar tidak terkontaminasi kotoran tersebut. Jalllalah disini termasuk burung gagak dan burung pemakan bangkai\n",
            "Keledai jinak\n" +
                    "\nKeledai adalah hewan yang biasa ditunggangi oleh manusia dan mengkonsumsi keledai jinak adalah haram hukumnya. Hal ini disebutkan dalam mahzab ke empat Imam kecuali imam Malik. Sebagaimana yang disebutkan dalam hadits\n" + "“Sesungguhnya Allah dan Rasul-Nya melarang kalian untuk memakan daging-daging keledai yang jinak, karena dia adalah najis”. (HR. Al-Bukhary dan Muslim) \n" + "Sedangkan hukum memakana keledai liar adalah halal berdasarkan perkataan  Jabir -radhiallahu ‘anhu",
            "Hewan Yang Diperintahkan untuk dibunuh\n" +
                    "\nSemua hewan yang dapat membahayakan manusia dan diperintahkan untuk dibunuh tanpa disembelih adalah haram hukumnya untuk dikonsumsi. Binatang tersebut antara lain disebutkan dalam hadits Rasulullah SAW berikut",
            "Monyet\n" +
                    "\nDalam mahzab Syafii disebutkan bahwa monyet adalah haram, karena Allah telah menghukum sekelompok manusia yang bermaksiat yakni kaum yahudi dan mengubahnya menjadi binatang babi dan monyet.. Selain itu monyet juga memiliki kesamaan dengan manusia dalam hal genetis dan kesamaan panca indra serta disebutkan bahwa monyet bukanlaj jenis hewan yang baik.\n" + "Demikianlah penjelasan mengenai makanan haram menurut islam dan hal tersebut dimaksudkan untuk membatasi dan memberi petunjuk mana saja makanan yang boleh dikonsumsi dan mana makanan yang haram dikonsumsi dan hal tersebut berlaku secara global. Adapun makanan yang masih meragukan sifatnya atau syubhat maka sebaiknya ditinggalkan. Sebelum mengkonsumsi sesuatu dewasa ini ada baiknya kita mengecek logo halal yang tertera pada kemasan dan mengetahui tempat atau restoran yang menyajikan makanan halal.",
        };
    private static int[] GambarMakananHaram = {
            R.drawable.bangkai,
            R.drawable.darah,
            R.drawable.dagingbabi,
            R.drawable.khamer,
            R.drawable.hewanbuas,
            R.drawable.burungbercakar,
            R.drawable.jallalah,
            R.drawable.keledaijinak,
            R.drawable.hewandipertahkandibunuh,
            R.drawable.monyet,
        };

    static ArrayList<HaramFood> getListData() {
        ArrayList<HaramFood> list = new ArrayList<>();
        for (int position = 0; position < NamaMakananHaram.length; position++) {
            HaramFood makananHaram = new HaramFood();
            makananHaram.setNameHaram(NamaMakananHaram[position]);
            makananHaram.setDetailHaram(DetailMakananHaram[position]);
            makananHaram.setPhotoHaram(GambarMakananHaram[position]);
            list.add(makananHaram);
            }
        return list;
        }
}