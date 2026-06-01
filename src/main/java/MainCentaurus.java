import com.aittr.javacollections.centaurus.Centaurus;

public class MainCentaurus {

    public static void main(String[] args){
        Centaurus ctr = new  Centaurus(" Nessus", 1234,
                36.5, "fireball");
        System.out.println(ctr);
        ctr.toJump();

    }
}
