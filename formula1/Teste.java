public class Teste {
    public static void main(String[] args) {

        Patrocinadores[] p = new Patrocinadores[3];

        p[0] = new Patrocinadores("nike", 10000);
        p[1] = new Patrocinadores("adidas", 20000);
        p[2] = new Patrocinadores("sadia", 2000);

        Equipe eqp = new Equipe("McLaren", 1901, p);
        Piloto plt = new Piloto("Juninho", 30, "Brasileiro");
        CarroF1 carF1 = new CarroF1(10, 1, eqp, plt);

        System.out.println(carF1);
        System.out.println(plt);
        System.out.println(eqp);
    }
}
