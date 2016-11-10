
/**
 * Write a description of class Calendario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasicoExpo
{
    // instance variables - replace the example below with your own
    private DisplayDosDigitos dia;

    private DisplayDosDigitos mes;

    private DisplayDosDigitos anno;

    /**
     * Constructor for objects of class Calendario
     */
    public CalendarioBasicoExpo()
    {
        // initialise instance variables
        dia = new DisplayDosDigitos(31);
        mes = new DisplayDosDigitos(13);
        anno = new DisplayDosDigitos(100);

    }

    /**
     * Solo van a contemplarse años desde 01 hasta 99.
     */
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAnno)
    {
        dia.setValor(nuevoDia);
        mes.setValor(nuevoMes);
        anno.setValor(nuevoAnno);
    }

    public void avanzarFecha()
    {
        dia.incrementaValor();
        if(dia.getValor() == 1) {
            mes.incrementaValor();
            if(mes.getValor() == 1) {
                anno.incrementaValor();
            }
        }
    }

    public String mostrarFecha()
    {

        return dia.getValorDelDisplay() + "-" + mes.getValorDelDisplay() + "-" + anno.getValorDelDisplay();

    }
}

