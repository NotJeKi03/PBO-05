/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum5;

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
// Kelas Turunan Mobil
class Mobil extends Kendaraan {
    int jumlahPintu;
    @Override
    
    public void showinfo() {
        super.showinfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
 }


class SepedaMotor extends Kendaraan {
    String jenisMesin;
    @Override
    
    public void showinfo() {
        super.showinfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.jumlahPintu = 4;
        mobil.showinfo();
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jenisMesin = "2-tak";
        motor.showinfo();
    }
}