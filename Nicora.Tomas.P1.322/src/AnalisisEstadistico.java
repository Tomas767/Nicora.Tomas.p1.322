public class AnalisisEstadistico extends Proyecto implements Actualizable{
    private TipoAnalisis analisis;

    public AnalisisEstadistico(TipoAnalisis analisis, String nombre, String equipoResponsable, EstadoActual estado) {
        super(nombre, equipoResponsable, estado);
        this.analisis = analisis;
    }
 
    
    @Override
    public void descripciones(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nombre Proyecto: " + nombre);
        sb.append("\nEquipo: " + equipoResponsable);
        sb.append("\nTipo de Analisis: " + analisis );
        
        System.out.println(sb);
    }
    
    @Override
    public boolean compararProyecto(Proyecto p){
        boolean retorno = false;
        
        if(p instanceof AnalisisEstadistico){
            retorno = compararEquipo(p.getEquipoResponsable());
        }
        
        return retorno;
    }
    
    
    @Override
    public void actualizarDatos(){
        
    }
}
