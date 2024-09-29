/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author notjeki03
 */
class Hewan {
    String nama;
    String jenis;

    public void showinfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}
// Kelas Turunan Kucing
class Kucing extends Hewan {
    
    public void showinfo() {
        super.showinfo();
        System.out.println("Suara: Meow Meow");
    }
 }


class Anjing extends Hewan {
    
    public void showinfo() {
        super.showinfo();
        System.out.println("Suara: Bark Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing Kucing = new Kucing();
        Kucing.nama = "Mimi";
        Kucing.jenis = "Mamalia";
        Kucing.showinfo();
        
        Anjing Anjing = new Anjing();
        Anjing.nama = "Dodo";
        Anjing.jenis = "Mamalia";
        Anjing.showinfo();
    }
}
