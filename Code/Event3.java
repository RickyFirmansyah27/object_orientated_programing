package Code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Event3 {
    
      
       int angka, pangkat;
       String text;
       private JFrame fr;
       JLabel menu = new JLabel("Program Pangkat");
       JLabel nAwal = new JLabel("Awal");
       JLabel nAkhir = new JLabel("Akhir");
       JTextField txtAwal = new JTextField(20);
       JTextField txtAkhir = new JTextField(20);
       JButton hitung = new JButton("Hasil");
       JButton reset = new JButton("Reset");
       JTextArea hasil = new JTextArea();
       
       public Event3(){
        makeFrame();
        fr.setVisible(true);
        AksiReaksi();
       }
       private void makeFrame(){
        fr = new JFrame("Program Perpangkatan");
        fr.setSize(300,330);
        komponenVisual();
        
       }
       public void komponenVisual(){
        JPanel panel = (JPanel)fr.getContentPane();
        panel.setLayout(null);
        
        panel.add(menu);
        menu.setBounds(95,10,200,20);
        
        panel.add(nAwal);
        nAwal.setBounds(10,40,30,20);
        panel.add(txtAwal);
        txtAwal.setBounds(50,40,100,20);
        
        panel.add(nAkhir);
        nAkhir.setBounds(10,70,30,20);
        panel.add(txtAkhir);
        txtAkhir.setBounds(50,70,100,20);
        
        panel.add(hitung);
        hitung.setBounds(95,100,100,20);
        panel.add(reset);
        reset.setBounds(95,130,100,20);
        
        panel.add(hasil);
        hasil.setBounds(7,170,270,150);
        
        
       }
       private void AksiReaksi(){
         hitung.addActionListener(new ActionListener(){
            
        public void actionPerformed(ActionEvent e){
            hasil.append("Hasil yang didapat"+"\n");
            hasil.append("Nilai awal  : "+txtAwal.getText()+"\n");
            hasil.append("Nilai akhir : "+txtAkhir.getText()+"\n");          
            angka = Integer.parseInt(txtAwal.getText());
            pangkat = Integer.parseInt(txtAkhir.getText());
            text =String.valueOf(Pangkat(angka, pangkat));
            hasil.append(txtAwal.getText()+" ^ "+txtAkhir.getText()+" = "+text+"\n");
            
        }
       
             
    });
          reset.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e) {
             hasil.setText("");
             txtAwal.setText("");
             txtAkhir.setText("");
             } 
          });
}
       public  int Pangkat(int angka, int pangkat)
{
   int x = 1;
       for(int i = 1 ; i<=pangkat ; i++)
       {
            x = x * angka;    
       }
       return(x);
}
       
}
