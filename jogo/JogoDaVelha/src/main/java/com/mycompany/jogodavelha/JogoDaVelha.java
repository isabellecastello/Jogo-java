package com.mycompany.jogodavelha;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.security.Principal;
import javax.swing.*;

public class JogoDaVelha extends JFrame {
  
    JButton[] bt = new JButton[9];
    JLabel placar = new JLabel("Placar");
    JLabel px = new JLabel("X 0");
    JLabel po = new JLabel("O 0");
    
    JButton novo = new JButton("Novo jogo");
    JButton zerar = new JButton("Zerar");
     int PX = 0;
     int PO =0;
    boolean xo = false;
    boolean[] click = new boolean[9];

    public JogoDaVelha() {
        setVisible(true);
        Color minhaCor = new Color(72, 61,  139);
        getContentPane().setBackground(minhaCor);
        setTitle("Jogo da Velha");
       
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(700, 300, 700, 500);
        
       
        add(placar);
        add(px);
        add(po);
        add(novo);
        add(zerar);
       
        
        placar.setBounds(310,360,100,30);
        placar.setFont(new Font("AlNile", Font.BOLD, 20));
        px.setBounds(300,380,100,40);
        px.setFont(new Font("Arial", Font.BOLD, 15));
        po.setBounds(350,380,100,40);
        po.setFont(new Font("Arial", Font.BOLD, 15));
        novo.setBounds(500,370,140,30);
        zerar.setBounds(500,400,140,30);
         novo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpar();

            }
        });
         zerar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PO = 0;
                PX = 0;
                atualizar();

            }
        });
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bt[cont] = new JButton();
                add(bt[cont]);
                bt[cont].setBounds((100 * i) + 200, (100 * j) + 50, 95, 95);
                bt[cont].setFont(new Font("Arial", Font.BOLD, 40));
                cont++;
            }
        }
        for (int i = 0; i < 9; i++) {
            click[i] = false;
        }
        bt[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[0] == false) {
                    click[0] = true;
                    mudar(bt[0]);
                }

            }
        });

        bt[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[1] == false) {
                    click[1] = true;
                    mudar(bt[1]);
                }

            }
        });
        bt[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[2] == false) {
                    click[2] = true;
                    mudar(bt[2]);
                }

            }
        });
        bt[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[3] == false) {
                    click[3] = true;
                    mudar(bt[3]);
                }

            }
        });
        bt[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[4] == false) {
                    click[4] = true;
                    mudar(bt[4]);
                }

            }
        });
        bt[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[5] == false) {
                    click[5] = true;
                    mudar(bt[5]);
                }

            }
        });
        bt[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[6] == false) {
                    click[6] = true;
                    mudar(bt[6]);
                }

            }
        });
        bt[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[7] == false) {
                    click[7] = true;
                    mudar(bt[7]);
                }

            }
        });
        bt[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[8] == false) {
                    click[8] = true;
                    mudar(bt[8]);
                }

            }
        });

    }

    public void mudar(JButton btn) {
        if (xo) {
            btn.setText("O");
            xo = false;
        } else {
            btn.setText("X");
            xo = true;
        }
        ganhou();
    }
    public void atualizar(){
        px.setText ("x " +PX);
        po.setText ("O " +PO);
    }

    public void ganhou() {
        int cont = 0;
        for(int i =0; i < 9; i++){
            if(click[i]== true){
                cont++;
            }
        }
        if ((bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X")
                || (bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X")
                || (bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X")
                || (bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X")
                || (bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X")
                || (bt[2].getText() == "X" && bt[5].getText() == "X" && bt[8].getText() == "X")
                || (bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X")
                || (bt[6].getText() == "X" && bt[4].getText() == "X" && bt[2].getText() == "X")) {
            JOptionPane.showMessageDialog(null, "X ganhou.");
            PX++;
            atualizar();
            limpar();
        }
        else if ((bt[0].getText() == "O" && bt[1].getText() == "O" && bt[2].getText() == "O")
                || (bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O")
                || (bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O")
                || (bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O")
                || (bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O")
                || (bt[2].getText() == "O" && bt[5].getText() == "O" && bt[8].getText() == "O")
                || (bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O")
                || (bt[6].getText() == "O" && bt[4].getText() == "O" && bt[2].getText() == "O")) {
            JOptionPane.showMessageDialog(null, "O ganhou.");
            PO++;
            atualizar();
            limpar();
        }
        else if(cont == 9) { 
        JOptionPane.showMessageDialog(null, "Empate");
            limpar();
        }
    }
    public void limpar(){
        for(int i = 0; i < 9; i++){
            bt[i].setText("");
            click[i] = false;
            xo = false;
        }
        
    }

    public static void main(String[] args) {
        new JogoDaVelha();
        
    }
}
