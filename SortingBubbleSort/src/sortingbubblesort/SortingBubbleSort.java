/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortingbubblesort;

/**
 *
 * @author LENOVO 13
 */
    class SortingBubbleSort {
        public static void main(String[] args) {
            int ukuran = 100;
            BubbleSort deret;
            deret = new BubbleSort(ukuran);
            deret.tambah(23);
            deret.tambah(105);
            deret.tambah(45);
            deret.tambah(87);
            deret.tambah(54);
            System.out.println("Larik awal ");
            deret.baca_larik();
            deret.bubbleSort();
            System.out.println("Larik akhir ");
            deret.baca_larik();
        }
    }

