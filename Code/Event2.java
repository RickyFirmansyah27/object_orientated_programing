package Code;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Event2 {
    float Angka;
    String Konversi;
    private JFrame fr;
    JLabel input = new JLabel("Masukan");
    JTextField txtinput = new JTextField(20);
    
    JLabel From = new JLabel("Dari");
    JRadioButton A1 = new JRadioButton("Celcius");
    JRadioButton A2 = new JRadioButton("Farenheit");
    JRadioButton A3 = new JRadioButton("Reamur");
    JRadioButton A4 = new JRadioButton("Kelvin");
    ButtonGroup kelompok = new ButtonGroup();
    ButtonGroup kelompok1 = new ButtonGroup();
    JLabel To = new JLabel("Ke");
    JRadioButton B1 = new JRadioButton("Celcius");
    JRadioButton B2 = new JRadioButton("Farenheit");
    JRadioButton B3 = new JRadioButton("Reamur");
    JRadioButton B4 = new JRadioButton("Kelvin");
    
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");
    JTextArea hasil = new JTextArea();
    
    public Event2(){
        makeFrame();
        fr.setVisible(true);
        AksiReaksi();
      
    }
    private void makeFrame(){
        fr = new JFrame("Termometer Digital");
        fr.setSize(300,330);
        komponenVisual();
    }
    public void komponenVisual(){
        JPanel panel = (JPanel)fr.getContentPane();
        panel.setLayout(null);
        
        panel.add(input);
        input.setBounds(10,10,80,20);
        panel.add(txtinput);
        txtinput.setBounds(70,10,175,20);
        
        panel.add(From);
        From.setBounds(10,40,80,20);
        panel.add(To);
        To.setBounds(150,40,80,20);
        
        kelompok.add(A1);kelompok.add(A2);kelompok.add(A3);kelompok.add(A4);
        kelompok1.add(B1);kelompok1.add(B2);kelompok1.add(B3);kelompok1.add(B4);
        
        panel.add(A1);panel.add(A2);panel.add(A3);panel.add(A4);
        panel.add(B1);panel.add(B2);panel.add(B3);panel.add(B4);
        
        
        A1.setBounds(10,57,80,20);A2.setBounds(10,77,80,20);
        B4.setBounds(150,57,80,20);B3.setBounds(150,77,80,20);
        A3.setBounds(10,97,80,20);A4.setBounds(10,117,80,20);
        B2.setBounds(150,97,80,20);B1.setBounds(150,117,80,20);
        
        hitung.setBounds(60,150,70,20);
        panel.add(hitung);
        reset.setBounds(150,150,70,20);
        panel.add(reset);
        hasil.setBounds(5,180,270,100);
        panel.add(hasil);
     
    }
    private void AksiReaksi() {
        hitung.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            //Celcius ke Lain
        if(A1.isSelected()==true&&B4.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf(Angka+273.5);
         hasil.append("Konversi dari "+txtinput.getText()+" Celcius \n");
         hasil.append("Menjadi Kelvin adalah "+Konversi+"\n");
         
        }
        if(A1.isSelected()==true&&B3.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf(Angka*0.8);
         hasil.append("Konversi dari "+txtinput.getText()+" Celcius \n");
         hasil.append("Menjadi Reamur adalah "+Konversi+"\n");
        }
        if(A1.isSelected()==true&&B2.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf(Angka*1.8+32);
         hasil.append("Konversi dari "+txtinput.getText()+" Celcius \n");
         hasil.append("Menjadi Farenheit adalah "+Konversi+"\n");
        }
        if(A1.isSelected()==true&&B1.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf(Angka);
         hasil.append("Tidak ada perubahan\n");
         hasil.append("Silakan pilih konversi ke suhu lain\n");
        }
        
        //Farenheit ke lain
        if(A2.isSelected()==true&&B4.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf((Angka+459.67) /1.8);
         hasil.append("Konversi dari "+txtinput.getText()+" Farenheit \n");
         hasil.append("Menjadi Kelvin adalah "+Konversi+"\n");
        }
        if(A2.isSelected()==true&&B3.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf((Angka-32)*4/9);
         hasil.append("Konversi dari "+txtinput.getText()+" Farenheit \n");
         hasil.append("Menjadi Reamur adalah "+Konversi+"\n");
        }
        if(A2.isSelected()==true&&B2.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf(Angka);
         hasil.append("Tidak ada perubahan\n");
         hasil.append("Silakan pilih konversi ke suhu lain\n");
        }
        if(A2.isSelected()==true&&B1.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf((Angka-32)/1.8);
         hasil.append("Konversi dari "+txtinput.getText()+" Farenheit \n");
         hasil.append("Menjadi Celcius adalah "+Konversi+"\n");
        }
        
        //Reamur ke Lain
        if(A3.isSelected()==true&&B4.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf((Angka/0.8)+273.15);
         hasil.append("Konversi dari "+txtinput.getText()+" Reamur \n");
         hasil.append("Menjadi Kelvin adalah "+Konversi+"\n");
        }
        if(A3.isSelected()==true&&B3.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf(Angka);
         hasil.append("Tidak ada perubahan\n");
         hasil.append("Silakan pilih konversi ke suhu lain\n");
        }
        if(A3.isSelected()==true&&B2.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf((2.25*Angka)+32);
         hasil.append("Konversi dari "+txtinput.getText()+" Reamur \n");
         hasil.append("Menjadi Farenheit adalah "+Konversi+"\n");
        }
        if(A3.isSelected()==true&&B1.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf((Angka*5/4));
         hasil.append("Konversi dari "+txtinput.getText()+" Reamur \n");
         hasil.append("Menjadi Celcius adalah "+Konversi+"\n");
        }
        
        //Kelvin ke Lain
        if(A4.isSelected()==true&&B4.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf(Angka);
         hasil.append("Tidak ada perubahan\n");
         hasil.append("Silakan pilih konversi ke suhu lain\n");
        }
        if(A4.isSelected()==true&&B3.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf((Angka-273.15)*4/5);
         hasil.append("Konversi dari "+txtinput.getText()+" Kelvin \n");
         hasil.append("Menjadi Reamur adalah "+Konversi+"\n");
        }
        if(A4.isSelected()==true&&B2.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf((Angka*1.8)-459.67);
         hasil.append("Konversi dari "+txtinput.getText()+" Kelvin \n");
         hasil.append("Menjadi Farenheit adalah "+Konversi+"\n");
        }
        if(A4.isSelected()==true&&B1.isSelected()==true){
         Angka =Float.parseFloat(txtinput.getText());
         Konversi =String.valueOf(Angka-273.15);
         hasil.append("Konversi dari "+txtinput.getText()+" Kelvin \n");
         hasil.append("Menjadi Celcius adalah "+Konversi+"\n");
        }
        
        }
        
    });
        reset.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
                hasil.setText("");
                txtinput.setText("");
            
            }
        });
    
    }
      
  
    
}
