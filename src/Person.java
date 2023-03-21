import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Person {
    // instansvariabler
    private String förnamn;
    private String efternamn;
    private int föddÅr;
    public  Person partner;
    private List<Person> barnLista = new LinkedList<>();

    // konstruktor
    public Person(String f, String e, int å) {
        sättFörnamn(f);
        sättEfternamn(e);
        sättFöddÅr(å);
    }

    public void nyttBarn(Person barn) {
        barnLista.add(barn);
    }

    public int antalBarn() {
        return barnLista.size();
    }

    public void printaBarn() {
        for (Person p : barnLista) {
            System.out.println(p);
        }
    }

    // instansmetoder
    public void sättFörnamn(String fn) {
        if (fn != null)
            förnamn = fn;
    else
        throw new NullPointerException();
    }

    public void sättEfternamn(String en) {
        if (en != null)
            efternamn = en;
        else
            throw new NullPointerException();
    }

    public void sättFöddÅr(int år) {
        if (år > 1880 &&
        år <= Calendar.getInstance().get(Calendar.YEAR))
        föddÅr = år;
    else
        throw new IllegalArgumentException("Felaktigt �r");
    }

    public String avläsFörnamn() {
        return förnamn;
    }

    public String avläsEfternamn() {
        return efternamn;
    }

    public int avläsFöddÅr() {
        return föddÅr;
    }

    public String toString() {
        return förnamn + " " + efternamn;
    }
}