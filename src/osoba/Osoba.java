
package osoba;

/**
 *
 * @author xyz
 */
public class Osoba {
    
    private String pesel;
    private String dataUrodzenia;
    private String imie;
    private String nazwisko;
    private String plec;
    private String obywatelstwo;
    
    /**
     * Tworzy obiekt z wartosciami domyslnymi
     */
    public Osoba(){
        this.pesel = "00000000000";
        this.dataUrodzenia = "00-00-0000";
        this.imie = "imie";
        this.nazwisko = "nazwisko";
        this.plec = "kobieta";
        this.obywatelstwo = "PL";
        
        
    }
    
    /**
     * Tworzy obiekt osoby
     * @param pesel
     * @param imie
     * @param nazwisko
     */
    public Osoba(String pesel, String imie, String nazwisko){
        
       this.imie = imie;
       this.nazwisko = nazwisko;
       this.setPesel(pesel);
       this.obywatelstwo = "PL";
        
    }
    
    
    /**
     *
     * Funkcja nie sprawdza poprawności numeru pesel ani cyfry kontrolnej;
     * ustawia pola na podstawie numeru pesel
     * ustawiane pola:
     * dataUrodzenia
     * plec
     * @param pesel
     */
    public void setPesel(String pesel){

        this.pesel = pesel;
        int int_rok = Integer.parseInt(pesel.substring(0, 2));
        int int_miesiac = Integer.parseInt(pesel.substring(2, 4));
        int int_dzien = Integer.parseInt(pesel.substring(4, 6));
        int int_plec = Integer.parseInt(String.format("%c", pesel.charAt(9)));
        if(int_miesiac>0 && int_miesiac<13){
            int_rok+=1900;
        }
        if(int_miesiac>20 && int_miesiac<33){
            int_rok+=2000;
            int_miesiac-=20;
        }
        if(int_miesiac>40 && int_miesiac<53){
            int_rok+=2100;
            int_miesiac-=40;
        }
        if(int_miesiac>61 && int_miesiac<72){
            int_rok+=2200;
            int_miesiac-=60;
        }
       
        this.dataUrodzenia = String.format("%d-%d-%d", int_rok, int_miesiac, int_dzien);

        
        if(int_plec%2==0){
            this.plec = "kobieta";
        }else{
            this.plec = "mezczyzna";
        }
    }
    
    /**
     * Ustawia imie
     * @param imie
     */
    public void setImie(String imie){
        this.imie = imie;
    }
    
    /**
     * Ustawia nazwisko
     * @param nazwisko
     */
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }
    
    /**
     * Ustawia obywatelstwo
     * @param obywatelstwo
     */
    public void setObywatelstwo(String obywatelstwo){
        this.obywatelstwo = obywatelstwo;
    }
    
    /**
     * Zwraca imie
     * @return
     */
    public String getImie(){
        return this.imie;
    }
    
    /**
     * Zwraza nazwisko
     * @return
     */
    public String getNazwisko(){
        return this.nazwisko;
    }
    
    /**
     * Zwraca pesel
     * @return
     */
    public String getPesel(){
        return this.pesel;
    }
    
    /**
     * Zwraca plec
     * @return
     */
    public String getPlec(){
        return this.plec;
    }
    
    /**
     * Zwraca date urodzenia
     * @return
     */
    public String getDataUrodzenia(){
        return this.dataUrodzenia;
    }
    
    /**
     * Zwraca obywatelstwo
     * @return
     */
    public String getObywatelstwo(){
        return this.obywatelstwo;
    }
    
    /**
     * Wyswietla na konsoli wszystkie informacje osoby
     */
    public void displayAll(){
        System.out.println(String.format(
        "Pesel:%s\nImie:%s\nNazwisko:%s\nData urodzenia:%s\nPlec:%s\nObywatelstwo:%s",
                
        this.pesel,this.imie,this.nazwisko,this.dataUrodzenia,this.plec,this.obywatelstwo
                
        ));
    }

    /**
     * Wyswietla na konsoli pesel
     */
    public void displayPesel(){
        System.out.println(String.format("Pesel:%s",this.pesel));
    }

    /**
     * Wyswietla na konsoli imie
     */
    public void displayImie(){
        System.out.println(String.format("Imie:%s",this.imie));
    }

    /**
     * Wyswietla na konsoli nazwisko
     */
    public void displayNazwisko(){
        System.out.println(String.format("Nazwisko:%s",this.nazwisko));
    }

    /**
     * Wyswietla na konsoli date urodzenia
     */
    public void displayDataUrodzenia(){
        System.out.println(String.format("Data urodzenia:%s",this.dataUrodzenia));
    }

    /**
     * Wyswietla na konsoli plec
     */
    public void displayPlec(){
        System.out.println(String.format("Plec:%s",this.plec));
    }

    /**
     * Wyswietla na konsoli obywatelstwo
     */
    public void displayObywatelstwo(){
        System.out.println(String.format("Obywatelstwo:%s",this.obywatelstwo));
    } 

    
    /**
     *
     * 
    public static void main(String args[]){
        Osoba o = new Osoba();
        o.setPesel("88023456739");
        o.displayAll();
        
    }
    
    */
}
