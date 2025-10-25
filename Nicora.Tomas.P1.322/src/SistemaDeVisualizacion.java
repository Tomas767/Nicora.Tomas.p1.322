public class SistemaDeVisualizacion extends Proyecto {
    private int cantGraficos;

    public SistemaDeVisualizacion(int cantGraficos, String nombre, String equipoResponsable, EstadoActual estado) {
        super(nombre, equipoResponsable, estado);
        this.cantGraficos = cantGraficos;
    }
    
    @Override
    public boolean compararProyecto(Proyecto p){
        boolean retorno = false;
        
        if(p instanceof SistemaDeVisualizacion){
            retorno = compararEquipo(p.getEquipoResponsable());
        }
        
        return retorno;
    }
    
    
    @Override
    public void descripciones(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nombre Proyecto: " + nombre);
        sb.append("\nEquipo: " + equipoResponsable);
        sb.append("\nCantidad de graficos: " + cantGraficos );
        
        System.out.println(sb);
    }
    
}
