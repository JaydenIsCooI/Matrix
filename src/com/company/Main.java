package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        String[] name = {"Steve", "Alex", "Notch", "Herobrine"};
        String[] weapon = {"Sword", "Pickaxe", "Axe", "Shovel", "Diamond"};
        String[][] inventory = new String[name.length][];

        //declare row size (number of items + 1)
        inventory[0] = new String[3];
        inventory[1] = new String[3];
        inventory[2] = new String[5];
        inventory[3] = new String[2];

        //assign items
        inventory[0][1] = weapon[1];
        inventory[0][2] = weapon[2];
        inventory[1][1] = weapon[0];
        inventory[1][2] = weapon[3];
        inventory[2][1] = weapon[1];
        inventory[2][2] = weapon[2];
        inventory[2][3] = weapon[3];
        inventory[2][4] = weapon[4];
        inventory[3][1] = weapon[4];

        //assign names
        for (int i = 0; i < name.length; i++)
        {
            inventory[i][0] = name[i];
        }

        //print inventory
        for (int i = 0; i < inventory.length; i++)
        {
            System.out.print("Player " + (i+1) + " :: " + inventory[i][0] + "  --  [");
            for (int j = 1; j < inventory[i].length; j++)
            {
                System.out.print(inventory[i][j]);
                if (j < inventory[i].length-1)
                {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}