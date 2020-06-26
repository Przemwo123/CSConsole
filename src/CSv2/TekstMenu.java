package CSv2;

public class TekstMenu {

    public void przywitanie(String user){
        System.out.println("--------------------\nCS:GO - V2.8\n--------------------");
        System.out.println("Witaj "+user+"!");
    }

    public void menuInfo(){
        System.out.println("[0]-wyświetl przyciski [1]-sprawdź trzymaną broń [2]-strzelaj [3]-pokaż plecak [4]-wyjmij broń z plecaka [5]-schowaj broń do plecaka [6]-zamiana broni na kolejną [9]-wyjście");
    }
}
