public abstract class FiguraGeometrica implements CalculosGeometricos{

    private String cor;
    private int id;

    public static int totalFiguras;

    public FiguraGeometrica(String cor, int totalFiguras, int id){
        this.cor = cor;
        this.totalFiguras = totalFiguras + 1;
        this.id = id;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return cor;
    }

    public static int getTotalFiguras(){
        return totalFiguras;
    }

    public String getInfo(){
        return "Cor: "+cor+"\nId: "+id;
    }

    public String getDetalhes(){
        return "null";
    }
    }