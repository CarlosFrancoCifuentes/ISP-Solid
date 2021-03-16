package org.formacion.isp;

import java.util.ArrayList;
import java.util.List;

public class ProcesadorCorrector implements Corrector{
    
	private List<String> texto = new ArrayList<>();

    @Override
	public boolean correcto (Idioma idioma) {
		for (String palabra: texto) {
			if (! idioma.diccionario.contains(palabra.toLowerCase())) {
				return false;
			}
		}
		return true;
	}
    
}
