public class Populacao {
    private int pop[ ][ ];
    public int estados, municipios;
    public Populacao(int estados , int municipios) {
        this.estados = estados;
        this.municipios = municipios;
        this.pop = new int[estados][municipios];
    }

    public void atualizarPopulacao(int i, int j, int populacao){
        if (i>=0 && i<4 && j>=0 && j<5 && populacao > 0)
            pop[i][j] = populacao;
    }

    public String mediaPop() {
        int soma[]= new int[4];
        StringBuilder relatorio = new StringBuilder();
        String relatoriofinal = "";
        for(int i = 0; i< 4;i++) {
            for(int j = 0 ; j< 5; j++) {
                soma[i] +=pop[i][j] ;
            }

        }
        relatorio.append("LISTA DE ESTADOS \n");
        for(int i=0;i<4;i++) {
            relatorio.append(String.format("estados %s: %s \n", i + 1, soma[i] / 5));
            relatoriofinal = relatorio.toString();
        }
        return relatoriofinal;
    }

}
