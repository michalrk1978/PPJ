package zadanie5s78;

public class Przedmiot {
    public Przedmiot() {
        nazwa = "";
        typ = 0;
    }    
        private String nazwa = "";
        private char typ;
        
        public String getNazwa() {
            return nazwa;
        }
        
        public void setNazwa(String sNazwa){
            nazwa = sNazwa;
        }
        
        public char getTyp (){
            return typ;
        }
        
        public void setTyp(char sTyp){
            typ = sTyp;
        }
        
        
}
