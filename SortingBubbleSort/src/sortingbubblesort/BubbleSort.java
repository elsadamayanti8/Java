/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortingbubblesort;

/**
 *
 * @author LENOVO 13
 */
public class BubbleSort {
        private long[] larik;
        private int jumItem;

        public BubbleSort(int max) {
            larik = new long[max];
            jumItem = 0;
        }

        public void tambah(long nilai) {
            larik[jumItem] = nilai;
            jumItem++;
        }

        public void baca_larik() {
            for (int j = 0; j < jumItem; j++) {
                System.out.print(larik[j] + " ");
            }
            System.out.println(" ");
        }
//ascending

        public void bubbleSort() {
            int i, j;
            for (i = jumItem - 1; i > 0; i--) {
                for (j = 0; j < i; j++) {
                    if (larik[j] > larik[j + 1]) {
                        tukar(j, j + 1);
                    }
                }
                System.out.println("Hasil langkah ke " + (-(i - jumItem)));
                baca_larik();
            }
        }
       
        private void tukar(int a, int b) {
            long temp = larik[a];
            larik[a] = larik[b];
            larik[b] = temp;
        }
    }
