
package osoba;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class Aplet extends Applet implements ActionListener{

    TextField fieldImie;
    TextField fieldNazwisko;
    TextField fieldPesel;
    TextField fieldObywatelstwo;
    
    Label labelImie;
    Label labelNazwisko;
    Label labelPesel;
    Label labelObywatelstwo;
    
    Button showBtn;
    TextArea dane;
    

    public void init() {

        GridLayout layout = new GridLayout(0,2);
        setLayout(layout);
        
        
        fieldImie = new TextField(20);
        fieldNazwisko = new TextField(20);
        fieldPesel = new TextField(11);       
        fieldObywatelstwo = new TextField(20);
        
        labelImie = new Label("Imie:");
        labelNazwisko = new Label("Nazwisko:");
        labelPesel = new Label("Pesel:");
        labelObywatelstwo = new Label("Obywatelstwo:");
        
        showBtn = new Button("Pokarz dane");
        dane = new TextArea();

        
        add(labelImie);
        add(fieldImie);
        
        add(labelNazwisko);
        add(fieldNazwisko);
        

        add(labelPesel);
        add(fieldPesel);
        
        add(labelObywatelstwo);
        add(fieldObywatelstwo);
        
        add(showBtn);
        add(dane);
        
        showBtn.addActionListener(this);
        
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==showBtn){
            
            Osoba o = new Osoba(this.fieldPesel.getText(),this.fieldImie.getText(),this.fieldNazwisko.getText());
            o.setObywatelstwo(this.fieldObywatelstwo.getText());
            
            this.dane.setText(String.format(
                "Pesel:%s\nImie:%s\nNazwisko:%s\nData urodzenia:%s\nPlec:%s\nObywatelstwo:%s",
                o.getPesel(),o.getImie(),o.getNazwisko(),o.getDataUrodzenia(),o.getPlec(),o.getObywatelstwo()
            ));
        }
    }

}
