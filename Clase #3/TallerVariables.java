public class  TallerVariables {
    public static void main(String[]args){

        double kml1 = 0;
        double kml2 = 0;
        double kml3 = 0;
        double klmtotal = 0;
        double deprec = 0;
        double comb = 0;
        double Peajes = 0;
        double costodirecto = 0;
        double costoporkm = 0;
        double Volumen = 0;
        double densidad = 0;
        double ocupacion = 0; 
        double CO2total = 0;
        double CO2porkm = 0;
        double vmedia = 0;
        double vpondt = 0;
        double sigma = 0;
        double cvprom = 0;
        double costomant = 0;
        double kmV = 0;
        double kmlmodelo = 0;
        double v = 0;
        double v1 = 0; 
        double v2 = 0;
        double v3 = 0;
        double vprom = 0;
        double vnorm = 0;
        double d1 = 42.0;
        double d2 = 58.5;
        double d3 = 37.2;
        double t1 = 0.9;
        double t2 = 1.4;
        double t3 = 0.8;
        double l1 = 5.1;
        double l2 = 6.9;
        double l3 = 4.3;
        double precioLitro = 1.35;
        double masaCargaKg = 1200; 
        double largo = 2.0;
        double ancho = 1.2;
        double alto = 1.1;
        double p1 = 2.5;
        double p2 = 3.0;
        double p3 = 2.0;
        double deprecPorKm = 0.08;
        double volCamionM3 = 10.0;
        double fCO2 = 2.68;
        double galtol = 0; 
        double galPorLitro = 0.264172;
        int  vmin = 30;
        int vmax = 90 ;
        int va = 40;
        int vb = 80;
        double ca = 0.05;
        double cb = 0.09;
        double a = -0.0008;
        double b = 0.08;
        double c = 4.0;
        double w1 = 0.25;
        double w2 = 0.25;
        double w3 = 0.25;
        double w4 = 0.25;
        double score = 0;
       

        v1 = (d1/t1);
        v2 = (d2/t2);
        v3 = (d3/t3); 


        kml1 = (d1/l1);
        kml2 = (d2/l2);
        kml3 = (d3/l3);


        



       

      

        
     System.out.println(v1);
     System.out.println(v2);
     System.out.println(v3);
     System.out.println(kml1);
     System.out.println(kml2);
     System.out.println(kml3);
     vprom =( d1*v1 + d2*v2 + d3*v3) / (d1 + d2 + d3);
     klmtotal = (d1 + d2 + d3) / (l1 + l2 + l3);
      comb = (l1+l2+l3)*precioLitro;
      deprec = (d1+d2+d3)*deprecPorKm;
      Peajes = (p1+p2+p3);
      costodirecto = (comb+deprec+Peajes);
      costoporkm = (costodirecto/(d1+d2+d3));
      Volumen = (largo*ancho*alto);
      densidad = (masaCargaKg/(Volumen));
      ocupacion = (Volumen/volCamionM3);
      CO2total = (l1+l2+l3)*fCO2;
      CO2porkm = (CO2total/(d1+d2+d3));
      galtol = (l1+l2+l3)*galPorLitro;
      vmedia = (v1+v2+v3)/(3);
      vpondt = (t1*v1 + t2*v2 + t3*v3) / (t1+t2+t3);
      sigma = (Math.sqrt(((Math.pow(v1-vmedia,2))+(Math.pow(v2-vmedia,2))+(Math.pow(v3-vmedia,2)))/3));
      vnorm = (vprom-vmin)/(vmax-vmin);
      cvprom = (ca + (cb-ca)*(vprom-va)/(vb-va));
      costomant = (cvprom)*(d1 + d2 + d3);
      kmV =  c;
      kmlmodelo = kmV+(vprom);
      score = w1 * (1)/(costoporkm)+w2 * klmtotal + w3 * (1)/(CO2porkm)+w4 * (1)/(1+sigma);
     System.out.println(vprom);
     System.out.println(klmtotal);
     System.out.println(comb);
     System.out.println(deprec);
     System.out.println(Peajes);
     System.out.println(costodirecto);
     System.out.println(costoporkm);
     System.out.println(Volumen);
     System.out.println(densidad);
     System.out.println(ocupacion);
     System.out.println(CO2total);
     System.out.println(CO2porkm);
     System.out.println(galtol);
     System.out.println(vmedia);
     System.out.println(vpondt);
     System.out.println(sigma);
     System.out.println(vnorm);
     System.out.println(cvprom);
     System.out.println(costomant);
     System.out.println(kmV);
     System.out.println(kmlmodelo);
     System.out.println(score);
     








     
     
     
     
     

    }
}