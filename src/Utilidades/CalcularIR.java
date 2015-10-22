package Utilidades;

import GUI.UserAdmin;
import GUI.UserIR;

/**
 *
 * @author SIS 05
 */
public class CalcularIR {

    public static double ImpIR() {
        long Salario2 = 0;

        if (UserIR.IR > 0 && UserIR.IR < 50000) {
            Salario2 = 0;

        } else if (UserIR.IR > 50001 && UserIR.IR < 100000) {
            Salario2 = (long) ((UserIR.IR * .10) / 12);

        } else if (UserIR.IR > 100001 && UserIR.IR < 200000) {
            Salario2 = (long) (((UserIR.IR * .15) + 5000) / 12);

        } else if (UserIR.IR > 200001 && UserIR.IR < 300000) {
            Salario2 = (long) ((((UserIR.IR) * .20) + 20000) / 12);

        } else if (UserIR.IR > 300001 && UserIR.IR < 500000) {
            Salario2 = (long) ((((UserIR.IR) * .25) + 40000) / 12);

        } else if (UserIR.IR > 500001 && UserIR.IR < 999999) {
            Salario2 = (long) ((((UserIR.IR) * .30) + 90000) / 12);

        }
        System.out.println(Salario2);
        return Salario2;
    }

    public static double HE() {
        double hrs;

        hrs = (((UserIR.salario / 30) / 8) * UserIR.HE) * 2;
        System.out.println(hrs);
        return hrs;

    }

    public static double INSSP() {
        float INSS1;
        INSS1 = (float) (UserIR.salario * 0.625);
        System.out.println(INSS1);
        return INSS1;

    }

    public static double INSS() {
        float INSS2;
        INSS2 = (long) (UserIR.salarioneto * 0.16);
        System.out.println(INSS2);
        return INSS2;

    }

    public static double INATEC() {
        long INATEC1;
        INATEC1 = (long) (UserIR.salarioneto * 0.228);
        System.out.println(INATEC1);
        return INATEC1;
    }

    public static double ImpIRadm() {
        long Salario2 = 0;

        if (UserAdmin.IR > 0 && UserAdmin.IR < 50000) {
            Salario2 = 0;

        } else if (UserAdmin.IR > 50001 && UserAdmin.IR < 100000) {
            Salario2 = (long) ((UserAdmin.IR * .10) / 12);

        } else if (UserAdmin.IR > 100001 && UserAdmin.IR < 200000) {
            Salario2 = (long) (((UserAdmin.IR * .15) + 5000) / 12);

        } else if (UserAdmin.IR > 200001 && UserAdmin.IR < 300000) {
            Salario2 = (long) ((((UserAdmin.IR) * .20) + 20000) / 12);

        } else if (UserAdmin.IR > 300001 && UserAdmin.IR < 500000) {
            Salario2 = (long) ((((UserAdmin.IR) * .25) + 40000) / 12);

        } else if (UserAdmin.IR > 500001 && UserAdmin.IR < 999999) {
            Salario2 = (long) ((((UserAdmin.IR) * .30) + 90000) / 12);

        }
        System.out.println(Salario2);
        return Salario2;
    }

    public static double HEadm() {
        double hrs;

        hrs = (((UserAdmin.salario / 30) / 8) * UserAdmin.HE) * 2;
        System.out.println(hrs);
        return hrs;

    }

    public static double INSSPadm() {
        float INSS1;
        INSS1 = (float) (UserAdmin.salariobruto * 0.625);
        System.out.println(INSS1);
        return INSS1;

    }

    public static double INSSadm() {
        float INSS2;
        INSS2 = (long) (UserAdmin.salarioneto * 0.16);
        System.out.println(INSS2);
        return INSS2;

    }

    public static double INATECadm() {
        long INATEC1;
        INATEC1 = (long) (UserAdmin.salarioneto * 0.228);
        System.out.println(INATEC1);
        return INATEC1;
    }

    
    
}
