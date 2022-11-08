package Code;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Main {
    private JFrame fr;
    JLabel lbljudul  = new JLabel("Universitas Teknokrat Indonesia");
    JLabel lbltugas   = new JLabel("Tugas Akhir PBO");
    JLabel lblkelas = new JLabel("IF18A");
    JLabel lblmenu = new JLabel("MENU PROGRAM");
    JRadioButton M1  = new JRadioButton("Identitas");
    JRadioButton M2  = new JRadioButton("Konversi Suhu");
    JRadioButton M3  = new JRadioButton("Perpangkatan");
    JRadioButton M4  = new JRadioButton("Mesin Kasir");
    
    ButtonGroup cek = new ButtonGroup();
    JButton Pil = new JButton("Pilih");
    
    public Main(){
        makeFrame();
        fr.setVisible(true);
        AksiReaksi();
        fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void makeFrame(){
        //tahap pembuatan frame beserta isinya di panggil melalui method
        fr = new JFrame("PBO");
        fr.setSize(300,230);
        komponenVisual();
    }
    public void komponenVisual(){
        //Pembuatan tombol dan juga penempatan posisinya
        JPanel panel = (JPanel)fr.getContentPane();
        panel.setLayout(null);
        
        panel.add(lbljudul);
        lbljudul.setBounds(50,10,200,20);
        panel.add(lbltugas);
        lbltugas.setBounds(10,40,150,20);
        panel.add(lblkelas);
        lblkelas.setBounds(10,60,150,20);
        
        panel.add(lblmenu);
        lblmenu.setBounds(95,80,140,20);
        
        cek.add(M1);
        cek.add(M2);
        cek.add(M3);
        cek.add(M4);
        panel.add(M1);
        M1.setBounds(150,100,100,20);
        panel.add(M2);
        M2.setBounds(10,120,130,20);
        panel.add(M3);
        M3.setBounds(10,100,130,20);
        panel.add(M4);
        M4.setBounds(150,120,100,20);
        
        panel.add(Pil);
        Pil.setBounds(95,160,100,20);
        
    }
    public void AksiReaksi(){
        Pil.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            
            if(M1.isSelected()==true){
               new Event();
               
            }
            if(M2.isSelected()==true){
                new Event2();
            }
            if(M3.isSelected()==true){
                new Event3();
            }
            if(M4.isSelected()==true){
                new Event4();
            }
            else{
                
            }
        }
    });
        
        
}

    
    public static void main(String[] args) {
        new Main();
    }
    
}
