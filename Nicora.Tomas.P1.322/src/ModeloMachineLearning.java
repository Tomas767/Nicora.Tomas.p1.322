public class ModeloMachineLearning extends Proyecto implements Actualizable{
    private double porcentajePrecision;

    public ModeloMachineLearning(double porcentajePrecision, String nombre, String equipoResponsable, EstadoActual estado) {
        super(nombre, equipoResponsable, estado);
        this.porcentajePrecision = porcentajePrecision;
    }
    
    @Override
    public void descripciones(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nombre Proyecto: " + nombre);
        sb.append("\nEquipo: " + equipoResponsable);
        sb.append("\nPorcentaje de precision: " + porcentajePrecision );
        
        System.out.println(sb);
    }
    
    @Override
    public boolean compararProyecto(Proyecto p){
        boolean retorno = false;
        
        if(p instanceof ModeloMachineLearning){
            retorno = compararEquipo(p.getEquipoResponsable());
        }
        
        return retorno;
    }
    
    @Override
    public void actualizarDatos() {
        
    }
    
    
}
