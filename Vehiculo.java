
package daniel.sobreescriturametodos1;

/**
  * @author Almache Crsitian
 */
import java.util.Scanner;
 import java.util.Calendar;
import java.util.ArrayList;

 class Vehiculo {

    private String marca;
    private String tecnologia;
    private int modelo;
    
     public Vehiculo(){
         marca="";
         tecnologia="";
         modelo=0;
     }
      public Vehiculo(String marca, String tecnologia, int moldelo){
          this.marca=marca;
          this.tecnologia=tecnologia;
          this.modelo=modelo;
      }
      public String getMarca(){
          return marca;
      }
      public String getTecnologia(){
          return tecnologia;
      }
      public int getModelo(){
          return modelo;
      }
}


 class Automovil extends Vehiculo{
     private String matriculaAutomovil;
      public Automovil(){
          super();
          matriculaAutomovil="Desconocido";
    }
     public Automovil(String marca, String tecnologia, int modelo){
         super(marca, tecnologia, modelo);
         matriculaAutomovil="Desconocido";
     }
       public void setMatriculaAutomovil(String matriculaAutomovil){
           this.matriculaAutomovil= matriculaAutomovil;
       }
       public String getMatriculaAutomovil(){
           return matriculaAutomovil;
       }   
       
        public void mostrarDatos(){
            System.out.println("Datos del Automovil: MARCA DEL AUTOMOVIL: "+ getMarca()+""+getTecnologia()+
                    "--MATRICULA DEL AUTOMOVIL:"+getMatriculaAutomovil());            
        }
 }   
        class AutomovilAutonomo extends Automovil{
            private Calendar fechaComienzoFabricacionAutonomia;
            
            public AutomovilAutonomo(Calendar fechaComienzoFabricacionAutonomia){
                super();
                fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia;
            }
            public AutomovilAutonomo(String marca, String tecnologia, int modelo, Calendar fechaComienzoFabricacionAutonomia){
                super(marca, tecnologia, modelo);
                this.fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia;
            }
             public Calendar getFechaComienzoFabricacionAutonomia(){
                 return fechaComienzoFabricacionAutonomia;
             }            
             public void mostrarDatos(){
                    System.out.println("Datos del Automovil Autonomo: FECHA DE FABRICACION: "
                            + fechaComienzoFabricacionAutonomia.getTime().toString());
             }
        }
      
        class ListadoAutomoviles{
            private ArrayList<Automovil>listadoAutomoviles;
            
            //Constructor
            public ListadoAutomoviles(){
                listadoAutomoviles=new ArrayList<Automovil>();
            }
            //Metodos
             public void addAutomovil(Automovil automovil){
                 listadoAutomoviles.add(automovil);
             } //Cierre método addAutomovil
                 public void Listar(){
                     System.out.println("DATOS DE LOS AUTOMOVILES EXISTEN EN EL LISTADO:");
                     for(Automovil tmp:listadoAutomoviles){ //Uso de for extendido
                         tmp.mostrarDatos();
                   }
               }
        }
          
 class SobreEscrituraMetodos1{
      public static void main(String[] args) {
          Scanner op=new Scanner(System.in);  
        int caso=0;
        System.out.println("\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS");
        System.out.println("\t\t\t\t ESPE");
        System.out.println("Nombre: Almache Cristian");
        System.out.println("Carrera: Ing. Automotriz");
        System.out.println("Docente: Ing. Luis Gerra");
        System.out.println("Tema: SobreEscrituraMetodos1 ");
        System.out.println("___________________________________");
            System.out.println("\t\t MENU AUTOMÓVIL /AUTOMÓVIL AUTÓNOMO ");
            System.out.println("1.AUTOMÓVIL");
            System.out.println("2.AUTOMÓVIL AUTÓNOMO");
            System.out.println("________________________________________");
                   
       for( int i=1;i<=3;i++){
           System.out.print("Seleccione <<  1 o 2 >> : ");
           caso= op.nextInt();
        switch(caso){
            case 1:
        //AUTOMOVIL
        Automovil automovil1=new Automovil("Ford --","TECNOLOGÍA: Canadiense",2018);
        automovil1.setMatriculaAutomovil("Ontario ABZM-264-20");
        ListadoAutomoviles listado1=new ListadoAutomoviles();
        listado1.addAutomovil(automovil1);
        listado1.Listar();
        break;
            case 2:
        //AUTONOMO 
        Calendar fecha1=Calendar.getInstance();
        fecha1.set(2019,10,22); //Los meses van de 0 a 11, luego 10 representan noviembre
         AutomovilAutonomo autonomo1=new AutomovilAutonomo("Nissan", "TECNOLOGÍA EUROPEA", 2020, fecha1);
         ListadoAutomoviles listado2=new ListadoAutomoviles();
         listado2.addAutomovil(autonomo1);       
         listado2.Listar();
         break;
         default: System.out.println("No existe datos para esa opción");
         }
      }
    }
 }

