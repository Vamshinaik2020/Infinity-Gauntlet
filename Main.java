package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=6-n;

        HashSet<String> set=new HashSet<>();
        String[] Gem={"Power","Time","Space","Soul","Reality","Mind"};
        String[] color={"purple","green","blue","orange","red","yellow"};

        for(int i=0;i<n;i++){
            set.add(sc.next());
        }

        System.out.println(m);

        for(int i=0;i<6;i++){
            if(!set.contains(color[i]))
                System.out.println(Gem[i]);
        }
    }
}

