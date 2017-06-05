package clases;

import java.util.Iterator;

public class cartas {
	
private int numero;
private int palo;
private int cartaID;

public cartas(int numero, int palo) {
	this.numero = numero;
	this.palo = palo;
}


public cartas(int cartaID) {
	this.cartaID = cartaID;
}


public int getCartaID() {
	return cartaID;
}

public void setCartaID(int cartaID) {
	this.cartaID = cartaID;
}


public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public int getPalo() {
	return palo;
}

public void setPalo(int palo) {
	this.palo = palo;
}
public String getNombreNumero(int numero){
	String cadena="";
	if(numero==1)
		cadena="as";
	if(numero==2)
		cadena="dos";
	if(numero==3)
		cadena="tres";
	if(numero==4)
		cadena="cuatro";
	if(numero==5)
		cadena="cinco";
	if(numero==6)
		cadena="seis";
	if(numero==7)
		cadena="siete";
	if(numero==8)
		cadena="sota";
	if(numero==9)
		cadena="caballo";
	if(numero==10)
		cadena="rey";
	return cadena;
}

public String getNombrePalo(int palo){
	String cadena="";
	if(palo==0){
		cadena="Oros";
	}
	if(palo==1){
		cadena="Copas";
	}
	if(palo==2){
		cadena="Espadas";
	}
	if(palo==3){
		cadena="Bastos";
	}
	return cadena;
}
public String getValorTute(int numero){
	String cadena="";
	if(numero==1){
		cadena="11";
	}
	if(numero==3){
		cadena="10";
	}
	if(numero==1){
		cadena="11";
	}
	if(numero==8){
		cadena="2";
	}
	if(numero==9){
		cadena="3";
	}
	if(numero==10){
		cadena="4";
	}
	return cadena;
}

public String getValorMus(int numero){
	String cadena="";
	if(numero==1){
		cadena="1";
	}
	if(numero==2){
		cadena="1";
	}
	if(numero==3){
		cadena="10";
	}
	if(numero==4){
		cadena="4";
	}
	if(numero==5){
		cadena="5";
	}
	if(numero==6){
		cadena="6";
	}
	if(numero==7){
		cadena="7";
	}
	if(numero==8){
		cadena="3";
	}
	if(numero==9){
		cadena="3";
	}
	if(numero==10){
		cadena="3";
	}
	return cadena;
}
public String getNombreCarta(){
	String cadena=getNumero()+" de "+getPalo();
	return cadena;
}




}


	



	
	
