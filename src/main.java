/**
 * Jose Jo Escobar,14343
 * Alejandro Chaclan, 15018
 * Hoja de trabajo No 6
 * Algortimos y estructura de datos
 * on 31/08/2016.
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Variable para leer los datos ingresados por el usuario
        boolean flag = true; //Bandera para cuando el usuario ya no quiera ingresar mas nombres
        int opc; //Variable para guardar la opcion
        String nombre, conjs; //Variables para guardar la informacion ingresada por el usuario
        Set<String> java = null, web = null, cel = null;
        char c;

        //Se muestran las opciones del Set
        System.out.println("Ingrese que tipo de implementacion Set desea:\n"
                + "1. HashSet\n"
                + "2. TreeSet\n"
                + "3. LinkedHashSet");

        //Se lee la opcion
        opc = (int)teclado.nextDouble();

        //Dependiendo de la opcion elegido, se instancian las diferentes clases
        switch(opc) {
            case 1:
                java = new HashSet();
                web = new HashSet();
                cel = new HashSet();
                break;
            case 2:
                java = new TreeSet();
                web = new TreeSet();
                cel = new TreeSet();
                break;
            case 3:
                java = new LinkedHashSet();
                web = new LinkedHashSet();
                cel = new LinkedHashSet();
                break;
        }

        //Se realiza un ciclo para que el usuario ingrese nombres hasta que eliga que ya no lo desea
        do{
            //Se pide el nombre
            System.out.println("Ingrese el nombre de la persona:");

            teclado.nextLine();
            nombre = teclado.nextLine();

            //Se muestran las opciones de tipos de desarrolladores
            System.out.println("Ingrese a los conjuntos que pertenece la persona separados por coma (Ej:1, 2, 3)\n"
                    + "1. Desarrolladores Java\n"
                    + "2. Desarrolladores Web\n"
                    + "3. Desarrolladores Celulares");

            //Se lee la opcion
            conjs = teclado.nextLine();
            //Se recorre el string ingresado por el usuario, y segun las opciones que ingreso, se agrega el nombre al Set correspondiente
            while (!conjs.isEmpty()) {
                c = conjs.charAt(0);
                switch (c) {
                    case '1':
                        java.add(nombre);
                        break;
                    case '2':
                        web.add(nombre);
                        break;
                    case '3':
                        cel.add(nombre);
                        break;
                }
                conjs = conjs.substring(1);
            }

            //Se le pregunta el usuario si quiere ingresar otro nombre
            System.out.println("¿Desea ingresar otro nombre? (si o no)");

            if (teclado.next().equals("no"))
                flag = false;
        } while (flag);
    }
