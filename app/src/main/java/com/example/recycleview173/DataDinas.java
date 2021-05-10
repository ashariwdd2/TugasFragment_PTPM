package com.example.recycleview173;

import java.util.ArrayList;

public class DataDinas {
    private static String [] namadinas = {
            "DISDIKPORA",
            "DINKES",
            "DISPUPERKIM",
            "DINPERTARU",
            "SATPOL PP",
            "DINSOSNAKERTRANS",
            "DP3AP2KB",
            "DISDUKCAPIL",
            "DISPERINDAG",
            "DINAS PERTANIAN",
            "DLH",
            "DISKOMINFOSANDI",
            "DISHUB",
            "DINAS KEBUDAYAAN",
            "DINAS PARIWISATA",
            "DPMPTSP",
            "DISPERINKOPUKM",
            "DPKP",
            "DISPERPUSARSIP"
    };

    private static String [] desdinas = {
            "Dinas yang mengurusi bagian Pendidikan, Kepemudaan dan Olahraga Kota Yogyakarta",
            "Dinas yang mengurusi bagian Kesehatan Kota Yogyakarta",
            "Dinas yang mengurusi bagian Pekerjaan Umum, Perumahan dan Kawasan Permukiman Kota Yogyakarta",
            "Dinas yang mengurusi bagian Pertanahan dan Tatat Ruang (Kundha Niti Mandala Sarta Tata Sasana) Kota Yogyakarta",
            "Dinas Satuan Polisi Pamong Praja Kota Yogyakarta",
            "Dinas yang mengurusi bagian Sosial, Tenaga Kerja dan Transmigrasi Kota Yogyakarta",
            "Dinas yang mengurusi bagian Pemberdayaan Perempuan, Perlindungan Anak, dan Pengendalian Penduduk dan Keluarga Berencana Kota Yogyakarta",
            "Dinas yang mengurusi bagian Kependudukan dan Pencatatan Sipil Kota Yogyakarta",
            "Dinas yang mengurusi bagian Perdagangan Kota Yogyakarta",
            "Dinas yang mengurusi bagian Pertanian dan Pangan Kota Yogyakarta",
            "Dinas yang mengurusi bagian Lingkungan Hidup Kota Yogyakarta",
            "Dinas yang mengurusi bagian Komunikasi Informatika dan Persandian Kota Yogyakarta",
            "Dinas yang mengurusi bagian Perhubungan Kota Yogyakarta",
            "Dinas yang mengurusi bagian Kebudayaan (Kundha Kabudayan) Kota Yogyakarta",
            "Dinas yang mengurusi bagian Pariwisata Kota Yogyakarta",
            "Dinas yang mengurusi bagian Penanaman Modal dan Pelayanan Satu Pintu Kota Yogyakarta",
            "Dinas yang mengurusi bagian Perindustrian, Koperasi, Usaha Kecil dan Menengah Kota Yogyakarta",
            "Dinas yang mengurusi bagian Pemadam Kebakaran dan Penyelamatan Kota Yogyakarta",
            "Dinas yang mengurusi bagian Perpustakaan dan Kearsipan Kota Yogyakarta"


    };

    private static int [] logodinas = {
            R.drawable.pendidikan,
            R.drawable.kesehatan,
            R.drawable.dpu,
            R.drawable.pertanahan,
            R.drawable.polpp,
            R.drawable.dinsosnakertrans,
            R.drawable.kb,
            R.drawable.dukcapil,
            R.drawable.disdikpora,
            R.drawable.pertanian,
            R.drawable.disdikpora,
            R.drawable.kominfologo,
            R.drawable.dishub,
            R.drawable.disdikpora,
            R.drawable.pariwisata,
            R.drawable.dpmptsp,
            R.drawable.perinkop,
            R.drawable.dpkp,
            R.drawable.perpustakaan
    };

    public static ArrayList<Dinas> getListData(){
        Dinas dinasModel = null;
        ArrayList<Dinas> list = new ArrayList<>();
        for (int position = 0; position <namadinas.length; position++){
            dinasModel = new Dinas();
            dinasModel.setNamadinas(namadinas[position]);
            dinasModel.setDesdinas(desdinas[position]);
            dinasModel.setLogodinas(logodinas[position]);
            list.add(dinasModel);
        }
        return list;
    }
}
