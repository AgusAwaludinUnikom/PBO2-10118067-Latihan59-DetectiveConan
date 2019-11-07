/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan59.detectiveconan;

/**
 *
 * @author
 * NAMA : Agus Awaludin
 * NIM : 10118067
 * KELAS : PBO2
 * Latihan ini berisi tentang cara menampilkan nama dan bio suatu karakter
 * dengan metode polymorpism
 */
public class PBO210118067Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DetectiveCilik dc = new DetectiveCilik("Conan Edogawa",
                "Conan Edogawa (江戸川コナン Edogawa Konan) \n"
                + "              adalah seorang anggota Grup Detektif Cilik.\n"
                + "              Identitas asli Conan Edogawa adalah Shinichi \n"
                + "              Kudo yang badannya menyusut karena racun APTX \n"
                + "              4869 yang diberikan oleh Organisasi Hitam di \n"
                + "              Tropical Land.\n");
        dc.DisplayChara();
        
        DetectiveDewasa dw = new DetectiveDewasa("Kogoro Mouri",
                "Kogoro Mouri adalah seorang detektif swasta \n"
                + "              yang sangat terkenal karena sering memecahkan \n"
                + "              kasus. Kogoro ahli dalam judo sementara istrinya \n"
                + "              adalah seorang pengacara. Kogoro telah berpisah \n"
                + "              dengan istrinya dan hidup berdua dengan anak \n"
                + "              perempuannya, Ran Mouri.\n");
        dw.DisplayChara();
        
        Pengacara pengacara = new Pengacara("Eri Kisaki",
                "Eri Kisaki (妃 英里 Kisaki Er) adalah ibu Ran \n"
                + "              Mouri sekaligus istri Kogoro Mouri. Dia bekerja \n"
                + "              sebagai pengacara. Dia dikenal sebagai \n"
                + "              “Ratu Pengacara”. Dia telah hidup berpisah \n"
                + "              dengan Kogoro Mouri sejak 10 tahun yang lalu \n"
                + "              karena suaminya (Kogoro) sering mabuk – mabukan, \n"
                + "              bertaruh pada pacuan kuda, dan hal- hal yang \n"
                + "              tidak dia sukai. Tetapi sekarang dia masih tetap \n"
                + "              memakai cincin kawinnya dan selalu mengetes Kogoro \n"
                + "              apakah dia masih mencintainya atau tidak.\n");
        pengacara.DisplayChara();
        
        Profesor pro = new Profesor("Hiroshi Agasa",
                "Hiroshi Agasa (阿笠 博士 Agasa Hiroshi) adalah \n"
                + "              seorang profesor linglung yang menemukan beberapa \n"
                + "              perangkat untuk membantu Conan.Dia mengetahui \n"
                + "              identitas asli Conan Edogawa. Dia sering membantu \n"
                + "              Grup Detektif Cilik dan membawa mereka mengadakan \n"
                + "              perjalanan dalam VW Beetle-nya. Setelah menemukan \n"
                + "              Shiho Miyano di jalan, dia mengadopsinya dan \n"
                + "              memberinya nama samaran yaitu Ai Haibara untuk \n"
                + "              menyembunyikan dia dari Organisasi Berbaju Hitam.\n");
        pro.DisplayChara();
        
        TokohSampingan ts = new TokohSampingan("Ran Mouri",
                "Ran Mouri adalah teman Shinichi Kudo sejak kecil. \n"
                + "              Ran dan Shinichi tidak pernah berani mengungkapkan \n"
                + "              perasaannya kepada Ran. Ran adalah anak seorang \n"
                + "              detektif, Kogoro Mouri, dan seorang pengacara \n"
                + "              handal, Eri Kisaki. Sekarang Ran tinggal bersama \n"
                + "              ayahnya, Kogoro Mouri. Salah satu sahabat Ran \n"
                + "              yaitu Sonoko Suzuki yang merupakan anak direktur \n"
                + "              perusahaan Suzuki.\n");
        ts.DisplayChara();
                
                
                
    }
    
}
