/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author notjeki03
 */
class Kendaraan {
    String nama;
    int kecepatan;

    public void showinfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}

class Mobil extends KendaraanDarat {
    int jumlahPintu;

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

class SepedaMotor extends KendaraanDarat {
    String jenisMesin;

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}


public class Main1 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;
        mobil.showinfo();

        System.out.println(); 

        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "2-tak";
        motor.showinfo();
    }
}
