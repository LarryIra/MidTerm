import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> prodList = new ArrayList<>();
        prodList.add(new Computers("Lenovo","Intel",2250,3));
        prodList.add(new Printers("Samsung","Samsung",76183,4));
        prodList.add(new Scanners("CanoScan","Canon",6192,2));
        prodList.add(new Printers("Xerox","Xerox",81307,6));
        prodList.add(new Computers("MacBook","Apple",15749,2));
        prodList.add(new Scanners("Fujitsu","Fujitsu",72838,5));
        prodList.add(new Printers("Panasonic","Pana",51838,7));
        prodList.add(new Computers("Surface","Microsoft",45671,9));
        prodList.add(new Scanners("Avision","Panasonic",81939,8));
        prodList.add(new Printers("Lexmark","Lexmark",61849,2));


        for (Product prod:prodList){
            System.out.println(prod);
        }
    }
}