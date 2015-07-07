/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication5;

/**
 *
 * @author Med Reda
 */
import java.util.*;

public class Shuffler
{
  Integer[][] array;
  public Shuffler(Integer[][] tab){
      array = tab;
      array = SuffleAll(array);
  }
  public static void main(String args[])
  {
    Integer[][] a1 = {{1, 3, 5, 7}, {9, 11, 13, 15}, {17, 19, 21, 23}, {25, 27, 29, 31}};
    a1 = SuffleAll(a1);
    for (int i = 0; i < a1.length; i++){
        for (int j = 0; j < a1[i].length; j++) System.out.print(a1[i][j] +  "\t");
        System.out.println();
    }
  }

  // Implementing Fisher–Yates shuffle
  static void shuffleArray(Integer[] ar)
  {
    Random rnd = new Random();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      // Simple swap
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
  static Integer[][] SuffleAll(Integer[][] at){
      Integer[] ar = {1,2,3,4};
      Integer[][] tab = new Integer[4][4];
      shuffleArray(ar);
      for(int i = 0; i < at.length;i++){
          tab[i] = at[ar[i]-1];
      }
      for(int i = 0; i < tab.length;i++){
          shuffleArray(tab[i]);
      }
      return tab;
  }
}