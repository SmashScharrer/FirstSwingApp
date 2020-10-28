package com.WebProjectCompany;

import javax.swing.*;

public class Fenetre extends JFrame {
    public Fenetre(String title, int width, int height){
        // TODO Donner un titre à la fenetre
        setTitle(title);

        // TODO Donner dimension à la fenetre
        setSize(width, height);

        // TODO Bloquer les dimensions de la fenetre
        setResizable(false);

        // TODO Centrer la fenetre au milieu de l'ecran
        setLocationRelativeTo(null);

        // TODO Un click sur la croix kill le process & ferme la fenetre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
