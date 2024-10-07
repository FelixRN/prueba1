public class teoriasymodelos {

    public static void main(String[] args) {
        
       /*Teoria liderazgoAdaptativo;
       Dteoria definicionLiderazgo;
       Modelo gestionCambio;
      Mteoria definicionCambio;*/

      changueManagement liderazgoAdaptativo = new changueManagement();
       liderazgoAdaptativo.teoria = "Liderazgo adaptativo";
       liderazgoAdaptativo.definicionT = "Diferencia entre problemas técnicos (soluciones conocidas) y adaptativos (complejos, requieren experimentación).";
       System.out.println(liderazgoAdaptativo.toString());
       
       changueManagement gestionCambio = new changueManagement();
       gestionCambio.modelos = "Modelo de transición de Bridges: ";
       gestionCambio.definicionM = "Aborda la transición emocional que atraviesan las personas durante el cambio en tres etapas: dejar ir, la zona neutral, y el nuevo comienzo.";
       System.out.println(gestionCambio.toString());
      } 
}
class changueManagement{

    String teoria;
    String definicionT;
    String modelos;
    String definicionM;

    public String toString(){
        String result = "Tenemos esta teoria" + this.teoria
                + " que nos habla de " + this.definicionT
                + ", y tenemos varios modelos como: " + this.modelos
                +" que nos habla de : " + this.definicionM;
            return result;
    }
}