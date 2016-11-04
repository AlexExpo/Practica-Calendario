
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
    
    private String mostrarDia;
    
    private String mostrarMes;
    
    private String mostrarAnno;

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
    /**
     * Solo van a contemplarse años desde 01 hasta 99.
     */
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAnno)
    {
        dia = nuevoDia;
        mes = nuevoMes;
        anno = nuevoAnno;
    }
    public void avanzarFecha()
    {
        if (dia == 30) {
            dia = 01;
            mes = mes + 01;
            if (mes == 13) {
                mes = 01;
                anno = anno + 01;
                if (anno == 99) {
                    dia = 01;
                    mes = 01;
                    anno = 01;
                }
            }
        }
        else {
            dia = dia + 1;
        }
    }
    public String mostrarFecha()
    {
        String mostrarDia;
        String mostrarMes;
        String mostrarAnno;
        
        if (dia < 10) {
            mostrarDia = "0" + dia;
        }
        else {
            mostrarDia = dia + "";
        }
        if (mes <10) {
            mostrarMes = "0" + mes;
        }
        else {
        mostrarMes = mes + "";
        }
        if (anno < 10) {
            mostrarAnno = "00" + anno;
            }
            else {
                mostrarAnno = anno + "";
                }
        return mostrarDia + "-" + mostrarMes + "-" + mostrarAnno;

}}
    
