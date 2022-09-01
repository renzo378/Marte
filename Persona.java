public class Persona {
    private String y;
    private int AlgoQUEnOsemuybienquehace;

    private int tole = 0;

    public void Algo(){
        this.AlgoQUEnOsemuybienquehace = (5>3)?4:5;
        if(5>3 && 5>5){
            if(5>6){
                this.y = "as";
            }
            y = "hola";
        } else if (5>4||8>5) {
            y = "chau";
        }else{
            this.AlgoQUEnOsemuybienquehace = 56;
        }
        try {
            int i = 4;
            switch (i) {
                case 1:
                    System.out.println("Monday");
                    break;
                default:
                    System.out.println("algo");
            }
            for (int y = 0; y < 4; y++) {
                if (y == 1) {
                    System.out.println("hola");
                }
            }
            while (tole != 0) {
                System.out.println("WHILE");  // No se ejecuta.
            }

            do {
                System.out.println("DO-WHILE"); // Se ejecuta una vez.
            } while (tole != 0);
        }catch(Exception err){
            System.out.println("error");
        }catch (ExceptionInInitializerError as){
            System.out.println("otro");
        }finally{
            System.out.println("Final");
        }
    }
}
