package Prueba;

import java.util.Iterator;
import java.util.List;

import clases.baraja;
import clases.cartas;

public class test {
	public static void main(String[] args) {
		
baraja espanola=new baraja("Baraja principal");

cartas uno=new cartas(1,0);
cartas dos=new cartas(2,0);
cartas tres=new cartas(3,0);
cartas cuatro=new cartas(4,0);
cartas cinco=new cartas(5,0);
cartas seis=new cartas(6,0);
cartas siete=new cartas(7,0);
cartas sota=new cartas(8,0);
cartas caballo=new cartas(9,0);
cartas rey=new cartas(10,0);

cartas unoc=new cartas(1,1);
cartas dosc=new cartas(2,1);
cartas tresc=new cartas(3,1);
cartas cuatroc=new cartas(4,1);
cartas cincoc=new cartas(5,1);
cartas seisc=new cartas(6,1);
cartas sietec=new cartas(7,1);
cartas sotac=new cartas(8,1);
cartas caballoc=new cartas(9,1);
cartas reyc=new cartas(10,1);

cartas unoe=new cartas(1,2);
cartas dose=new cartas(2,2);
cartas trese=new cartas(3,2);
cartas cuatroe=new cartas(4,2);
cartas cincoe=new cartas(5,2);
cartas seise=new cartas(6,2);
cartas sietee=new cartas(7,2);
cartas sotae=new cartas(8,2);
cartas caballoe=new cartas(9,2);
cartas reye=new cartas(10,2);

cartas unob=new cartas(1,3);
cartas dosb=new cartas(2,3);
cartas tresb=new cartas(3,3);
cartas cuatrob=new cartas(4,3);
cartas cincob=new cartas(5,3);
cartas seisb=new cartas(6,3);
cartas sieteb=new cartas(7,3);
cartas sotab=new cartas(8,3);
cartas caballob=new cartas(9,3);
cartas reyb=new cartas(10,3);

espanola.anadir(uno);
espanola.anadir(unoc);
espanola.anadir(unoe);
espanola.anadir(unob);
espanola.anadir(dos);
espanola.anadir(dosc);
espanola.anadir(dose);
espanola.anadir(dosb);
espanola.anadir(tres);
espanola.anadir(trese);
espanola.anadir(tresb);
espanola.anadir(tresc);
espanola.anadir(cuatro);
espanola.anadir(cuatroe);
espanola.anadir(cuatroc);
espanola.anadir(cuatrob);
espanola.anadir(cinco);
espanola.anadir(cincoc);
espanola.anadir(cincoe);
espanola.anadir(cincob);
espanola.anadir(seis);
espanola.anadir(seisc);
espanola.anadir(seise);
espanola.anadir(seisb);
espanola.anadir(siete);
espanola.anadir(sietee);
espanola.anadir(sietec);
espanola.anadir(sieteb);
espanola.anadir(sota);
espanola.anadir(sotae);
espanola.anadir(sotac);
espanola.anadir(sotab);
espanola.anadir(caballo);
espanola.anadir(caballoc);
espanola.anadir(caballoe);
espanola.anadir(caballob);
espanola.anadir(rey);
espanola.anadir(reye);
espanola.anadir(reyc);
espanola.anadir(reyb);


	  System.out.println((espanola).getcarta(2));



	}
}
