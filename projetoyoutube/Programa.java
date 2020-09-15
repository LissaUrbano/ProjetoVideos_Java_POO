public class Programa {
    public static void main(String[] args) {
        
        Video[] v = new Video[3]; //vetor de objetos video
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula de PHP");
        v[2] = new Video("Aula de HTML5");

        Gafanhoto[] g = new Gafanhoto[2]; //vetor de objetos gafanhoto
        g[0] = new Gafanhoto("Lissa", 26, "F", "lissaurbano");
        g[1] = new Gafanhoto("Ariel", 30, "M", "moraes");

        Visualizacao vis = new Visualizacao(g[0], v[0]);
        vis.avaliar(10);
        System.out.println(vis.toString());

    }
}
