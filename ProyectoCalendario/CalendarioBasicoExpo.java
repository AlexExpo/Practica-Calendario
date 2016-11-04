
/**
 * Write a description of class Calendario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasicoExpo
{
    // instance variables - replace the example below with your own
    private int dia;
    
    private int mes;
    
    private int anno;

    /**
     * Constructor for objects of class Calendario
     */
    public CalendarioBasicoExpo()
    {
        // initialise instance variables
        dia = 01;
        mes = 01;
        anno = 01;
    }
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAnno)
    {
        dia = nuevoDia;
        mes = nuevoMes;
        anno = nuevoAnno;
    }

}
