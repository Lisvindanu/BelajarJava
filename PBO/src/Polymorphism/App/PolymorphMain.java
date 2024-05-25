/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Polymorphism.App;

import Polymorphism.Data.WD2Character;

public class PolymorphMain {
    public static void main(String[] args) {
        WD2Character MarcusHolloway = new WD2Character("Marcus Holloway", "memiliki keahlian dalam meretas sistem, mengakses data tersembunyi, dan memanipulasi teknologi.",
                " San Francisco, California.", "quadcopter");
        WD2Character Josh = new WD2Character("Josh Sauchak", "memiliki pengetahuan mendalam tentang sistem komputer dan keamanan siber.", "tinggal di San Francisco, California.",
                "Salah satu perangkat khasnya adalah RC Jumper, sebuah mobil mini yang dapat dikendalikan dari jarak jauh dan digunakan untuk meretas perangkat elektronik.");
        WD2Character Sitara = new WD2Character("Sitara Dhawan", "memiliki keahlian dalam mengelola citra publik dan desain grafis.",
                "lahir di Los Angeles, California, dan pindah ke San Francisco.", "Salah satu perangkat khasnya adalah DedSec blog yang dia jalankan.");
        WD2Character T_Bone = new WD2Character("T-Bone (Raymond Kenney)", "memiliki pengetahuan tentang sistem komputer dan keahlian dalam meretas.",
                "tumbuh besar di Amerika Serikat bagian selatan.", "Salah satu perangkat khasnya adalah T-Bone Truck yang dia gunakan untuk membantu DedSec dalam misi-misi mereka.");
        WD2Character Horatio  = new WD2Character("Horatio Carlin", "koordinator taktis DedSec. Dia mengirim DedSec ke tempat yang diperlukan dan mengidentifikasi intel yang diperlukan untuk melaksanakan operasi.",
                "Horatio tumbuh dalam lingkungan yang bermasalah dan menemukan pelarian di internet dan musik", "Salah satu perangkat khasnya adalah backdoor yang dia tanamkan di server Nudle.");
        WD2Character Wrench  = new WD2Character("Wrench", "seorang ahli mekanik dan seniman. Dia memiliki keahlian dalam merakit perangkat dan senjata.",
                "Wrench adalah karakter misterius yang selalu mengenakan topeng.", "berbagai perangkat khusus, termasuk senjata dan peralatan mekanik yang dia buat sendiri.");

        System.out.println("=== Markus Holloway ===");
        MarcusHolloway.showDedsecMember();
        System.out.println("=== Josh ===");
        Josh.showDedsecMember();
        System.out.println("=== Sitara ===");
        Sitara.showDedsecMember();
        System.out.println("=== T-Bone ===");
        T_Bone.showDedsecMember();
        System.out.println("=== Horatio ===");
        Horatio.showDedsecMember();
        System.out.println("=== Wrench ===");
        Wrench.showDedsecMember();
    }
}
