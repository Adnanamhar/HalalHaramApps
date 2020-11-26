package com.example.halalharam;

import java.util.ArrayList;

public class DataHalalJob {
        private static String[] NamaPekerjaanHalal = {
                "Nelayan",
                "Tukang Cat",
                "Petani",
                "Pembuat Roti",
                "Peternak",
                "Pemadam",
                "Polisi",
                "Tukang Bangunan"
        };
        private static String[] DetailPekerjaanHalal = {
                "Nelayan\n" +
                        "\nadalah istilah bagi orang-orang yang sehari-harinya bekerja menangkap ikan atau biota lainnya yang hidup di dasar, kolom maupun permukaan perairan. Perairan yang menjadi daerah aktivitas nelayan ini dapat merupakan perairan tawar, payau maupun laut. Di negara-negara berkembang seperti di Asia Tenggara atau di Afrika, masih banyak nelayan yang menggunakan peralatan yang sederhana dalam menangkap ikan.",
                "Tukang Cat\n" +
                        "\nadalah seseorang yang bekerja mengecat tembok bangunan orang-orang ini yang sehari-harinya bekerja mengecat tembok . Rumah-rumah warga lah yang menjadi daerah aktivitas tukang cat ini.",
                "Petani\n" +
                        "\nadalah seseorang yang bergerak di bidang pertanian, utamanya dengan cara melakukan pengelolaan tanah dengan tujuan untuk menumbuhkan dan memelihara tanaman (seperti padi, bunga, buah dan lain lain), dengan harapan untuk memperoleh hasil dari tanaman tersebut untuk digunakan sendiri ataupun menjualnya kepada orang lain. Mereka juga dapat menyediakan bahan mentah bagi industri, seperti serealia untuk minuman beralkohol, buah untuk jus, dan wol atau kapas untuk penenunan dan pembuatan pakaian.",
                "Tukang roti\n" +
                        "\nadalah seseorang yang bekerja membuat roti. Beberapa pembuat roti juga membuat kue dan makanan pencuci mulut, namun tukang roti aslinya hanya membuat roti. Tukang roti bekerja di toko roti.Roti pertama dibuat oleh bangsa Mesir pada tahun 8000 BC dan pada Abad Pertengahan sebagian besar tuan tanah memiliki toko roti. Mereka memiliki pemanggang umum dan ibu rumah tangga membawa adonan kepada tukang roti untuk dipanggang.Roti sekarang lebih manis daripada pada masa Abad Pertengahan karena banyak menggunakan sirup jagung atau madu.",
                "Peternakan\n" +
                        "\nadalah kegiatan mengembangbiakkan dan pemeliharaan hewan ternak untuk mendapatkan manfaat dan hasil dari kegiatan tersebut. Hewan yang banyak diternakkan di antaranya sapi, ayam. kambing, domba, dan babi. Hasil peternakan di antaranya daging, susu, telur, dan bahan pakaian (seperti wol). Selain itu, kotoran hewan dapat menyuburkan tanah dan tenaga hewan dapat digunakan sebagai sarana transportasi dan untuk membajak tanah.",
                "Pemadam kebakaran\n" +
                        "\ndisingkat Damkar, Branwir (dari Bahasa Belanda \"Brandweer\"), atau PMK adalah orang atau pasukan yang bertugas memadamkan kebakaran, melakukan penyelamatan, dan menanggulangi bencana atau kejadian lainya.\n" + "Petugas pemadam kebakaran selain terlatih untuk menyelamatkan korban dari kebakaran atau melakukan pemadaman, juga dilatih untuk menyelamatkan korban-korban bencana seperti kecelakaan lalu lintas, gedung runtuh, banjir, gempa bumi, dll.\n",
                "Polisi\n" +
                        "\nadalah suatu pranata umum sipil yang menjaga ketertiban, keamanan, dan penegakan hukum di seluruh wilayah negara. Kepolisian adalah salah satu lembaga penting yang memainkan tugas utama sebagai penjaga keamanan, ketertiban dan penegakan hukum, sehingga lembaga kepolisian pasti lah ada di seluruh negara berdaulat. Kadangkala pranata ini bersifat militaristis, seperti di Indonesia sebelum Kepolisian Negara Republik Indonesia (POLRI) dilepas dari ABRI. Polisi dalam lingkungan pengadilan bertugas sebagai penyidik. Dalam tugasnya dia mencari barang bukti, keterangan-keterangan dari berbagai sumber, baik keterangan saksi-saksi maupun keterangan saksi ahli.",
                "Tukang Bangunan\n" +
                        "\nadalah pekerja yang mempunyai ketrampilan dalam bidang membangun rumah, membangun ruko dan bangunan yang lain.Biasanya tukang bangunan disebut juga tukang batu dalam istilah yang umum, untuk pengupahan tukang bangunan biasanya ada yang harian dan ada yang borong tergantung persetujuan antara tukang dan pengguna jasanya.Biasanya tukang bangunan dipimpin oleh seorang yang disebut Pelaksana, yang bekerja sebagai pengarah dan pengatur pekerjaan dalam proyek.",
        };
        private static int[] GambarPekerjaanHalal = {
                R.drawable.nelayan,
                R.drawable.tukang_cat,
                R.drawable.petani,
                R.drawable.pembuat_roti,
                R.drawable.peternak,
                R.drawable.pemadam,
                R.drawable.polisi,
                R.drawable.tukang_bangunan,
        };

        static ArrayList<HalalJob> getListData() {
            ArrayList<HalalJob> list = new ArrayList<>();
            for (int position = 0; position < NamaPekerjaanHalal.length; position++) {
                HalalJob pekerjaanHalal = new HalalJob();
                pekerjaanHalal.setName(NamaPekerjaanHalal[position]);
                pekerjaanHalal.setDetail(DetailPekerjaanHalal[position]);
                pekerjaanHalal.setPhoto(GambarPekerjaanHalal[position]);
                list.add(pekerjaanHalal);
            }
            return list;
        }
    }

