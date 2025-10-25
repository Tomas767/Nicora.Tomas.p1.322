import java.util.ArrayList;

public class LaboratorioTecnologico {
    private ArrayList<Proyecto> proyectos;
    
    public LaboratorioTecnologico(){
        proyectos = new ArrayList<>();
    }
    
    public void agregarProyecto(Proyecto proyecto){
        validacion(proyecto);
        proyectos.add(proyecto);
    }
    
    public void mostrarProyectos(){
        for(Proyecto p : proyectos){
            p.descripciones();
        }
    }
    
    // Muy estructurado, empece tarde
    public void actualizarResultadosProyectos(){
        for(Proyecto p : proyectos){
            if(p instanceof AnalisisEstadistico){
                ((AnalisisEstadistico) p).actualizarDatos();
            }else if(p instanceof ModeloMachineLearning){
                ((ModeloMachineLearning) p).actualizarDatos();
            }else{
                System.out.println("Proyecto de visualizacion no actualizable");
            }
        }
    }
    
    public void actualizarEstadoProyectos(EstadoActual nuevoEstadoActual){
        int i = 0;
        for(Proyecto p : proyectos){
            if(p.actualizarEstado(nuevoEstadoActual)){
                p.cambiarEstado(nuevoEstadoActual);
                System.out.println("Estado del proyecto" + p.getEstado());
                
                System.out.println("Proyectos actualizados" + i);
                
                i++;
            }
        }
    }
    
    public static void main(String[] args) {
        LaboratorioTecnologico LabFerrete = new LaboratorioTecnologico();
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    // PENDIENTE
    private void validacion(Proyecto proyecto){
        for(Proyecto p : proyectos){
            if(p.compararProyecto(proyecto)){
                throw new projectException("Projecto ya existente");
            }
        }
    }
}
