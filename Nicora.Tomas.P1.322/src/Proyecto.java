public abstract class Proyecto {
    protected String nombre;
    protected String equipoResponsable;
    protected EstadoActual estado;

    protected Proyecto(String nombre, String equipoResponsable, EstadoActual estado) {
        this.nombre = nombre;
        this.equipoResponsable = equipoResponsable;
        this.estado = estado;
    }
    
    protected abstract boolean compararProyecto(Proyecto p);
    
    protected abstract void descripciones();
    
    public boolean actualizarEstado(EstadoActual nuevoEstadoActual){
        boolean retorno = false;
        
        return !(nuevoEstadoActual == null && compararEstado(nuevoEstadoActual));
    }
    
    public void cambiarEstado(EstadoActual nuevoEstadoActual){
        estado = nuevoEstadoActual;
    }
    
    protected boolean compararEstado(EstadoActual estado){
        return this.estado.equals(estado);
    }
    protected boolean compararEquipo(String equipo){
        return this.equipoResponsable.equals(equipo);
    }
    
    public EstadoActual getEstado(){
        return estado;
    }
    public String getEquipoResponsable() {
        return equipoResponsable;
    }
    
    
}
