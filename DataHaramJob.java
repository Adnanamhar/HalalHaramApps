package com.example.halalharam;

import java.util.ArrayList;

public class DataHaramJob {
        private static String[] NamaPekerjaanHaram = {
        "Pekerjaan yang Berkaitan dengan Perbuatan Syirik",
        "Pekerjaan yang Berupa Sarana untuk Melakukan Kesyirikan",
        "Memperjual Belikan Barang Haram",
        "Memakan Harta Riba",
        "Menimbun Bahan-Bahan Perdagangan",
        "Perjudian",
        "Memakan Harta Anak Yatim Secara Dzalim",
        "Mencuri, Mencopet, Menjambret, dan Merampok",
        "Mengurangi Timbangan dan Takaran",
        "Korupsi dan Penipuan Terhadap Rakyat",
};
        private static String[] DetailPekerjaanHaram = {
                "Syirik\n" +
                        " \nmerupakan perbuatan yang paling besar dosanya dalam ajaran Islam. Syirik diartikan sebagai perbuatan mempersekutukan Allah. Allah SWT berfirman:\n" + "“Sesungguhnya Allah tidak akan mengampuni dosa syirik, dan Dia mengampuni segala dosa yang selain dari (syirik) itu, bagi siapa yang dikehendaki-Nya. Barang siapa yang mempersekutukan Allah, maka sungguh ia telah berbuat dosa yang besar.” (QS An Nisaa: 48)",
                "Pekerjaan yang Berupa Sarana untuk Melakukan Kesyirikan\n" +
                        "Tidak hanya syirik, ternyata saat ini telah banyak orang yang melakukan pekerjaan yang menjadi sarana melakukan kesyirikan. Contohnya saja orang yang menjadi juru kunci makan, membuat patung berhala, melukis gambar makhluk yang bernyawa dan pekerjaan sejenis yang menjadi sarana manusia untuk berbuat syirik",
                "Memperjual Belikan Barang Haram\n" +
                        "Berdagang memang menjadi salah satu cara untuk memperoleh rezeki. Namun, kini banyak orang yang justru memperjualbelikan barang-barang yang diharamkan oleh syariat. Barang tersebut di antaranya bangkai, babi, darah, anjing, patung, lukisan makhluk yang bernyawa, minuman keras, narkotika, dan masih banyak yang lainnya.", " Memakan Harta Riba\u2028Pekerjaan yang juga kian ramai peminatnya adalah yang berhubungan dengan riba. Riba ini menjadi salah satu perbuatan yang dilarang dalam Islam, namun masih banyak saja orang yang tergiur dengan keuntungan dari riba. Allah SWT berfirman:",
                "Menimbun Bahan-Bahan Perdagangan\n" +
                        "Pekerjaan haram selanjutnya yang juga ramai peminatnya ialah menimbun bahan-bahan perdagangan ketika harganya murah dan dibutuhkan oleh masyarakat dengan tujuan untuk mendapatkan keuntungan yang berlipat ganda ketika barang tersebut bernilai lebih tinggi di pasaran. Dari Ma’ mar bin Abdullah al-Anshari ra dari Rasulullah Shallallahu ‘Alaihi wa Sallam",
                "Perjudian\n " +
                        "memang menjadi salah satu perbuatan yang sudah dilakukan umat banyak orang sejak zaman dahulu. Namun kini, pamor dari kegiatan ini semakin menanjak terlebih lagi bagi mereka yang gemar berhura-hura. Allah Ta’ala berfirman:\n" + "“Hai orang-orang yang beriman, sesungguhnya khamer (minuman keras), perjudian, berkurban untuk berhala-berhala, dan mengundi nasib dengan anak panah adalah perbuatan keji dan termasuk perbuatan setan, maka jauhilah oleh kalian perbuatan-perbuatan tersebut agar kalian mendapatkan keberuntungan”",
                "Memakan Harta Anak Yatim Secara Dzalim\n" +
                        "Anak yatim menjadi salah satu golongan yang dicintai oleh Allah SWT. Maka dari itu kita diperintahkan untuk mencintai anak yatim. Namun, tidak semua orang bisa melakukannya, masih banyak di antara manusia yang melakukan pekerjaan haram yakni memakan harta anak yatim secara dzalim. Allah Ta’ala berfirman:\n" + "“Sesungguhnya orang-orang yang memakan harta anak yatim secara dzalim, sebenarnya mereka itu menelan api sepenuh perutnya dan mereka akan masuk ke dalam api yang menyala-nyala (neraka).” (QS An-Nisa’ [4): 10).",
                "Mencuri, Mencopet, Menjambret, dan Merampok\n" +
                        "Kesulitan ekonomi memang menjadi salah satu permasalahan semua orang. Terlebih lagi bagi mereka yang tidak memiliki gaji cukup untuk membiayai keluarga. Maka dari itu, akhirnya orang-orang memilih jalan pintas untuk mendapatkan uang dengan cara yang tidak halal seperti mencuri, mencopet, menjambret dan merampok yang tidak hanya merugikan orang lain bahkan juga dapat menghilangkan nyawa korbannya",
                "Mengurangi Timbangan dan Takaran\n" +
                        "Mengurangi timbangan dan takaran dalam dagangan juga menjadi salah satu pekerjaan haram yang kerap dilakukan oleh umat manusia. Tujuan dari mengurangi timbangan tersebut itu tentu saja untuk mendapatkan keuntungan lebih. Allah SWT berfirman:\n" + "“Kecelakaan bagi orang-orang yang melakukan kecurangan dalam timbangan, yaitu kalau menakar milik orang lain untuk dirinya, ia meminta disempurnakan. Namun, apabila mereka menakar barang dagangan mereka untuk orang lain, ia merugikan orang lain (dengan mengurangi takaran).” (QS Al-Muthaffifin: 1-3).\n",
                "Korupsi dan Penipuan Terhadap Rakyat\n Pekerjaan selanjutnya yang juga kian banyak peminatnya yaitu korupsi. Korupsi menjadi salah satu permasalahan yang dapat menyebabkan banyak kerugian bagi negara dan rakyat. Padahal seharusnya, sebagai seorang pemimpin itu harus mampu menjaga amanat dari rakyatnya.",
        };
        private static int[] GambarPekerjaanHaram = {
                R.drawable.santet,
                R.drawable.dukun,
                R.drawable.barangharam,
                R.drawable.riba,
                R.drawable.menimbunbahan,
                R.drawable.perjudian,
                R.drawable.makanhartaanakyatim,
                R.drawable.pencuri,
                R.drawable.mengurangitakaran,
                R.drawable.korupsi,
        };

        static ArrayList<HaramJob> getListData() {
            ArrayList<HaramJob> list = new ArrayList<>();
            for (int position = 0; position < NamaPekerjaanHaram.length; position++) {
                HaramJob pekerjaanHaram = new HaramJob();
                pekerjaanHaram.setName(NamaPekerjaanHaram[position]);
                pekerjaanHaram.setDetail(DetailPekerjaanHaram[position]);
                pekerjaanHaram.setPhoto(GambarPekerjaanHaram[position]);
                list.add(pekerjaanHaram);
            }
            return list;
        }
}