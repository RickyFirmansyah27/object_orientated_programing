package Code;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Event {
    private JFrame fr;
    JLabel lblnama = new JLabel("Nama");
    JTextField txtnama = new JTextField(20);
    JLabel npm = new JLabel("NPM");
    JTextField txtnpm = new JTextField(8);
    JLabel lblKelamin = new JLabel("Jenis Kelamin");
    JRadioButton pria = new JRadioButton("Laki-Laki");
    JRadioButton wanita = new JRadioButton("Perempuan");
    ButtonGroup kelompok = new ButtonGroup();
    JLabel hobi = new JLabel("Hobi");
    JCheckBox baca  = new JCheckBox("Membaca");
    JCheckBox main  = new JCheckBox("Bermain");
    JCheckBox jalan = new JCheckBox("Traveller");
    JButton cetak = new JButton("Cetak");
    JTextArea hasil = new JTextArea();
    
    public Event(){
        makeFrame();
        fr.setVisible(true);
        AksiReaksi();
        
    }
    public void makeFrame(){
        fr = new JFrame("Menu Identitas");
        fr.setSize(300,330);
        komponenVisual();
    }
    public void komponenVisual(){
        JPanel panel = (JPanel)fr.getContentPane();
        panel.setLayout(null);
        
        panel.add(lblnama);
        lblnama.setBounds(10,10,80,20);
        
        panel.add(txtnama);
        txtnama.setBounds(105,10,175,20);
        
        panel.add(npm);
        npm.setBounds(10,33,80,20);
        
        panel.add(txtnpm);
        txtnpm.setBounds(105,33,70,20);
        
        panel.add(lblKelamin);
        lblKelamin.setBounds(10,57,80,20);
        
        kelompok.add(pria);
        kelompok.add(wanita);
        panel.add(pria);
        panel.add(wanita);
        pria.setBounds(105,57,80,20);
        wanita.setBounds(183,57,200,20);
        
        hobi.setBounds(10,80,70,20);
        panel.add(hobi);
        baca.setBounds(105,80,100,20);
        panel.add(baca);
        main.setBounds(105,103,100,20);
        panel.add(main);
        jalan.setBounds(105,126,100,20);
        panel.add(jalan);
        
        cetak.setBounds(10,150,270,20);
        panel.add(cetak);
        
        JScrollPane scrollPane = new JScrollPane(hasil);
        panel.add(scrollPane);
        scrollPane.setBounds(10,180,270,100); 
    }
    public void AksiReaksi(){
        cetak.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
                hasil.append("Nama                 : "+txtnama.getText()+"\n");
                hasil.append("NPM                    : "+txtnpm.getText()+"\n");
            if(pria.isSelected()==true){
                hasil.append("Jenis Kelamin  : "+pria.getText()+"\n");
            }
            else{
                hasil.append("Jenis Kelamin  : "+wanita.getText()+"\n");
            }
            if(baca.isSelected()==true){
                hasil.append("Hobi                    : "+baca.getText()+"\n");
            }
            if(main.isSelected()==true){
                hasil.append("Hobi                    : "+main.getText()+"\n");
            }
            if(jalan.isSelected()==true){
                hasil.append("Hobi                    : "+jalan.getText()+"\n");
            }
        }
    });
       
    }
    
}
 