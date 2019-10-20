package com.exercise16strings.app;
import com.exercise16strings.model.Tuneador;

public class StringssApp 
{

	public int numero1;
	
	public static void main(String[] myopinion)
	{
		
		
		String cad1 = "Estamos en la senda hacia Chile para una reunión de los dos presidentes a mediados de noviembre. Y el plan ahí es tener un acuerdo, así que ya veremos lo que ocurre";
		
		String cad2 = "			Estamos en la senda hacia Chile para una reunión de los dos presidentes a mediados de noviembre. Y el plan ahí es tener un acuerdo, así que ya veremos lo que ocurre		";
	
		
		System.out.println(cad1.charAt(3));
		System.out.println(cad1.codePointAt(4));
		System.out.println(cad1.codePointBefore(4));
		System.out.println(cad1.codePointCount(3,4));
		System.out.println(cad1.equals(cad2));
		System.out.println(cad1.concat(cad2));
		System.out.println(cad1.contains("El Chapo"));
		System.out.println(String.valueOf(115));
		System.out.println(cad1.endsWith("ocurre"));
		System.out.println(cad2.trim()+cad2.trim());
		System.out.println(cad1.indexOf('s'));//Non greedy
		System.out.println(cad1.lastIndexOf('s')); //Greedy
		System.out.println(cad1.length());
		
		String[] cads = cad1.split(",");
		
		/*for(String c:cads)
		 {
		 System.out.println(c);
		 } */
		
		for(int i=0; i<cads.length; i++)
			System.out.println(cads [i]);
			
		String cad3="";
		cad3 = cad1.replace('a', 'e');
		
		System.out.println(cad3);
		System.out.println(cad3.toLowerCase());
		System.out.println(cad3.toUpperCase());
		
		//Algorithm for reversing string
		String reversedString="";
		for(int index=cad1.length()-1;index>=0;index--)
		{
			reversedString=reversedString+cad1.charAt(index);
		}
		System.out.println(reversedString);
		
		System.out.println(myopinion[0]);
		System.out.println(myopinion[1]);
		System.out.println(myopinion[2]);
		System.out.println(myopinion[3]);
		
	
		String[] misCadenas = {cad1, cad2, cad3};
		String[] misNuevasCadenas = Tuneador.Tunea(misCadenas);
		for(int i=0;i<misNuevasCadenas.length;i++)
		{
			System.out.println(misNuevasCadenas[i]);
		}

		int[] misEnteros = {5,7,2,3,5,8,1,5,6,7,9};
		System.out.println("La media aritmetica es: "+Tuneador.mediaVector(misEnteros));
			
			
		
		
	}

}
