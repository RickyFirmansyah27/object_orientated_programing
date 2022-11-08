package Code;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Event4 {
    int harga =0;
    private String txtharga;
    private JFrame fr;
    JLabel lbljudul = new JLabel("Universitas Teknokrat Indonesia");
    JLabel lbljudul2 = new JLabel("Kantin Kita");
    JLabel lblmakanan = new JLabel("Makanan");
    JLabel lblminuman = new JLabel("Minuman");
    JLabel struk = new JLabel("Struk Tagihan");
    
    
    //Menu Makanan
    JCheckBox Ma1  = new JCheckBox("Ayam Bakar Special  Rp.20.000");
    JCheckBox Ma2  = new JCheckBox("Ayam Bakar Pedes    Rp.16.000");
    JCheckBox Ma3  = new JCheckBox("Nasi Jamur Crispy     Rp.13.000");
    JCheckBox Ma4  = new JCheckBox("Pecel Lele                    Rp.15.000");
    JCheckBox Ma5  = new JCheckBox("Nasi Goreng                 Rp.10.000");
   
    
    //Menu Minuman
    JCheckBox Mi1  = new JCheckBox("Cappucino                       Rp.7000");
    JCheckBox Mi2  = new JCheckBox("Jus Alpukat                     Rp.6000");
    JCheckBox Mi3  = new JCheckBox("Jus Jeruk                        Rp.5000");
    JCheckBox Mi4  = new JCheckBox("Es Campur                       Rp.5000");
    JCheckBox Mi5  = new JCheckBox("Es Dugan                          Rp.5000");
   
    JLabel jlhbeli = new JLabel("Jumlah");
    JTextField txtbeli = new JTextField();
    
    JButton cetak = new JButton("Hasil");
    JButton tagihan = new JButton("Bill");
    JButton reset = new JButton("Reset");
    JTextArea hasil = new JTextArea();
    
 public Event4(){
        makeFrame();
        fr.setVisible(true);
        AksiReaksi();
 }
 private void makeFrame(){
        fr = new JFrame("Menu Kasir");
        fr.setSize(420,400);
        komponenVisual();
 }
 public void komponenVisual(){
        JPanel panel = (JPanel)fr.getContentPane();
        panel.setLayout(null);
        
        panel.add(lbljudul);
        lbljudul.setBounds(108, 10, 200, 20);
        panel.add(lbljudul2);
        lbljudul2.setBounds(175,30,70,20);
        
        panel.add(lblmakanan);
        lblmakanan.setBounds(10,60,70,20);
        panel.add(lblminuman);
        lblminuman.setBounds(10,180,70,20);
        
        //Menu Makanan
        panel.add(Ma1);
        Ma1.setBounds(10,80,220,20);
        panel.add(Ma2);
        Ma2.setBounds(10,100,220,20);
        panel.add(Ma3);
        Ma3.setBounds(10,120,220,20);
        panel.add(Ma4);
        Ma4.setBounds(10,140,220,20);
        panel.add(Ma5);
        Ma5.setBounds(10,160,220,20);
        
        //Menu Minuman
        panel.add(Mi1);
        Mi1.setBounds(10,200,220,20);
        panel.add(Mi2);
        Mi2.setBounds(10,220,220,20);
        panel.add(Mi3);
        Mi3.setBounds(10,240,220,20);
        panel.add(Mi4);
        Mi4.setBounds(10,260,220,20);
        panel.add(Mi5);
        Mi5.setBounds(10,280,220,20);
        
        //posisi tombol
        panel.add(cetak);
        cetak.setBounds(10,320,70,20);
        panel.add(struk);
        struk.setBounds(220,60,200,20);
        panel.add(hasil);
        hasil.setBounds(230,80,170,270);
        panel.add(tagihan);
        tagihan.setBounds(85,320,65,20);
        panel.add(reset);
        reset.setBounds(155,320,70,20);
        
        //pemberian fitur scroll
       
    
 }
 private void AksiReaksi(){
     cetak.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            
            hasil.append("Pesanan yang anda minta:\n");
            if(Ma1.isSelected()){
                hasil.append("-Ayam Bakar Special\n");
                harga=harga+20000;
            }
            if(Ma2.isSelected()){
                hasil.append("-Ayam Bakar Pedes\n");
                harga=harga+16000;
            }
            if(Ma3.isSelected()){
                hasil.append("-Nasi Jamur Crispy\n");
                harga=harga+13000;
            }
            if(Ma4.isSelected()){
                hasil.append("-Pecel Lele\n");
                harga=harga+15000;
            }
            if(Ma5.isSelected()){
                hasil.append("-Nasi Goreng\n");
                harga=harga+10000;
            }
            if(Mi1.isSelected()){
                hasil.append("-Cappucino\n");
                harga=harga+7000;
            }
            if(Mi2.isSelected()){
                hasil.append("-Jus Alpukat\n");
                harga=harga+6000;
            }
            if(Mi3.isSelected()){
                hasil.append("-Jus Jeruk\n");
                harga=harga+5000;
            }
            if(Mi4.isSelected()){
                hasil.append("-Es Campur\n");
                harga=harga+5000;
            }
            if(Mi5.isSelected()){
                hasil.append("-Es Dugan\n");
                harga=harga+5000;
            }
            
        }        
    });   
     tagihan.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
             txtharga=String.valueOf(harga);
             hasil.append("\n");
             hasil.append("Total Tagihan: "+txtharga+"\n");
        }
     });
     reset.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            hasil.setText("");
            harga=0;
        }
     });
     
    }
}